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

import com.dingtalk.api.response.OapiMessageCorpconversationStatusBarUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.status_bar.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.06.09
 */
public class OapiMessageCorpconversationStatusBarUpdateRequest extends BaseTaobaoRequest<OapiMessageCorpconversationStatusBarUpdateResponse> {
	
	

	/** 
	* 应用id
	 */
	private Long agentId;

	/** 
	* 状态栏背景色
	 */
	private String statusBg;

	/** 
	* 状态栏值
	 */
	private String statusValue;

	/** 
	* 工作通知任务id
	 */
	private Long taskId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setStatusBg(String statusBg) {
		this.statusBg = statusBg;
	}

	public String getStatusBg() {
		return this.statusBg;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	public String getStatusValue() {
		return this.statusValue;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.status_bar.update";
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
		txtParams.put("status_bg", this.statusBg);
		txtParams.put("status_value", this.statusValue);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationStatusBarUpdateResponse> getResponseClass() {
		return OapiMessageCorpconversationStatusBarUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(statusValue, "statusValue");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}