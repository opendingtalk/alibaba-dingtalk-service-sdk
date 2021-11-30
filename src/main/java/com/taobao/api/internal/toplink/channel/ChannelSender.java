package com.taobao.api.internal.toplink.channel;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

public interface ChannelSender {
	public void send(byte[] data, int offset, int length) throws ChannelException;
	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException;
	public void close(String reason);
	
	// channel info
	public SocketAddress getLocalAddress();
	public SocketAddress getRemoteAddress();
	
	// channel context
	public Object getContext(Object key);
	public void setContext(Object key, Object value);
	
	public interface SendHandler {
		public void onSendComplete(boolean success);
	}
}
