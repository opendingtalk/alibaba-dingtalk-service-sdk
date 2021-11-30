package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiNewretailTestResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.newretail.test request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.03
 */
public class OapiNewretailTestRequest extends BaseTaobaoRequest<OapiNewretailTestResponse> {
	
	

	/** 
	* 1
	 */
	private Long param4;

	public void setParam4(Long param4) {
		this.param4 = param4;
	}

	public Long getParam4() {
		return this.param4;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.newretail.test";
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
		txtParams.put("param4", this.param4);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiNewretailTestResponse> getResponseClass() {
		return OapiNewretailTestResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}