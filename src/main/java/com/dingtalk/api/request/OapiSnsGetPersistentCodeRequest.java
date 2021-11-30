package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGetPersistentCodeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.get_persistent_code request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGetPersistentCodeRequest extends BaseTaobaoRequest<OapiSnsGetPersistentCodeResponse> {
	
	

	/** 
	* 用户授权给钉钉开放应用的临时授权码
	 */
	private String tmpAuthCode;

	public void setTmpAuthCode(String tmpAuthCode) {
		this.tmpAuthCode = tmpAuthCode;
	}

	public String getTmpAuthCode() {
		return this.tmpAuthCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.get_persistent_code";
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
		txtParams.put("tmp_auth_code", this.tmpAuthCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGetPersistentCodeResponse> getResponseClass() {
		return OapiSnsGetPersistentCodeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}