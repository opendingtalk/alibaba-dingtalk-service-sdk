package com.taobao.api.internal.toplink.channel.tcp;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;

import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.channel.netty.NettyClientUpstreamHandler;

public class TcpClientUpstreamHandler extends NettyClientUpstreamHandler {
	public TcpClientUpstreamHandler(Logger logger, TcpClientChannel clientChannel) {
		super(logger, clientChannel);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		if (this.haveHandler())
			this.getHandler().onMessage(this.createContext(e.getMessage()));
	}
}