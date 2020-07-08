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
import com.dingtalk.api.response.OapiProcessApproversForecastResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.approvers.forecast request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.21
 */
public class OapiProcessApproversForecastRequest extends BaseTaobaoRequest<OapiProcessApproversForecastResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ProcessForecastRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.approvers.forecast";
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

	public Class<OapiProcessApproversForecastResponse> getResponseClass() {
		return OapiProcessApproversForecastResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 表单数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 4411729974858877177L;
		/**
		 * 组件名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 组件值
		 */
		@ApiField("value")
		private String value;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessForecastRequest extends TaobaoObject {
		private static final long serialVersionUID = 6838211275582974757L;
		/**
		 * 应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 表单数据
		 */
		@ApiListField("form_component_values")
		@ApiField("form_component_value_vo")
		private List<FormComponentValueVo> formComponentValues;
		/**
		 * 发起人所在部门
		 */
		@ApiField("originator_deptid")
		private Long originatorDeptid;
		/**
		 * 发起人id
		 */
		@ApiField("originator_userid")
		private String originatorUserid;
		/**
		 * 模板唯一码
		 */
		@ApiField("process_code")
		private String processCode;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public List<FormComponentValueVo> getFormComponentValues() {
			return this.formComponentValues;
		}
		public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
			this.formComponentValues = formComponentValues;
		}
		public Long getOriginatorDeptid() {
			return this.originatorDeptid;
		}
		public void setOriginatorDeptid(Long originatorDeptid) {
			this.originatorDeptid = originatorDeptid;
		}
		public String getOriginatorUserid() {
			return this.originatorUserid;
		}
		public void setOriginatorUserid(String originatorUserid) {
			this.originatorUserid = originatorUserid;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	

}