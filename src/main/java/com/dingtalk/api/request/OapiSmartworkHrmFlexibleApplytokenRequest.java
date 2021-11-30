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

import com.dingtalk.api.response.OapiSmartworkHrmFlexibleApplytokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.flexible.applytoken request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.11
 */
public class OapiSmartworkHrmFlexibleApplytokenRequest extends BaseTaobaoRequest<OapiSmartworkHrmFlexibleApplytokenResponse> {
	
	

	/** 
	* 微应用在企业的AgentId，不需要自定义字段可不传
	 */
	private Long agentid;

	/** 
	* 用户在企业的ID
	 */
	private String optUserId;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setOptUserId(String optUserId) {
		this.optUserId = optUserId;
	}

	public String getOptUserId() {
		return this.optUserId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.flexible.applytoken";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("opt_user_id", this.optUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmFlexibleApplytokenResponse> getResponseClass() {
		return OapiSmartworkHrmFlexibleApplytokenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
		RequestCheckUtils.checkNotEmpty(optUserId, "optUserId");
	}
	

}