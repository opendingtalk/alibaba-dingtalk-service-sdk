package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetAuthInfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_auth_info request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.26
 */
public class OapiServiceGetAuthInfoRequest extends BaseTaobaoRequest<OapiServiceGetAuthInfoResponse> {
	
	

	/** 
	* 授权方corpid
	 */
	private String authCorpid;

	/** 
	* 套件key
	 */
	private String suiteKey;

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_auth_info";
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
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("suite_key", this.suiteKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetAuthInfoResponse> getResponseClass() {
		return OapiServiceGetAuthInfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}