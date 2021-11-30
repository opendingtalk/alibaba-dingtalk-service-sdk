package com.taobao.api.internal.toplink.channel.websocket;

import org.jboss.netty.channel.Channel;

import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class WebSocketServerChannelSender extends WebSocketChannelSender implements ServerChannelSender {
	public WebSocketServerChannelSender(Channel channel) {
		super(channel);
	}

	public boolean isOpen() {
		return this.channel.isOpen();
	}
}
