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

import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft06.FrameBuilderDraft06.Opcode;


/**
 * The Class PingFrame.
 *
 * @author Takahiro Hashimoto
 */
public class PingFrame extends FrameDraft06 {

	/**
	 * Instantiates a new ping frame.
	 *
	 * @param header the header
	 * @param bodyData the contents data
	 */
	protected PingFrame(FrameHeaderDraft06 header, byte[] bodyData) {
		super(header, bodyData);
	}

	/**
	 * Instantiates a new ping frame.
	 */
	public PingFrame(){
		FrameHeader header = FrameBuilderDraft06.createFrameHeader(null, false, Opcode.PING);
		setHeader(header);
	}
}
