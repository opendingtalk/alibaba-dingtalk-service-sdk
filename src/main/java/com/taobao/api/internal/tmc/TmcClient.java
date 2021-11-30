package com.taobao.api.internal.tmc;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.util.NamedThreadFactory;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 消息服务客户端入口。
 * 
 * @author fengsheng
 * @since 1.0, May 4, 2013
 */
public class TmcClient {

	private static final Log log = LogFactory.getLog("tmcClient");

	// sign parameters
	private static final String TIMESTAMP = Constants.TIMESTAMP;
	private static final String APP_KEY = Constants.APP_KEY;
	private static final String GROUP_NAME = "group_name";
	private static final String MINOR_GROUP = "minor_group";
	private static final String FILTER_EXP = "filter_exp";
	private static final String INTRANET_IP = "intranet_ip";
	private static final String TOKEN = "token";
	private static final String SIGN = Constants.SIGN;
	private static final String SDK = "sdk";
	private static final String OUT_ID = "out_id";

	private final AtomicBoolean connected = new AtomicBoolean(false);

	private InnerClient client;
	private MessageHandler messageHandler;
	private TmcHandler tmcHandler;

	private ThreadPoolExecutor threadPool;
	private ThreadPoolExecutor confirmThreadPool = null;
	private int queueSize = 2000; // 消息缓冲队列大小
	private int threadCount = Runtime.getRuntime().availableProcessors() * 10; // 并发处理的线程数量
	private int confirmThreadCount = 4; // 手动确认线程数量

	private int fetchPeriod = 15; // 定时获取消息周期（单位：秒）
	private int reconnectInterval = 10000; // 连接关闭后的重连时间间隔（单位：毫秒）
	private int heartbeatInterval = 45000; // 客户端与服务端心跳时间间隔（单位：毫秒）

	private boolean removeDuplicate = false; // 是否启用消息去重功能
	private boolean useDefaultConfirm = true; // 是否采用系统默认确认消息
	private KeySelector keySelector; // 默认对交易、商品、退款进行去重

	private Timer fetchTimer;
	private TimerTask fetchTimerTask;

	private String uri; // 消息通道服务地址
	private String appKey;
	private String groupName;
	private String minorGroup;
	private String filterExp;
	
	private String apiUrl = null;

	public TmcClient(String appKey, String appSecret) {
		this(appKey, appSecret, "default"); // 默认分组+线上服务
	}

	public TmcClient(String appKey, String appSecret, String groupName) {
		this("ws://mc.api.taobao.com/", appKey, appSecret, groupName); // 指定分组+线上服务
	}

	public TmcClient(String uri, String appKey, String appSecret, String groupName) {
		this(uri, appKey, appSecret, groupName,"default");
	}
	
	public TmcClient(String uri, String appKey, String appSecret, String groupName,String minorGroup) {
		this(uri, appKey, appSecret, groupName,minorGroup,"*");
	}
	
	public TmcClient(String uri, String appKey, String appSecret, String groupName,String minorGroup,String filterExp) {
		if(apiUrl == null && uri.contains("mc.api.taobao.com")){
			apiUrl = "http://gw.api.taobao.com/router/rest";
		}
		
		if(minorGroup == null)
			minorGroup = "default";
		if(filterExp == null)
			filterExp = "*";
		this.uri = uri;
		this.appKey = appKey;
		this.groupName = groupName;
		this.minorGroup = minorGroup;
		this.filterExp = filterExp;
		this.client = new InnerClient(new TmcIdentity(appKey, groupName,minorGroup,filterExp));
		this.client.appKey = appKey;
		this.client.appSecret = appSecret;
		this.client.groupName = groupName;
		this.client.minorGroup = minorGroup;
		this.client.filterExp = filterExp;
		
	}

	public String getMinorGroup() {
		return minorGroup;
	}

	public String getFilterExp() {
		return filterExp;
	}

	protected void setUri(String uri) {
		this.uri = uri;
	}

	protected String getAppKey() {
		return this.appKey;
	}

	protected String getGroupName() {
		return this.groupName;
	}

	protected InnerClient getClient() {
		return this.client;
	}

	protected ThreadPoolExecutor getThreadPool() {
		return this.threadPool;
	}

	public ThreadPoolExecutor getConfirmThreadPool() {
		return confirmThreadPool;
	}

	protected MessageHandler getMessageHandler() {
		return this.messageHandler;
	}

	public void setMessageHandler(MessageHandler handler) {
		this.messageHandler = handler;
	}

	protected TmcHandler getTmcHandler() {
		return this.tmcHandler;
	}

