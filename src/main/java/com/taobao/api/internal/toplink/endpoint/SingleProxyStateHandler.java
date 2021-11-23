package com.taobao.api.internal.toplink.endpoint;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ServerChannelSender;

public class SingleProxyStateHandler implements StateHandler {
	public void onConnect(EndpointProxy endpoint, ChannelSenderWrapper sender, Identity connectingIdentity) throws LinkException {
		if (!(sender.getChannelSender() instanceof ServerChannelSender))
			return;
		// FIXME hack here, maybe not alwasy ServerChannelSender
		ServerChannelSender serverSender = (ServerChannelSender) sender.getChannelSender();
		if (serverSender.getContext("__endpoint") != null)
			throw new LinkException(Text.E_SINGLE_ALLOW);
		serverSender.setContext("__endpoint", endpoint);
	}

}
