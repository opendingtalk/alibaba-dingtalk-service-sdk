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
import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameParser;
import com.taobao.api.internal.toplink.embedded.websocket.handshake.Handshake;



/**
 * The Class WebSocketStreamHandler.
 *
 * @author Takahiro Hashimoto
 */
public class WebSocketStreamHandler implements StreamHandler {

	/** The handshake. */
	private final Handshake handshake;
	
	/** The frame parser. */
	private final FrameParser frameParser;
	
	/**
	 * Instantiates a new web socket stream handler.
	 *
	 * @param handshake the handshake
	 * @param frameParser the frame parser
	 */
	public WebSocketStreamHandler(Handshake handshake, FrameParser frameParser){
		this.handshake = handshake;
		this.frameParser = frameParser;
	}
	
	
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.handler.StreamHandler#nextUpstreamHandler(jp.a840.websocket.WebSocket, java.nio.ByteBuffer, jp.a840.websocket.frame.Frame, jp.a840.websocket.handler.StreamHandlerChain)
	 */
	public void nextUpstreamHandler(WebSocket ws, ByteBuffer buffer, Frame frame,
			StreamHandlerChain chain) throws WebSocketException {
		// TODO split buffer for WebSocket buffer size
		chain.nextUpstreamHandler(ws, frame.toByteBuffer(), null);
	}

	/* (non-Javadoc)
	 * @see jp.a840.websocket.handler.StreamHandler#nextDownstreamHandler(jp.a840.websocket.WebSocket, java.nio.ByteBuffer, jp.a840.websocket.frame.Frame, jp.a840.websocket.handler.StreamHandlerChain)
	 */
	public void nextDownstreamHandler(WebSocket ws, ByteBuffer buffer, Frame nullFrame,
			StreamHandlerChain chain) throws WebSocketException {
		while (buffer.hasRemaining()) {
			Frame frame = frameParser.parse(buffer);
			if(frame != null){
				chain.nextDownstreamHandler(ws, buffer, frame);
			}
		}
	}



	/* (non-Javadoc)
	 * @see jp.a840.websocket.handler.StreamHandler#nextHandshakeUpstreamHandler(jp.a840.websocket.WebSocket, java.nio.ByteBuffer, jp.a840.websocket.handler.StreamHandlerChain)
	 */
	public void nextHandshakeUpstreamHandler(WebSocket ws, ByteBuffer buffer,
			StreamHandlerChain chain) throws WebSocketException {
		ByteBuffer request = handshake.createHandshakeRequest();
		chain.nextHandshakeUpstreamHandler(ws, request);
	}



	/* (non-Javadoc)
	 * @see jp.a840.websocket.handler.StreamHandler#nextHandshakeDownstreamHandler(jp.a840.websocket.WebSocket, java.nio.ByteBuffer, jp.a840.websocket.handler.StreamHandlerChain)
	 */
	public void nextHandshakeDownstreamHandler(WebSocket ws, ByteBuffer buffer,
			StreamHandlerChain chain) throws WebSocketException {
		if(handshake.handshakeResponse(buffer)){
			chain.nextHandshakeDownstreamHandler(ws, buffer);
		}
	}

}
