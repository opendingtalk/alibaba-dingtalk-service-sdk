package com.taobao.api.internal.tmc;

import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.api.internal.toplink.endpoint.EndpointContext;
import com.taobao.api.internal.util.NamedThreadFactory;
import com.taobao.api.internal.util.json.JSONValidatingReader;

/**
 * 消息服务-内部去重处理器
 */
public class DuplicateRemoverTmcHandler extends TmcHandler {

	private static final Log log = LogFactory.getLog(DuplicateRemoverTmcHandler.class);
	private static final Log statlog = LogFactory.getLog(DuplicateRemoverTmcHandler.class.getSimpleName());

	private static final long SCHEDULE_DELAY = 10L; // 启动延时
	private static final long SCHEDULE_PERIOD = 100L; // 执行间隔
	private static final long REMOVE_DUPLICATE_PERIOD = 1000L; // 去重时间

	private ConcurrentHashMap<String, Message> msgMap;
	private LinkedBlockingQueue<Pair<String, Long>> msgKeyQueue;
	private KeySelector keySelector;
	private ScheduledExecutorService scheduledService;
	private ScheduledFuture<?> scheduledFuture;
	public DuplicateRemoverTmcHandler(TmcClient tmcClient) {
		super(tmcClient);
		if (tmcClient.getKeySelector() == null) {
			this.keySelector = new MsgKeySelector();
		} else {
			this.keySelector = tmcClient.getKeySelector();
		}
		this.msgMap = new ConcurrentHashMap<String, Message>();
		this.msgKeyQueue = new LinkedBlockingQueue<Pair<String, Long>>(tmcClient.getQueueSize() * 2);
		this.scheduledService = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("tmc-duplicate-remover"));
		this.scheduledFuture = this.scheduledService.scheduleWithFixedDelay(new MsgScheduleTask(), SCHEDULE_DELAY, SCHEDULE_PERIOD, TimeUnit.MILLISECONDS);
	}

	public void onMessage(EndpointContext context) throws Exception {
		final Map<String, Object> rawMsg = context.getMessage();
		if (log.isDebugEnabled()) {
			log.debug(String.format("onMessage from %s: %s", context.getMessageFrom(), rawMsg));
		}

		final Message msg = parse(rawMsg);
		final String key = this.keySelector.selectKey(msg);
		if (key == null) { // 走正常流程
			super.handleMessage(msg, false);
		} else { // 走去重流程
			if (!put(key, msg)) { // 去重成功
				super.handleMessage(msg, true);
				log(key, msg.getId());
			}
		}
	}

	private void log(String key, Long msgId) {
		StringBuilder buf = new StringBuilder();
		buf.append(System.currentTimeMillis()).append(","); // 时间
		buf.append(tmcClient.getAppKey()).append(","); // AppKey
		buf.append(tmcClient.getGroupName()).append(","); // GroupName
		buf.append(msgId).append(","); // 消息ID
		buf.append(key); // 业务ID
		statlog.fatal(buf.toString());
	}

	public void close() {
		super.close();
		if (this.scheduledFuture != null) {
		    this.scheduledFuture.cancel(true);
		    this.scheduledFuture = null;
			this.scheduledService.shutdown();
			this.scheduledService = null;
		}
	}

	private boolean put(String key, Message message) throws InterruptedException {
		Object obj = msgMap.putIfAbsent(key, message);
		if (obj == null) {
			msgKeyQueue.put(new Pair<String, Long>(key, System.currentTimeMillis()));
			return true;
		} else {
			return false;
		}
	}

	private class MsgKeySelector implements KeySelector {
		public String selectKey(Message message) {
			String topic = message.getTopic();
			String key = null;
			if (topic.startsWith("taobao_trade") || topic.equals("taobao_datapush_SynTrade")) {
				key = "trade_" + this.getId(message, "tid");
			} else if (topic.startsWith("taobao_item") || topic.equals("taobao_datapush_SynItem")) {
				key = "item_" + this.getId(message, "num_iid");
			} else if (topic.startsWith("taobao_refund")) {
				key = "refund_" + this.getId(message, "refund_id");
			} else {
				key = null;
			}
			return key;
		}

		private String getId(Message message, String field) {
			JSONValidatingReader reader = new JSONValidatingReader();
			message.setContentMap((Map<?, ?>) reader.read(message.getContent()));
			Object id = message.getContentMap().get(field);
			return String.valueOf(id);
		}
	}

	private class MsgScheduleTask extends TimerTask {
		public void run() {
			while (true) {
				Pair<String, Long> keyPair = null;
				try {
				    keyPair = msgKeyQueue.poll();
				    if (keyPair == null) {
				        break ;
				    }
					handleMessage(msgMap.remove(keyPair.getKey()), false);
					if (keyPair.getValue() + REMOVE_DUPLICATE_PERIOD > System.currentTimeMillis()) {
					    break ;
					}
				} catch (Exception e) {
					log.error("handle message fail: %s" + keyPair.getKey(), e);
				}
			}
		}
	}

	class Pair<K, V>{
	    private K key;
	    private V value;
	    
        public K getKey() {
            return key;
        }
        public void setKey(K key) {
            this.key = key;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

	}
}
