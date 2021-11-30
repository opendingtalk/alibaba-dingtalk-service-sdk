package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetCorpTokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_corp_token request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceGetCorpTokenRequest extends BaseTaobaoRequest<OapiServiceGetCorpTokenResponse> {
	
	

	/** 
	* 授权方corpid
	 */
	private String authCorpid;

	/** 
	* 永久授权码，通过get_permanent_code获取
	 */
	private String permanentCode;

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setPermanentCode(String permanentCode) {
		this.permanentCode = permanentCode;
	}

	public String getPermanentCode() {
		return this.permanentCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_corp_token";
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
		txtParams.put("permanent_code", this.permanentCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetCorpTokenResponse> getResponseClass() {
		return OapiServiceGetCorpTokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}