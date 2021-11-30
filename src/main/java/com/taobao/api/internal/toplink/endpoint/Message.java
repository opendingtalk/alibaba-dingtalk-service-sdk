package com.taobao.api.internal.toplink.endpoint;

import java.util.Map;

// just simple version
public class Message {
	// version upgrade to 2 at 20130801
	public int protocolVersion = 2;
	public short messageType;

	public int statusCode;
	public String statusPhase;
	public int flag;
	public String token;

	public Map<String, Object> content;
}