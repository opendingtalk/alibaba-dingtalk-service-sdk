package com.taobao.api.internal.toplink.endpoint.protocol;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Map.Entry;

import com.taobao.api.internal.toplink.endpoint.Message;
import com.taobao.api.internal.toplink.endpoint.MessageIO.MessageEncoder;
import com.taobao.api.internal.toplink.endpoint.MessageType.HeaderType;
import com.taobao.api.internal.toplink.endpoint.MessageType.ValueFormat;

public class MessageEncoder02 implements MessageEncoder {
	public void writeMessage(ByteBuffer buffer, Message message) {
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		
		buffer.put((byte) 2);
		buffer.put((byte) message.messageType);
		
		if (message.statusCode > 0) {
			buffer.putShort(HeaderType.StatusCode);
			buffer.putInt(message.statusCode);
		}
		if (message.statusPhase != null && message.statusPhase != "") {
			buffer.putShort(HeaderType.StatusPhrase);
			writeCountedString(buffer, message.statusPhase);
		}
		if (message.flag > 0) {
			buffer.putShort(HeaderType.Flag);
			buffer.putInt(message.flag);
		}
		if (message.token != null && !message.token.equals("")) {
			buffer.putShort(HeaderType.Token);
			writeCountedString(buffer, message.token);
		}
		if (message.content != null) {
			for (Entry<String, Object> i : message.content.entrySet())
				writeCustomHeader(buffer, i.getKey(), i.getValue());
		}
		buffer.putShort(HeaderType.EndOfHeaders);
		
		buffer.order(ByteOrder.BIG_ENDIAN);
		buffer.flip();
	}
	
	private static void writeCountedString(ByteBuffer buffer, String value)
	{
		int strLength = 0;
		if (value != null)
			strLength = value.length();
		
		if (strLength > 0) {
			byte[] strBytes = CompatibleUtil.getBytes(value, "UTF-8");
			buffer.putInt(strBytes.length);
			buffer.put(strBytes);
		}
		else
			buffer.putInt(0);
	}
	
	private static void writeCustomHeader(ByteBuffer buffer, String name, Object value)
	{
		buffer.putShort(HeaderType.Custom);
		writeCountedString(buffer, name);
		writeCustomValue(buffer, value);
	}
	
	private static void writeCustomValue(ByteBuffer buffer, Object value) {
		if (value == null) {
			buffer.put(ValueFormat.Void);
			return;
		}
		Class<?> type = value.getClass();
		if (byte.class.equals(type) || Byte.class.equals(type)) {
			buffer.put(ValueFormat.Byte);
			buffer.put((Byte) value);
		} else if (short.class.equals(type) || Short.class.equals(type)) {
			buffer.put(ValueFormat.Int16);
			buffer.putShort((Short) value);
		} else if (int.class.equals(type) || Integer.class.equals(type)) {
			buffer.put(ValueFormat.Int32);
			buffer.putInt((Integer) value);
		} else if (long.class.equals(type) || Long.class.equals(type)) {
			buffer.put(ValueFormat.Int64);
			buffer.putLong((Long) value);
		} else if (Date.class.equals(type)) {
			buffer.put(ValueFormat.Date);
			buffer.putLong(((Date) value).getTime());
		} else if (value instanceof byte[]) {
			buffer.put(ValueFormat.ByteArray);
			byte[] data = (byte[]) value;
			buffer.putInt(data.length);
			buffer.put(data);
		} else {
			buffer.put(ValueFormat.CountedString);
			writeCountedString(buffer, (String) value);
		}
	}
}
