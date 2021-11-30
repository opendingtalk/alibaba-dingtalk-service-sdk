package com.taobao.api.internal.tmc;

/**
 * 消息服务-关键字段选择器
 */
public interface KeySelector {

	public String selectKey(Message message);

}
