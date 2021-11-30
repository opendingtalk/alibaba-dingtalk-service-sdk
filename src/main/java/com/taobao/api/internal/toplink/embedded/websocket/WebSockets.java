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

import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.handler.WebSocketHandler;
import com.taobao.api.internal.toplink.embedded.websocket.impl.WebSocketDraft06;
import com.taobao.api.internal.toplink.embedded.websocket.impl.WebSocketDraft76;
import com.taobao.api.internal.toplink.embedded.websocket.impl.WebSocketImpl;
import com.taobao.api.internal.toplink.embedded.websocket.proxy.Proxy;


/**
 * WebSocket factory class.
 *
 * @author t-hashimoto
 */
public class WebSockets {
	
    /**
   	 * Create websocket
   	 *
   	 * @param url the url
     * @param origin the origin
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return websocket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket create(String url, String origin, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketImpl(url, origin, handler, protocols);
   	}

    /**
   	 * Create websocket
   	 *
   	 * @param url the url
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return websocket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket create(String url, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketImpl(url, handler, protocols);
   	}

   	/**
     * Create websocket
   	 *
   	 * @param url the url
     * @param origin the origin
   	 * @param proxy the proxy
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return the web socket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket create(String url, String origin, Proxy proxy, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketImpl(url, origin, proxy, handler, protocols);
   	}

    /**
     * Create websocket
   	 *
   	 * @param url the url
   	 * @param proxy the proxy
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return the web socket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket create(String url, Proxy proxy, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketImpl(url, proxy, handler, protocols);
   	}

	/**
	 * Create Draft76 websocket.
	 *
	 * @param url the url
	 * @param handler the handler
	 * @param protocols the protocols
	 * @return websocket
	 * @throws WebSocketException the web socket exception
	 */
	public static WebSocket createDraft76(String url, WebSocketHandler handler, String... protocols) throws WebSocketException {
		return new WebSocketDraft76(url, handler, protocols);
	}

	/**
	 * Creates Draft76 websocket.
	 *
	 * @param url the url
	 * @param proxy the proxy
	 * @param handler the handler
	 * @param protocols the protocols
	 * @return the web socket
	 * @throws WebSocketException the web socket exception
	 */
	public static WebSocket createDraft76(String url, Proxy proxy, WebSocketHandler handler, String... protocols) throws WebSocketException {
		return new WebSocketDraft76(url, proxy, handler, protocols);
	}

	/**
	 * Create Draft06 websocket.
	 *
	 * @param url the url
     * @param origin the origin
	 * @param handler the handler
	 * @param protocols the protocols
	 * @return websocket
	 * @throws WebSocketException the web socket exception
	 */
	public static WebSocket createDraft06(String url, String origin, WebSocketHandler handler, String... protocols) throws WebSocketException {
		return new WebSocketDraft06(url, origin, handler, protocols);
	}

    /**
   	 * Create Draft06 websocket.
   	 *
   	 * @param url the url
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return websocket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket createDraft06(String url, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketDraft06(url,handler, protocols);
   	}

	/**
	 * Creates Draft06 websocket.
	 *
	 * @param url the url
     * @param origin the origin
	 * @param proxy the proxy
	 * @param handler the handler
	 * @param protocols the protocols
	 * @return the web socket
	 * @throws WebSocketException the web socket exception
	 */
	public static WebSocket createDraft06(String url, String origin, Proxy proxy, WebSocketHandler handler, String... protocols) throws WebSocketException {
		return new WebSocketDraft06(url, origin, proxy, handler, protocols);
	}

    /**
   	 * Creates Draft06 websocket.
   	 *
   	 * @param url the url
   	 * @param proxy the proxy
   	 * @param handler the handler
   	 * @param protocols the protocols
   	 * @return the web socket
   	 * @throws WebSocketException the web socket exception
   	 */
   	public static WebSocket createDraft06(String url, Proxy proxy, WebSocketHandler handler, String... protocols) throws WebSocketException {
   		return new WebSocketDraft06(url, proxy, handler, protocols);
   	}
}
