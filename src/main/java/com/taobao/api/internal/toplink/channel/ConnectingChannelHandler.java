package com.taobao.api.internal.toplink.channel;


public class ConnectingChannelHandler implements ChannelHandler {
	public Throwable error;
	public Object syncObject = new Object();

	public void onConnect(ChannelContext context) {
		synchronized (syncObject) {
			syncObject.notify();
		}
	}

	public void onMessage(ChannelContext context) {
	}

	public void onError(ChannelContext context) {
		error = context.getError();
		synchronized (syncObject) {
			syncObject.notify();
		}
	}

	public void onClosed(String reason) {
	}
}