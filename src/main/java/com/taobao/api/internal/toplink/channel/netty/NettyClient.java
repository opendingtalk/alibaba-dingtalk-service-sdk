package com.taobao.api.internal.toplink.channel.netty;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.Executors;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.ssl.SslHandler;

import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.X509AlwaysTrustManager;

public abstract class NettyClient {
	private static TrustManager[] trustAllCerts = new TrustManager[] { new X509AlwaysTrustManager() };

	private static NioClientSocketChannelFactory nioClientSocketChannelFactory = new NioClientSocketChannelFactory(
			Executors.newCachedThreadPool(),
			Executors.newCachedThreadPool());

	public static InetSocketAddress parse(URI uri) {
		return new InetSocketAddress(uri.getHost(), uri.getPort() > 0 ? uri.getPort() : 80);
	}

	protected static Channel prepareAndConnect(Logger logger,
			URI uri,
			ChannelPipeline pipeline,
			ChannelHandler handler,
			boolean ssl,
			int connectTimeoutMillis) throws ChannelException {
		SslHandler sslHandler = ssl ? createSslHandler(uri) : null;
		ClientBootstrap bootstrap = prepareBootstrap(logger, pipeline, handler, sslHandler, connectTimeoutMillis);
		return doConnect(uri, bootstrap, sslHandler);
	}

	private static Channel doConnect(URI uri, ClientBootstrap bootstrap, SslHandler sslHandler) throws ChannelException {
		try {
			Channel channel = bootstrap.connect(parse(uri)).syncUninterruptibly().getChannel();
			if (sslHandler != null)
				sslHandler.handshake().syncUninterruptibly();
			return channel;
		} catch (Exception e) {
			// only release when application unload
			// https://github.com/wsky/top-link/issues/79
			// bootstrap.releaseExternalResources();
			throw new ChannelException(Text.CONNECT_ERROR, e);
		}
	}

	private static ClientBootstrap prepareBootstrap(Logger logger,
			final ChannelPipeline pipeline,
			ChannelHandler handler,
			SslHandler sslHandler,
			int connectTimeoutMillis) {
		ClientBootstrap bootstrap = new ClientBootstrap(nioClientSocketChannelFactory);
		bootstrap.setOption("tcpNoDelay", true);
		bootstrap.setOption("reuseAddress", true);
		bootstrap.setOption("connectTimeoutMillis", connectTimeoutMillis);
		bootstrap.setOption("writeBufferHighWaterMark", 10 * 1024 * 1024);

		if (sslHandler != null)
			pipeline.addFirst("ssl", sslHandler);
		if (handler != null)
			pipeline.addLast("handler", handler);

		bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
			public ChannelPipeline getPipeline() throws Exception {
				return pipeline;
			}
		});
		return bootstrap;
	}

	private static SslHandler createSslHandler(URI uri) {
		try {
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, trustAllCerts, null);
			SSLEngine sslEngine = sslContext.createSSLEngine();
			sslEngine.setUseClientMode(true);
			return new SslHandler(sslEngine);
		} catch (Exception e) {
			return null;
		}
	}
}
