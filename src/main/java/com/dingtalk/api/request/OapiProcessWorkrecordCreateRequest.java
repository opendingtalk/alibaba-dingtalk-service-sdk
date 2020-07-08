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
import com.dingtalk.api.response.OapiProcessWorkrecordCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.21
 */
public class OapiProcessWorkrecordCreateRequest extends BaseTaobaoRequest<OapiProcessWorkrecordCreateResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(SaveFakeProcessInstanceRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.workrecord.create";
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

	public Class<OapiProcessWorkrecordCreateResponse> getResponseClass() {
		return OapiProcessWorkrecordCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 表单参数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 4862331962494977371L;
		/**
		 * 扩展字段
		 */
		@ApiField("extValue")
		private String extValue;
		/**
		 * 表单名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
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
	public static class SaveFakeProcessInstanceRequest extends TaobaoObject {
		private static final long serialVersionUID = 2433114749931343856L;
		/**
		 * 应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 表单参数列表
		 */
		@ApiListField("form_component_values")
		@ApiField("form_component_value_vo")
		private List<FormComponentValueVo> formComponentValues;
		/**
		 * 审批发起人
		 */
		@ApiField("originator_user_id")
		private String originatorUserId;
		/**
		 * 审批模板唯一码
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 实例标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 实例跳转链接
		 */
		@ApiField("url")
		private String url;
	
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
		public String getOriginatorUserId() {
			return this.originatorUserId;
		}
		public void setOriginatorUserId(String originatorUserId) {
			this.originatorUserId = originatorUserId;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	

}