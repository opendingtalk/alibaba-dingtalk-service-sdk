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
package com.taobao.api.internal.toplink.embedded.websocket.handshake;

import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.EnumSet;
//import java.util.logging.Logger;


import com.taobao.api.internal.toplink.embedded.websocket.BufferManager;
import com.taobao.api.internal.toplink.embedded.websocket.HttpHeader;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.util.StringUtil;

import static com.taobao.api.internal.toplink.embedded.websocket.exception.ErrorCode.*;

/**
 * Processing WebSocket Handshake
 * 
 * <pre>
 * Sample (Draft06)
 * client => server
 * GET /chat HTTP/1.1
 * Host: server.example.com
 * Upgrade: websocket
 * Connection: Upgrade
 * Sec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==
 * Sec-WebSocket-Origin: http://example.com
 * Sec-WebSocket-Protocol: chat, superchat
 * Sec-WebSocket-Version:6
 * 
 * server => client
 * HTTP/1.1 101 Switching Protocols
 * Upgrade: websocket
 * Connection: Upgrade
 * Sec-WebSocket-Accept: s3pPLMBiTxaQ9kYGzzhZRbK+xOo=
 * Sec-WebSocket-Protocol: chat
 * </pre>
 *
 * @author Takahiro Hashimoto
 */
public abstract class Handshake {
	
	/** The logger. */
	//private static Logger logger = Logger.getLogger(Handshake.class.getName());

	/** The response status. */
	private int responseStatus;	

	/** The response header map. */
	private HttpResponseHeaderParser httpResponseHeaderParser;

	/**
	 * The Enum State.
	 *
	 * @author Takahiro Hashimoto
	 */
	enum State {
		
		/** The INIT. */
		INIT,
		/** The METHOD. */
		METHOD, 
		/** The HEADER. */
		HEADER, 
		/** The BODY. */
		BODY, 
		/** The DONE. */
		DONE;
		
		/** The state map. */
		private static EnumMap<State, EnumSet<State>> stateMap = new EnumMap<State, EnumSet<State>>(State.class);
		static {
			stateMap.put(INIT,   EnumSet.of(State.METHOD));
			stateMap.put(METHOD,   EnumSet.of(State.HEADER));
			stateMap.put(HEADER,    EnumSet.of(State.BODY, State.DONE));
			stateMap.put(BODY,    EnumSet.of(State.DONE));
			stateMap.put(DONE,     EnumSet.of(State.METHOD));
		}
		
		/**
		 * Can transition to.
		 *
		 * @param state the state
		 * @return true, if successful
		 */
		boolean canTransitionTo(State state){
			EnumSet<State> set = stateMap.get(this);
			if(set == null) return false;
			return set.contains(state);
		}
	}
	
	/**
	 * Transition to.
	 *
	 * @param to the to
	 * @return the state
	 */
	protected State transitionTo(State to){
		if(state.canTransitionTo(to)){
			State old = state;
			state = to;
			return old;
		}else{
			throw new IllegalStateException("Couldn't transtion from " + state + " to " + to);
		}
	}
	
	/** The state. */
	volatile private State state = State.INIT;
	
	/**
	 * State.
	 *
	 * @return the state
	 */
	protected State state(){
		return state;
	}

	/** The buffer manager. */
	protected BufferManager bufferManager = new BufferManager();
	
	/**
	 * Handshake response.
	 *
	 * @param downloadBuffer the download buffer
	 * @return true, if successful
	 * @throws WebSocketException the web socket exception
	 */
	final public boolean handshakeResponse(ByteBuffer downloadBuffer) throws WebSocketException {
		ByteBuffer buffer = null;
		try{
			if (state == State.INIT || state == State.DONE) {
				transitionTo(State.METHOD);
				responseStatus = -1;
				httpResponseHeaderParser = new HttpResponseHeaderParser();
				bufferManager.init();
				buffer = downloadBuffer;
			} else {
				buffer = bufferManager.getBuffer(downloadBuffer);
			}

			if (state == State.METHOD || state == State.HEADER) {
				int position = buffer.position();
				if (!parseHandshakeResponseHeader(buffer)) {
					buffer.position(position);
					bufferManager.storeFragmentBuffer(buffer);
					return false;
				}
				transitionTo(State.BODY);
			}

			if (state == State.BODY) {
				int position = buffer.position();
				if (!parseHandshakeResponseBody(buffer)) {
					buffer.position(position);
					bufferManager.storeFragmentBuffer(buffer);
					return false;
				}
			}

			return done();
		}finally{
			if(buffer != null && buffer != downloadBuffer){
				downloadBuffer.position(downloadBuffer.limit() - buffer.remaining());
			}
		}
	}

	/**
	 * Done.
	 *
	 * @return true, if successful
	 */
	protected boolean done(){
		transitionTo(State.DONE);
		return true;
	}
	
	/**
	 * Checks if is done.
	 *
	 * @return true, if is done
	 */
	public boolean isDone(){
		return state == State.DONE;
	}
		
	/**
	 * Parses the handshake response contents.
	 *
	 * @param buffer the buffer
	 * @return true, if successful
	 * @throws WebSocketException the web socket exception
	 */
	protected boolean parseHandshakeResponseBody(ByteBuffer buffer) throws WebSocketException {
		return true;
	}
	
	/**
	 * Parses the handshake response header.
	 *
	 * @param buffer the buffer
	 * @return true, if successful
	 * @throws WebSocketException the web socket exception
	 */
	protected boolean parseHandshakeResponseHeader(ByteBuffer buffer)
			throws WebSocketException {

		if (state == State.METHOD) {
			// METHOD
			// HTTP/1.1 101 Switching Protocols
			String line = StringUtil.readLine(buffer);
			if(line == null){
				return false;
			}
			if (!line.startsWith("HTTP/1.1")) {
				throw new WebSocketException(E3101,line);
			}
			responseStatus = Integer.valueOf(line.substring(9, 12));
			if (responseStatus != 101) {
				throw new WebSocketException(E3102,line);
			}
			transitionTo(State.HEADER);
		}

		if (state == State.HEADER) {
			httpResponseHeaderParser.parse(buffer);
			return httpResponseHeaderParser.isCompleted();
		}

		return true;
	}

	/**
	 * Creates the handshake request.
	 *
	 * @return the byte buffer
	 * @throws WebSocketException the web socket exception
	 */
	abstract public ByteBuffer createHandshakeRequest()
			throws WebSocketException;

	/**
	 * Gets the response status.
	 *
	 * @return the response status
	 */
	public int getResponseStatus() {
		return responseStatus;
	}

	/**
	 * Gets the response header map.
	 *
	 * @return the response header map
	 */
	public HttpHeader getResponseHeader() {
		return httpResponseHeaderParser.getResponseHeader();
	} 
}
