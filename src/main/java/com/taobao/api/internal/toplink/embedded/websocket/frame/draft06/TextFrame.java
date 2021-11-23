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

import java.io.UnsupportedEncodingException;

import com.taobao.api.internal.toplink.embedded.websocket.frame.draft06.FrameBuilderDraft06.Opcode;



/**
 * The Class TextFrame.
 *
 * @author Takahiro Hashimoto
 */
public class TextFrame extends FrameDraft06 {

	/** The converted string. */
	private String convertedString;
	
	/**
	 * Instantiates a new text frame.
	 *
	 * @param header the header
	 * @param bodyData the contents data
	 */
	public TextFrame(FrameHeaderDraft06 header, byte[] bodyData) {
		super(header, bodyData);
	}

	/**
	 * Instantiates a new text frame.
	 *
	 * @param str the str
	 */
	public TextFrame(String str){
		super();
		byte[] body = convertStringToByteArray(str);
		setHeader(FrameBuilderDraft06.createFrameHeader(body, false, Opcode.TEXT_FRAME));
		setContents(body);
	}
	
	/**
	 * Convert string to byte array.
	 *
	 * @param str the str
	 * @return the byte[]
	 */
	private static byte[] convertStringToByteArray(String str){
		try{
			return str.getBytes("UTF-8");
		}catch(UnsupportedEncodingException e){
			;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		if(convertedString == null){
			try{
				convertedString = new String(contents, "UTF-8");
			}catch(UnsupportedEncodingException e){
				convertedString = "";
			}
		}
		return convertedString;
	}
}
