package com.taobao.api.internal.toplink.channel.websocket;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.handler.codec.http.DefaultHttpResponse;
import org.jboss.netty.handler.codec.http.HttpHeaders;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.jboss.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.WebSocket13FrameDecoder;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import org.jboss.netty.util.CharsetUtil;

import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelHandler;
import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;
import com.taobao.api.internal.toplink.channel.netty.NettyServerUpstreamHandler;

//one handler per connection
public class WebSocketServerUpstreamHandler extends NettyServerUpstreamHandler {
	private WebSocketServerHandshaker handshaker;
	private boolean cumulative;

	public WebSocketServerUpstreamHandler(LoggerFactory loggerFactory,
			ChannelHandler channelHandler,
			ChannelGroup channelGroup,
			boolean cumulative) {
		super(loggerFactory, channelHandler, channelGroup);
		this.cumulative = cumulative;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		Object msg = e.getMessage();
		if (msg instanceof HttpRequest) {
			this.handleHttpRequest(ctx, (HttpRequest) msg);
		} else if (msg instanceof WebSocketFrame) {
			this.handleWebSocketFrame(ctx, (WebSocketFrame) msg);
		} else if (msg instanceof List<?>) {
			this.handleWebSocketFrame(ctx, (List<WebSocketFrame>) msg);
		}
	}

	private void handleHttpRequest(ChannelHandlerContext ctx, HttpRequest req) {
		this.dump(req);

		if (req.getMethod() != HttpMethod.GET) {
			this.sendHttpResponse(ctx, req,
					new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.FORBIDDEN));
			return;
		}

		this.renderServerChannelContext(req);

		if (this.channelHandler != null) {
			try {
				this.channelHandler.onConnect(this.createContext(req.getHeaders()));
			} catch (Exception e) {
				this.logger.error(e);
				this.sendHttpResponse(ctx, req,
						new DefaultHttpResponse(HttpVersion.HTTP_1_1,
								new HttpResponseStatus(401, e.getMessage())));
				return;
			}
		}

		String subprotocols = null;
		boolean allowExtensions = false;
		WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
				req.getUri(), subprotocols, allowExtensions);
		this.handshaker = wsFactory.newHandshaker(req);
		if (this.handshaker == null) {
			wsFactory.sendUnsupportedWebSocketVersionResponse(ctx.getChannel());
			return;
		}

		// FIXME: maybe not finish for later work
		this.handshaker.handshake(ctx.getChannel(),
				req).addListener(WebSocketServerHandshaker.HANDSHAKE_LISTENER);

		if (this.cumulative)
			// use custom decoder for cumulative
			ctx.getPipeline().replace(WebSocket13FrameDecoder.class, "wsdecoder-custom",
					new CustomWebSocket13FrameDecoder(true,
							allowExtensions,
							this.handshaker.getMaxFramePayloadLength()));
	}

	protected void handleWebSocketFrame(final ChannelHandlerContext ctx,
			WebSocketFrame frame) throws Exception {
		if (frame instanceof CloseWebSocketFrame) {
			this.logger.info(Text.WS_CONNECTION_CLOSED_BY,
					((CloseWebSocketFrame) frame).getStatusCode(),
					this.closedReason = ((CloseWebSocketFrame) frame).getReasonText());
			ctx.getChannel().close();
			return;
		} else if (frame instanceof BinaryWebSocketFrame) {
			if (!((BinaryWebSocketFrame) frame).isFinalFragment()) {
				this.logger.warn(Text.WS_NOT_FINAL);
				return;
			}
			if (this.channelHandler != null) {
				// if not final frame,
				// should wait until final frame received
				// https://github.com/wsky/top-link/issues/5
				ChannelBuffer buffer = ((BinaryWebSocketFrame) frame).getBinaryData();
				this.channelHandler.onMessage(this.createContext(buffer.toByteBuffer()));
			}
		}
		if (this.logger.isDebugEnabled())
			this.logger.debug("unhandled frame: %s", frame);
	}

	private void handleWebSocketFrame(final ChannelHandlerContext ctx,
			List<WebSocketFrame> frames) throws Exception {
		List<ByteBuffer> buffers = new ArrayList<ByteBuffer>();
		for (WebSocketFrame f : frames) {
			buffers.add(f.getBinaryData().toByteBuffer());
		}
		this.channelHandler.onMessage(this.createContext(buffers));
	}

	private void sendHttpResponse(ChannelHandlerContext ctx,
			HttpRequest req, HttpResponse res) {
		if (res.getStatus().getCode() != 200) {
			res.setContent(ChannelBuffers.copiedBuffer(res.getStatus().toString(), CharsetUtil.UTF_8));
			HttpHeaders.setContentLength(res, res.getContent().readableBytes());
		}

		ChannelFuture f = ctx.getChannel().write(res);

		if (res.getStatus().getCode() != 200) {
			f.addListener(ChannelFutureListener.CLOSE);
		}
	}

	private void dump(HttpRequest request) {
		if (!this.logger.isDebugEnabled())
			return;
		this.logger.debug(request.getMethod().getName());
		this.logger.debug(request.getUri());
		for (Entry<String, String> h : request.getHeaders()) {
			this.logger.debug("%s=%s", h.getKey(), h.getValue());
		}
	}

	private void renderServerChannelContext(HttpRequest request) {
		ServerChannelSender serverChannelSender = (WebSocketServerChannelSender) this.sender;
		for (Entry<String, String> h : request.getHeaders())
			serverChannelSender.setContext(h.getKey(), h.getValue());
	}

	@Override
	protected ChannelSender createSender(Channel channel) {
		return new WebSocketServerChannelSender(channel);
	}
}
