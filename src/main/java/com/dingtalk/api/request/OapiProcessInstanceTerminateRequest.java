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
import com.dingtalk.api.response.OapiProcessInstanceTerminateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.instance.terminate request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.09
 */
public class OapiProcessInstanceTerminateRequest extends BaseTaobaoRequest<OapiProcessInstanceTerminateResponse> {
	
	

	/** 
	* 终止审批请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(TerminateProcessInstanceRequestV2 request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.instance.terminate";
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

	public Class<OapiProcessInstanceTerminateResponse> getResponseClass() {
		return OapiProcessInstanceTerminateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 终止审批请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TerminateProcessInstanceRequestV2 extends TaobaoObject {
		private static final long serialVersionUID = 8274472212361159378L;
		/**
		 * 是否系统调用
		 */
		@ApiField("is_system")
		private Boolean isSystem;
		/**
		 * 操作人工号
		 */
		@ApiField("operating_userid")
		private String operatingUserid;
		/**
		 * 审批实例
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 说明
		 */
		@ApiField("remark")
		private String remark;
	
		public Boolean getIsSystem() {
			return this.isSystem;
		}
		public void setIsSystem(Boolean isSystem) {
			this.isSystem = isSystem;
		}
		public String getOperatingUserid() {
			return this.operatingUserid;
		}
		public void setOperatingUserid(String operatingUserid) {
			this.operatingUserid = operatingUserid;
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