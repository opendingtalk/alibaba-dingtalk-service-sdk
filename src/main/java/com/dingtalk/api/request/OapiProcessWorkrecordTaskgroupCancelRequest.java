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
import com.dingtalk.api.response.OapiProcessWorkrecordTaskgroupCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.taskgroup.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.24
 */
public class OapiProcessWorkrecordTaskgroupCancelRequest extends BaseTaobaoRequest<OapiProcessWorkrecordTaskgroupCancelResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(UpdateTaskRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.taskgroup.cancel";
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

	public Class<OapiProcessWorkrecordTaskgroupCancelResponse> getResponseClass() {
		return OapiProcessWorkrecordTaskgroupCancelResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateTaskRequest extends TaobaoObject {
		private static final long serialVersionUID = 4571894629498552753L;
		/**
		 * 任务组id
		 */
		@ApiField("activity_id")
		private String activityId;
		/**
		 * 任务组id列表
		 */
		@ApiListField("activity_id_list")
		@ApiField("string")
		private List<String> activityIdList;
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
	
		public String getActivityId() {
			return this.activityId;
		}
		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}
		public List<String> getActivityIdList() {
			return this.activityIdList;
		}
		public void setActivityIdList(List<String> activityIdList) {
			this.activityIdList = activityIdList;
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
	}
	

}