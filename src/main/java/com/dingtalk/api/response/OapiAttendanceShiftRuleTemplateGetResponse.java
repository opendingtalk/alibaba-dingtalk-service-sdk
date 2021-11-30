package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.rule.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceShiftRuleTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6574594238479256734L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 使用的自定义字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftRuleFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 1875495825455871933L;
		/**
		 * 字段描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 字段名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 字段类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 字段值
		 */
		@ApiField("value")
		private String value;
	
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 结果数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftRuleTemplateVo extends TaobaoObject {
		private static final long serialVersionUID = 3345964856995227562L;
		/**
		 * 规则类型，如浮动打卡时间
		 */
		@ApiField("category")
		private Long category;
		/**
		 * 规则代码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 所属企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 使用的自定义字段
		 */
		@ApiListField("custom_fields")
		@ApiField("top_shift_rule_field_vo")
		private List<TopShiftRuleFieldVo> customFields;
		/**
		 * 规则描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 规则流程
		 */
		@ApiField("flow")
		private Long flow;
		/**
		 * 规则名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 规则组id
		 */
		@ApiField("rule_group_id")
		private Long ruleGroupId;
		/**
		 * 规则状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 所属套件key
		 */
		@ApiField("suite_key")
		private String suiteKey;
		/**
		 * 使用到的系统字段
		 */
		@ApiListField("system_fields")
		@ApiField("string")
		private List<String> systemFields;
	
		public Long getCategory() {
			return this.category;
		}
		public void setCategory(Long category) {
			this.category = category;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<TopShiftRuleFieldVo> getCustomFields() {
			return this.customFields;
		}
		public void setCustomFields(List<TopShiftRuleFieldVo> customFields) {
			this.customFields = customFields;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getFlow() {
			return this.flow;
		}
		public void setFlow(Long flow) {
			this.flow = flow;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getRuleGroupId() {
			return this.ruleGroupId;
		}
		public void setRuleGroupId(Long ruleGroupId) {
			this.ruleGroupId = ruleGroupId;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getSuiteKey() {
			return this.suiteKey;
		}
		public void setSuiteKey(String suiteKey) {
			this.suiteKey = suiteKey;
		}
		public List<String> getSystemFields() {
			return this.systemFields;
		}
		public void setSystemFields(List<String> systemFields) {
			this.systemFields = systemFields;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2699425314364276844L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误描述
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 结果数据
		 */
		@ApiField("result")
		private TopShiftRuleTemplateVo result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public TopShiftRuleTemplateVo getResult() {
			return this.result;
		}
		public void setResult(TopShiftRuleTemplateVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
