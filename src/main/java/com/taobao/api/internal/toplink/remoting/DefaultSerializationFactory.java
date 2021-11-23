package com.taobao.api.internal.toplink.remoting;

public class DefaultSerializationFactory implements SerializationFactory {
	private Serializer serializer = new DefaultSerializer();

	public Serializer get(Object format) {
		return this.serializer;
	}
}
