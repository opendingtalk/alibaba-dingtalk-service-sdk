package com.taobao.api.internal.toplink.channel.embedded;

import java.net.SocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.internal.toplink.ResetableTimer;
import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelHandler;
import com.taobao.api.internal.toplink.channel.ClientChannel;
import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455.CloseFrame;
import com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455.FrameRfc6455;
import com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455.PingFrame;

public class EmbeddedWebSocketClientChannel implements ClientChannel {
	private URI uri;
	protected WebSocket socket;
	protected Exception error;
	private ChannelHandler channelHandler;
	private ResetableTimer heartbeatTimer;
	private Map<Object, Object> context;
	
	public EmbeddedWebSocketClientChannel() {
		this.context = new HashMap<Object, Object>();
	}

	public SocketAddress getLocalAddress() {
		return null;
	}

	public SocketAddress getRemoteAddress() {
		return null;
	}
	
	public Object getContext(Object key) {
		return this.context.get(key);
	}

	public void setContext(Object key, Object value) {
		this.context.put(key, value);
	}

	public ChannelHandler getChannelHandler() {
		this.delayPing();
		return this.channelHandler;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

	public URI getUri() {
		return this.uri;
	}

	public void setChannelHandler(ChannelHandler handler) {
		this.channelHandler = handler;
	}

	public boolean isConnected() {
		return socket.isConnected();
	}

	public void close(String reason) {
		this.stopHeartbeat();
		try {
			CloseFrame frame = new CloseFrame(1000,
					reason != null ? reason : Text.WS_UNKNOWN_ERROR);
			frame.mask();
			this.socket.send(frame);
		} catch (WebSocketException e) {
			// TODO:log error
		}
	}

	public void setHeartbeatTimer(ResetableTimer timer) {
		this.stopHeartbeat();
		this.heartbeatTimer = timer;
		this.heartbeatTimer.setTask(new Runnable() {
			public void run() {
				if (!isConnected())
					return;
				PingFrame pingFrame = new PingFrame();
				pingFrame.mask();
				try {
					socket.send(pingFrame);
				} catch (WebSocketException e) {
				}
			}
		});
		this.heartbeatTimer.start();
	}

	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		this.checkChannel();
		try {
			// create will copy data to it's sendbuffers
			FrameRfc6455 frame = (FrameRfc6455) this.socket.createFrame(dataBuffer);
			frame.mask();
			this.socket.send(frame);
		} catch (WebSocketException e) {
			throw new ChannelException(Text.WS_SEND_ERROR, e);
		} finally {
			// TODO: onSendComplete just do returnbuffer currently, should add
			// callback to do this like netty
			if (sendHandler != null)
				// maybe not success
				sendHandler.onSendComplete(true);
		}
	}

	public void send(byte[] data, int offset, int length) throws ChannelException {
		this.send(ByteBuffer.wrap(data, offset, length), null);
	}

	private void checkChannel() throws ChannelException {
		if (!this.socket.isConnected()) {
			this.stopHeartbeat();
			throw new ChannelException(Text.CHANNEL_CLOSED);
		}
		this.delayPing();
	}

	private void delayPing() {
		if (this.heartbeatTimer != null)
			this.heartbeatTimer.delay();
	}

	public void stopHeartbeat() {
		if (this.heartbeatTimer != null) {
			this.heartbeatTimer.stop();
			this.heartbeatTimer = null;
		}
	}
}
