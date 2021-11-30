package com.taobao.api.internal.toplink.channel.websocket;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.handler.codec.http.HttpRequestDecoder;
import org.jboss.netty.handler.codec.http.HttpResponseEncoder;

import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.netty.NettyServerChannel;

public class WebSocketServerChannel extends NettyServerChannel {
	protected boolean cumulative;

	public WebSocketServerChannel(int port) {
		this(port, false);
	}

	public WebSocketServerChannel(int port, boolean cumulative) {
		this(DefaultLoggerFactory.getDefault(), port, cumulative);
	}

	public WebSocketServerChannel(LoggerFactory factory, int port) {
		this(factory, port, false);
	}

	public WebSocketServerChannel(LoggerFactory factory, int port, boolean cumulative) {
		super(factory, port);
		this.cumulative = cumulative;
	}
	
	protected void preparePipeline(ChannelPipeline pipeline) {
		pipeline.addLast("decoder", new HttpRequestDecoder());
		pipeline.addLast("encoder", new HttpResponseEncoder());
		pipeline.addLast("handler", this.createHandler());
	}

	protected void prepareBootstrap(ServerBootstrap bootstrap) {
	}

	protected WebSocketServerUpstreamHandler createHandler() {
		return new WebSocketServerUpstreamHandler(
				this.loggerFactory,
				this.channelHandler,
				this.allChannels,
				this.cumulative);
	}
}
