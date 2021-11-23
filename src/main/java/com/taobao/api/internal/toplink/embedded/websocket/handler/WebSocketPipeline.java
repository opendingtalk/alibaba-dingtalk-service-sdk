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
 * The Class WebSocketPipeline.
 *
 * @author Takahiro Hashimoto
 */
public class WebSocketPipeline {

	/** The start chain. */
	private StreamHandlerChain startChain;
	
	/** The last chain. */
	private StreamHandlerChain lastChain;

	/**
	 * Send handshake upstream.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void sendHandshakeUpstream(WebSocket ws, ByteBuffer buffer) throws WebSocketException {
		lastChain.nextHandshakeUpstreamHandler(ws, buffer);
	}
	
	/**
	 * Send handshake downstream.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public void sendHandshakeDownstream(WebSocket ws, ByteBuffer buffer) throws WebSocketException {
		startChain.nextHandshakeDownstreamHandler(ws, buffer);
	}
	
	/**
	 * Send upstream.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @throws WebSocketException the web socket exception
	 */
	public void sendUpstream(WebSocket ws, ByteBuffer buffer, Frame frame) throws WebSocketException {
		lastChain.nextUpstreamHandler(ws, buffer, frame);
	}
	
	/**
	 * Send downstream.
	 *
	 * @param ws the ws
	 * @param buffer the buffer
	 * @param frame the frame
	 * @throws WebSocketException the web socket exception
	 */
	public void sendDownstream(WebSocket ws, ByteBuffer buffer, Frame frame) throws WebSocketException {
		startChain.nextDownstreamHandler(ws, buffer,frame);
	}
	
	/**
	 * Adds the stream handler.
	 *
	 * @param handler the handler
	 */
	public void addStreamHandler(StreamHandler handler){
		StreamHandlerChain c = new StreamHandlerChain(handler);
		if(startChain == null){
			startChain = c;
			lastChain = c;
		}else{
			lastChain.add(c);
			lastChain = c;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		startChain.clear();
		super.finalize();
	}
}
