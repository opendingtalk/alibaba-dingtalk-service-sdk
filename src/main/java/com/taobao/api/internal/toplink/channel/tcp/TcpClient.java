package com.taobao.api.internal.toplink.channel.tcp;

import java.net.URI;

import org.jboss.netty.channel.ChannelPipeline;

import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ConnectingChannelHandler;
import com.taobao.api.internal.toplink.channel.netty.NettyClient;

public class TcpClient extends NettyClient {
	public static ClientChannel connect(LoggerFactory loggerFactory, 
			URI uri, 
			int connectTimeoutMillis, 
			ChannelPipeline pipeline)
			throws ChannelException {
		Logger logger = loggerFactory.create(String.format("TcpClientHandler-%s", uri));

		TcpClientChannel clientChannel = new TcpClientChannel();
		clientChannel.setUri(uri);

		ConnectingChannelHandler handler = new ConnectingChannelHandler();
		clientChannel.setChannelHandler(handler);

		TcpClientUpstreamHandler tcpHandler = new TcpClientUpstreamHandler(logger, clientChannel);
		// connect
		prepareAndConnect(logger, uri,
				pipeline, tcpHandler,
				uri.getScheme().equalsIgnoreCase("ssl"),
				connectTimeoutMillis);
		return clientChannel;
	}
}