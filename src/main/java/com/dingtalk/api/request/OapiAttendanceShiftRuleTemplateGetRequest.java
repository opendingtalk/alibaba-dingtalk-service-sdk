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

import com.dingtalk.api.response.OapiAttendanceShiftRuleTemplateGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.rule.template.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.02
 */
public class OapiAttendanceShiftRuleTemplateGetRequest extends BaseTaobaoRequest<OapiAttendanceShiftRuleTemplateGetResponse> {
	
	

	/** 
	* 操作人userId
	 */
	private String opUserId;

	/** 
	* 规则模板id
	 */
	private Long ruleTemplateId;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setRuleTemplateId(Long ruleTemplateId) {
		this.ruleTemplateId = ruleTemplateId;
	}

	public Long getRuleTemplateId() {
		return this.ruleTemplateId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.rule.template.get";
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
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("rule_template_id", this.ruleTemplateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftRuleTemplateGetResponse> getResponseClass() {
		return OapiAttendanceShiftRuleTemplateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(ruleTemplateId, "ruleTemplateId");
	}
	

}