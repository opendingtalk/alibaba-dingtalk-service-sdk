package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappRuleGetUserTotalResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.rule.get_user_total request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappRuleGetUserTotalRequest extends BaseTaobaoRequest<OapiMicroappRuleGetUserTotalResponse> {
	
	

	/** 
	* 规则所属的微应用agentId
	 */
	private Long agentId;

	/** 
	* 需要查询的规则id集合
	 */
	private List<Long> ruleIdList;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setRuleIdList(List<Long> ruleIdList) {
		this.ruleIdList = ruleIdList;
	}

	public List<Long> getRuleIdList() {
		return this.ruleIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.rule.get_user_total";
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
		txtParams.put("agentId", this.agentId);
		txtParams.put("ruleIdList", TaobaoUtils.objectToJson(this.ruleIdList));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappRuleGetUserTotalResponse> getResponseClass() {
		return OapiMicroappRuleGetUserTotalResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}