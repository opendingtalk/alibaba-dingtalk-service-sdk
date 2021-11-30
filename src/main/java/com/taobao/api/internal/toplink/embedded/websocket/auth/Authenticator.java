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
package com.taobao.api.internal.toplink.embedded.websocket.auth;

import com.taobao.api.internal.toplink.embedded.websocket.HttpHeader;
import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;

/**
 * The Interface of ProxyCredentials.
 *
 * @author t-hashimoto
 */
public interface Authenticator {
	
	/**
	 * Gets the credentials.
	 *
	 * @param method request method GET,POST,CONNECT(proxy)
	 * @param requestUri the request uri
	 * @param header http header
	 * @param authenticateHeaderName the authenticate header name
	 * @return the credentials
	 * @throws WebSocketException the web socket exception
	 */
	public String getCredentials(String method, String requestUri, HttpHeader header, String authenticateHeaderName) throws WebSocketException;
	/**
	 * inits authenticator
	 *
	 * @param websocket the websocket
	 * @param credentials the credentials
	 */
	public void init(WebSocket websocket, Credentials credentials);

    /**
     * finish authenticate phase.
     * if retry authenticate, need to create a new Authenticator instance.
     */
    public void done();

    public boolean isNeedAuthenticate();

    public boolean isDone();
}
