package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiTdpProjectBasicGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.basic.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiTdpProjectBasicGetRequest extends BaseTaobaoRequest<OapiTdpProjectBasicGetResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 项目ID
	 */
	private String projectId;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.project.basic.get";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("project_id", this.projectId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpProjectBasicGetResponse> getResponseClass() {
		return OapiTdpProjectBasicGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}