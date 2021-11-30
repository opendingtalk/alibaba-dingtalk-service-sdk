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
package com.taobao.api.internal.toplink.embedded.websocket.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.Random;
//import java.util.logging.Logger;


import com.taobao.api.internal.toplink.embedded.websocket.WebSocket;
import com.taobao.api.internal.toplink.embedded.websocket.exception.WebSocketException;
import com.taobao.api.internal.toplink.embedded.websocket.frame.Frame;
import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameHeader;
import com.taobao.api.internal.toplink.embedded.websocket.frame.FrameParser;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft76.BinaryFrame;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft76.CloseFrame;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft76.FrameBuilderDraft76;
import com.taobao.api.internal.toplink.embedded.websocket.frame.draft76.TextFrame;
import com.taobao.api.internal.toplink.embedded.websocket.handler.StreamHandlerAdapter;
import com.taobao.api.internal.toplink.embedded.websocket.handler.StreamHandlerChain;
import com.taobao.api.internal.toplink.embedded.websocket.handler.WebSocketHandler;
import com.taobao.api.internal.toplink.embedded.websocket.handler.WebSocketPipeline;
import com.taobao.api.internal.toplink.embedded.websocket.handshake.Handshake;
import com.taobao.api.internal.toplink.embedded.websocket.proxy.Proxy;

import static com.taobao.api.internal.toplink.embedded.websocket.exception.ErrorCode.*;


/**
 * A simple websocket client
 * this class is implement the WebSocket Draft76 specification.
 * 
 * @see <a href="http://tools.ietf.org/html/draft-hixie-thewebsocketprotocol-76">draft-hixie-thewebsocketprotocol-76</a>
 * @author t-hashimoto
 * 
 */
public class WebSocketDraft76 extends WebSocketBase {
	
	/** The logger. */
	//private static Logger logger = Logger.getLogger(WebSocketDraft76.class.getName());

	/** The Constant VERSION. */
	private static final int VERSION = 76;

	/**
	 * Instantiates a new web socket draft76.
	 *
	 * @param url the url
	 * @param handler the handler
	 * @param protocols the protocols
	 * @throws WebSocketException the web socket exception
	 */
	public WebSocketDraft76(String url, WebSocketHandler handler,
			String... protocols) throws WebSocketException {
		super(url, (String)null, handler, protocols);
	}
	
	/**
	 * Instantiates a new web socket draft76.
	 *
	 * @param url the url
	 * @param proxy the proxy
	 * @param handler the handler
	 * @param protocols the protocols
	 * @throws WebSocketException the web socket exception
	 */
	public WebSocketDraft76(String url, Proxy proxy, WebSocketHandler handler,
			String... protocols) throws WebSocketException {
		super(url, (String)null, proxy, handler, protocols);
	}
	
	/* (non-Javadoc)
	 * @see jp.a840.websocket.impl.WebSocketBase#newHandshakeInstance()
	 */
	@Override
	protected Handshake newHandshakeInstance() {
		return new Handshake() {
			private ByteBuffer bodyBuf = ByteBuffer.allocate(16);
			
			/**
			 * Create a handshake requtest
			 * 
			 * <pre>
			 * Sample (Draft76) client => server
			 * GET /demo HTTP/1.1
			 * Host: example.com
			 * Connection: Upgrade
			 * Sec-WebSocket-Key2: 12998 5 Y3 1  .P00
			 * Sec-WebSocket-Protocol: sample
			 * Upgrade: WebSocket
			 * Sec-WebSocket-Key1: 4 @1  46546xW%0l 1 5
			 * Origin: http://example.com
			 * 
			 * ^n:ds[4U
			 * </pre>
			 * 
			 */
			@Override
			public ByteBuffer createHandshakeRequest() {
				bodyBuf.clear(); // initilize a buffer
				
				// Send GET request to server
				StringBuilder sb = new StringBuilder();
				sb.append("GET " + path + " HTTP/1.1\r\n");
				addHeader(sb, "Host", endpointAddress.getHostName());
				addHeader(sb, "Upgrade", "websocket");
				addHeader(sb, "Connection", "Upgrade");
				addHeader(sb, "Sec-WebSocket-Key1", SecWebSocketKey.generateKey());
				addHeader(sb, "Sec-WebSocket-Key2", SecWebSocketKey.generateKey());
				if (origin != null) {
					addHeader(sb, "Origin", origin);
				}
				if (protocols != null && protocols.length > 0) {
					addHeader(sb, "Sec-WebSocket-Protocol", join(",", protocols));
				}
				sb.append("\r\n");

				ByteBuffer buf = ByteBuffer.allocate(512);
				buf.put(sb.toString().getBytes());
				buf.put(SecWebSocketKey.generateKey3());
				buf.put((byte) 0xd);
				buf.put((byte) 0xa);
				buf.flip();

				return buf;
			}

			/**
			 * check handshake response
			 * 
			 * <pre>
			 * server => client
			 * HTTP/1.1 101 WebSocket Protocol Handshake
			 * Upgrade: WebSocket
			 * Connection: Upgrade
			 * Sec-WebSocket-Origin: http://example.com
			 * Sec-WebSocket-Location: ws://example.com/demo
			 * Sec-WebSocket-Protocol: sample
			 * 
			 * 8jKS'y:G*Co,Wxa-
			 * </pre>
			 * 
			 * @param buffer
			 */
			@Override
			protected boolean parseHandshakeResponseHeader(ByteBuffer buffer)
					throws WebSocketException {
				if(!super.parseHandshakeResponseHeader(buffer)){
					return false;
				}
				if(!"websocket".equalsIgnoreCase(this.getResponseHeader().getHeaderValue("upgrade"))){
					throw new WebSocketException(E3500, responseHeader.getHeaderValue("upgrade"));
				}
				if(!"upgrade".equalsIgnoreCase(this.getResponseHeader().getHeaderValue("connection"))){
					throw new WebSocketException(E3501, responseHeader.getHeaderValue("connection"));
				}
				String serverOrigin = this.getResponseHeader().getHeaderValue("sec-websocket-origin");
				if(origin != null && serverOrigin != null && !serverOrigin.equals(origin)){
					throw new WebSocketException(E3502, origin, serverOrigin);
				}
				String serverLocation = this.getResponseHeader().getHeaderValue("sec-websocket-location");
				try{
					// reformat location URI.
					// drop custom port
					URI uri = new URI(location.getScheme(),
								  	location.getHost(),
								  	location.getPath(),
								  	location.getFragment()
								  	);
					if(serverLocation != null && !serverLocation.equals(uri.toString())){
						throw new WebSocketException(E3503, uri.toString(), serverLocation);
					}
				}catch(URISyntaxException e){
					;
				}
				String protocolStr = this.getResponseHeader().getHeaderValue("sec-websocket-protocol");
				if(protocolStr != null){
					serverProtocols = protocolStr.split(",");
				}
				return true;
			}

			@Override
			protected boolean parseHandshakeResponseBody(ByteBuffer buffer) throws WebSocketException {
				if(!super.parseHandshakeResponseBody(buffer)){
					return false;
				}
				
				if(buffer.remaining() < bodyBuf.capacity()){
					return false;
				}

				buffer.get(bodyBuf.array(), 0, bodyBuf.capacity());				
				return true;
			}

		};
	}	

