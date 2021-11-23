package com.taobao.api.internal.toplink.endpoint;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.taobao.api.internal.toplink.BufferManager;
import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelContext;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelSender;
import com.taobao.api.internal.toplink.channel.SimpleChannelHandler;
import com.taobao.api.internal.toplink.channel.ChannelSender.SendHandler;
import com.taobao.api.internal.toplink.schedule.Scheduler;

// make timing
public class EndpointChannelHandler extends SimpleChannelHandler {
	private Logger logger;
	private Endpoint endpoint;
	private AtomicInteger flag;
	private Map<Integer, SendCallback> callbackByFlag;
	// all connect in/out endpoints
	private Map<String, Identity> idByToken;
	private Scheduler<Identity> scheduler;
	private StateHandler stateHandler;

	public EndpointChannelHandler() {
		this(DefaultLoggerFactory.getDefault());
	}

	public EndpointChannelHandler(LoggerFactory loggerFactory) {
		this.logger = loggerFactory.create(this);
		this.flag = new AtomicInteger();
		this.callbackByFlag = new ConcurrentHashMap<Integer, SendCallback>();
		this.idByToken = new ConcurrentHashMap<String, Identity>();
	}

	protected void setEndpoint(Endpoint endpoint) {
		this.endpoint = endpoint;
	}

	public void setScheduler(Scheduler<Identity> scheduler) {
		this.scheduler = scheduler;
	}

	public void setStateHandler(StateHandler stateHandler) {
		this.stateHandler = stateHandler;
	}

	protected final void pending(Message msg, ChannelSender sender) throws ChannelException {
		this.pending(msg, sender, null);
	}

	// all send in Endpoint module must call here
	protected final void pending(Message msg, ChannelSender sender, SendCallback callback) throws ChannelException {
		if (callback != null) {
			callback.flag = msg.flag = this.flag.incrementAndGet();
			this.callbackByFlag.put(msg.flag, callback);
		}
		ByteBuffer buffer = BufferManager.getBuffer();
		MessageIO.writeMessage(buffer, msg);
		sender.send(buffer, new InnerSendHandler(buffer));
	}

	public void cancel(SendCallback callback) {
		this.callbackByFlag.remove(callback.flag);
	}

	@Override
	public void onConnect(ChannelContext context) throws Exception {
	}

	@Override
	public void onError(ChannelContext context) throws Exception {
		this.logger.error(Text.E_CHANNEL_ERROR, context.getError());
	}

	@SuppressWarnings("unchecked")
	public final void onMessage(ChannelContext context) throws Exception {
		Object msg = context.getMessage();

		if (msg instanceof ByteBuffer) {
			this.onMessage(context, (ByteBuffer) msg);
			return;
		}

		for (ByteBuffer buffer : (List<ByteBuffer>) msg)
			this.onMessage(context, buffer);
	}

	private void onMessage(ChannelContext context, ByteBuffer buffer) throws LinkException {
		Message msg = MessageIO.readMessage(buffer);

		if (msg.messageType == MessageType.CONNECT) {
			this.handleConnect(context, msg);
			return;
		}

		SendCallback callback = this.callbackByFlag.remove(msg.flag);

		if (msg.messageType == MessageType.CONNECTACK) {
			this.handleConnectAck(callback, msg);
			return;
		}

		Identity msgFrom = msg.token != null ? this.idByToken.get(msg.token) : null;
		// must CONNECT/CONNECTACK for got token before SEND
		if (msgFrom == null) {
			LinkException error = new LinkException(String.format(
					"[%s] %s: v=%s, type=%s, token=%s, flag=%s, code=%s, phase=%s, content=%s",
					this.endpoint.getIdentity(),
					Text.E_UNKNOWN_MSG_FROM,
					msg.protocolVersion,
					msg.messageType,
					msg.token,
					msg.flag,
					msg.statusCode,
					msg.statusPhase,
					msg.content));
			if (callback == null)
				throw error;
			callback.setError(error);
			return;
		}

		// raise callback of client
		if (callback != null) {
			this.handleCallback(callback, msg, msgFrom);
			return;
		} else if (this.isError(msg)) {
			this.logger.error(Text.E_GOT_ERROR, msgFrom, msg.statusCode, msg.statusPhase);
			return;
		}

		if (msg.messageType != MessageType.SEND &&
				msg.messageType != MessageType.SENDACK)
			throw new LinkException(String.format(Text.E_UNKNOWN_MSG_TYPE, msg.messageType));

		// raise onMessage for async receive mode
		if (this.endpoint.getMessageHandler() == null)
			return;
		// exec directly
		if (this.scheduler == null) {
			this.internalOnMessage(context, msg, msgFrom);
			return;
		}
		// dispatch
		this.scheduler.schedule(msgFrom, this.createTask(context, msg, msgFrom));
	}

