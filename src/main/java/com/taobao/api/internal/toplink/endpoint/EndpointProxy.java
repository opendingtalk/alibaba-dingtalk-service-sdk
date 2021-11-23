package com.taobao.api.internal.toplink.endpoint;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class EndpointProxy {
	private Identity identity;
	// known by both side
	private String token;
	private List<ChannelSenderWrapper> senders;
	private Map<String, ClientChannelWrapper> clientChannels;
	private Random random;
	private Endpoint endpoint;

	protected EndpointProxy(Endpoint endpoint) {
		this.senders = new ArrayList<ChannelSenderWrapper>();
		this.clientChannels = new HashMap<String, ClientChannelWrapper>();
		this.random = new Random();
		this.endpoint = endpoint;
	}

	protected void setIdentity(Identity identity) {
		this.identity = identity;
	}

	protected void setToken(String token) {
		this.token = token;
	}

	protected String getToken() {
		return this.token;
	}

	protected synchronized void add(ChannelSenderWrapper sender) {
		this.senders.add(sender);
		if (sender instanceof ClientChannelWrapper) {
			ClientChannelWrapper channel = (ClientChannelWrapper) sender;
			this.clientChannels.put(channel.getUri().toString(), channel);
		}
	}

	protected synchronized void remove(ChannelSender sender) {
		this.senders.remove(sender);
		if (sender instanceof ClientChannelWrapper) {
			ClientChannelWrapper channel = (ClientChannelWrapper) sender;
			this.clientChannels.remove(channel.getUri().toString());
		}
	}

	protected synchronized void remove(URI uri) {
		ClientChannel channel = this.clientChannels.remove(uri.toString());
		if (channel != null)
			this.senders.remove(channel);
	}

	public Identity getIdentity() {
		return this.identity;
	}

	public boolean hasValidSender() {
		for (ChannelSender sender : this.senders) {
			if ((sender instanceof ServerChannelSender &&
					((ServerChannelSender) sender).isOpen()) ||
					(sender instanceof ClientChannel &&
					((ClientChannel) sender).isConnected()))
				return true;
		}
		return false;
	}

	public Map<String, Object> sendAndWait(
			Map<String, Object> message) throws LinkException {
		return this.sendAndWait(message, Endpoint.TIMOUT);
	}

	public Map<String, Object> sendAndWait(
			Map<String, Object> message, int timeout) throws LinkException {
		return this.sendAndWait(null, message, timeout);
	}

	public Map<String, Object> sendAndWait(ChannelSenderWrapper sender,
			Map<String, Object> message, int timeout) throws LinkException {
		ChannelSenderWrapper senderWrapper = this.getSenders(sender);
		return this.endpoint.sendAndWait(this,
				senderWrapper,
				this.createMessage(message, senderWrapper),
				timeout);
	}

	public void send(Map<String, Object> message) throws ChannelException {
		this.send(null, message);
	}

	public void send(ChannelSenderWrapper sender, Map<String, Object> message) throws ChannelException {
		ChannelSenderWrapper senderWrapper = this.getSenders(sender);
		this.endpoint.send(senderWrapper, this.createMessage(message, senderWrapper));
	}

	private Message createMessage(Map<String, Object> message, ChannelSenderWrapper senderWrapper) {
		Message msg = new Message();
		// use sender's protocol version
		msg.protocolVersion = senderWrapper.getProtocolVersion();
		msg.messageType = MessageType.SEND;
		msg.content = message;
		msg.token = this.token;
		return msg;
	}

	private ChannelSenderWrapper getSenders(ChannelSenderWrapper sender) throws ChannelException {
		if (this.senders.isEmpty())
			throw new ChannelException(Text.E_NO_SENDER);
		if (this.senders.contains(sender))
			return sender;
		return this.senders.get(this.random.nextInt(this.senders.size()));
	}
}