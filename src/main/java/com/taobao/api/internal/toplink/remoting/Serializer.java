package com.taobao.api.internal.toplink.remoting;

public interface Serializer {
	public String getName();
	public byte[] serializeMethodCall(MethodCall methodCall) throws FormatterException;
	public MethodReturn deserializeMethodReturn(byte[] input, Class<?> returnType) throws FormatterException;
	public byte[] serializeMethodReturn(MethodReturn methodReturn) throws FormatterException;
	public MethodCall deserializeMethodCall(byte[] input) throws FormatterException;
}