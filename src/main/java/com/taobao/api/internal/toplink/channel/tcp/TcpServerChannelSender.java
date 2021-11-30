package com.taobao.api.internal.toplink.channel.tcp;

import java.util.HashMap;
import java.util.Map;

import org.jboss.netty.channel.Channel;

import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class TcpServerChannelSender extends TcpChannelSender implements ServerChannelSender{
	private Map<Object, Object> context;

	public TcpServerChannelSender(Channel channel) {
		super(channel);
		this.context = new HashMap<Object, Object>();
	}

	@Override
	public Object getContext(Object key) {
		return this.context.get(key);
	}

	@Override
	public void setContext(Object key, Object value) {
		this.context.put(key, value);
	}

	public boolean isOpen() {
		return this.channel.isOpen();
	}
}