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

import com.dingtalk.api.response.OapiCspaceAuthcodeDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.authcode.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.29
 */
public class OapiCspaceAuthcodeDeleteRequest extends BaseTaobaoRequest<OapiCspaceAuthcodeDeleteResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private Long agentId;

	/** 
	* isv文件授权码
	 */
	private String isvCode;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getIsvCode() {
		return this.isvCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.authcode.delete";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("isv_code", this.isvCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAuthcodeDeleteResponse> getResponseClass() {
		return OapiCspaceAuthcodeDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(isvCode, "isvCode");
	}
	

}