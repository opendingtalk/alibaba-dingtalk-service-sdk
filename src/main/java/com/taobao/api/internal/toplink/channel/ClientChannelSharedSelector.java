package com.taobao.api.internal.toplink.channel;

import java.net.URI;
import java.util.Hashtable;

import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.ResetableTimer;
import com.taobao.api.internal.toplink.channel.websocket.WebSocketClient;

public class ClientChannelSharedSelector implements ClientChannelSelector {
	private final static int CONNECT_TIMEOUT = 5000;
	private Hashtable<String, ClientChannel> channels;
	private LoggerFactory loggerFactory;
	private Object lockObject;
	private int heartbeatInterval;

	public ClientChannelSharedSelector() {
		this(DefaultLoggerFactory.getDefault());
	}

	public ClientChannelSharedSelector(LoggerFactory loggerFactory) {
		this.loggerFactory = loggerFactory;
		this.channels = new Hashtable<String, ClientChannel>();
		this.lockObject = new Object();
	}

	public void setHeartbeat(int interval) {
		this.heartbeatInterval = interval;
	}

	public ClientChannel getChannel(URI uri) throws ChannelException {
		final String url = uri.toString();
		if (channels.get(url) == null || !channels.get(url).isConnected()) {
			synchronized (this.lockObject) {
				if (channels.get(url) == null || !channels.get(url).isConnected()) {
					channels.put(url, this.wrapChannel(this.connect(this.loggerFactory, uri, CONNECT_TIMEOUT)));
				}
			}
		}
		return channels.get(url);
	}

	public void returnChannel(ClientChannel channel) {
		// shared channel
	}

	protected ClientChannel connect(LoggerFactory loggerFactory, URI uri, int timeout) throws ChannelException {
		return WebSocketClient.connect(loggerFactory, uri, timeout);
	}

	private ClientChannel wrapChannel(final ClientChannel channel) {
		if (this.heartbeatInterval > 0)
			channel.setHeartbeatTimer(new ResetableTimer(this.heartbeatInterval, null, "tmc-heartbeat"));
		return channel;
	}
}
