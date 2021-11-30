package com.taobao.api.internal.toplink.channel;

import java.net.URI;

public interface ClientChannelSelector {
	public ClientChannel getChannel(URI uri) throws ChannelException;
	public void returnChannel(ClientChannel channel);
}