package com.taobao.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

public class UserGetRequest extends BaseTaobaoRequest<UserGetResponse> {

	private String fields;
	private String nick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApiMethodName() {
		return "taobao.user.get";
	}

	public String getContentType() {
		return null;
	}

	public String getResponseType() {
		return null;
	}

	public String getApiVersion() {
		return null;
	}

	public String getApiCallType() {
		return null;
	}

	public String getHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap params = new TaobaoHashMap();
		params.put("fields", this.fields);
		params.put("nick", this.nick);
		return params;
	}

	public Class<UserGetResponse> getResponseClass() {
		return UserGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}

}