	protected int getQueueSize() {
		return this.queueSize;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setAuthApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public void setQueueSize(int queueSize) {
		if (queueSize < threadCount) {
			throw new IllegalArgumentException("queue size must greater than thread count");
		}
		this.queueSize = queueSize;
	}

	public void setThreadCount(int threadCount) {
		if (threadCount < 1) {
			throw new IllegalArgumentException("thread count must greater than 1");
		}
		this.threadCount = threadCount;
	}
	
	public void setConfirmThreadCount(int threadCount) {
		if (threadCount < 1) {
			throw new IllegalArgumentException("thread count must greater than 1");
		}
		this.confirmThreadCount = threadCount;
	}

	public String getOutId() {
		return this.client.getOutId();
	}

	public void setOutId(String outId) {
		this.client.setOutId(outId);
	}

	public void setFetchPeriod(int fetchPeriod) {
		if (fetchPeriod < 1) {
			throw new IllegalArgumentException("fetch period must greater than 1");
		}
		this.fetchPeriod = fetchPeriod;
	}

	public void setRemoveDuplicate(boolean removeDuplicate) {
		this.removeDuplicate = removeDuplicate;
	}

	protected KeySelector getKeySelector() {
		return this.keySelector;
	}

	public void setKeySelector(KeySelector keySelector) {
		this.keySelector = keySelector;
	}

	/**
	 * 连接到线上服务器。
	 */
	public void connect() throws LinkException {
		connect(false);
	}

	/**
	 * 连接到指定的服务器。
	 * 
	 * @param uri 消息服务地址，线上或沙箱
	 */
	public void connect(String uri) throws LinkException {
		connect(uri, false);
	}

	/**
	 * 连接到指定的服务器。
	 * 
	 * @param uri 消息服务地址，线上或沙箱
	 * @param async 是否异步的发起连接
	 */
	public void connect(String uri, boolean async) throws LinkException {
		this.uri = uri;
		
		if(uri.contains("mc.api.taobao.com")){
			apiUrl = "http://gw.api.taobao.com/router/rest";
		}else{
			apiUrl = null;
		}
		connect(async);
	}

	/**
	 * 连接到线上服务器。
	 */
	private void connect(boolean async) throws LinkException {
		if (!connected.compareAndSet(false, true)) {
			return;
		}
		if (this.removeDuplicate) {
			this.tmcHandler = new DuplicateRemoverTmcHandler(this);
		} else {
			this.tmcHandler = new TmcHandler(this);
		}
		this.client.setMessageHandler(this.tmcHandler);
		this.threadPool = new ThreadPoolExecutor(threadCount, threadCount, fetchPeriod * 2, TimeUnit.MICROSECONDS,
				new ArrayBlockingQueue<Runnable>(queueSize), new NamedThreadFactory("tmc-worker"), new AbortPolicy());
		try {
			this.client.connect(uri, async);
		} catch (LinkException e) {
			connected.set(false);
			throw e;
		}
		this.doPullRequest();
	}

	/**
	 * 向指定的主题发布一条与用户无关的消息。
	 * 
	 * @param topic 主题名称
	 * @param content 严格根据主题定义的消息内容（JSON/XML）
	 */
	public void send(String topic, String content) throws LinkException {
		if (StringUtils.isEmpty(topic)) {
			throw new LinkException("topic is required");
		}
		if (StringUtils.isEmpty(content)) {
			throw new LinkException("content is required");
		}

		Map<String, Object> msg = new HashMap<String, Object>();
		msg.put(MessageFields.KIND, MessageKind.Data);
		msg.put(MessageFields.DATA_TOPIC, topic);
		msg.put(MessageFields.DATA_CONTENT, content);
		this.client.sendAndWait(msg, 2000);
	}

	/**
	 * 向指定的主题发布一条与用户相关的消息。
	 * 
	 * @param topic 主题名称
	 * @param content 严格根据主题定义的消息内容（JSON/XML）
	 * @param session 用户授权码
	 */
	public void send(String topic, String content, String session) throws LinkException {
		if (StringUtils.isEmpty(topic)) {
			throw new LinkException("topic is required");
		}
		if (StringUtils.isEmpty(content)) {
			throw new LinkException("content is required");
		}
		if (StringUtils.isEmpty(session)) {
			throw new LinkException("session is required");
		}

		Map<String, Object> msg = new HashMap<String, Object>();
		msg.put(MessageFields.KIND, MessageKind.Data);
		msg.put(MessageFields.DATA_TOPIC, topic);
		msg.put(MessageFields.DATA_CONTENT, content);
		msg.put(MessageFields.DATA_INCOMING_USER_SESSION, session);
		this.client.sendAndWait(msg, 2000);
	}
	
	public void manualConfirm(Message message){
		this.tmcHandler.handleConfirm(message);
	}
	
	public void manualConfirm(Long outGoingId) {
	    this.tmcHandler.handleConfirm(outGoingId);
	}
	
	public void retryMessage(Message message) throws RejectedExecutionException {
		this.tmcHandler.retryMessage(message);
	}

	public void close() {
		this.close("tmc client closed");
	}

	/**
	 * 关闭TMC长连接并释放所有资源。
	 * 
	 * @param reason 关闭的原因
	 */
	public void close(String reason) {
		this.stopPullRequest();
		if (this.tmcHandler != null) {
			this.tmcHandler.close();
		}
		if (this.threadPool != null) {
			this.threadPool.shutdown();
			this.threadPool = null;
		}
		
		if(this.confirmThreadPool != null){
			this.confirmThreadPool.shutdown();
			this.confirmThreadPool = null;			
		}
		
		this.client.disconnect(reason);
		client.close();
		connected.set(false);
		log.warn("tmc client closed");
	}

	/**
	 * 检查TMC长连接是否存活。
	 */
	public boolean isOnline() {
		return this.client != null && this.client.isOnline();
	}

	protected void pullRequest() {
		try {
			Map<String, Object> msg = new HashMap<String, Object>();
			msg.put(MessageFields.KIND, MessageKind.PullRequest);
			if (this.client.isOnline()) {
				this.client.send(msg);
			}
		} catch (Exception e) {
			log.warn("pull request error", e);
		}
	}

	private void doPullRequest() {
		this.stopPullRequest();
		this.fetchTimerTask = new TimerTask() {
			public void run() {
				pullRequest();
			}
		};
		Date begin = new Date();
		begin.setTime(begin.getTime() + fetchPeriod * 1000L);
		this.fetchTimer = new Timer("tmc-pull", true);
		this.fetchTimer.schedule(this.fetchTimerTask, begin, fetchPeriod * 1000L);
	}

	private void stopPullRequest() {
		if (this.fetchTimer != null) {
			this.fetchTimer.cancel();
			this.fetchTimer = null;
		}
	}

	class InnerClient extends MixClient {
		private String appKey;
		private String appSecret;
		private String groupName;
		private String minorGroup;
		private String filterExp;
		private String outId;

		public InnerClient(TmcIdentity id) {
			super(id, reconnectInterval, heartbeatInterval);
		}

		@Override
		protected Map<String, Object> createConnectHeaders() throws LinkException{
			Map<String, String> signHeader = new HashMap<String, String>();
			signHeader.put(TIMESTAMP, String.valueOf(System.currentTimeMillis()));
			signHeader.put(APP_KEY, this.appKey);
			signHeader.put(GROUP_NAME, this.groupName);
			try {
				signHeader.put(SIGN, TaobaoUtils.signTopRequest(signHeader, null, this.appSecret, Constants.SIGN_METHOD_MD5));
			} catch (Exception e) {
				log.error("tmc sign error", e);
			}
			try{
				Map<String, Object> requestHeader = new HashMap<String, Object>();
				requestHeader.putAll(signHeader);
				requestHeader.put(SDK, Constants.SDK_VERSION);
				requestHeader.put(INTRANET_IP, TaobaoUtils.getIntranetIp());
				requestHeader.put(TOKEN, getConnectionToken());
				requestHeader.put(MINOR_GROUP, minorGroup);
				requestHeader.put(FILTER_EXP, filterExp);
				if(outId != null){
					requestHeader.put(OUT_ID, outId);
				}
				return requestHeader;
			}catch(Exception e){
				throw new LinkException(e.getMessage());
			}
		}
		
		public String getConnectionToken() throws ApiException{
			if(apiUrl != null && apiUrl.length() > 0){
				TaobaoClient client = new DefaultTaobaoClient(apiUrl, appKey, appSecret);
				TmcAuthGetRequest request = new TmcAuthGetRequest();
				request.setGroup(this.groupName);
				
				TmcAuthGetResponse response = client.execute(request);
				if(response.isSuccess()){
					return response.getResult();
				}else{
					throw new ApiException(response.getMsg());
				}
			}
			return null;
		}

		public String getOutId() {
			return outId;
		}

		public void setOutId(String outId) {
			this.outId = outId;
		}
		
	}

	public boolean isUseDefaultConfirm() {
		return this.useDefaultConfirm;
	}

	public void setUseDefaultConfirm(boolean useDefaultConfirm) throws InterruptedException {
		if(!useDefaultConfirm && confirmThreadPool == null){
			this.confirmThreadPool = new ThreadPoolExecutor(confirmThreadCount, confirmThreadCount, fetchPeriod * 2, TimeUnit.SECONDS,
					new ArrayBlockingQueue<Runnable>(queueSize), new NamedThreadFactory("tmc-confirm-worker"), new AbortPolicy());
		}

		if(useDefaultConfirm && confirmThreadPool != null){
			this.confirmThreadPool.awaitTermination(30, TimeUnit.SECONDS);
		}

		this.useDefaultConfirm = useDefaultConfirm;
	}

}
