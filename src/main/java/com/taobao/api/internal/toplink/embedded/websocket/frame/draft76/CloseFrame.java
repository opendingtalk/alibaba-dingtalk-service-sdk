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
 * The Class BinaryFrame.
 *
 * @author Takahiro Hashimoto
 */
public class CloseFrame extends FrameDraft76 {

	/**
	 * Instantiates a new binary frame.
	 *
	 */
	protected CloseFrame() {
		super();
		FrameHeaderDraft76 header = new FrameHeaderDraft76((byte)0xFF, 1);
		setHeader(header);
		setContents(new byte[]{0x00});
	}
	
	/**
	 * Instantiates a new binary frame.
	 *
	 * @param header the header
	 * @param bodyData the contents data
	 */
	protected CloseFrame(FrameHeader header, byte[] bodyData){
		super(header, bodyData);
	}

	/* (non-Javadoc)
	 * @see jp.a840.websocket.frame.Frame#toByteBuffer()
	 */
	@Override
	public ByteBuffer toByteBuffer() {
		byte[] bodyLengthBuf = getBodyLength(contents);
		ByteBuffer buf = ByteBuffer.allocate(1 + bodyLengthBuf.length + contents.length);
		buf.put(header.toByteBuffer());
		buf.put(bodyLengthBuf);
		buf.put(contents);
		buf.flip();
		return buf;
	}
	
	/**
	 * Gets the contents length.
	 *
	 * @param body the contents
	 * @return the contents length
	 */
	private static byte[] getBodyLength(byte[] body){
		byte[] tmp = new byte[body.length / 7 + 1];
		int length = body.length;
		int i = 0;
		while(length != 0){
			tmp[i] = (byte)((length | 0x7F) | 0x80);
			length = length >> 7;
			i++;
		}
		i--;
		tmp[i] = (byte)(tmp[i] | 0x7F);
		byte[] bodyLengthBuf = new byte[i];
		System.arraycopy(tmp, 0, bodyLengthBuf, 0, bodyLengthBuf.length);
		return bodyLengthBuf;
	}
}
