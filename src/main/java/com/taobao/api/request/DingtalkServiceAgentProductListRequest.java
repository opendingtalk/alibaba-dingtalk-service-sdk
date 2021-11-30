package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkServiceAgentProductListResponse;

/**
 * TOP API: dingtalk.service.agent.product.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.25
 */
public class DingtalkServiceAgentProductListRequest extends BaseTaobaoRequest<DingtalkServiceAgentProductListResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.service.agent.product.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkServiceAgentProductListResponse> getResponseClass() {
		return DingtalkServiceAgentProductListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}