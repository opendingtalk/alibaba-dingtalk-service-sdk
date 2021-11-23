package com.taobao.api.internal.toplink.endpoint;

public interface MessageHandler {
	public void onMessage(EndpointContext context) throws Exception;
	public void onAckMessage(EndpointBaseContext context);
}