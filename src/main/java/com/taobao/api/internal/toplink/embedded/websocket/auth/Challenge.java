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

/**
 * The Class Challenge.
 *
 * @author Takahiro Hashimoto
 */
public class Challenge {
	
	/** The scheme. */
	private AuthScheme scheme;

	/** The method. */
	private String method;
	
	/** The request uri. */
	private String requestUri;
	
	/** The param */
	private String param;

    /** param
    private String param;

	/**
	 * Instantiates a new challenge.
	 *
	 * @param method the method
	 * @param requestUri the request uri
	 * @param scheme the scheme
	 * @param param the param
	 */
	public Challenge(String method, String requestUri, AuthScheme scheme, String param){
		this.method = method;
		this.requestUri = requestUri;
		this.scheme = scheme;
        this.param = param;
	}
	
	/**
	 * Gets the scheme.
	 *
	 * @return the scheme
	 */
	public AuthScheme getScheme(){
		return this.scheme;
	}
	
	/**
	 * Gets the param.
	 *
	 * @return the param
	 */
	public String getParam(){
		return this.param;
	}

	/**
	 * Gets the method.
	 *
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Gets the request uri.
	 *
	 * @return the request uri
	 */
	public String getRequestUri() {
		return requestUri;
	}
}
