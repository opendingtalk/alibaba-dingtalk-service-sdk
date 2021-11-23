package com.taobao.api.internal.toplink.channel;

import java.net.URI;

import com.taobao.api.internal.toplink.ResetableTimer;

public interface ClientChannel extends ChannelSender {
	public boolean isConnected();
	public ChannelHandler getChannelHandler();
	public void setChannelHandler(ChannelHandler handler);
	public void setUri(URI uri);
	public URI getUri();
	public void setHeartbeatTimer(ResetableTimer timer);
}