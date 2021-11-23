package com.taobao.api.internal.toplink.remoting;

// one callback per rpc-call
public abstract class RemotingCallback {

	public Integer flag;

	public String serializationFormat;
	
	public Class<?> returnType;

	public abstract void onException(Throwable exception);

	public abstract void onMethodReturn(MethodReturn methodReturn);
}
