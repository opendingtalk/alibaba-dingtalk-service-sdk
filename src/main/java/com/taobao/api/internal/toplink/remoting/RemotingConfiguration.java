package com.taobao.api.internal.toplink.remoting;

import java.util.concurrent.ExecutorService;

import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ClientChannelSelector;
import com.taobao.api.internal.toplink.channel.ServerChannel;
import com.taobao.api.internal.toplink.channel.websocket.WebSocketServerChannel;

// combined client/server remoting config helper
public class RemotingConfiguration {
	private static RemotingConfiguration configuration;

	public synchronized static RemotingConfiguration configure() {
		if (configuration == null)
			configuration = new RemotingConfiguration();
		return configuration;
	}

	private LoggerFactory loggerFactory;
	private DefaultRemotingServerChannelHandler defaultHandler;
	private SerializationFactory serializationFactory;

	public RemotingConfiguration() {
		this.loggerFactory(DefaultLoggerFactory.getDefault());
	}

	// should be set first
	public RemotingConfiguration loggerFactory(LoggerFactory loggerFactory) {
		this.loggerFactory = loggerFactory;
		RemotingService.setLoggerFactory(loggerFactory);
		return this;
	}

	public RemotingConfiguration clientChannelSelector(ClientChannelSelector selector) {
		RemotingService.setChannelSelector(selector);
		return this;
	}

	public RemotingConfiguration SerializationFactory(SerializationFactory serializationFactory) {
		this.serializationFactory = serializationFactory;
		RemotingService.setSerializationFactory(serializationFactory);
		return this;
	}

	// shold be set before bind()
	public RemotingConfiguration defaultServerChannelHandler(DefaultRemotingServerChannelHandler channelHandler) {
		this.defaultHandler = channelHandler;
		return this;
	}

	// bind to custom channel
	public RemotingConfiguration bind(ServerChannel channel) {
		channel.setChannelHandler(this.getChannelHandler());
		channel.run();
		return this;
	}

	public RemotingConfiguration websocket(int port) {
		return this.bind(new WebSocketServerChannel(this.loggerFactory, port, true));
	}

	public RemotingConfiguration tcp(int port) {
		return this;
	}

	public RemotingConfiguration http(int port) {
		return this;
	}

	public RemotingConfiguration addProcessor(
			String objectUri, MethodCallProcessor processor) {
		this.defaultHandler.addProcessor(objectUri, processor);
		return this;
	}

	public RemotingConfiguration businessThreadPool(ExecutorService threadPool) {
		this.defaultHandler.setThreadPool(threadPool);
		return this;
	}

	private synchronized DefaultRemotingServerChannelHandler getChannelHandler() {
		if (this.defaultHandler == null)
			this.defaultHandler = new DefaultRemotingServerChannelHandler(this.loggerFactory);
		if (this.serializationFactory != null)
			this.defaultHandler.setSerializationFactory(this.serializationFactory);
		return this.defaultHandler;
	}
}
