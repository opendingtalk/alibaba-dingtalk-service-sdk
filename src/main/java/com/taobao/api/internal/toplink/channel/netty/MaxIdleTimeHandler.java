package com.taobao.api.internal.toplink.channel.netty;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import org.jboss.netty.handler.timeout.IdleState;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelHandler;
import org.jboss.netty.handler.timeout.IdleStateEvent;

import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.Text;

// IdleStateHandler.
// http://docs.jboss.org/netty/3.2/api/org/jboss/netty/handler/timeout/IdleStateHandler.html
public class MaxIdleTimeHandler extends IdleStateAwareChannelHandler {
	private Logger logger;
	private int maxIdleTimeSeconds;

	public MaxIdleTimeHandler(LoggerFactory loggerFactory, int maxIdleTimeSeconds) {
		this.logger = loggerFactory.create(this);
		this.maxIdleTimeSeconds = maxIdleTimeSeconds;
	}

	@Override
	public void channelIdle(ChannelHandlerContext ctx, IdleStateEvent e) throws InterruptedException {
		if (e.getState() == IdleState.ALL_IDLE) {
			this.closeChannel(ctx, 1011, Text.REACH_MAX_IDLE);
			this.logger.info(Text.REACH_MAX_IDLE_AND_CLOSE, this.maxIdleTimeSeconds);
		}
	}

	private void closeChannel(ChannelHandlerContext ctx, int statusCode, String reason) throws InterruptedException {
		ctx.getChannel().write(new CloseWebSocketFrame(statusCode, reason)).sync();
		ctx.getChannel().close();
	}
}
