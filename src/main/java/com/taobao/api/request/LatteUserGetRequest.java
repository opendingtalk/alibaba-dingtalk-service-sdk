package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LatteUserGetResponse;

/**
 * TOP API: taobao.latte.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.23
 */
public class LatteUserGetRequest extends BaseTaobaoRequest<LatteUserGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.latte.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LatteUserGetResponse> getResponseClass() {
		return LatteUserGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}