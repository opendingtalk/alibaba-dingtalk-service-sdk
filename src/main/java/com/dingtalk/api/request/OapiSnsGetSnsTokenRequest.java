package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGetSnsTokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.get_sns_token request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGetSnsTokenRequest extends BaseTaobaoRequest<OapiSnsGetSnsTokenResponse> {
	
	

	/** 
	* 用户的openid
	 */
	private String openid;

	/** 
	* 用户授权给钉钉开放应用的持久授权码
	 */
	private String persistentCode;

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setPersistentCode(String persistentCode) {
		this.persistentCode = persistentCode;
	}

	public String getPersistentCode() {
		return this.persistentCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.get_sns_token";
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
		txtParams.put("openid", this.openid);
		txtParams.put("persistent_code", this.persistentCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGetSnsTokenResponse> getResponseClass() {
		return OapiSnsGetSnsTokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}