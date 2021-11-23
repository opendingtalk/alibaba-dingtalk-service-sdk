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

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;


/**
 * The Class DefaultAuthenticator.
 *
 * @author Takahiro Hashimoto
 */
public class DefaultAuthenticator extends AbstractAuthenticator {
	
	/** The basic authenticator. */
	private BasicAuthenticator basicAuthenticator;
	
	/** The digest authenticator. */
	private DigestAuthenticator digestAuthenticator;

    /** The spengo authenticator.(Windows only) */
	//private SpengoAuthenticator spengoAuthenticator;

	/**
	 * Instantiates a new default authenticator.
	 */
	public DefaultAuthenticator(){
		this.basicAuthenticator = new BasicAuthenticator();
		this.digestAuthenticator = new DigestAuthenticator();
//        if(System.getProperty("os.name").indexOf("Windows") > -1){
//            this.spengoAuthenticator = new SpengoAuthenticator();
//        }
	}

	/**
	 * Instantiates a new default authenticator.
	 *
	 * @param basicAuthenticator the basic authenticator
	 * @param digestAuthenticator the digest authenticator
	 */
	public DefaultAuthenticator(BasicAuthenticator basicAuthenticator,
			DigestAuthenticator digestAuthenticator){
		this.basicAuthenticator = basicAuthenticator;
		this.digestAuthenticator = digestAuthenticator;		
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.auth.AbstractAuthenticator#getCredentials(java.util.List)
	 */
	@Override
	public String getCredentials(List<Challenge> challengeList)
			throws WebSocketException {
		Map<AuthScheme, Challenge> schemeMap = new EnumMap<AuthScheme, Challenge>(AuthScheme.class);
		for(Challenge challenge : challengeList){
			schemeMap.put(challenge.getScheme(), challenge);
		}
		
//        if(this.spengoAuthenticator != null && schemeMap.containsKey(AuthScheme.Negotiate)){
//            this.spengoAuthenticator.init(this.websocket, this.credentials);
//            return this.spengoAuthenticator.getCredentials(schemeMap.get(AuthScheme.Negotiate));
//        }else 
    	if(schemeMap.containsKey(AuthScheme.Digest)){
			this.digestAuthenticator.init(this.websocket, this.credentials);
			return this.digestAuthenticator.getCredentials(schemeMap.get(AuthScheme.Digest));
		}else if(schemeMap.containsKey(AuthScheme.Basic)){
			this.basicAuthenticator.init(this.websocket, this.credentials);
			return this.basicAuthenticator.getCredentials(schemeMap.get(AuthScheme.Basic));
		}
		return null;
	}
}
