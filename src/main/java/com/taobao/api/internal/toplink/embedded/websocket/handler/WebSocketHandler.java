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

import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;

/**
 * The Interface WebSocketHandler.
 * 
 * @author Takahiro Hashimoto
 */
public interface WebSocketHandler {

	/**
	 * On open.
	 * 
	 * @param socket
	 *            the socket
	 */
	public void onOpen(WebSocket socket);

	/**
	 * On message.
	 * 
	 * @param socket
	 *            the socket
	 * @param frame
	 *            the frame
	 */
	public void onMessage(WebSocket socket, Frame frame);

	/**
	 * On error.
	 * 
	 * @param socket
	 *            the socket
	 * @param e
	 *            the e
	 */
	public void onError(WebSocket socket, WebSocketException e);

	/**
	 * On close.
	 * 
	 * @param socket
	 *            the socket
	 */
	public void onClose(WebSocket socket);

	/**
	 * On close frame.
	 * 
	 * @param socket
	 *            the socket
	 * @param statusCode
	 * @param reasonText
	 */
	// maybe not well design, onMessage should contain closeframe?
	public void onCloseFrame(WebSocket socket, int statusCode, String reasonText);

}
