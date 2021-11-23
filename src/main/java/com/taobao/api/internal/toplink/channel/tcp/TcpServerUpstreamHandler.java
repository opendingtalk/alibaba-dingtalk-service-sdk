package com.taobao.api.internal.toplink.channel.tcp;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.group.ChannelGroup;

import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelHandler;
import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.netty.NettyServerUpstreamHandler;

public class TcpServerUpstreamHandler extends NettyServerUpstreamHandler {
	public TcpServerUpstreamHandler(LoggerFactory loggerFactory,
			ChannelHandler channelHandler,
			ChannelGroup channelGroup) {
		super(loggerFactory, channelHandler, channelGroup);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		if(this.channelHandler!=null)
			this.channelHandler.onMessage(this.createContext(e.getMessage()));
	}

	@Override
	protected ChannelSender createSender(Channel channel) {
		return new TcpServerChannelSender(channel);
	}
}
