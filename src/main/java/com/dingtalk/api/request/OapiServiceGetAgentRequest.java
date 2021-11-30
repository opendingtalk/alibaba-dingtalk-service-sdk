package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetAgentResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_agent request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.16
 */
public class OapiServiceGetAgentRequest extends BaseTaobaoRequest<OapiServiceGetAgentResponse> {
	
	

	/** 
	* 授权企业方应用id
	 */
	private String agentid;

	/** 
	* 授权企业方corpid
	 */
	private String authCorpid;

	/** 
	* 永久授权码
	 */
	private String permanentCode;

	/** 
	* 应用套件key
	 */
	private String suiteKey;

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentid() {
		return this.agentid;
	}

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setPermanentCode(String permanentCode) {
		this.permanentCode = permanentCode;
	}

	public String getPermanentCode() {
		return this.permanentCode;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_agent";
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
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("permanent_code", this.permanentCode);
		txtParams.put("suite_key", this.suiteKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetAgentResponse> getResponseClass() {
		return OapiServiceGetAgentResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}