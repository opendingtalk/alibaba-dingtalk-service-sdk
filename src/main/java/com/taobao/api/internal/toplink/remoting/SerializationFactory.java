package com.taobao.api.internal.toplink.remoting;

public interface SerializationFactory {
	public Serializer get(Object format);
}