package com.taobao.api.internal.toplink.channel.websocket;

import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import org.jboss.netty.handler.codec.http.websocketx.WebSocketFrame;

import com.taobao.api.internal.toplink.Text;
import com.taobao.api.internal.toplink.channel.ChannelException;
import com.taobao.api.internal.toplink.channel.ChannelTimeoutException;
import com.taobao.api.internal.toplink.channel.netty.NettyChannelSender;

public abstract class WebSocketChannelSender extends NettyChannelSender {
	public static int MaxTotalPendingCount = 50000;
	public static AtomicInteger TotalPendingCount = new AtomicInteger();
	
	private AtomicInteger pendingCount = new AtomicInteger();
	private int maxPendingCount = 1000;
	private int timeout = 2000;
	
	public WebSocketChannelSender(Channel channel) {
		super(channel);
	}
	
	public void setMaxPendingCount(int value) {
		this.maxPendingCount = value;
	}
	
	public void setTimeoutMillis(int value) {
		this.timeout = value;
	}
	
	public int getPendingCount() {
		return this.pendingCount.get();
	}
	
	public void send(byte[] data, int offset, int length) throws ChannelException {
		ChannelBuffer buffer = ChannelBuffers.wrappedBuffer(data, offset, length);
		BinaryWebSocketFrame frame = new BinaryWebSocketFrame(buffer);
		this.send(frame, null);
	}
	
	public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
		ChannelBuffer buffer = ChannelBuffers.wrappedBuffer(dataBuffer);
		BinaryWebSocketFrame frame = new BinaryWebSocketFrame(buffer);
		this.send(frame, sendHandler);
	}
	
	public void close(String reason) {
		this.channel.write(new CloseWebSocketFrame(1000, reason));
	}
	
	private void send(WebSocketFrame frame, final SendHandler sendHandler) throws ChannelException {
		// do not support fragmentation
		frame.setFinalFragment(true);
		
		// weather sendSync enabled
		final CountDownLatch latch = this.isHighwater() &&
				this.timeout > 0 ?
				new CountDownLatch(1) :
				null;
		
		this.channel.write(frame).addListener(new ChannelFutureListener() {
			public void operationComplete(ChannelFuture future) throws Exception {
				TotalPendingCount.decrementAndGet();
				pendingCount.decrementAndGet();
				
				if (latch != null)
					latch.countDown();
				else if (sendHandler != null)
					sendHandler.onSendComplete(future.isSuccess());
			}
		});
		
		if (latch == null)
			return;
		
		// boolean success = false;
		try {
			if (!latch.await(this.timeout, TimeUnit.MILLISECONDS))
				throw new ChannelTimeoutException(String.format(Text.WS_SEND_SYNC_TIMEOUT, timeout));
		} catch (InterruptedException e) {
			throw new ChannelException(Text.WS_SEND_SYNC_ERROR, e);
		} finally {
			// not safe, timeout message already in netty sendbuffer and will be
			// sent later,
			// if buffer clear in onSendComplete, client will got wrong message
			// if (sendHandler != null)
			// sendHandler.onSendComplete(success);
		}
	}
	
	private boolean isHighwater() {
		int self = this.pendingCount.incrementAndGet();
		int total = TotalPendingCount.incrementAndGet();
		return self > this.maxPendingCount || (MaxTotalPendingCount > 0 && total > MaxTotalPendingCount);
	}
	
}
