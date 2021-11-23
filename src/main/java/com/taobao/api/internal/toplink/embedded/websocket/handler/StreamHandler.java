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
 * The Interface StreamHandler.
 *
 * @author Takahiro Hashimoto
 */
public interface StreamHandler {
	
	/**
	 * Next handshake upstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param chain the chain
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void nextHandshakeUpstreamHandler(WebSocket ws, ByteBuffer buffer, StreamHandlerChain chain) throws WebSocketException;
	
	/**
	 * Next handshake downstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param chain the chain
	 * @throws WebSocketException the web socket exception
	 */
	public void nextHandshakeDownstreamHandler(WebSocket ws, ByteBuffer buffer, StreamHandlerChain chain) throws WebSocketException;
	
	/**
	 * Next upstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @param chain the chain
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void nextUpstreamHandler(WebSocket ws, ByteBuffer buffer, Frame frame, StreamHandlerChain chain) throws WebSocketException;
	
	/**
	 * Next downstream handler.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @param chain the chain
	 * @throws WebSocketException the web socket exception
	 */
	public void nextDownstreamHandler(WebSocket ws, ByteBuffer buffer, Frame frame, StreamHandlerChain chain) throws WebSocketException;
}
