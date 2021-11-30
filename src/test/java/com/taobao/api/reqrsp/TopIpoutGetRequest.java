package com.taobao.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * 获取TOP网关出口IP请求封装。
 * 
 * @author fengsheng
 * @since Aug 30, 2016
 */
public class TopIpoutGetRequest extends BaseTaobaoRequest<TopIpoutGetResponse> {

	public String getApiMethodName() {
		return "taobao.top.ipout.get";
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
		return new TaobaoHashMap();
	}

	public Class<TopIpoutGetResponse> getResponseClass() {
		return TopIpoutGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}

}
