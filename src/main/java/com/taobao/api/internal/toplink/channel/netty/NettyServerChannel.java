package com.taobao.api.internal.toplink.channel.netty;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.group.ChannelGroup;
import org.jboss.netty.channel.group.DefaultChannelGroup;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.ssl.SslHandler;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.jboss.netty.util.HashedWheelTimer;
import org.jboss.netty.util.Timer;

import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ServerChannel;

public abstract class NettyServerChannel extends ServerChannel {
	private static NioServerSocketChannelFactory nioServerSocketChannelFactory = new NioServerSocketChannelFactory(
			Executors.newCachedThreadPool(),
			Executors.newCachedThreadPool());

	private ServerBootstrap bootstrap;
	protected ChannelGroup allChannels;
	protected SSLContext sslContext;

	public NettyServerChannel(LoggerFactory factory, int port) {
		super(factory, port);
		this.allChannels = new DefaultChannelGroup();
	}

	public void setSSLContext(SSLContext sslContext) {
		this.sslContext = sslContext;
	}

	@Override
	public void run() {
		this.bootstrap = new ServerBootstrap(nioServerSocketChannelFactory);
		// http://netty.io/3.6/xref/org/jboss/netty/channel/socket/nio/DefaultNioSocketChannelConfig.html
		// http://stackoverflow.com/questions/8655973/latency-in-netty-due-to-passing-requests-from-boss-thread-to-worker-thread
		// http://docs.jboss.org/netty/3.2/api/org/jboss/netty/channel/socket/ServerSocketChannelConfig.html
		// http://docs.jboss.org/netty/3.2/api/org/jboss/netty/channel/socket/nio/NioSocketChannelConfig.html
		// http://docs.oracle.com/javase/6/docs/technotes/guides/net/socketOpt.html
		// http://stackoverflow.com/questions/9916796/tuning-netty-on-32-core-10gbit-hosts
		bootstrap.setOption("reuseAddress", true);
		bootstrap.setOption("backlog", 1024);
		// bootstrap.setOption("writeSpinCount", 16);
		// bootstrap.setOption("writeBufferHighWaterMark", 64 * 1024 * 1024);
		// bootstrap.setOption("writeBufferLowWaterMark", 32 * 1024 * 1024);
		// bootstrap.setOption("receiveBufferSizePredictor", 16);
		// bootstrap.setOption("receiveBufferSizePredictorFactory", 16);
		bootstrap.setOption("sendBufferSize", 1048576);
		bootstrap.setOption("receiveBufferSize", 1048576);
		bootstrap.setOption("child.sendBufferSize", 1048576);
		bootstrap.setOption("child.receiveBufferSize", 1048576);
		bootstrap.setOption("child.tcpNoDelay", true);
		this.prepareBootstrap(this.bootstrap);

		// shared timer for idle
		final Timer timer = new HashedWheelTimer();
		this.bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
			public ChannelPipeline getPipeline() throws Exception {
				ChannelPipeline pipeline = Channels.pipeline();
				if (maxIdleTimeSeconds > 0) {
					pipeline.addLast("idleStateHandler", new IdleStateHandler(timer, 0, 0, maxIdleTimeSeconds));
					pipeline.addLast("maxIdleHandler", new MaxIdleTimeHandler(loggerFactory, maxIdleTimeSeconds));
				}
				if (sslContext != null) {
					SSLEngine sslEngine = sslContext.createSSLEngine();
					sslEngine.setUseClientMode(false);
					pipeline.addLast("ssl", new SslHandler(sslEngine));
				}
				preparePipeline(pipeline);
				return pipeline;
			}
		});
		this.allChannels.add(this.bootstrap.bind(new InetSocketAddress(this.port)));
		this.logger.info(Text.SERVER_RUN, this.port);
	}

	@Override
	public void stop() {
		this.allChannels.close().awaitUninterruptibly();
		// FIXME releaseExternalResources will close nioServerSocketChannelFactory
		// this.bootstrap.releaseExternalResources();
		this.logger.info(Text.SERVER_STOP);
	}

	protected abstract void preparePipeline(ChannelPipeline pipeline);

	protected void prepareBootstrap(ServerBootstrap bootstrap) {
	}
}