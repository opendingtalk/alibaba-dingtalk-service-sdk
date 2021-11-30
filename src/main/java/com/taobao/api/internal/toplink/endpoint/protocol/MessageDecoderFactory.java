package com.taobao.api.internal.toplink.endpoint.protocol;

import java.nio.ByteBuffer;

import com.taobao.api.internal.toplink.endpoint.MessageIO.MessageDecoder;

public interface MessageDecoderFactory {
	public MessageDecoder get(ByteBuffer buffer);
}