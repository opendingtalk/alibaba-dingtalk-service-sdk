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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * The Class HttpHeader.
 *
 * @author Takahiro Hashimoto
 */
public class HttpHeader {
	
	/** The header map. */
	private SortedMap<String, List<String>> headerMap = new TreeMap<String, List<String>>();
	
	/**
	 * Instantiates a new http response headers.
	 */
	public HttpHeader(){
	}

	/**
	 * Gets the header value.
	 *
	 * @param name the name
	 * @return the header value
	 */
	public String getHeaderValue(String name){
		name = name.toLowerCase();
		List<String> list = headerMap.get(name);
		if(list == null){
			return null;
		}
		return list.get(0);
	}
	
	/**
	 * Gets the header values.
	 *
	 * @param name the name
	 * @return the header values
	 */
	public List<String> getHeaderValues(String name){
		name = name.toLowerCase();
		List<String> list = headerMap.get(name);
		if(list == null){
			return null;
		}
		return Collections.unmodifiableList(list);
	}

	/**
	 * Contains header.
	 *
	 * @param name the header name
	 * @return true, if successful
	 */
	public boolean containsHeader(String name){
		name = name.toLowerCase();
		return headerMap.containsKey(name);
	}
	
	/**
	 * Adds the header.
	 *
	 * @param name the name
	 * @param value the value
	 */
	public void addHeader(String name, String value){
		name = name.toLowerCase();
		List<String> list = headerMap.get(name);
		if(list == null){
			list = new ArrayList<String>();
			headerMap.put(name, list);
		}
		list.add(value);
	}
	
	/**
	 * Removes the header.
	 *
	 * @param name the name
	 */
	public void removeHeader(String name){
		name = name.toLowerCase();
		headerMap.remove(name);
	}
	
	/**
	 * Gets the header names.
	 *
	 * @return the header names
	 */
	public List<String> getHeaderNames(){
		return new ArrayList<String>(headerMap.keySet());
	}
}
