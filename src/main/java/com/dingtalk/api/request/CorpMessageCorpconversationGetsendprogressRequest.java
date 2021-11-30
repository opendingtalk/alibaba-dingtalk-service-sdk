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

import com.dingtalk.api.response.CorpMessageCorpconversationGetsendprogressResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.getsendprogress request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpMessageCorpconversationGetsendprogressRequest extends BaseTaobaoRequest<CorpMessageCorpconversationGetsendprogressResponse> {
	
	

	/** 
	* 发送消息时使用的微应用的id
	 */
	private Long agentId;

	/** 
	* 发送消息时钉钉返回的任务id
	 */
	private Long taskId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.message.corpconversation.getsendprogress";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpMessageCorpconversationGetsendprogressResponse> getResponseClass() {
		return CorpMessageCorpconversationGetsendprogressResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}