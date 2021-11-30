/*
 * The MIT License
 * 
 * Copyright (c) 2011 Takahiro Hashimoto
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.taobao.api.internal.toplink.embedded.websocket.frame.draft06;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft06.FrameBuilderDraft06.Opcode;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft06.FrameBuilderDraft06.PayloadLengthType;




/**
 * The Class FrameHeaderDraft06.
 *
 * @author Takahiro Hashimoto
 */
public class FrameHeaderDraft06 implements FrameHeader {
	
	/** The payload length. */
	protected final long payloadLength;

	/** The payload length type. */
	protected final PayloadLengthType payloadLengthType;
	
	/** The header length. */
	protected final int headerLength;
	
	/** The fragmented. */
	protected final boolean fragmented;

	/** The opcode. */
	protected final Opcode opcode;
	
	/** The real opcode. */
	protected Opcode realOpcode;

	/**
	 * Instantiates a new frame header draft06.
	 *
	 * @param fragmented the fragmented
	 * @param headerLength the header length
	 * @param payloadLengthType the payload length type
	 * @param payloadLength the payload length
	 * @param opcode the opcode
	 */
	public FrameHeaderDraft06(boolean fragmented, int headerLength, PayloadLengthType payloadLengthType, long payloadLength, Opcode opcode) {
		this.headerLength = headerLength + payloadLengthType.offset();
		this.payloadLengthType = payloadLengthType;
		this.payloadLength = payloadLength;
		this.fragmented = fragmented;
		this.opcode = opcode;
	}
	
	/**
	 * Instantiates a new frame header draft06.
	 *
	 * @param fragmented the fragmented
	 * @param headerLength the header length
	 * @param payloadLengthType the payload length type
	 * @param payloadLength the payload length
	 * @param opcode the opcode
	 * @param realOpcode the real opcode
	 */
	public FrameHeaderDraft06(boolean fragmented, int headerLength, PayloadLengthType payloadLengthType, long payloadLength, Opcode opcode, Opcode realOpcode) {
		this.headerLength = headerLength + payloadLengthType.offset();
		this.payloadLengthType = payloadLengthType;
		this.payloadLength = payloadLength;
		this.fragmented = fragmented;
		this.opcode = opcode;
		this.realOpcode = realOpcode;
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.FrameHeader#getFrameLength()
	 */
	public long getFrameLength(){
		return headerLength + payloadLength;
	}
	
	/**
	 * Gets the header length.
	 *
	 * @return the header length
	 */
	public int getHeaderLength(){
		return headerLength;
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.FrameHeader#getContentsLength()
	 */
	public long getContentsLength(){
		return payloadLength;
	}
	
	/**
	 * Checks if is fragmented.
	 *
	 * @return true, if is fragmented
	 */
	public boolean isFragmented(){
		return fragmented;
	}
	
	/**
	 * Checks if is continuation.
	 *
	 * @return true, if is continuation
	 */
	public boolean isContinuation(){
		return Opcode.CONTINUATION.equals(opcode);
	}
	
	/**
	 * Gets the opcode.
	 *
	 * @return the opcode
	 */
	public Opcode getOpcode(){
		return opcode;
	}
	
	/**
	 * If opcode is CONTINUATION, real opcode has previous non-CONTINUATION opcode
	 * or not real opcode is null.
	 *
	 * @return previous non-CONTINUATION opcode
	 */
	public Opcode getRealOpcode(){
		return realOpcode;
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.FrameHeader#toByteBuffer()
	 */
	public ByteBuffer toByteBuffer(){
			ByteBuffer buf = ByteBuffer.allocate(2 + payloadLengthType.offset());
			buf.put((byte)((fragmented ? 0 : 0x80) | opcode.intValue()));
			switch(payloadLengthType){
			case LEN_SHORT:
				buf.put((byte)payloadLength);
				break;
			case LEN_16:
				buf.put((byte)payloadLengthType.byteValue());
				buf.putShort((short)payloadLength);
				break;
			case LEN_63:
				buf.put((byte)payloadLengthType.byteValue());
				buf.putLong(payloadLength);
				break;
			}
			buf.flip();
			return buf;
	}
}
