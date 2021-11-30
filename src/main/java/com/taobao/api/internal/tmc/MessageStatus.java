package com.taobao.api.internal.tmc;

/**
 * 消息服务-消息状态。
 * 
 * @author fengsheng
 * @since 1.0, May 4, 2013
 */
public class MessageStatus {

	private boolean isFail = false; // 是否处理失败
	private String reason; // 处理失败原因

	public boolean isFail() {
		return this.isFail;
	}

	public void fail() {
		this.isFail = true;
	}
	
	public void fail(String msg) {
		this.isFail = true;
		this.reason = msg;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
