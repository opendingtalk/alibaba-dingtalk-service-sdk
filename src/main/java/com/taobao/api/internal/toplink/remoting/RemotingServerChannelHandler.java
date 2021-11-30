package com.taobao.api.internal.toplink.remoting;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

import com.taobao.api.internal.toplink.BufferManager;
import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.channel.ChannelContext;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.SimpleChannelHandler;
import com.taobao.api.internal.toplink.channel.ChannelSender.SendHandler;
import com.taobao.api.internal.toplink.protocol.NotSupportedException;
import com.taobao.api.internal.toplink.protocol.tcp.TcpContentDelimiter;
import com.taobao.api.internal.toplink.protocol.tcp.TcpOperations;
import com.taobao.api.internal.toplink.protocol.tcp.TcpTransportHeader;
import com.taobao.api.internal.toplink.remoting.protocol.RemotingTcpProtocolHandle;
import com.taobao.api.internal.toplink.remoting.protocol.RemotingTransportHeader;

public abstract class RemotingServerChannelHandler extends SimpleChannelHandler {
	protected Logger logger;
	private ExecutorService threadPool;
	private SerializationFactory serializationFactory = new DefaultSerializationFactory();

	public RemotingServerChannelHandler() {
		this(DefaultLoggerFactory.getDefault());
	}

	public RemotingServerChannelHandler(LoggerFactory loggerFactory) {
		this.setLoggerFactory(loggerFactory);
	}

	public void setThreadPool(ExecutorService threadPool) {
		this.threadPool = threadPool;
	}

	public void setLoggerFactory(LoggerFactory loggerFactory) {
		this.logger = loggerFactory.create(this);
	}

	public void setSerializationFactory(SerializationFactory serializationFactory) {
		this.serializationFactory = serializationFactory;
	}

	public abstract MethodReturn onMethodCall(MethodCall methodCall, MethodCallContext callContext) throws Throwable;

	@SuppressWarnings("unchecked")
	public final void onMessage(final ChannelContext context) throws ChannelException, NotSupportedException {
		Object msg = context.getMessage();

		if (msg instanceof ByteBuffer || msg instanceof RemotingTcpProtocolHandle) {
			this.onMessage(context, msg);
			return;
		}

		if (msg instanceof List<?>) {
			for (Object buffer : (List<Object>) msg)
				this.onMessage(context, buffer);
			return;
		}
	}

	private void onMessage(final ChannelContext context, Object msg) throws ChannelException, NotSupportedException {
		final RemotingTcpProtocolHandle protocol = msg instanceof ByteBuffer ?
				new RemotingTcpProtocolHandle((ByteBuffer) msg) :
				(RemotingTcpProtocolHandle) msg;
		protocol.ReadPreamble();
		protocol.ReadMajorVersion();
		protocol.ReadMinorVersion();
		final short operation = protocol.ReadOperation();
		protocol.ReadContentDelimiter();
		protocol.ReadContentLength();
		final HashMap<String, Object> transportHeaders = protocol.ReadTransportHeaders();
		final MethodCallContext callContext = this.createCallContext(context, transportHeaders);
		final Serializer serializer = this.serializationFactory.get(transportHeaders.get(RemotingTransportHeader.Format));
		Object flag = transportHeaders.get(RemotingTransportHeader.Flag);
		transportHeaders.clear();
		transportHeaders.put(RemotingTransportHeader.Flag, flag);

		// just use netty io-woker thread, count=cpucore
		if (this.threadPool == null) {
			this.internalOnMessage(context, callContext, protocol, operation, transportHeaders, serializer);
			return;
		}

		// dispatch to business workers
		try {
			this.threadPool.execute(new Runnable() {
				public void run() {
					try {
						internalOnMessage(context, callContext, protocol, operation, transportHeaders, serializer);
					} catch (ChannelException e) {
						logger.error(e);
					}
				}
			});
		} catch (RejectedExecutionException exception) {
			String statusPhrase = String.format(
					"server threadpool full, threadpool maxsize is: %s",
					((ThreadPoolExecutor) this.threadPool).getMaximumPoolSize());
			this.logger.fatal(statusPhrase);
			transportHeaders.put(TcpTransportHeader.StatusCode, 500);
			transportHeaders.put(TcpTransportHeader.StatusPhrase, statusPhrase);
			this.reply(context, transportHeaders, null);
		}
	}

	private void internalOnMessage(ChannelContext context,
			MethodCallContext callContext,
			RemotingTcpProtocolHandle protocol,
			short operation,
			HashMap<String, Object> transportHeaders,
			Serializer serializer) throws ChannelException {
		// get method return
		MethodCall methodCall = null;
		MethodReturn methodReturn = null;
		try {
			methodCall = serializer.deserializeMethodCall(protocol.ReadContent());
			methodReturn = this.onMethodCall(methodCall, callContext);
		} catch (Throwable e) {
			this.logger.error(e);
			methodReturn = new MethodReturn();
			methodReturn.Exception = e;
		}

		// oneway?
		if (operation == TcpOperations.OneWayRequest)
			return;

		byte[] data = null;
		try {
			data = serializer.serializeMethodReturn(methodReturn);
		} catch (FormatterException e) {
			this.logger.error(e);
			transportHeaders.put(TcpTransportHeader.StatusCode, 400);
			transportHeaders.put(TcpTransportHeader.StatusPhrase, e.getMessage());
		}
		this.reply(context, transportHeaders, data);
	}

	private void reply(ChannelContext context,
			HashMap<String, Object> transportHeaders,
			byte[] data) throws ChannelException {
		final ByteBuffer responseBuffer = BufferManager.getBuffer();
		RemotingTcpProtocolHandle handle = new RemotingTcpProtocolHandle(responseBuffer);
		handle.WritePreamble();
		handle.WriteMajorVersion();
		handle.WriteMinorVersion();
		handle.WriteOperation(TcpOperations.Reply);
		handle.WriteContentDelimiter(TcpContentDelimiter.ContentLength);
		handle.WriteContentLength(data != null ? data.length : 0);
		handle.WriteTransportHeaders(transportHeaders);
		if (data != null)
			handle.WriteContent(data);

		responseBuffer.flip();
		context.reply(responseBuffer, new SendHandler() {
			public void onSendComplete(boolean success) {
				BufferManager.returnBuffer(responseBuffer);
			}
		});
	}

	private MethodCallContext createCallContext(ChannelContext channelContext, Map<String, Object> headers) {
		MethodCallContext callContext = new MethodCallContext(channelContext.getSender());
		for (Entry<String, Object> h : headers.entrySet())
			callContext.setCallContext(h.getKey(), h.getValue());
		return callContext;
	}
}
