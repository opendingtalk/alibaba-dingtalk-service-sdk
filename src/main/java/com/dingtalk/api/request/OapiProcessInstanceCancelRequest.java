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
import com.dingtalk.api.response.OapiProcessInstanceCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.instance.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.30
 */
public class OapiProcessInstanceCancelRequest extends BaseTaobaoRequest<OapiProcessInstanceCancelResponse> {
	
	

	/** 
	* 入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CancelProcessInstanceRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.instance.cancel";
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

	public Class<OapiProcessInstanceCancelResponse> getResponseClass() {
		return OapiProcessInstanceCancelResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CancelProcessInstanceRequest extends TaobaoObject {
		private static final long serialVersionUID = 5836294776338225491L;
		/**
		 * 本次作废操作的发起者名字，通常指代系统名称
		 */
		@ApiField("operator_name")
		private String operatorName;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 本次作废操作的系统描述，会在审批操作记录里已操作备注的形式展示出来
		 */
		@ApiField("remark")
		private String remark;
	
		public String getOperatorName() {
			return this.operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
	}
	

}