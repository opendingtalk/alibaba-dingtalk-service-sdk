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
import com.dingtalk.api.response.OapiProcessPrinterInstanceGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.printer.instance.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.08
 */
public class OapiProcessPrinterInstanceGetRequest extends BaseTaobaoRequest<OapiProcessPrinterInstanceGetResponse> {
	
	

	/** 
	* 脱敏数据请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(InstancePrintDataRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.printer.instance.get";
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

	public Class<OapiProcessPrinterInstanceGetResponse> getResponseClass() {
		return OapiProcessPrinterInstanceGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 脱敏数据请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InstancePrintDataRequest extends TaobaoObject {
		private static final long serialVersionUID = 3613843458583185479L;
		/**
		 * 微应用agentId
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 审批单实例编号
		 */
		@ApiField("instance_id")
		private String instanceId;
		/**
		 * 流程code
		 */
		@ApiField("process_code")
		private String processCode;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	

}