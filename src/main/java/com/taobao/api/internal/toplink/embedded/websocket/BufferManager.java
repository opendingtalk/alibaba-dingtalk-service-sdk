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
package com.taobao.api.internal.toplink.embedded.websocket;

import java.nio.ByteBuffer;


/**
 * Fragmented buffer management class
 * management fragment buffer and recycle it if occur fragmented buffer when received websocket data.
 * 
 * @author t-hashimoto
 */
public class BufferManager {
	
	/** The fragment buf. */
	private ByteBuffer fragmentBuf;

	/**
	 * init management fragment buffer.
	 */
	public void init(){
		if(this.fragmentBuf != null){
			this.fragmentBuf.clear();
		}
		this.fragmentBuf = null;
	}

	/**
	 * Get merged fragmented buffer and argument buffer.
	 * if does not have a management fragment buffer then return take a argument buffer
	 *
	 * @param buffer the buffer
	 * @return merged buffer management(if have) and argument.
	 */
	public ByteBuffer getBuffer(ByteBuffer buffer){
		if (fragmentBuf != null) {
			fragmentBuf.rewind();
			int len = fragmentBuf.remaining() + buffer.remaining();
			byte[] buf = new byte[len];
			fragmentBuf.get(buf, 0, fragmentBuf.remaining());
			buffer.get(buf, fragmentBuf.position(), buffer.remaining());
			buffer = ByteBuffer.wrap(buf);
		}
		return buffer;
	}
	
	/**
	 * set buffer to management buffer.
	 *
	 * @param buffer the buffer
	 */
	public void storeFragmentBuffer(ByteBuffer buffer){
		this.fragmentBuf = ByteBuffer.allocate(buffer.limit() - buffer.position());
		this.fragmentBuf.put(buffer);
	}
}
