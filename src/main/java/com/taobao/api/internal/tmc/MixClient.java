package com.taobao.api.internal.tmc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ClientChannelSharedSelector;
import com.taobao.api.internal.toplink.channel.embedded.EmbeddedClientChannelSharedSelector;
import com.taobao.api.internal.toplink.endpoint.Endpoint;
import com.taobao.api.internal.toplink.endpoint.EndpointChannelHandler;
import com.taobao.api.internal.toplink.endpoint.EndpointProxy;
import com.taobao.api.internal.toplink.endpoint.Identity;
import com.taobao.api.internal.toplink.endpoint.MessageHandler;
import com.taobao.api.internal.toplink.logging.LogUtil;

/**
 * 消息服务-推拉客户端
 */
class MixClient {

	protected Logger logger;
	protected Identity id;
	private Endpoint endpoint;
	private URI serverUri;
	private EndpointProxy server;
	private ClientChannelSharedSelector selector;

	private Timer reconnectTimer;
	private int reconnectInterval;

	public MixClient(Identity id, int reconnectInterval, int heartbeatInterval) {
		this.reconnectInterval = reconnectInterval;

		// whatever, log first
		LoggerFactory loggerFactory = LogUtil.getLoggerFactory(this);
		this.logger = loggerFactory.create(this);

		// sharedpool with heartbeat
		this.selector = new EmbeddedClientChannelSharedSelector(loggerFactory);
		this.selector.setHeartbeat(heartbeatInterval);

		// custom scheduler
		EndpointChannelHandler channelHandler = new EndpointChannelHandler(loggerFactory);
		// client do not need complex scheduler, only one io-thread
		// channelHandler.setScheduler(scheduler);

		this.endpoint = new Endpoint(loggerFactory, this.id = id);
		this.endpoint.setClientChannelSelector(this.selector);
		this.endpoint.setChannelHandler(channelHandler);
	}

	protected Identity getIdentity() {
		return this.id;
	}

	protected void setMessageHandler(MessageHandler handler) {
		this.endpoint.setMessageHandler(handler);
	}

	protected void connect(String uri, boolean async) throws LinkException {
		try {
			this.connect(new URI(uri));
		} catch (URISyntaxException e) {
			this.logger.error(e);
		} catch (LinkException e) {
			if (!async) {
				throw e;
			} else {
				this.logger.warn(String.format("%s unable to connect to tmc server: %s, waiting %s milliseconds to connect", this.id.toString(), uri, this.reconnectInterval), e);
			}
		}
		this.startReconnect();
	}

	private void connect(URI uri) throws LinkException {
		this.serverUri = uri;
		this.server = this.endpoint.getEndpoint(new ServerIdentity(), uri, this.createConnectHeaders());
		this.logger.warn("%s connected to tmc server: %s", this.id, this.serverUri);
	}

	protected void disconnect(String reason) {
		this.stopReconnect();

		if (this.server == null || !this.server.hasValidSender())
			return;

		try {
			ClientChannel channel = this.selector.getChannel(this.serverUri);
			if (channel != null) {
				channel.close(reason);
			}
		} catch (ChannelException e) {
			this.logger.error(e);
		}
	}

	protected final void send(Map<String, Object> message) throws ChannelException {
		this.server.send(message);
	}

	protected final void sendAndWait(Map<String, Object> message, int timeout) throws LinkException {
		this.server.sendAndWait(message, timeout);
	}

	protected Map<String, Object> createConnectHeaders() throws LinkException {
		return null;
	}

	protected boolean isOnline() {
		return this.server != null && this.server.hasValidSender();
	}

	private void startReconnect() {
		this.reconnectTimer = new Timer("tmc-reconnect", true);
		this.reconnectTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					if (!isOnline()) {
						logger.warn(String.format("%s reconnecting...", id));
						connect(serverUri);
					}
				} catch (Exception e) {
					logger.warn("reconnect error", e);
				}
			}
		}, this.reconnectInterval, this.reconnectInterval);
	}

	private void stopReconnect() {
		if (this.reconnectTimer != null) {
			this.reconnectTimer.cancel();
			this.reconnectTimer = null;
		}
	}
	
	public void close(){
		server = null ;
	}

	public class ServerIdentity implements Identity {
		public Identity parse(Object data) throws LinkException {
			return null;
		}

		public void render(Object to) {
		}

		public boolean equals(Identity id) {
			return id instanceof ServerIdentity;
		}

		public String toString() {
			return id.toString();
		}
	}
}
