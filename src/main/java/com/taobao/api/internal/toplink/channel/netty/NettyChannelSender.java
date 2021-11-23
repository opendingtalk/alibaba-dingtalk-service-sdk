package com.taobao.api.internal.toplink.channel.netty;

import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;

import org.jboss.netty.channel.Channel;

import com.taobao.api.internal.toplink.channel.ChannelSender;

public abstract class NettyChannelSender implements ChannelSender {
	protected Channel channel;
	private Map<Object, Object> context;

	public NettyChannelSender(Channel channel) {
		this.channel = channel;
		this.context = new HashMap<Object, Object>();
	}
	
	public Channel getChannel() {
		return this.channel;
	}
	
	public SocketAddress getLocalAddress() {
		return this.channel.getLocalAddress();
	}
	
	public SocketAddress getRemoteAddress() {
		return this.channel.getRemoteAddress();
	}
	
	public Object getContext(Object key) {
		return this.context.get(key);
	}

	public void setContext(Object key, Object value) {
		this.context.put(key, value);
	}
}