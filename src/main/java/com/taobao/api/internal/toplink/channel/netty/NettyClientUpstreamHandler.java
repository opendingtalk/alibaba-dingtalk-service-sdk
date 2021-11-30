package com.taobao.api.internal.toplink.channel.netty;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelContext;
import com.taobao.api.internal.toplink.channel.ChannelHandler;

public class NettyClientUpstreamHandler extends SimpleChannelUpstreamHandler {
	protected Logger logger;
	protected NettyClientChannel clientChannel;
	protected String closedReason;

	public NettyClientUpstreamHandler(Logger logger, NettyClientChannel clientChannel) {
		this.logger = logger;
		this.clientChannel = clientChannel;
	}

	@Override
	public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
		this.clientChannel.setChannel(ctx.getChannel());
	}

	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		if (this.closedReason == null)
			this.logger.warn(Text.CHANNEL_CLOSED);
		if (this.haveHandler())
			this.getHandler().onClosed(this.closedReason);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		if (this.haveHandler())
			this.getHandler().onError(this.createContext(e.getCause()));
		this.clear(ctx);
		this.logger.error(Text.ERROR_AT_CLIENT, e.getCause());
	}

	protected boolean haveHandler() {
		return this.clientChannel != null &&
				this.clientChannel.getChannelHandler() != null;
	}

	protected ChannelHandler getHandler() {
		return this.clientChannel.getChannelHandler();
	}

	protected ChannelContext createContext(Object message) {
		ChannelContext ctx = new ChannelContext();
		ctx.setSender(this.clientChannel);
		ctx.setMessage(message);
		return ctx;
	}

	protected ChannelContext createContext(Throwable error) {
		ChannelContext ctx = new ChannelContext();
		ctx.setSender(this.clientChannel);
		ctx.setError(error);
		return ctx;
	}

	protected void clear(ChannelHandlerContext ctx) {
		ctx.getChannel().close();
	}
}
