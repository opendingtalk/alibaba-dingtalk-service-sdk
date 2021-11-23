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
package com.taobao.api.internal.toplink.embedded.websocket.handler;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;



/**
 * The Class StreamHandlerChain.
 *
 * @author Takahiro Hashimoto
 */
public class StreamHandlerChain {
	
	/** The next. */
	private StreamHandlerChain next;
	
	/** The prev. */
	private StreamHandlerChain prev;

	/** The stream handler. */
	final private StreamHandler streamHandler;

	/**
	 * Instantiates a new stream handler chain.
	 *
	 * @param streamHandler the stream handler
	 */
	public StreamHandlerChain(StreamHandler streamHandler) {
		this.streamHandler = streamHandler;
	}

	/**
	 * Next handshake upstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @throws WebSocketException the web socket exception
	 */
	public void nextHandshakeUpstreamHandler(WebSocket ws, ByteBuffer buffer) throws WebSocketException {
		if(prev != null) {
			prev.streamHandler.nextHandshakeUpstreamHandler(ws, buffer, prev);
		}		
	}

	/**
	 * Next handshake downstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @throws WebSocketException the web socket exception
	 */
	public void nextHandshakeDownstreamHandler(WebSocket ws, ByteBuffer buffer) throws WebSocketException {
		if(next != null){
			next.streamHandler.nextHandshakeDownstreamHandler(ws, buffer, next);
		}
	}

	/**
	 * Next upstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void nextUpstreamHandler(WebSocket ws, ByteBuffer buffer, Frame frame) throws WebSocketException {
		if(prev != null) {
			prev.streamHandler.nextUpstreamHandler(ws, buffer, frame, prev);
		}
	}

	/**
	 * Next downstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void nextDownstreamHandler(WebSocket ws, ByteBuffer buffer, Frame frame) throws WebSocketException {
		if(next != null){
			next.streamHandler.nextDownstreamHandler(ws, buffer, frame, next);
		}
	}
		
	/**
	 * Adds the.
	 *
	 * @param next the next
	 */
	public void add(StreamHandlerChain next){
		this.next = next;
		next.prev = this;
	}
	
	/**
	 * Clear.
	 */
	public void clear(){
		this.next.clear();
		this.prev = null;
	}
}
