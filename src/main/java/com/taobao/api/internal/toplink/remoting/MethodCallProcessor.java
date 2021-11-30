package com.taobao.api.internal.toplink.remoting;

public interface MethodCallProcessor {
	public MethodReturn process(MethodCall methodCall, MethodCallContext callContext) throws Throwable;
}