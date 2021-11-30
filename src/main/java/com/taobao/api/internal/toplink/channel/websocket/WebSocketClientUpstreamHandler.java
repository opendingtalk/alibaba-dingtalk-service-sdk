package com.taobao.api.internal.toplink.channel.websocket;

import java.nio.charset.Charset;
import java.util.Map.Entry;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpHeaders.Names;
import org.jboss.netty.handler.codec.http.HttpHeaders.Values;
import org.jboss.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketFrame;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.netty.NettyClientUpstreamHandler;

// one handler per connection
public class WebSocketClientUpstreamHandler extends NettyClientUpstreamHandler {
	private static HttpResponseStatus SUCCESS = new HttpResponseStatus(101, "Web Socket Protocol Handshake");
	protected WebSocketClientHandshaker handshaker;
	
	public WebSocketClientUpstreamHandler(Logger logger, WebSocketClientChannel clientChannel) {
		super(logger, clientChannel);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		if (!this.handshaker.isHandshakeComplete())
			this.handleHandshake(ctx, (HttpResponse) e.getMessage());
		if (e.getMessage() instanceof WebSocketFrame)
			this.handleWebSocketFrame(ctx, (WebSocketFrame) e.getMessage());
	}

	private void handleHandshake(ChannelHandlerContext ctx, HttpResponse response)
			throws Exception {
		this.dump(response);
		boolean validStatus = response.getStatus().equals(SUCCESS);
		boolean validUpgrade = response.getHeader(Names.UPGRADE) != null &&
				response.getHeader(Names.UPGRADE).equalsIgnoreCase(Values.WEBSOCKET);
		boolean validConnection = response.getHeader(Names.CONNECTION) != null &&
				response.getHeader(Names.CONNECTION).equalsIgnoreCase(Values.UPGRADE);

		if (!validStatus || !validUpgrade || !validConnection) {
			throw new LinkException(response.getStatus().getCode(),
					String.format(Text.WS_HANDSHAKE_INVALID, 
							response.getContent().readable() ?
									response.getContent().toString(Charset.forName("UTF-8")) : ""));
		}

		this.handshaker.finishHandshake(ctx.getChannel(), response);
		if (this.haveHandler())
			this.getHandler().onConnect(this.createContext(response));
	}

	private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame)
			throws Exception {
		if (frame instanceof CloseWebSocketFrame) {
			this.logger.info(Text.WS_CONNECTION_CLOSED_BY,
					((CloseWebSocketFrame) frame).getStatusCode(),
					this.closedReason = ((CloseWebSocketFrame) frame).getReasonText());
			CloseWebSocketFrame closeFrame = (CloseWebSocketFrame) frame;
			this.clear(ctx);
			this.logger.warn(Text.WS_CONNECTION_CLOSED_BY,
					closeFrame.getStatusCode(), closeFrame.getReasonText());
		} else if (frame instanceof BinaryWebSocketFrame) {
			if (!((BinaryWebSocketFrame) frame).isFinalFragment()) {
				this.logger.warn(Text.WS_NOT_FINAL);
				return;
			}
			if (this.haveHandler()) {
				ChannelBuffer buffer = ((BinaryWebSocketFrame) frame).getBinaryData();
				this.getHandler().onMessage(this.createContext(buffer.toByteBuffer()));
			}
		}
	}

	private void dump(HttpResponse response) {
		if (!this.logger.isDebugEnabled())
			return;
		this.logger.debug("%s|%s",
				response.getStatus().getCode(),
				response.getStatus().getReasonPhrase());
		for (Entry<String, String> h : response.getHeaders()) {
			this.logger.debug("%s=%s", h.getKey(), h.getValue());
		}
	}

	public interface ClearHandler {
		public void clear();
	}
}