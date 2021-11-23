package com.taobao.api.internal.cluster;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;

public class HttpdnsGetRequest extends BaseTaobaoRequest<HttpdnsGetResponse> {

	public String getApiMethodName() {
		return "taobao.httpdns.get";
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
		return new HashMap<String, String>();
	}

	public Class<HttpdnsGetResponse> getResponseClass() {
		return HttpdnsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}

}
