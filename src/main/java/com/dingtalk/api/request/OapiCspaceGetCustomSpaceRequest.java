package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCspaceGetCustomSpaceResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.get_custom_space request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCspaceGetCustomSpaceRequest extends BaseTaobaoRequest<OapiCspaceGetCustomSpaceResponse> {
	
	

	/** 
	* ISV调用时传入，微应用agentId
	 */
	private String agentId;

	/** 
	* 企业调用时传入，需要为10个字节以内的字符串，仅可包含字母和数字，大小写不敏感
	 */
	private String domain;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomain() {
		return this.domain;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.get_custom_space";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("domain", this.domain);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceGetCustomSpaceResponse> getResponseClass() {
		return OapiCspaceGetCustomSpaceResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}