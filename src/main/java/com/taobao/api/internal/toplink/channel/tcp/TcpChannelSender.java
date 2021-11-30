package com.taobao.api.internal.toplink.channel.tcp;

import java.nio.ByteBuffer;

import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;

import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.netty.NettyChannelSender;

public abstract class TcpChannelSender extends NettyChannelSender {
	public TcpChannelSender(Channel channel) {
		super(channel);
	}

	public void send(byte[] data, int offset, int length) throws ChannelException {
		this.send(ChannelBuffers.wrappedBuffer(data, offset, length), null);
	}

	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		this.send(ChannelBuffers.wrappedBuffer(dataBuffer), sendHandler);
	}

	public void close(String reason) {
		channel.write(reason).addListener(new ChannelFutureListener() {
			public void operationComplete(ChannelFuture future) throws Exception {
				future.getChannel().close();
			}
		});
	}

	private void send(Object message, final SendHandler sendHandler) throws ChannelException {
		if (sendHandler == null)
			this.channel.write(message);
		else
			this.channel.write(message).addListener(new ChannelFutureListener() {
				public void operationComplete(ChannelFuture future) throws Exception {
					if (sendHandler != null)
						sendHandler.onSendComplete(future.isSuccess());
				}
			});
	}
}