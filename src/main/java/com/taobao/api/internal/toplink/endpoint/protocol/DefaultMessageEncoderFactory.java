package com.taobao.api.internal.toplink.endpoint.protocol;

import com.taobao.api.internal.toplink.endpoint.Message;
import com.taobao.api.internal.toplink.endpoint.MessageIO.MessageEncoder;

public class DefaultMessageEncoderFactory implements MessageEncoderFactory {
	private MessageEncoder01 encoder01 = new MessageEncoder01();
	private MessageEncoder02 encoder02 = new MessageEncoder02();

	public MessageEncoder get(Message message) {
		if (message.protocolVersion == 1)
			return this.encoder01;
		return this.encoder02;
	}
}