package com.taobao.api.internal.toplink.channel.websocket;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class WebSocketClientHelper {
	private static Map<String, Map<String, String>> headersByUri = new HashMap<String, Map<String, String>>();

	public static void setHeaders(URI uri, Map<String, String> headers) {
		headersByUri.put(uri.toASCIIString(), headers);
	}

	public static Map<String, String> getHeaders(URI uri) {
		return headersByUri.get(uri.toASCIIString());
	}
}
