package com.taobao.api.internal.toplink.remoting;

@SuppressWarnings("serial")
public class MethodReturn implements Message {
	public Object ReturnValue;
	public Throwable Exception;
}
