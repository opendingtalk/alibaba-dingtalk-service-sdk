package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSmartworkHrmEmployeeFieldListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.field.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.26
 */
public class OapiSmartworkHrmEmployeeFieldListRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeFieldListResponse> {
	
	

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
		return "dingtalk.oapi.smartwork.hrm.employee.field.list";
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

	public Class<OapiSmartworkHrmEmployeeFieldListResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeFieldListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}