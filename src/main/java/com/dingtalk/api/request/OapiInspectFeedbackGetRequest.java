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

import com.dingtalk.api.response.OapiInspectFeedbackGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.inspect.feedback.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.14
 */
public class OapiInspectFeedbackGetRequest extends BaseTaobaoRequest<OapiInspectFeedbackGetResponse> {
	
	

	/** 
	* 表单标识（传空值，暂时保留）
	 */
	private String formId;

	/** 
	* 巡店任务唯一标识
	 */
	private String taskId;

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFormId() {
		return this.formId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.inspect.feedback.get";
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
		txtParams.put("form_id", this.formId);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiInspectFeedbackGetResponse> getResponseClass() {
		return OapiInspectFeedbackGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}