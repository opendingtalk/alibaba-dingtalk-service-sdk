package com.taobao.api.internal.tmc;

/**
 * 消息服务-消息类型
 */
public abstract class MessageKind {
	public final static Byte None = 0;
	public final static Byte PullRequest = 1;
	public final static Byte Confirm = 2;
	public final static Byte Failed = 20;
	public final static Byte Data = 3;
}