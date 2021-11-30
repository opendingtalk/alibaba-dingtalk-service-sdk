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

import com.dingtalk.api.response.OapiMessageMassRecallResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.mass.recall request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.19
 */
public class OapiMessageMassRecallRequest extends BaseTaobaoRequest<OapiMessageMassRecallResponse> {
	
	

	/** 
	* 消息发送任务id
	 */
	private String taskId;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.mass.recall";
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
		txtParams.put("task_id", this.taskId);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageMassRecallResponse> getResponseClass() {
		return OapiMessageMassRecallResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
		RequestCheckUtils.checkMaxLength(taskId, 128, "taskId");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
		RequestCheckUtils.checkMaxLength(unionid, 128, "unionid");
	}
	

}