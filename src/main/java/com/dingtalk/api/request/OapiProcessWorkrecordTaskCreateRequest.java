package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiProcessWorkrecordTaskCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.task.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiProcessWorkrecordTaskCreateRequest extends BaseTaobaoRequest<OapiProcessWorkrecordTaskCreateResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(SaveTaskRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.task.create";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessWorkrecordTaskCreateResponse> getResponseClass() {
		return OapiProcessWorkrecordTaskCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 任务列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskTopVo extends TaobaoObject {
		private static final long serialVersionUID = 7888279289957284321L;
		/**
		 * 跳转url
		 */
		@ApiField("url")
		private String url;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SaveTaskRequest extends TaobaoObject {
		private static final long serialVersionUID = 2535159481823784974L;
		/**
		 * 节点id
		 */
		@ApiField("activity_id")
		private String activityId;
		/**
		 * 应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 任务列表
		 */
		@ApiListField("tasks")
		@ApiField("task_top_vo")
		private List<TaskTopVo> tasks;
	
		public String getActivityId() {
			return this.activityId;
		}
		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public List<TaskTopVo> getTasks() {
			return this.tasks;
		}
		public void setTasks(List<TaskTopVo> tasks) {
			this.tasks = tasks;
		}
	}
	

}