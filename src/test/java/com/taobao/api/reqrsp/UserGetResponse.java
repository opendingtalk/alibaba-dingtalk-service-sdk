package com.taobao.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.User;
import com.taobao.api.internal.mapping.ApiField;

public class UserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6002616341014794429L;

	@ApiField("user")
	private User user;

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
