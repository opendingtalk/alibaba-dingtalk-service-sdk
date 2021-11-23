package com.taobao.api.internal.toplink.channel.websocket;

import java.util.ArrayList;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.WebSocket13FrameDecoder;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketFrame;

// improve io-worker thread usage
// https://github.com/wsky/top-link/issues/37
public class CustomWebSocket13FrameDecoder extends WebSocket13FrameDecoder {

	private List<WebSocketFrame> cumulation;

	public CustomWebSocket13FrameDecoder(boolean maskedPayload, boolean allowExtensions) {
		super(maskedPayload, allowExtensions);
		// disable unfold resuts
		this.setUnfold(false);
	}

	public CustomWebSocket13FrameDecoder(boolean maskedPayload, boolean allowExtensions, long maxFramePayloadLength) {
		super(maskedPayload, allowExtensions, maxFramePayloadLength);
		// disable unfold resuts
		this.setUnfold(false);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		this.cumulation = new ArrayList<WebSocketFrame>();
		super.messageReceived(ctx, e);
		// batch FireMessageReceived
		if (this.cumulation.size() > 0)
			Channels.fireMessageReceived(ctx, cumulation, e.getRemoteAddress());
	}

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer, State state)
			throws Exception {
		Object o = super.decode(ctx, channel, buffer, state);
		
		if (o == null)
			return null;

		if (!(o instanceof BinaryWebSocketFrame || o instanceof TextWebSocketFrame))
			return o;

		// collect binary/text frame only
		this.cumulation.add((WebSocketFrame) o);
		// always return null making calldecode break and do not raise
		// unfoldAndFireMessageReceived
		return null;
	}
}
