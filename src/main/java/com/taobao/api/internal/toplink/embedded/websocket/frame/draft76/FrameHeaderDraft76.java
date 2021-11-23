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
package com.taobao.api.internal.toplink.embedded.websocket.frame.draft76;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;


/**
 * The Class FrameHeaderDraft76.
 *
 * @author Takahiro Hashimoto
 */
public class FrameHeaderDraft76 implements FrameHeader {
	
	/** The contents length. */
	protected final long bodyLength;

	/** The frame type. */
	protected byte frameType;
	
	/** The header length. */
	protected final int headerLength = 1;
	
	/**
	 * Instantiates a new frame header draft76.
	 *
	 * @param frameType the frame type
	 * @param payloadLength the payload length
	 */
	public FrameHeaderDraft76(byte frameType, long payloadLength) {
		this.bodyLength = payloadLength;
		this.frameType = frameType;
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.FrameHeader#getFrameLength()
	 */
	public long getFrameLength(){
		return headerLength + bodyLength;
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
		return bodyLength;
	}

	/**
	 * Gets the frame type.
	 *
	 * @return the frame type
	 */
	public byte getFrameType() {
		return frameType;
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.FrameHeader#toByteBuffer()
	 */
	public ByteBuffer toByteBuffer(){
		ByteBuffer buf = ByteBuffer.allocate(1);
		buf.put(frameType);
		buf.flip();
		return buf;
	}
}
