package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class User extends TaobaoObject {

	private static final long serialVersionUID = 6702493950634800226L;

	@ApiField("user_id")
	private Long userId;
	@ApiField("nick")
	private String nick;
	@ApiField("type")
	private String type;

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
