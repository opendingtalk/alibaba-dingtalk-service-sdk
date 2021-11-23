package com.taobao.api.internal.tmc;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

public class TmcAuthGetRequest extends BaseTaobaoRequest<TmcAuthGetResponse> {

	private String group;
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getApiMethodName() {
		return "taobao.tmc.auth.get";
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
        params.put("group", this.group);
        return params;
	}

	public Class<TmcAuthGetResponse> getResponseClass() {
		return TmcAuthGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}

}
