package com.taobao.api.internal.toplink.remoting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;

import com.taobao.api.internal.toplink.BufferManager;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.channel.ClientChannelSelector;
import com.taobao.api.internal.toplink.channel.ChannelSender.SendHandler;
import com.taobao.api.internal.toplink.protocol.tcp.TcpOperations;
import com.taobao.api.internal.toplink.protocol.tcp.TcpTransportHeader;

public class DynamicProxy implements InvocationHandler {
	private int executionTimeout = 0;
	private URI remoteUri;
	private String uriString;
	private String serializationFormat;
	private ClientChannelSelector selector;
	private RemotingClientChannelHandler channelHandler;

	protected DynamicProxy(URI remoteUri,
			ClientChannelSelector selector,
			RemotingClientChannelHandler handler) {
		this.remoteUri = remoteUri;
		this.uriString = remoteUri != null ? remoteUri.toString() : "";
		this.selector = selector;
		this.channelHandler = handler;
	}

	public Object create(Class<?> interfaceClass, URI remoteUri) {
		this.uriString = remoteUri.toString();
		return Proxy.newProxyInstance(
				interfaceClass.getClassLoader(),
				new Class[] { interfaceClass },
				this);
	}

	public void setExecutionTimeout(int millisecond) {
		this.executionTimeout = millisecond;
	}

	public void setSerializationFormat(String format) {
		this.serializationFormat = format;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		MethodCall methodCall = new MethodCall();
		methodCall.Uri = this.uriString;
		methodCall.MethodName = method.getName();
		methodCall.TypeName = method.getDeclaringClass().getName();
		methodCall.MethodSignature = method.getParameterTypes();
		methodCall.Args = args;

		MethodReturn methodReturn = this.invoke(methodCall, method.getReturnType());

		if (methodReturn.Exception == null)
			return methodReturn.ReturnValue;

		// https://github.com/wsky/top-link/issues/18
		// will course java.lang.reflect.UndeclaredThrowableException
		// throw new RemotingException("invoke got error",
		// methodReturn.Exception);
		throw methodReturn.Exception;
	}

	public MethodReturn invoke(MethodCall methodCall) throws RemotingException, FormatterException {
		return this.invoke(methodCall, Object.class);
	}

	public MethodReturn invoke(MethodCall methodCall,
			Class<?> returnType) throws RemotingException, FormatterException {
		return this.invoke(methodCall, returnType, this.executionTimeout);
	}

	public MethodReturn invoke(MethodCall methodCall,
			int executionTimeoutMillisecond) throws RemotingException, FormatterException {
		return this.invoke(methodCall, Object.class, executionTimeoutMillisecond);
	}

	public MethodReturn invoke(MethodCall methodCall,
			Class<?> returnType,
			int executionTimeoutMillisecond) throws RemotingException, FormatterException {
		SynchronizedRemotingCallback syncCallback = new SynchronizedRemotingCallback();
		syncCallback.returnType = returnType;
		syncCallback.serializationFormat = this.serializationFormat;

		HashMap<String, Object> transportHeaders = new HashMap<String, Object>();
		transportHeaders.put(TcpTransportHeader.RequestUri, this.uriString);

		ClientChannel channel = this.getChannel();
		try {
			return this.send(channel,
					this.channelHandler.pending(syncCallback,
							TcpOperations.Request, transportHeaders, methodCall),
					syncCallback,
					executionTimeoutMillisecond);
		} finally {
			this.selector.returnChannel(channel);
		}
	}

	private ClientChannel getChannel() throws RemotingException {
		try {
			ClientChannel channel = this.selector.getChannel(this.remoteUri);
			channel.setChannelHandler(channelHandler);
			return channel;
		} catch (ChannelException e) {
			throw new RemotingException(Text.RPC_CAN_NOT_GET_CHANNEL, e);
		}
	}

	private MethodReturn send(ClientChannel clientChannel,
			final ByteBuffer buffer,
			SynchronizedRemotingCallback syncCallback,
			int executionTimeoutMillisecond) throws RemotingException {
		// reset buffer limit and position for send
		buffer.flip();

		try {
			clientChannel.send(buffer, new SendHandler() {
				public void onSendComplete(boolean success) {
					BufferManager.returnBuffer(buffer);
				}
			});
		} catch (ChannelException e) {
			throw unexcepException(syncCallback, Text.RPC_SEND_ERROR, e);
		}

		try {
			syncCallback.waitReturn(executionTimeoutMillisecond);
		} finally {
			this.channelHandler.cancel(syncCallback);
		}

		if (syncCallback.getFailure() != null)
			throw unexcepException(
					syncCallback, 
					Text.RPC_CALL_ERROR, 
					syncCallback.getFailure());

		return syncCallback.getMethodReturn();
	}

	private RemotingException unexcepException(
			SynchronizedRemotingCallback callback, String message, Throwable innerException) {
		if (innerException instanceof RemotingException)
			return (RemotingException) innerException;
		return innerException != null
				? new RemotingException(message, innerException)
				: new RemotingException(message);
	}
}
