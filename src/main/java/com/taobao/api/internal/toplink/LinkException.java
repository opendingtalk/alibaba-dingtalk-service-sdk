package com.taobao.api.internal.toplink;

public class LinkException extends Exception {

	private static final long serialVersionUID = 2528412120681347894L;

	private int errorCode;

	public int getErrorCode() {
		return this.errorCode;
	}

	public LinkException() {
		this("");
	}

	public LinkException(String message) {
		super(message);
	}

	public LinkException(String message, Exception innerException) {
		super(message, innerException);
	}

	public LinkException(String message, Throwable innerException) {
		super(message, innerException);
	}

	public LinkException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public LinkException(int errorCode, String message, Exception innerException) {
		super(message, innerException);
		this.errorCode = errorCode;
	}

	public LinkException(int errorCode, String message, Throwable innerException) {
		super(message, innerException);
		this.errorCode = errorCode;
	}
}
