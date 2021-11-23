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
package com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;
import com.taobao.api.internal.toplink.embedded.websocket.frame.rfc6455.FrameBuilderRfc6455.Opcode;

/**
 * The Class ConnectionCloseFrame.
 * 
 * @author Takahiro Hashimoto
 */
public class CloseFrame extends FrameRfc6455 {
	
	/**
	 * Instantiates a new connection close frame.
	 * 
	 * @param header
	 *            the header
	 * @param bodyData
	 *            the contents data
	 */
	protected CloseFrame(FrameHeaderRfc6455 header, byte[] bodyData) {
		super(header, bodyData);
	}
	
	/**
	 * Instantiates a new close frame.
	 */
	public CloseFrame() {
		FrameHeader header = FrameBuilderRfc6455.createFrameHeader(null, false, Opcode.CONNECTION_CLOSE);
		setHeader(header);
	}
	
	public CloseFrame(int statusCode, String reasonText) {
		byte[] reasonBytes;
		try {
			reasonBytes = reasonText.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		byte[] body = new byte[reasonBytes.length + 2];
		ByteBuffer buffer = ByteBuffer.wrap(body);
		buffer.putShort((short) statusCode);
		buffer.put(reasonBytes);
		setHeader(FrameBuilderRfc6455.createFrameHeader(body, false, Opcode.CONNECTION_CLOSE));
		setContents(body);
	}
	
	public int getStatusCode() {
		return this.contents.length < 2 ? 0 : ByteBuffer.wrap(this.contents).getShort();
	}
	
	public String getReasonText() {
		try {
			return this.contents.length <= 2 ? null :
					new String(this.contents, 2, this.contents.length - 2, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
}
