package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetSuiteTokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_suite_token request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.07
 */
public class OapiServiceGetSuiteTokenRequest extends BaseTaobaoRequest<OapiServiceGetSuiteTokenResponse> {
	
	

	/** 
	* 套件key，开发者后台创建套件后获取
	 */
	private String suiteKey;

	/** 
	* 套件secret，开发者后台创建套件后获取
	 */
	private String suiteSecret;

	/** 
	* 钉钉推送的ticket
	 */
	private String suiteTicket;

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setSuiteSecret(String suiteSecret) {
		this.suiteSecret = suiteSecret;
	}

	public String getSuiteSecret() {
		return this.suiteSecret;
	}

	public void setSuiteTicket(String suiteTicket) {
		this.suiteTicket = suiteTicket;
	}

	public String getSuiteTicket() {
		return this.suiteTicket;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_suite_token";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("suite_secret", this.suiteSecret);
		txtParams.put("suite_ticket", this.suiteTicket);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetSuiteTokenResponse> getResponseClass() {
		return OapiServiceGetSuiteTokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}