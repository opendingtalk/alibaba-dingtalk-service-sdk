package com.taobao.api.internal.toplink.remoting;

import java.net.URI;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.Channels;

import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ClientChannelSharedSelector;
import com.taobao.api.internal.toplink.channel.tcp.TcpClient;

public class NettyRemotingClientChannelSharedSelector extends ClientChannelSharedSelector {
	@Override
	protected ClientChannel connect(LoggerFactory loggerFactory, URI uri, int timeout) throws ChannelException {
		if (uri.getScheme().equalsIgnoreCase("tcp") || 
				uri.getScheme().equalsIgnoreCase("ssl")) {
			ChannelPipeline pipeline = Channels.pipeline();
			pipeline.addLast("decoder", new NettyRemotingDecoder());
			return TcpClient.connect(loggerFactory, uri, timeout, pipeline);
		}
		return super.connect(loggerFactory, uri, timeout);
	}
}
