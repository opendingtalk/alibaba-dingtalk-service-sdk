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
package com.taobao.api.internal.toplink.embedded.websocket.frame;

import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.EnumSet;

import com.taobao.api.internal.toplink.embedded.websocket.BufferManager;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;


/**
 * The Class FrameParser.
 *
 * @author Takahiro Hashimoto
 */
public abstract class FrameParser {

	/**
	 * The Enum State.
	 *
	 * @author Takahiro Hashimoto
	 */
	enum State {
		
		/** The HEADER. */
		HEADER, 
		/** The FRAME. */
		FRAME, 
		/** The DONE. */
		DONE;
		
		/** The state map. */
		private static EnumMap<State, EnumSet<State>> stateMap = new EnumMap<State, EnumSet<State>>(State.class);
		static {
			stateMap.put(HEADER,   EnumSet.of(State.FRAME));
			stateMap.put(FRAME,    EnumSet.of(State.DONE));
			stateMap.put(DONE,     EnumSet.of(State.HEADER));
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
	volatile private State state = State.DONE;
	
	/**
	 * State.
	 *
	 * @return the state
	 */
	protected State state(){
		return state;
	}
	
	/** The header. */
	private FrameHeader header;

	/** The buffer manager. */
	private BufferManager bufferManager = new BufferManager();
	
	/**
	 * Parses the.
	 *
	 * @param downloadBuffer the download buffer
	 * @return the frame
	 * @throws com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException the web socket exception
	 */
	public Frame parse(ByteBuffer downloadBuffer) throws WebSocketException {
		ByteBuffer buffer = null;
		try {
			if (State.DONE.equals(state)) {
				transitionTo(State.HEADER);
				buffer = downloadBuffer;
			} else {
				buffer = bufferManager.getBuffer(downloadBuffer);
			}

			if (State.HEADER.equals(state)) {
				int position = buffer.position();
				header = createFrameHeader(buffer);
				if (header == null) {
					buffer.position(position);
					bufferManager.storeFragmentBuffer(buffer);
					return null;
				}
				if (header.getContentsLength() - 1 > Integer.MAX_VALUE) {
					throw new IllegalArgumentException(
							"large data is not support yet");
				}
				transitionTo(State.FRAME);
			}

			if (State.FRAME.equals(state)) {
				if (header.getContentsLength() > buffer.remaining()) {
					bufferManager.storeFragmentBuffer(buffer);
					return null;
				}

				byte[] bodyBuf = new byte[(int) header.getContentsLength()];
				buffer.get(bodyBuf, 0, bodyBuf.length);
				Frame frame = createFrame(header, bodyBuf);
				transitionTo(State.DONE);
				bufferManager.init();

				header = null;
				return frame;
			}
			return null;
		} finally {
			if (buffer != null && buffer != downloadBuffer) {
				downloadBuffer.position(downloadBuffer.limit()
						- buffer.remaining());
			}
		}
	}

	/**
	 * Creates the frame header.
	 *
	 * @param chunkData the chunk data
	 * @return the frame header
	 */
	abstract protected FrameHeader createFrameHeader(ByteBuffer chunkData);
	
	/**
	 * Creates the frame.
	 *
	 * @param h the h
	 * @param bodyData the contents data
	 * @return the frame
	 */
	abstract protected Frame createFrame(FrameHeader h, byte[] bodyData);
}
