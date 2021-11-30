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

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class StringUtil.
 *
 * @author Takahiro Hashimoto
 */
public class StringUtil {
	
	/** The log. */
	private static Logger log = Logger.getLogger(StringUtil.class.getName());
	
	/**
	 * Join.
	 *
	 * @param delim the delim
	 * @param collections the collections
	 * @return the string
	 */
	public static String join(String delim, Collection<String> collections) {
		String[] values = new String[collections.size()];
		collections.toArray(values);
		return join(delim, 0, collections.size(), values);
	}

	/**
	 * Join.
	 *
	 * @param delim the delim
	 * @param strings the strings
	 * @return the string
	 */
	public static String join(String delim, String... strings) {
		return join(delim, 0, strings.length, strings);
	}

	/**
	 * Join.
	 *
	 * @param delim the delim
	 * @param start the start
	 * @param end the end
	 * @param strings the strings
	 * @return the string
	 */
	public static String join(String delim, int start, int end,
			String... strings) {
		if (strings.length == 1) {
			return strings[0];
		}
		StringBuilder sb = new StringBuilder(strings[start]);
		for (int i = start + 1; i < end; i++) {
			sb.append(delim).append(strings[i]);
		}
		return sb.toString();
	}

	/**
	 * Adds the header.
	 *
	 * @param sb the sb
	 * @param key the key
	 * @param value the value
	 */
	public static void addHeader(StringBuilder sb, String key, String value) {
		// TODO need folding?
		sb.append(key + ": " + value + "\r\n");
	}
	
	/**
	 * Read line.
	 *
	 * @param buf the buf
	 * @return the string
	 */
	public static String readLine(ByteBuffer buf) {
		boolean completed = false;
		buf.mark();
		while (buf.hasRemaining() && !completed) {
			byte b = buf.get();
			if (b == '\r') {
				if(buf.hasRemaining() && buf.get() == '\n'){
					completed = true;
				}
			}
		}

		if(!completed){
			return null;
		}

		int limit = buf.position();
		buf.reset();
		int length = limit - buf.position();
		byte[] tmp = new byte[length];
		buf.get(tmp, 0, length);
		try {
			String line = new String(tmp, "US-ASCII");
			if (log.isLoggable(Level.FINEST)) {
				log.finest(line.trim());
			}
			return line;
		} catch (UnsupportedEncodingException e) {
			;
		}
		return null;
	}

	/**
	 * Adds the param.
	 *
	 * @param sb the sb
	 * @param key the key
	 * @param param the param
	 * @return the string builder
	 */
	public static StringBuilder addParam(StringBuilder sb, String key, String param){
		sb.append(key).append("=").append(param);
		return sb;
	}

	/**
	 * Adds the quoted param.
	 *
	 * @param sb the sb
	 * @param key the key
	 * @param param the param
	 * @return the string builder
	 */
	public static StringBuilder addQuotedParam(StringBuilder sb, String key, String param){
		sb.append(key).append("=\"").append(param).append("\"");
		return sb;
	}
	
	/**
	 * To m d5 hex string.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String toMD5HexString(String str){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes("US-ASCII"));
			return toHexString(md.digest());
		}catch(UnsupportedEncodingException e){
			;
		}catch(NoSuchAlgorithmException e){
			;
		}
		return null;
	}
	
	/** The hex table. */
	private static char[] hexTable = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	/**
	 * toHexString.
	 *
	 * @param b the b
	 * @return the string
	 */
	public static String toHexString(byte b){
		char[] chars = new char[2];
		int d = (b & 0xF0) >> 4;
		int m =  b & 0x0F;
		chars[0] = hexTable[d];
		chars[1] = hexTable[m];
		return new String(chars);
	}
	
	/**
	 * toHexString.
	 *
	 * @param bytes the bytes
	 * @return the string
	 */
	public static String toHexString(byte[] bytes){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < bytes.length; i++){
			char[] chars = new char[2];
			int d = (bytes[i] & 0xF0) >> 4;
			int m =  bytes[i] & 0x0F;
			chars[0] = hexTable[d];
			chars[1] = hexTable[m];
			sb.append(chars);
		}
		return sb.toString();
	}
	
	/**
	 * Lpad.
	 *
	 * @param str the str
	 * @param len the len
	 * @param padding the padding
	 * @return the string
	 */
	public static String lpad(Object str, int len, String padding){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len - str.toString().length(); i++){
			sb.append(padding);
		}
		sb.append(str);
		return sb.toString();
	}
	
	/**
	 * Rpad.
	 *
	 * @param str the str
	 * @param len the len
	 * @param padding the padding
	 * @return the string
	 */
	public static String rpad(Object str, int len, String padding){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		for(int i = 0; i < len - str.toString().length(); i++){
			sb.append(padding);
		}
		return sb.toString();
	}
	

	/**
	 * The Enum State.
	 *
	 * @author Takahiro Hashimoto
	 */
	enum State {
		
		/** The KE y_ start. */
		KEY_START, 
 /** The KEY. */
 KEY,
/** The VALU e_ start. */
VALUE_START, 
 /** The VALUE. */
 VALUE,
/** The DELIM. */
DELIM;
	}
	
	/**
	 * ex. realm="testrealm@host.com", qop="auth,auth-int"
	 *
	 * @param str the str
	 * @param delim the delim
	 * @return the map
	 */
	public static Map<String, String> parseKeyValues(String str, char delim){
		State state = State.KEY;
		char[] chars = str.toCharArray();
		String key = null;
		String value = null;
		StringBuilder sb = new StringBuilder();
		Map<String, String> map = new HashMap<String, String>();
		boolean isQuoted = false;
		for(int i = 0; i < chars.length; i++){
			switch(state){
			case KEY_START:
				if(chars[i] == ' '){
					continue;
				}else{
					sb.append(chars[i]);
					state = State.KEY;
				}
				break;
			case KEY:
				if(chars[i] == '='){
					key = sb.toString().trim();
					sb = new StringBuilder();
					state = State.VALUE_START;
				}else{
					sb.append(chars[i]);
				}
				break;
			case VALUE_START:
				if(chars[i] == ' '){
					continue;
				}else if(chars[i] == '"'){
					state = State.VALUE;
					isQuoted = true;
				}else{
					sb.append(chars[i]);
					state = State.VALUE;
					isQuoted = false;
				}
				break;
			case VALUE:
				if(isQuoted && chars[i] == '"'){
					state = State.DELIM;
					value = sb.toString();
					
					map.put(key, value);
					sb = new StringBuilder();
				}else if(!isQuoted && chars[i] == delim){
					state = State.KEY_START;
					value = sb.toString();
					
					map.put(key, value);
					sb = new StringBuilder();
				}else{
					sb.append(chars[i]);					
				}
				break;
			case DELIM:
				if(chars[i] == ' '){
					continue;
				}else if(chars[i] == ','){
					state = State.KEY_START;
				}else{
					break;
				}
				break;
			}
		}
		return map;
	}
}