	private Runnable createTask(final ChannelContext context, final Message message, final Identity messageFrom) {
		return new MessageScheduleTask(message) {
			public void run() {
				try {
					internalOnMessage(context, message, messageFrom);
				} catch (LinkException e) {
					logger.error(e);
				}
			}
		};
	}

	private void internalOnMessage(ChannelContext context, Message message, Identity messageFrom) throws LinkException {
		if (message.messageType == MessageType.SENDACK) {
			this.endpoint.getMessageHandler().onAckMessage(
					new EndpointBaseContext(context, messageFrom, message));
			return;
		}

		EndpointContext endpointContext = new
				EndpointContext(context, messageFrom, message, this.endpoint);
		try {
			this.endpoint.getMessageHandler().onMessage(endpointContext);
		} catch (Exception e) {
			this.logger.error(e);
			// onMessage error should be reply to client
			if (e instanceof LinkException)
				endpointContext.error(
						((LinkException) e).getErrorCode(),
						this.parseStatusPhase(((LinkException) e)));
			else
				endpointContext.error(0, this.parseStatusPhase(e));
		}
	}

	// deal with connect-in message from endpoint,
	// parse identity send from endpoint and assign it a token,
	// token just used for routing message-from, not auth
	private void handleConnect(ChannelContext context, Message connectMessage) throws ChannelException {
		Message ack = this.createConnectAckMessage(connectMessage);
		ack.messageType = MessageType.CONNECTACK;
		try {
			Identity id = this.endpoint.getIdentity().parse(connectMessage.content);
			EndpointProxy proxy = this.endpoint.getEndpoint(id);
			// set connect-in version as the sender protocol version
			ChannelSenderWrapper senderWrapper =
					new ChannelSenderWrapper(context.getSender(), connectMessage.protocolVersion);
			proxy.add(senderWrapper);
			if (proxy.getToken() == null) {
				synchronized (proxy) {
					if (proxy.getToken() == null)
						// uuid for token? or get from id?
						proxy.setToken(UUID.randomUUID().toString());
				}
			}
			ack.token = proxy.getToken();
			this.idByToken.put(proxy.getToken(), id);

			if (this.stateHandler != null)
				this.stateHandler.onConnect(proxy, senderWrapper, id);

			this.logger.info(Text.E_ACCEPT, this.endpoint.getIdentity(), id, proxy.getToken());
		} catch (LinkException e) {
			ack.statusCode = e.getErrorCode();
			ack.statusPhase = this.parseStatusPhase(e);
			this.logger.error(Text.E_REFUSE, e);
		}
		final ByteBuffer buffer = BufferManager.getBuffer();
		MessageIO.writeMessage(buffer, ack);
		context.reply(buffer, new InnerSendHandler(buffer));
	}

	private void handleConnectAck(SendCallback callback, Message msg) throws LinkException {
		if (callback == null)
			throw new LinkException(Text.E_NO_CALLBACK);
		if (this.isError(msg))
			callback.setError(new LinkException(msg.statusCode, msg.statusPhase));
		else if (msg.token == null) {
			callback.setError(new LinkException(Text.E_NULL_TOKEN));
		} else {
			callback.setComplete();
			// set token for proxy for sending message next time
			callback.getTarget().setToken(msg.token);
			// store token from target endpoint for receiving it's message
			// next time
			this.idByToken.put(msg.token, callback.getTarget().getIdentity());
			this.logger.info(Text.E_CONNECT_SUCCESS, callback.getTarget().getIdentity(), msg.token);
		}
	}

	private void handleCallback(SendCallback callback, Message msg, Identity msgFrom) {
		if (!callback.getTarget().getIdentity().equals(msgFrom)) {
			this.logger.warn(
					Text.E_IDENTITY_NOT_MATCH_WITH_CALLBACK,
					msgFrom, callback.getTarget().getIdentity());
			return;
		}
		if (this.isError(msg))
			callback.setError(new LinkException(msg.statusCode, msg.statusPhase));
		else
			callback.setReturn(msg.content);
	}

	private boolean isError(Message msg) {
		return msg.statusCode > 0 ||
				(msg.statusPhase != null && msg.statusPhase != "");
	}

	private Message createConnectAckMessage(Message connectMessage) {
		Message msg = new Message();
		// version match with message from
		msg.protocolVersion = connectMessage.protocolVersion;
		msg.flag = connectMessage.flag;
		msg.token = connectMessage.token;
		return msg;
	}

	private String parseStatusPhase(Exception e) {
		return e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage();
	}

	private String parseStatusPhase(LinkException e) {
		return e.getMessage() == null && e.getErrorCode() <= 0 ? Text.E_UNKNOWN_ERROR : e.getMessage();
	}

	class InnerSendHandler implements SendHandler {
		private ByteBuffer buffer;

		public InnerSendHandler(ByteBuffer buffer) {
			this.buffer = buffer;
		}

		public void onSendComplete(boolean success) {
			BufferManager.returnBuffer(this.buffer);
		}

	}
}
