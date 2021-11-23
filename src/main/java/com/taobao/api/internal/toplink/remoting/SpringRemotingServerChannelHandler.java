package com.taobao.api.internal.toplink.remoting;

import java.util.List;
import java.util.Map.Entry;

import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelContext;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class SpringRemotingServerChannelHandler extends DefaultRemotingServerChannelHandler {
	private HandshakerBean handshaker;

	public SpringRemotingServerChannelHandler(LoggerFactory loggerFactory, HandshakerBean handshaker) {
		super(loggerFactory);
		this.handshaker = handshaker;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void onConnect(ChannelContext context) throws Exception {
		if (this.handshaker == null)
			return;
		this.handshaker.onHandshake(
				(List<Entry<String, String>>) context.getMessage(),
				new Context((ServerChannelSender) context.getSender()));
	}

	public class Context implements ChannelContextBean {
		private ServerChannelSender sender;

		public Context(ServerChannelSender sender) {
			this.sender = sender;
		}

		public Object get(Object key) {
			return this.sender.getContext(key);
		}

		public void set(Object key, Object value) {
			this.sender.setContext(key, value);
		}

	}
}