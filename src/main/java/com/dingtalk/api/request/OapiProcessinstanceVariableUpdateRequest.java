package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiProcessinstanceVariableUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.variable.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.20
 */
public class OapiProcessinstanceVariableUpdateRequest extends BaseTaobaoRequest<OapiProcessinstanceVariableUpdateResponse> {
	
	

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 变量列表
	 */
	private String variables;

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setVariables(String variables) {
		this.variables = variables;
	}

	public void setVariables(List<BizValueVo> variables) {
		this.variables = new JSONWriter(false,false,true).write(variables);
	}

	public String getVariables() {
		return this.variables;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.variable.update";
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
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("remark", this.remark);
		txtParams.put("variables", this.variables);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceVariableUpdateResponse> getResponseClass() {
		return OapiProcessinstanceVariableUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkObjectMaxListSize(variables, 20, "variables");
	}
	
	/**
	 * 变量列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BizValueVo extends TaobaoObject {
		private static final long serialVersionUID = 8347527765976847934L;
		/**
		 * 额外信息
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 表单组件id
		 */
		@ApiField("id")
		private String id;
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
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	

}