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

import com.dingtalk.api.response.OapiOrgSetshortcutResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.setshortcut request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiOrgSetshortcutRequest extends BaseTaobaoRequest<OapiOrgSetshortcutResponse> {
	
	

	/** 
	* 微应用实例id列表
	 */
	private String agentIds;

	public void setAgentIds(String agentIds) {
		this.agentIds = agentIds;
	}

	public String getAgentIds() {
		return this.agentIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.setshortcut";
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
		txtParams.put("agentIds", this.agentIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgSetshortcutResponse> getResponseClass() {
		return OapiOrgSetshortcutResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(agentIds, 20, "agentIds");
	}
	

}