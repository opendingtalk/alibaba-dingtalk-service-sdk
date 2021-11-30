package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserCountResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.count request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.13
 */
public class OapiUserCountRequest extends BaseTaobaoRequest<OapiUserCountResponse> {
	
	

	/** 
	* false 包含未激活钉钉的人员数量 true 只包含激活钉钉的人员数量
	 */
	private Boolean onlyActive;

	public void setOnlyActive(Boolean onlyActive) {
		this.onlyActive = onlyActive;
	}

	public Boolean getOnlyActive() {
		return this.onlyActive;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.count";
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
		txtParams.put("only_active", this.onlyActive);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserCountResponse> getResponseClass() {
		return OapiUserCountResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(onlyActive, "onlyActive");
	}
	

}