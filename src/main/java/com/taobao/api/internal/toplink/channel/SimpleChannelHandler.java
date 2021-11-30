package com.taobao.api.internal.toplink.channel;

public abstract class SimpleChannelHandler implements ChannelHandler {
	public void onConnect(ChannelContext context) throws Exception {

	}
	
	public void onError(ChannelContext context) throws Exception {
	}
	
	public void onClosed(String reason) {	
	}
}
