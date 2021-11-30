package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkHammerBiOneserviceAaaResponse;

/**
 * TOP API: dingtalk.hammer.bi.oneservice.aaa request
 * 
 * @author top auto create
 * @since 1.0, 2019.01.17
 */
public class DingtalkHammerBiOneserviceAaaRequest extends BaseTaobaoRequest<DingtalkHammerBiOneserviceAaaResponse> {
	
	

	/** 
	* 5555
	 */
	private String appUuid;

	/** 
	* 666
	 */
	private String tokenStr;

	public void setAppUuid(String appUuid) {
		this.appUuid = appUuid;
	}

	public String getAppUuid() {
		return this.appUuid;
	}

	public void setTokenStr(String tokenStr) {
		this.tokenStr = tokenStr;
	}

	public String getTokenStr() {
		return this.tokenStr;
	}

	public String getApiMethodName() {
		return "dingtalk.hammer.bi.oneservice.aaa";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("app_uuid", this.appUuid);
		txtParams.put("token_str", this.tokenStr);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkHammerBiOneserviceAaaResponse> getResponseClass() {
		return DingtalkHammerBiOneserviceAaaResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}