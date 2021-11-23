package com.taobao.api.internal.toplink.channel;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.channel.ChannelSender.SendHandler;

public class ChannelContext {
	private Throwable error;
	private ChannelSender sender;
	private Object message;

	public Throwable getError() {
		return this.error;
	}

	public void setError(Throwable e) {
		this.error = e;
	}

	public ChannelSender getSender() {
		return this.sender;
	}
	
	public void setSender(ChannelSender sender) {
		this.sender=sender;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	
	public Object getMessage() {
		return this.message;
	}

	public void reply(byte[] data, int offset, int length) throws ChannelException {
		this.sender.send(data, offset, length);
	}

	public void reply(ByteBuffer dataBuffer) throws ChannelException {
		this.sender.send(dataBuffer, null);
	}

	public void reply(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		this.sender.send(dataBuffer, sendHandler);
	}
}
