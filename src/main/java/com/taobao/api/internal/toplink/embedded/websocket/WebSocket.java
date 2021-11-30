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

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;



/**
 * The Interface WebSocket.
 *
 * @author Takahiro Hashimoto
 */
public interface WebSocket {
	
	/**
	 * Send.
	 *
	 * @param frame the frame
	 * @throws WebSocketException the web socket exception
	 */
	public void send(Frame frame) throws WebSocketException;

    /**
   	 * Send.
   	 *
   	 * @param buffer the ByteBuffer
   	 * @throws WebSocketException the web socket exception
   	 */
   	public void send(ByteBuffer buffer) throws WebSocketException;

    /**
   	 * Send.
   	 *
   	 * @param bytes the bytes
   	 * @throws WebSocketException the web socket exception
   	 */
   	public void send(byte[] bytes) throws WebSocketException;

    /**
   	 * Send.
   	 *
   	 * @param text the text
   	 * @throws WebSocketException the web socket exception
   	 */
   	public void send(String text) throws WebSocketException;

	/**
	 * Connect.
	 *
	 * @throws WebSocketException the web socket exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void connect() throws WebSocketException, IOException;
	
	/**
	 * Checks if is connected.
	 *
	 * @return true, if is connected
	 */
	public boolean isConnected();
	
	/**
	 * Close.
	 */
	public void close();

    /**
     * await close
     */
    public void awaitClose() throws InterruptedException;

	/**
	 * Checks if is blocking mode.
	 *
	 * @return true, if is blocking mode
	 */
	public boolean isBlockingMode();
	
	/**
	 * Sets the blocking mode.
	 *
	 * @param blockingMode the new blocking mode
	 */
	public void setBlockingMode(boolean blockingMode);
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public URI getLocation();
	
	/**
	 * Gets the endpoint.
	 *
	 * @return the endpoint
	 */
	public InetSocketAddress getEndpoint();
	
	/**
	 * Gets the buffer size.
	 *
	 * @return the buffer size
	 */
	public int getBufferSize();
	
	/**
	 * Gets the connection timeout.
	 *
	 * @return the connection timeout
	 */
	public int getConnectionTimeout();
	
	/**
	 * Sets the connection timeout.
	 *
	 * @param connectionTimeout the new connection timeout
	 */
	public void setConnectionTimeout(int connectionTimeout);
	
	/**
	 * Creates the frame.
	 *
	 * @param obj the obj
	 * @return the frame
	 * @throws WebSocketException the web socket exception
	 */
	public Frame createFrame(Object obj) throws WebSocketException;

    /**
   	 * Creates the frame.
   	 *
   	 * @param bytes the byte array
   	 * @return the frame
   	 * @throws WebSocketException the web socket exception
   	 */
   	public Frame createFrame(byte[] bytes) throws WebSocketException;

    /**
   	 * Creates the frame.
   	 *
   	 * @param buffer the ByteBuffer
   	 * @return the frame
   	 * @throws WebSocketException the web socket exception
   	 */
   	public Frame createFrame(ByteBuffer buffer) throws WebSocketException;

	/**
	 * Creates the frame.
	 *
	 * @param str the str
	 * @return the frame
	 * @throws WebSocketException the web socket exception
	 */
	public Frame createFrame(String str) throws WebSocketException;
}
