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
package com.taobao.api.internal.toplink.embedded.websocket.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.logging.Logger;

import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.impl.WebSocketBase;


/**
 * The Class PacketDumpUtil.
 *
 * @author Takahiro Hashimoto
 */
public class PacketDumpUtil {
	/** The Constant FR_DOWN. */
	public static final int FR_DOWN = 1 << 0;
	
	/** The Constant HS_DOWN. */
	public static final int HS_DOWN = 1 << 1;
	
	/** The Constant FR_UP. */
	public static final int FR_UP   = 1 << 2;
	
	/** The Constant HS_UP. */
	public static final int HS_UP   = 1 << 3;
	
	/** The Constant ALL. */
	public static final int ALL     = FR_DOWN | HS_DOWN | FR_UP | HS_UP;
	

	/** The log. */
	private static Logger log = Logger.getLogger(PacketDumpUtil.class.getName());

	/**
	 * Checks if is dump.
	 *
	 * @param mode the mode
	 * @return true, if is dump
	 */
	public static boolean isDump(WebSocket ws, int mode){
		return (((WebSocketBase)ws).getPacketDumpMode() & mode) > 0;
	}
	
//	/**
//	 * Checks if is dump.
//	 *
//	 * @param mode the mode
//	 * @return true, if is dump
//	 */
//	public static boolean isDump(int mode){
//		return (WebSocketBase.getPacketDumpMode() & mode) > 0;
//	}

	/**
	 * Prints the packet dump.
	 *
	 * @param title the title
	 * @param buffer the buffer
	 */
	public static void printPacketDump(String title, ByteBuffer buffer){
		buffer.mark();
		
		// 00 01 02 03 04 05 06 07 08 09 0A 0B 0C 0D 0E 0F
		int count = 0;
		String header = "               4         8        12        16";
		
		StringBuilder dump = new StringBuilder();
		dump.append(title);
		dump.append("\n");
		dump.append(header);
		dump.append("\n");
		while(buffer.hasRemaining()){
			byte[] line = new byte[16];
			StringBuilder dumpLine = new StringBuilder();
			dumpLine.append(StringUtil.lpad(Integer.toHexString(16 * count++), 5, "0"));
			dumpLine.append(":");
			int length = Math.min(buffer.remaining(), line.length);
			buffer.get(line, 0, length);
			for(int i = 0; i < length; i++){
				if(i % 2 == 0){
					dumpLine.append(" ");
				}
				dumpLine.append(StringUtil.lpad(StringUtil.toHexString(line[i]), 2, "0"));
			}
			dumpLine.append(" ");
			dump.append(StringUtil.rpad(dumpLine, header.length() + 3, " ") + dumpStr(line, length));
			dump.append("\n");
		}
		log.info(dump.toString());
		buffer.reset();
	}
	
	/**
	 * Dump str.
	 *
	 * @param bytes the bytes
	 * @param length the length
	 * @return the string
	 */
	private static String dumpStr(byte[] bytes, int length){
		CharBuffer buf = CharBuffer.allocate(length);
		
		for(int i = 0; i < length; i++){
			if((0x00 <= bytes[i] && bytes[i] <= 0x1F) || bytes[i] == 0x7F || (bytes[i] & 0x80) > 0){
				buf.put(i, (char)0x2E);
			}else{
				buf.put(i, (char)bytes[i]);				
			}
		}
		return buf.toString();
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		ByteBuffer buf = ByteBuffer.allocate(64);
		buf.put("01234567890-+=\n\rabcdefg".getBytes());
		buf.flip();
		printPacketDump("TEST", buf);
	}

}
