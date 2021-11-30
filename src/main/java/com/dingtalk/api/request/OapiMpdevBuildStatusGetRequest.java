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

import com.dingtalk.api.response.OapiMpdevBuildStatusGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.build.status.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.15
 */
public class OapiMpdevBuildStatusGetRequest extends BaseTaobaoRequest<OapiMpdevBuildStatusGetResponse> {
	
	

	/** 
	* 小程序ID
	 */
	private String miniappId;

	/** 
	* 上传任务ID
	 */
	private String taskId;

	public void setMiniappId(String miniappId) {
		this.miniappId = miniappId;
	}

	public String getMiniappId() {
		return this.miniappId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.mpdev.build.status.get";
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
		txtParams.put("miniapp_id", this.miniappId);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMpdevBuildStatusGetResponse> getResponseClass() {
		return OapiMpdevBuildStatusGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(miniappId, "miniappId");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}