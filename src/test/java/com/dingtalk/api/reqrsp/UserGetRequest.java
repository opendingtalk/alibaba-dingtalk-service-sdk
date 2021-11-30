package com.dingtalk.api.reqrsp;

import java.util.Map;

import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;

public class UserGetRequest extends BaseTaobaoRequest<UserGetResponse> {

	public String getApiMethodName() {
		return "dingtalk.user.get";
	}

	public String getTopApiCallType() {
		return DingTalkConstants.CALL_TYPE_TOP;
	}

	public String getTopHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		return null;
	}

	public Long getTimestamp() {
		return null;
	}

	public Class<UserGetResponse> getResponseClass() {
		return UserGetResponse.class;
	}

	public Map<String, String> getHeaderMap() {
		return null;
	}

	public void check() throws ApiRuleException {
		
	}

}
