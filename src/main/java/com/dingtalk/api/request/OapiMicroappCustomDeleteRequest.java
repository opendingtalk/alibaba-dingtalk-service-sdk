package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappCustomDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.custom.delete request
 * 
 * @author top auto create
 * @since 1.0, 2021.10.11
 */
public class OapiMicroappCustomDeleteRequest extends BaseTaobaoRequest<OapiMicroappCustomDeleteResponse> {
	
	

	/** 
	* 定制应用id
	 */
	private Long agentId;

	/** 
	* 定制应用所属企业
	 */
	private String appCorpId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAppCorpId(String appCorpId) {
		this.appCorpId = appCorpId;
	}

	public String getAppCorpId() {
		return this.appCorpId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.custom.delete";
	}

	private String topResponseType ;

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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("app_corp_id", this.appCorpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappCustomDeleteResponse> getResponseClass() {
		return OapiMicroappCustomDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}