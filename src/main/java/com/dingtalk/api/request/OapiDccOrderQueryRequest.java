package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDccOrderQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dcc.order.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.22
 */
public class OapiDccOrderQueryRequest extends BaseTaobaoRequest<OapiDccOrderQueryResponse> {
	
	

	/** 
	* 1
	 */
	private String corpId;

	/** 
	* 1
	 */
	private Long isvOrgId;

	/** 
	* 1
	 */
	private String message;

	/** 
	* 1
	 */
	private Long microappAgentId;

	/** 
	* 1
	 */
	private Long orgId;

	/** 
	* 1
	 */
	private String suiteKey;

	/** 
	* 1
	 */
	private Long tokenGrantType;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dcc.order.query";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("isv_org_id", this.isvOrgId);
		txtParams.put("message", this.message);
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("org_id", this.orgId);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("token_grant_type", this.tokenGrantType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDccOrderQueryResponse> getResponseClass() {
		return OapiDccOrderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}