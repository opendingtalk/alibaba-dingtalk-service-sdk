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

import com.dingtalk.api.response.OapiCspaceAuthUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.auth.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.08
 */
public class OapiCspaceAuthUpdateRequest extends BaseTaobaoRequest<OapiCspaceAuthUpdateResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private Long agentId;

	/** 
	* 授权码有效期，单位为日，为空则表示永久授权
	 */
	private Long duration;

	/** 
	* isv授权码
	 */
	private String isvCode;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getIsvCode() {
		return this.isvCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.auth.update";
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
		txtParams.put("duration", this.duration);
		txtParams.put("isv_code", this.isvCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAuthUpdateResponse> getResponseClass() {
		return OapiCspaceAuthUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(isvCode, "isvCode");
	}
	

}