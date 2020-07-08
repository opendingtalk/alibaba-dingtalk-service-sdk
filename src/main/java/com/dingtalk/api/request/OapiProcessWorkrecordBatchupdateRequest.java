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
import com.dingtalk.api.response.OapiProcessWorkrecordBatchupdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.batchupdate request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.24
 */
public class OapiProcessWorkrecordBatchupdateRequest extends BaseTaobaoRequest<OapiProcessWorkrecordBatchupdateResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(BatchUpdateProcessInstanceRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.batchupdate";
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

	public Class<OapiProcessWorkrecordBatchupdateResponse> getResponseClass() {
		return OapiProcessWorkrecordBatchupdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 实例列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateProcessInstanceRequest extends TaobaoObject {
		private static final long serialVersionUID = 5114799991445392467L;
		/**
		 * 实例id，通过创建待办实例接口获取
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 任务结果，分为agree和refuse
		 */
		@ApiField("result")
		private String result;
		/**
		 * 实例状态，分为COMPLETED, TERMINATED
		 */
		@ApiField("status")
		private String status;
	
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
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchUpdateProcessInstanceRequest extends TaobaoObject {
		private static final long serialVersionUID = 6715938212585344738L;
		/**
		 * 企业应用标识
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 实例列表
		 */
		@ApiListField("instances")
		@ApiField("update_process_instance_request")
		private List<UpdateProcessInstanceRequest> instances;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public List<UpdateProcessInstanceRequest> getInstances() {
			return this.instances;
		}
		public void setInstances(List<UpdateProcessInstanceRequest> instances) {
			this.instances = instances;
		}
	}
	

}