	/* (non-Javadoc)
	 * @see jp.a840.websocket.impl.WebSocketBase#getWebSocketVersion()
	 */
	@Override
	protected int getWebSocketVersion() {
		return VERSION;
	}

	/**
	 * The Class SecWebSocketKey.
	 *
	 * @author Takahiro Hashimoto
	 */
	private static class SecWebSocketKey {
		
		/** The Constant random. */
		private static final Random random = new Random();

		/** The Constant LARGEST_INTEGER. */
		private static final long LARGEST_INTEGER = 4294967295L;

		/** The Constant CHARS. */
		private static final char[] CHARS = new char[84];

		static {
			int i = 0;
			for (int c = 0x21; c <= 0x2F; c++) {
				CHARS[i++] = (char) c;
			}
			for (int c = 0x3A; c <= 0x7E; c++) {
				CHARS[i++] = (char) c;
			}
		}

		/**
		 * Generate key.
		 *
		 * @return the string
		 */
		public static String generateKey() {
			int spaces = random.nextInt(12) + 1;
			long max = LARGEST_INTEGER / spaces;
			long number = Math.abs(random.nextLong()) % max;
			long product = number * spaces;

			StringBuilder key = new StringBuilder();
			key.append(product);

			int charsNum = random.nextInt(12) + 1;
			for (int i = 0; i < charsNum; i++) {
				int position = random.nextInt(key.length());
				char c = CHARS[random.nextInt(CHARS.length)];
				key.insert(position, c);
			}

			for (int i = 0; i < spaces; i++) {
				int position = random.nextInt(key.length() - 1) + 1;
				key.insert(position, ' ');
			}
			return key.toString();
		}

		/**
		 * Generate key3.
		 *
		 * @return the byte[]
		 */
		public static byte[] generateKey3() {
			byte[] key3 = new byte[8];
			random.nextBytes(key3);
			return key3;
		}
	}

    @Override
    public Frame createFrame(byte[] bytes) throws WebSocketException {
        return new BinaryFrame(bytes);
    }

	/* (non-Javadoc)
	 * @see jp.a840.websocket.impl.WebSocketBase#createFrame(java.lang.String)
	 */
	@Override
	public Frame createFrame(String str) throws WebSocketException {
		return new TextFrame(str);
	}

	/* (non-Javadoc)
	 * @see jp.a840.websocket.impl.WebSocketBase#newFrameParserInstance()
	 */
	@Override
	protected FrameParser newFrameParserInstance() {
		return new FrameParser() {
			
			@Override
			protected FrameHeader createFrameHeader(ByteBuffer chunkData) {
				return FrameBuilderDraft76.createFrameHeader(chunkData);
			}

			@Override
			protected Frame createFrame(FrameHeader h, byte[] bodyData) {
				return FrameBuilderDraft76.createFrame(h, bodyData);
			}
			
		};
	}

	/* (non-Javadoc)
	 * @see jp.a840.websocket.impl.WebSocketBase#initializePipeline(jp.a840.websocket.handler.WebSocketPipeline)
	 */
	@Override
	protected void initializePipeline(WebSocketPipeline pipeline)
			throws WebSocketException {
		super.initializePipeline(pipeline);
		// Add base response handler
		this.pipeline.addStreamHandler(new StreamHandlerAdapter() {
			public void nextDownstreamHandler(WebSocket ws, ByteBuffer buffer,
					Frame frame, StreamHandlerChain chain) throws WebSocketException {
				if(frame instanceof CloseFrame){
					WebSocketDraft76.this.handler.onClose(ws);
				}else{
					WebSocketDraft76.this.handler.onMessage(ws, frame);
				}
			}

			public void nextHandshakeDownstreamHandler(WebSocket ws, ByteBuffer buffer,
					StreamHandlerChain chain) throws WebSocketException {
				// set response status
				responseHeader = getHandshake().getResponseHeader();
				responseStatus = getHandshake().getResponseStatus();
				transitionTo(State.WAIT);
				// HANDSHAKE -> WAIT
				WebSocketDraft76.this.handler.onOpen(WebSocketDraft76.this);
			}
		});		
	}
}
