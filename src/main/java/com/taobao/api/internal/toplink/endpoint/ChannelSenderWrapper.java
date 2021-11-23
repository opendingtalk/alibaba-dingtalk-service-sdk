package com.taobao.api.internal.toplink.endpoint;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class ChannelSenderWrapper implements ChannelSender {
	private ChannelSender sender;
	private int protocolVersion;

	public ChannelSenderWrapper(ChannelSender sender, int protocolVersion) {
		this.sender = sender;
		this.protocolVersion = protocolVersion;
	}

	public int getProtocolVersion() {
		return this.protocolVersion;
	}
	
	public ChannelSender getChannelSender() {
		return this.sender;
	}

	public boolean isValid() {
		return (this.sender instanceof ClientChannel && ((ClientChannel) this.sender).isConnected()) ||
				(this.sender instanceof ServerChannelSender && ((ServerChannelSender) this.sender).isOpen());
	}

	public void send(byte[] data, int offset, int length) throws ChannelException {
		this.sender.send(data, offset, length);
	}

	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		this.sender.send(dataBuffer, sendHandler);
	}

	public void close(String reason) {
		this.sender.close(reason);
	}

	public SocketAddress getLocalAddress() {
		return this.sender.getLocalAddress();
	}

	public SocketAddress getRemoteAddress() {
		return this.sender.getRemoteAddress();
	}

	public Object getContext(Object key) {
		return this.sender.getContext(key);
	}

	public void setContext(Object key, Object value) {
		this.sender.setContext(key, value);
	}
}
