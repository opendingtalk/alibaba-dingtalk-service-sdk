package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiProcessWorkrecordUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.09
 */
public class OapiProcessWorkrecordUpdateRequest extends BaseTaobaoRequest<OapiProcessWorkrecordUpdateResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(UpdateProcessInstanceRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.update";
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

	public Class<OapiProcessWorkrecordUpdateResponse> getResponseClass() {
		return OapiProcessWorkrecordUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateProcessInstanceRequest extends TaobaoObject {
		private static final long serialVersionUID = 5623689815113314974L;
		/**
		 * 应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 取消任务
		 */
		@ApiField("cancel_running_task")
		private Boolean cancelRunningTask;
		/**
		 * 实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 实例结果, 如果实例状态是COMPLETED，需要设置result，分为agree和refuse
		 */
		@ApiField("result")
		private String result;
		/**
		 * 实例状态，分为COMPLETED, TERMINATED
		 */
		@ApiField("status")
		private String status;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public Boolean getCancelRunningTask() {
			return this.cancelRunningTask;
		}
		public void setCancelRunningTask(Boolean cancelRunningTask) {
			this.cancelRunningTask = cancelRunningTask;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}
	

}