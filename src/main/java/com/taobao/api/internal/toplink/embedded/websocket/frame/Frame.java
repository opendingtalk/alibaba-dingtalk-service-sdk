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
package com.taobao.api.internal.toplink.embedded.websocket.frame;

import java.nio.ByteBuffer;


/**
 * The Class Frame.
 *
 * @author Takahiro Hashimoto
 */
abstract public class Frame {

	/** The header. */
	protected FrameHeader header;

	/** The contents. */
	protected byte[] contents;
	
	/**
	 * Instantiates a new frame.
	 */
	protected Frame(){
	}
	
	/**
	 * Instantiates a new frame.
	 *
	 * @param header the header
	 * @param contents the contents
	 */
	protected Frame(FrameHeader header, byte[] contents){
		this.header = header;
		this.contents = contents;
	}

	/**
	 * Gets the contents length.
	 *
	 * @return the contents length
	 */
	public long getContentsLength(){
		return header.getContentsLength();
	}
	
	/**
	 * Gets the header.
	 *
	 * @return the header
	 */
	public FrameHeader getHeader(){
		return header;
	}
	
	/**
	 * convert frame to byte buffer.
	 *
	 * @return the byte buffer
	 */
	abstract public ByteBuffer toByteBuffer();

	/**
	 * Gets the raw contents.
	 *
	 * @return the raw contents
	 */
	public ByteBuffer getContents(){
		return ByteBuffer.wrap(contents);
	}

    /**
   	 * Gets the raw contents.
   	 *
   	 * @return the raw contents
   	 */
   	public void readContents(byte[] buf){
           System.arraycopy(contents, 0, buf, 0, buf.length);
   	}

    /**
   	 * Gets the raw contents.
   	 *
   	 * @return the raw contents
   	 */
   	public void readContents(byte[] buf, int offset, int length){
           System.arraycopy(contents, 0, buf, offset, length);
   	}

	/**
	 * Sets the header.
	 *
	 * @param header the new header
	 */
	protected void setHeader(FrameHeader header) {
		this.header = header;
	}

	/**
	 * Sets the contents.
	 *
	 * @param contents the new contents
	 */
	protected void setContents(byte[] contents) {
		this.contents = contents;
	}
}
