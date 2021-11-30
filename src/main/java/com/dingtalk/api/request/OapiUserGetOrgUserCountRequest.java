package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserGetOrgUserCountResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get_org_user_count request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserGetOrgUserCountRequest extends BaseTaobaoRequest<OapiUserGetOrgUserCountResponse> {
	
	

	/** 
	* 0：包含未激活钉钉的人员数量 1：不包含未激活钉钉的人员数量
	 */
	private Long onlyActive;

	public void setOnlyActive(Long onlyActive) {
		this.onlyActive = onlyActive;
	}

	public Long getOnlyActive() {
		return this.onlyActive;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.get_org_user_count";
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

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_GET;

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
		txtParams.put("onlyActive", this.onlyActive);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserGetOrgUserCountResponse> getResponseClass() {
		return OapiUserGetOrgUserCountResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}