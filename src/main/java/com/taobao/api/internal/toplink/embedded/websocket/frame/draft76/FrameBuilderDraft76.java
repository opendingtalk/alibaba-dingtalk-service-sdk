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

import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;
import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;


/**
 * The Class FrameBuilderDraft76.
 *
 * @author Takahiro Hashimoto
 */
public class FrameBuilderDraft76 {
	
	/**
	 * create frame header from parameter bytes
	 * if a invalid frame data received which may throw IllegalArgumentException.
	 *
	 * @param chunkData the chunk data
	 * @return a sub class of FrameHeader or null if not enough buffer
	 */
	public static FrameHeader createFrameHeader(ByteBuffer chunkData) {
		if(chunkData == null){
			throw new IllegalArgumentException("Data is null.");
		}

		int length = chunkData.limit() - chunkData.position();
		if(length < 2){
			return null;
		}

		int payloadLength = 0;
		byte type = chunkData.get();
		int position = chunkData.position();
		if((byte)0x00 <= type && type <= (byte)0x7F){
			chunkData.mark();
			boolean completed = false;
			while(chunkData.hasRemaining() && !completed){
				if(chunkData.get() == (byte)0xFF){
					completed = true;
					continue;
				}
			}
			if(!completed){
				return null;
			}
			payloadLength = chunkData.position() - position;
			chunkData.reset();
		}else if((byte)0x80 <= type && type <= (byte)0xFF){
			boolean completed = false;
			while(chunkData.hasRemaining() && !completed){
				int lengthByte = chunkData.get();
				int length7Bit = lengthByte & 0x7F;
				payloadLength = (payloadLength << 7) | length7Bit;
				if(length7Bit == lengthByte){
					completed = true;
					continue;
				}
			}
			if(!completed){
				return null;
			}
		}else{
			throw new IllegalStateException("Not found Opcode type! (" + type + ")");			
		}
		return new FrameHeaderDraft76((byte)type, payloadLength);
	}
	
	/**
	 * Creates the frame.
	 *
	 * @param h the h
	 * @param bodyData the contents data
	 * @return the frame
	 */
	public static Frame createFrame(FrameHeader h, byte[] bodyData){
		FrameHeaderDraft76 header = (FrameHeaderDraft76)h;
		if((byte)0x00 <= header.getFrameType() && header.getFrameType() <= (byte)0x7F){
			return new TextFrame(header, bodyData);
		}else if((byte)0x80 <= header.getFrameType() && header.getFrameType() <= (byte)0xFF){
			if(bodyData.length == 1 && bodyData[0] == 0x00){
				return new CloseFrame(header, bodyData);
			}else{
				return new BinaryFrame(header, bodyData);
			}
		}else{
			throw new IllegalStateException("Not found Opcode type! (" + header.getFrameType() + ")");
		}
	}
}
