package com.taobao.api.internal.toplink.remoting;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.TooLongFrameException;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;

public class NettyRemotingDecoder extends ReplayingDecoder<NettyRemotingDecoder.State> {
	private NettyRemotingProtocolHandle handle;
	private int payloadBytesRead;
	private int payloadLength;
	private ChannelBuffer payload;

	public enum State {
		HEADER, PAYLOAD
	}

	public NettyRemotingDecoder() {
		super(State.HEADER);
	}

	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer, State state) throws Exception {
		switch (state) {
		case HEADER:
			this.payloadBytesRead = 0;
			this.payloadLength = -1;
			this.payload = null;
			this.handle = new NettyRemotingProtocolHandle(buffer);
			this.handle.preamble = handle.ReadPreamble();
			this.handle.majorVersion = handle.ReadMajorVersion();
			this.handle.minorVersion = handle.ReadMinorVersion();
			this.handle.operation = handle.ReadOperation();
			this.handle.contentDelimiter = handle.ReadContentDelimiter();
			this.handle.setContentLength(this.payloadLength = handle.ReadContentLength());
			// not a good design that content-length do not contain headers
			// length, so here read is blocked or maybe not read enought data
			this.handle.transportHeaders = handle.ReadTransportHeaders();
			checkpoint(State.PAYLOAD);
		case PAYLOAD:
			// refers to
			// https://github.com/netty/netty/blob/netty-3.5.7.Final/src/main/java/org/jboss/netty/handler/codec/http/websocketx/WebSocket08FrameDecoder.java#L256
			// Sometimes, the payload may not be delivered in 1 nice packet
			// We need to accumulate the data until we have it all
			int rbytes = this.actualReadableBytes();
			ChannelBuffer payloadBuffer = null;

			long willHaveReadByteCount = this.payloadBytesRead + rbytes;
			if (willHaveReadByteCount == this.payloadLength) {
				// We have all our content so proceed to process
				payloadBuffer = buffer.readBytes(rbytes);
			} else if (willHaveReadByteCount < this.payloadLength) {
				// We don't have all our content so accumulate payload.
				// Returning null means we will get called back
				payloadBuffer = buffer.readBytes(rbytes);
				if (this.payload == null)
					this.payload = channel.getConfig().getBufferFactory().getBuffer(toFrameLength(this.payloadLength));
				this.payload.writeBytes(payloadBuffer);
				this.payloadBytesRead += rbytes;

				// Return null to wait for more bytes to arrive
				return null;
			} else if (willHaveReadByteCount > this.payloadLength) {
				// We have more than what we need so read up to the end of frame
				// Leave the remainder in the buffer for next frame
				payloadBuffer = buffer.readBytes(toFrameLength(this.payloadLength - this.payloadBytesRead));
			}

			checkpoint(State.HEADER);

			if (this.payload == null)
				this.payload = payloadBuffer;
			else
				this.payload.writeBytes(payloadBuffer);

			this.handle.setContentBuffer(this.payload);
			return this.handle;
		default:
			throw new Error("Shouldn't reach here.");
		}
	}

	private static int toFrameLength(long l) throws TooLongFrameException {
		if (l > Integer.MAX_VALUE) {
			throw new TooLongFrameException("Length:" + l);
		} else {
			return (int) l;
		}
	}
}
