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

import java.util.List;

import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.util.Base64;



/**
 * The Class ProxyBasicCredentials.
 *
 * @author Takahiro Hashimoto
 */
public class BasicAuthenticator extends AbstractAuthenticator {

	/**
	 * Instantiates a new proxy basic credentials.
	 * this is not check the server auth realm
	 *
	 */
	public BasicAuthenticator(){
	}
		
	/* (non-Javadoc)
	 * @see jp.a840.websocket.proxy.ProxyCredentials#getCredentials()
	 */
	public String getCredentials(List<Challenge> challengeList) throws WebSocketException {
		for(Challenge challenge : challengeList){
			if (AuthScheme.Basic.equals(challenge.getScheme())) {
				return getCredentials(challenge);
			}
		}
		return null;
	}
	
	/**
	 * Gets the credentials.
	 *
	 * @param challenge the challenge
	 * @return the credentials
	 * @throws WebSocketException the web socket exception
	 */
	public String getCredentials(Challenge challenge) throws WebSocketException {
		String credentialsStr = this.credentials.getUsername() + ":" + this.credentials.getPassword();
		return AuthScheme.Basic.name() + " "
				+ Base64.encodeToString(credentialsStr.getBytes(), false);
	}
}
