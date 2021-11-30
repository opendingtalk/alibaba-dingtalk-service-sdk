package com.taobao.api.internal.toplink.remoting;

public class RemotingException extends Throwable {

	private static final long serialVersionUID = 1231494988352101100L;

	public RemotingException(String message) {
		super(message);
	}

	public RemotingException(String message, Exception innerException) {
		super(message, innerException);
	}
	
	public RemotingException(String message, Throwable innerException) {
		super(message, innerException);
	}
}
