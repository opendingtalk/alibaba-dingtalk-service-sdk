package com.taobao.api.internal.toplink.remoting;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class MethodCallContext {
	private Map<Object, Object> callContext;
	private ServerChannelSender sender;

	public MethodCallContext(ChannelSender sender) {
		this.sender = (ServerChannelSender) sender;
		this.callContext = new HashMap<Object, Object>();
	}

	public Object get(Object key) {
		Object val = this.getCallContext(key);
		// callcontext first
		return val != null ? val : this.sender.getContext(key);
	}

	public Object getCallContext(Object key) {
		return this.callContext.get(key);
	}

	public void setCallContext(Object key, Object value) {
		this.callContext.put(key, value);
	}
}
