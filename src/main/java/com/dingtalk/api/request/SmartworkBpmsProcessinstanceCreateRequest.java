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
import com.dingtalk.api.response.SmartworkBpmsProcessinstanceCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class SmartworkBpmsProcessinstanceCreateRequest extends BaseTaobaoRequest<SmartworkBpmsProcessinstanceCreateResponse> {
	
	

	/** 
	* 企业微应用标识
	 */
	private Long agentId;

	/** 
	* 审批人userid列表
	 */
	private String approvers;

	/** 
	* 抄送人userid列表
	 */
	private String ccList;

	/** 
	* 抄送时间,分为（START,FINISH,START_FINISH）
	 */
	private String ccPosition;

	/** 
	* 发起人所在的部门
	 */
	private Long deptId;

	/** 
	* 审批流表单参数
	 */
	private String formComponentValues;

	/** 
	* 审批实例发起人的userid
	 */
	private String originatorUserId;

	/** 
	* 审批流的唯一码
	 */
	private String processCode;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setApprovers(String approvers) {
		this.approvers = approvers;
	}

	public String getApprovers() {
		return this.approvers;
	}

	public void setCcList(String ccList) {
		this.ccList = ccList;
	}

	public String getCcList() {
		return this.ccList;
	}

	public void setCcPosition(String ccPosition) {
		this.ccPosition = ccPosition;
	}

	public String getCcPosition() {
		return this.ccPosition;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setFormComponentValues(String formComponentValues) {
		this.formComponentValues = formComponentValues;
	}

	public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
		this.formComponentValues = new JSONWriter(false,true).write(formComponentValues);
	}

	public String getFormComponentValues() {
		return this.formComponentValues;
	}

	public void setOriginatorUserId(String originatorUserId) {
		this.originatorUserId = originatorUserId;
	}

	public String getOriginatorUserId() {
		return this.originatorUserId;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.processinstance.create";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("approvers", this.approvers);
		txtParams.put("cc_list", this.ccList);
		txtParams.put("cc_position", this.ccPosition);
		txtParams.put("dept_id", this.deptId);
		txtParams.put("form_component_values", this.formComponentValues);
		txtParams.put("originator_user_id", this.originatorUserId);
		txtParams.put("process_code", this.processCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessinstanceCreateResponse> getResponseClass() {
		return SmartworkBpmsProcessinstanceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(approvers, "approvers");
		RequestCheckUtils.checkMaxListSize(approvers, 20, "approvers");
		RequestCheckUtils.checkMaxListSize(ccList, 20, "ccList");
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
		RequestCheckUtils.checkObjectMaxListSize(formComponentValues, 20, "formComponentValues");
		RequestCheckUtils.checkNotEmpty(originatorUserId, "originatorUserId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
	}
	
	/**
	 * 审批流表单参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 4591577359999127154L;
		/**
		 * 扩展值
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 表单每一栏的名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 表单每一栏的值
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
	

}