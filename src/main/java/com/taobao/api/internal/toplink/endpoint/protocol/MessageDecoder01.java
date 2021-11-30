package com.taobao.api.internal.toplink.endpoint.protocol;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.HashMap;

import com.taobao.api.internal.toplink.endpoint.Message;
import com.taobao.api.internal.toplink.endpoint.MessageIO.MessageDecoder;
import com.taobao.api.internal.toplink.endpoint.MessageType.HeaderType;
import com.taobao.api.internal.toplink.endpoint.MessageType.ValueFormat;

public class MessageDecoder01 implements MessageDecoder {
	public Message readMessage(ByteBuffer buffer) {
		buffer.order(ByteOrder.LITTLE_ENDIAN);

		Message msg = new Message();
		msg.protocolVersion = 1;
		msg.messageType = buffer.get();
		// read kv
		HashMap<String, Object> dict = new HashMap<String, Object>();
		short headerType = buffer.getShort();
		while (headerType != HeaderType.EndOfHeaders) {
			if (headerType == HeaderType.Custom)
				dict.put(readCountedString(buffer), readCustomValue(buffer));
			else if (headerType == HeaderType.StatusCode)
				msg.statusCode = buffer.getInt();
			else if (headerType == HeaderType.StatusPhrase)
				msg.statusPhase = readCountedString(buffer);
			else if (headerType == HeaderType.Flag)
				msg.flag = buffer.getInt();
			else if (headerType == HeaderType.Token)
				msg.token = readCountedString(buffer);
			headerType = buffer.getShort();
		}
		msg.content = dict;

		buffer.order(ByteOrder.BIG_ENDIAN);
		return msg;
	}

	// UTF-8 only
	private static String readCountedString(ByteBuffer buffer)
	{
		int size = buffer.getInt();
		if (size > 0) {
			byte[] data = new byte[size];
			buffer.get(data, 0, data.length);
			return  CompatibleUtil.newString(data, "UTF-8");
		}
		return null;
	}

	private static Object readCustomValue(ByteBuffer buffer) {
		byte format = buffer.get();
		switch (format) {
		case ValueFormat.Void:
			return null;
		case ValueFormat.Byte:
			return buffer.get();
		case ValueFormat.Int16:
			buffer.order(ByteOrder.LITTLE_ENDIAN);
			short value = buffer.getShort();
			buffer.order(ByteOrder.BIG_ENDIAN);
			return value;
		case ValueFormat.Int32:
			buffer.order(ByteOrder.LITTLE_ENDIAN);
			int intValue = buffer.getInt();
			buffer.order(ByteOrder.BIG_ENDIAN);
			return intValue;
		case ValueFormat.Int64:
			buffer.order(ByteOrder.LITTLE_ENDIAN);
			long longValue = buffer.getLong();
			buffer.order(ByteOrder.BIG_ENDIAN);
			return longValue;
		case ValueFormat.Date:
			buffer.order(ByteOrder.LITTLE_ENDIAN);
			long ticks = buffer.getLong();
			buffer.order(ByteOrder.BIG_ENDIAN);
			return new Date(ticks);
		default:
			return readCountedString(buffer);
		}
	}
}
