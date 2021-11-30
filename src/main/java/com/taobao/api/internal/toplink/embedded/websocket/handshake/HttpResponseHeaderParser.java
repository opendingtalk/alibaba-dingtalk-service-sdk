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
package com.taobao.api.internal.toplink.embedded.websocket.handshake;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.HttpHeader;
import com.taobao.api.internal.toplink.embedded.websocket.util.StringUtil;


/**
 * The Class HttpResponseHeaderParser.
 *
 * @author Takahiro Hashimoto
 */
public class HttpResponseHeaderParser {
	
	/** The response header. */
	private HttpHeader responseHeader = new HttpHeader();

	/** The complete. */
	private boolean complete = false;
	
	/**
	 * Parses the.
	 *
	 * @param buffer the buffer
	 */
	public void parse(ByteBuffer buffer){
		if(complete){
			throw new IllegalStateException("Parser already parse completed");
		}
		do {
			String line = StringUtil.readLine(buffer);
			if(line == null){				
				return;
			}
			if (line.indexOf(':') > 0) {
				String[] keyValue = line.split(":", 2);
				if (keyValue.length > 1) {
					responseHeader.addHeader(keyValue[0].trim(),
							keyValue[1].trim());
				}
			}
			if ("\r\n".compareTo(line) == 0) {
				complete = true;
				return;
			}
			if (!buffer.hasRemaining()) {
				return;
			}
		} while (true);
	}
	
	/**
	 * Checks if is completed.
	 *
	 * @return true, if is completed
	 */
	public boolean isCompleted(){
		return complete;
	}
	
	/**
	 * Gets the response header.
	 *
	 * @return the response header
	 */
	public HttpHeader getResponseHeader(){
		return responseHeader;
	}
}
