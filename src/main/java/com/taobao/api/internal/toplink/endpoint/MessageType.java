package com.taobao.api.internal.toplink.endpoint;

public class MessageType {
	public static final short CONNECT = 0;
	public static final short CONNECTACK = 1;

	public static final short SEND = 2;
	public static final short SENDACK = 3;

	public class HeaderType {
		public final static short EndOfHeaders = 0;
		public final static short Custom = 1;
		public final static short StatusCode = 2;
		public final static short StatusPhrase = 3;
		public final static short Flag = 4;
		public final static short Token = 5;
	}

	public class ValueFormat {
		public final static byte Void = 0;// act as null
		public final static byte CountedString = 1;
		public final static byte Byte = 2;
		public final static byte Int16 = 3;
		public final static byte Int32 = 4;
		public final static byte Int64 = 5;
		public final static byte Date = 6;
		public final static byte ByteArray = 7;
	}
}