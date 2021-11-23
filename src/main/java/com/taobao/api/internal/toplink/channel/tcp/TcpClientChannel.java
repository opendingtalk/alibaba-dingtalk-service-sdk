package com.taobao.api.internal.toplink.channel.tcp;

import java.net.URI;
import java.nio.ByteBuffer;

import org.jboss.netty.channel.Channel;

import com.taobao.api.internal.toplink.ResetableTimer;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelHandler;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.netty.NettyClientChannel;

public class TcpClientChannel extends TcpChannelSender implements ClientChannel, NettyClientChannel {
	private URI uri;
	private ChannelHandler channelHandler;
	private ResetableTimer timer;

	public TcpClientChannel() {
		super(null);
	}
	
	public TcpClientChannel(Channel channel) {
		super(channel);
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	public void setUri(URI uri) {
		this.uri = uri;
	}

	public URI getUri() {
		return this.uri;
	}

	public ChannelHandler getChannelHandler() {
		this.delayPing();
		return this.channelHandler;
	}

	public void setChannelHandler(ChannelHandler handler) {
		this.channelHandler = handler;
	}

	public boolean isConnected() {
		return this.channel.isConnected();
	}

	public void setHeartbeatTimer(ResetableTimer timer) {
		this.timer = timer;
		this.timer.setTask(new Runnable() {
			public void run() {
				// if (isConnected())
				// TODO:easy heartbeat frame
				// channel.write();
			}
		});
		this.timer.start();
	}

	@Override
	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		this.checkChannel();
		super.send(dataBuffer, sendHandler);
	}

	@Override
	public void send(byte[] data, int offset, int length) throws ChannelException {
		this.checkChannel();
		super.send(data, offset, length);
	}

	private void checkChannel() throws ChannelException {
		// prevent unknown exception after connected and get channel
		// channel.write is async default
		if (!this.channel.isConnected()) {
			if (this.timer != null)
				this.timer.stop();
			throw new ChannelException(Text.CHANNEL_CLOSED);
		}
		this.delayPing();
	}

	private void delayPing() {
		if (this.timer != null)
			this.timer.delay();
	}
}
