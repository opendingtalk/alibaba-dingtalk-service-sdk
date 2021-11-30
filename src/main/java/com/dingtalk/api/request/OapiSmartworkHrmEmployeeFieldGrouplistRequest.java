package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSmartworkHrmEmployeeFieldGrouplistResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.field.grouplist request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.19
 */
public class OapiSmartworkHrmEmployeeFieldGrouplistRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeFieldGrouplistResponse> {
	
	

	/** 
	* 微应用在企业的AgentId，不需要自定义字段可不传
	 */
	private Long agentid;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.field.grouplist";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeFieldGrouplistResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeFieldGrouplistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}