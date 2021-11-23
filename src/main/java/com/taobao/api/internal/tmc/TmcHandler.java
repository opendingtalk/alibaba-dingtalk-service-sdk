package com.taobao.api.internal.tmc;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

import com.taobao.api.Constants;
import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.endpoint.EndpointBaseContext;
import com.taobao.api.internal.toplink.endpoint.EndpointContext;
import com.taobao.api.internal.toplink.util.GZIPHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 消息服务-内部处理器
 */
class TmcHandler implements com.taobao.api.internal.toplink.endpoint.MessageHandler {

	private static final Log log = LogFactory.getLog("tmcClient");

	protected TmcClient tmcClient;
	protected volatile boolean stopped;

	public TmcHandler(TmcClient tmcClient) {
		this.tmcClient = tmcClient;
	}

	public final void onAckMessage(EndpointBaseContext context) {
	}

	public void onMessage(final EndpointContext context) throws Exception {
		final Map<String, Object> rawMsg = context.getMessage();

		handleMessage(parse(rawMsg), false);
	}

	public void close() {
		this.stopped = true;
	}
	
	public void handleConfirm(Message message){
	    handleConfirm((Long)message.getRaw().get(MessageFields.OUTGOING_ID));
	}
	
	public void handleConfirm(Long outGoingId){
        if(tmcClient.getConfirmThreadPool() != null){
            tmcClient.getConfirmThreadPool().submit(new ConfirmWorker(0, outGoingId) {
                public void run() {
                    try {
                        confirm(this.getOutGoingId());
                    } catch (LinkException e) {
                        //only if connection is closed
                        log.warn(String.format("confirm message fail: %d", this.getOutGoingId()), e);
                        //when it happended, should hold the thread because all message can't confirm success
                        holdTheThread();
                        //retry
                        if(this.getRetry() < 3){
                            this.incrRetry();
                            tmcClient.getConfirmThreadPool().submit(this);
                        }else{
                            log.warn(String.format("confirm message fail 3 times,discard it : %d", this.getOutGoingId()));
                        }
                    }
                }
            });
        }
    }
	
	
	private void holdTheThread(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
	
	public void retryMessage(final Message message) throws RejectedExecutionException {
		tmcClient.getThreadPool().submit(new Runnable() {
			public void run() {
				MessageStatus status = new MessageStatus();
				
				try {
					tmcClient.getMessageHandler().onMessage(message, status);
				} catch (Exception e) {
					log.error(String.format("handle message fail: %s", message.getRaw()), e);
					String errorMsg = e.getMessage();
					//错误信息上传128个字节到服务端，用于记录错误信息
					status.fail(errorMsg.substring(0,errorMsg.length() > 128 ? 128 : errorMsg.length()));
				}
				//if enable manual confirm
				if(!tmcClient.isUseDefaultConfirm()){
					return;
				}
				
				if (!status.isFail()) {
					try {
						confirm(message.getId());
					} catch (Exception e) {
						log.warn(String.format("confirm message fail: %s", message.getRaw()), e);
					}
				}else{
					//上传错误信息
				}
			}
		});
	}

	public void handleMessage(final Message message, final boolean ignore) {
		
		log.info(String.format("receive message topic:%s, dataid: %s", message.getTopic(), message.getDataId()));

		while (!stopped) {
			try {
				
				tmcClient.getThreadPool().submit(new Runnable() {
					public void run() {
						MessageStatus status = new MessageStatus();
						long begin = System.currentTimeMillis();
						
						if (!ignore) {
							try {
								tmcClient.getMessageHandler().onMessage(message, status);
							} catch (Exception e) {
								log.error(String.format("handle message fail topic:%s, dataid: %s", message.getTopic(), message.getDataId()), e);
								String errorMsg = e.getMessage();
								//错误信息上传128个字节到服务端，用于记录错误信息
								status.fail(errorMsg.substring(0,errorMsg.length() > 128 ? 128 : errorMsg.length()));
							}
						}
						
						//if enable manual confirm
						if(!tmcClient.isUseDefaultConfirm()){
							status.fail();
						}
						
						try {
							if (ignore || !status.isFail()) {
									
									long end = System.currentTimeMillis();
	
									confirm(message.getId());
									
									log.info(String.format("handle message success topic:%s, dataid: %s. total spent %s ,local spent %s", 
											message.getTopic(), message.getDataId(),
											message.getOutgoingTime() == null ? 0 : end - message.getOutgoingTime().getTime(),
													end - begin));
									
							}
						
							if(status.isFail()){
								fail(message.getId(), status.getReason());
							}
						} catch (Exception e) {
							log.warn(String.format("confirm message fail: %s", message.getRaw()), e);
						}
					}
				});
				
				break;
			} catch (RejectedExecutionException ree) {
				log.warn(String.format("all tmc worker threads are currently busy, waiting 50 ms, appkey:%s-group:%s", tmcClient.getAppKey(), tmcClient.getGroupName()));
				try {
					Thread.sleep(50L);
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	protected void confirm(Map<String, Object> message) throws LinkException {
	    confirm((Long)message.get(MessageFields.OUTGOING_ID));
	}
	
	protected void confirm(Long outGoingId) throws LinkException {
	    Map<String, Object> msg = new HashMap<String, Object>();
        msg.put(MessageFields.KIND, MessageKind.Confirm);
        msg.put(MessageFields.CONFIRM_ID, outGoingId);
        tmcClient.getClient().send(msg);
	}
	
	protected void fail(Long outGoingId,String errorMsg) throws LinkException {
	    Map<String, Object> msg = new HashMap<String, Object>();
        msg.put(MessageFields.KIND, MessageKind.Failed);
        msg.put(MessageFields.CONFIRM_ID, outGoingId);
        msg.put(MessageFields.MSG, errorMsg);
        tmcClient.getClient().send(msg);
	}

	protected Message parse(Map<String, Object> raw) throws IOException {
		Message msg = new Message();
		msg.setRaw(raw);
		msg.setId((Long) raw.get(MessageFields.OUTGOING_ID));
		msg.setTopic((String) raw.get(MessageFields.DATA_TOPIC));
		msg.setPubAppKey((String) raw.get(MessageFields.DATA_OUTGOING_PUBLISHER));
		msg.setUserId((Long) raw.get(MessageFields.DATA_OUTGOING_USER_ID));
		msg.setUserNick((String) raw.get(MessageFields.DATA_OUTGOING_USER_NICK));
		msg.setPubTime((Date) raw.get(MessageFields.DATA_PUBLISH_TIME));
		
		Object dataId = raw.get(MessageFields.DATA_DATAID);
		if(dataId != null){
			msg.setDataId(dataId.toString());
		}
		
		Object time = raw.get(MessageFields.DATA_ATTACH_OUTGOING_TIME);
		if (time != null){
			msg.setOutgoingTime((Date) time);
		}

		Object content = raw.get(MessageFields.DATA_CONTENT);
		if (content instanceof String){
			msg.setContent((String) content);
		} else if (content instanceof byte[]) {
			msg.setContent(new String(GZIPHelper.unzip((byte[]) content), Constants.CHARSET_UTF8));
		}
		return msg;
	}

	public abstract class ConfirmWorker implements Runnable{
		
		private int retry;
		private final Long outGoingId;

		public ConfirmWorker(int retry,Long outGoingId){
			this.retry = retry;
			this.outGoingId = outGoingId;
		}

		public void incrRetry() {
			this.retry = this.retry + 1;
		}

		public int getRetry() {
			return retry;
		}

        public Long getOutGoingId() {
            return outGoingId;
        }
	}
}