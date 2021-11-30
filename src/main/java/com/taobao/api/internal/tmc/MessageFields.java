package com.taobao.api.internal.tmc;

/**
 * 消息服务-消息字段
 */
public abstract class MessageFields {
	public final static String KIND = "__kind";

	// public final static String PULL_AMOUNT = "amount";

	public final static String CONFIRM_ID = "id";
	public final static String MSG = "msg";
	public final static String CONFIRM_ATTACH_QUEUE = "queue";

	public final static String DATA_TOPIC = "topic";
	public final static String DATA_CONTENT = "content";
	public final static String DATA_PUBLISH_TIME = "time";
	public final static String DATA_DATAID = "dataid";
	
	public final static String DATA_OUTGOING_PUBLISHER = "publisher";
	public final static String DATA_OUTGOING_USER_NICK = "nick";
	public final static String DATA_OUTGOING_USER_ID = "userid";
	
	public final static String DATA_ATTACH_OUTGOING_TIME = "outtime";
	
	public final static String DATA_INCOMING_USER_SESSION = "session";
	

	public final static String OUTGOING_ID = "id";

	// ATTACH means server will attch the filed to message, not passed from client
	// OUTGOING means only outgoing message to client have the field
	// INCOMING means only incoming message from client have the field
}