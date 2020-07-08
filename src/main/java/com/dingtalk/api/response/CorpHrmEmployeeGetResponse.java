package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpHrmEmployeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4748978647968899278L;

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
	 * 字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SysCustomFieldVpo extends TaobaoObject {
		private static final long serialVersionUID = 1879487269832133698L;
		/**
		 * 确认入职是否必填
		 */
		@ApiField("confirm_entry_required")
		private Boolean confirmEntryRequired;
		/**
		 * 是否通讯录client字段
		 */
		@ApiField("contact_client_flag")
		private Boolean contactClientFlag;
		/**
		 * 是否通讯录字段
		 */
		@ApiField("contact_flag")
		private Boolean contactFlag;
		/**
		 * 通讯录来源
		 */
		@ApiField("contact_source")
		private Long contactSource;
		/**
		 * 是否通讯录系统字段
		 */
		@ApiField("contact_system_flag")
		private Boolean contactSystemFlag;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 是否已删除
		 */
		@ApiField("deleted")
		private Boolean deleted;
		/**
		 * editableByEmp
		 */
		@ApiField("editable_by_emp")
		private Boolean editableByEmp;
		/**
		 * editableByHr
		 */
		@ApiField("editable_by_hr")
		private Boolean editableByHr;
		/**
		 * 在个人信息展示
		 */
		@ApiField("emp_profile_required")
		private Boolean empProfileRequired;
		/**
		 * 字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 字段类型
		 */
		@ApiField("field_type")
		private String fieldType;
		/**
		 * groupId
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 对员工不可见
		 */
		@ApiField("hidden_from_employee_flag")
		private Boolean hiddenFromEmployeeFlag;
		/**
		 * 提醒
		 */
		@ApiField("hint")
		private String hint;
		/**
		 * 字段key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 是否需要水印
		 */
		@ApiField("no_watermark")
		private Boolean noWatermark;
		/**
		 * 选项值
		 */
		@ApiField("option_text")
		private String optionText;
		/**
		 * required
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 是否系统字段
		 */
		@ApiField("system_flag")
		private Boolean systemFlag;
		/**
		 * 类型名
		 */
		@ApiField("type_name")
		private String typeName;
		/**
		 * 字段的值
		 */
		@ApiField("value")
		private String value;
		/**
		 * visibleByEmp
		 */
		@ApiField("visible_by_emp")
		private Boolean visibleByEmp;
	
		public Boolean getConfirmEntryRequired() {
			return this.confirmEntryRequired;
		}
		public void setConfirmEntryRequired(Boolean confirmEntryRequired) {
			this.confirmEntryRequired = confirmEntryRequired;
		}
		public Boolean getContactClientFlag() {
			return this.contactClientFlag;
		}
		public void setContactClientFlag(Boolean contactClientFlag) {
			this.contactClientFlag = contactClientFlag;
		}
		public Boolean getContactFlag() {
			return this.contactFlag;
		}
		public void setContactFlag(Boolean contactFlag) {
			this.contactFlag = contactFlag;
		}
		public Long getContactSource() {
			return this.contactSource;
		}
		public void setContactSource(Long contactSource) {
			this.contactSource = contactSource;
		}
		public Boolean getContactSystemFlag() {
			return this.contactSystemFlag;
		}
		public void setContactSystemFlag(Boolean contactSystemFlag) {
			this.contactSystemFlag = contactSystemFlag;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Boolean getDeleted() {
			return this.deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
		public Boolean getEditableByEmp() {
			return this.editableByEmp;
		}
		public void setEditableByEmp(Boolean editableByEmp) {
			this.editableByEmp = editableByEmp;
		}
		public Boolean getEditableByHr() {
			return this.editableByHr;
		}
		public void setEditableByHr(Boolean editableByHr) {
			this.editableByHr = editableByHr;
		}
		public Boolean getEmpProfileRequired() {
			return this.empProfileRequired;
		}
		public void setEmpProfileRequired(Boolean empProfileRequired) {
			this.empProfileRequired = empProfileRequired;
		}
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getFieldType() {
			return this.fieldType;
		}
		public void setFieldType(String fieldType) {
			this.fieldType = fieldType;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public Boolean getHiddenFromEmployeeFlag() {
			return this.hiddenFromEmployeeFlag;
		}
		public void setHiddenFromEmployeeFlag(Boolean hiddenFromEmployeeFlag) {
			this.hiddenFromEmployeeFlag = hiddenFromEmployeeFlag;
		}
		public String getHint() {
			return this.hint;
		}
		public void setHint(String hint) {
			this.hint = hint;
		}
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public Boolean getNoWatermark() {
			return this.noWatermark;
		}
		public void setNoWatermark(Boolean noWatermark) {
			this.noWatermark = noWatermark;
		}
		public String getOptionText() {
			return this.optionText;
		}
		public void setOptionText(String optionText) {
			this.optionText = optionText;
		}
		public Boolean getRequired() {
			return this.required;
		}
		public void setRequired(Boolean required) {
			this.required = required;
		}
		public Boolean getSystemFlag() {
			return this.systemFlag;
		}
		public void setSystemFlag(Boolean systemFlag) {
			this.systemFlag = systemFlag;
		}
		public String getTypeName() {
			return this.typeName;
		}
		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public Boolean getVisibleByEmp() {
			return this.visibleByEmp;
		}
		public void setVisibleByEmp(Boolean visibleByEmp) {
			this.visibleByEmp = visibleByEmp;
		}
	}
	
	/**
	 * 花名册分组列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FieldGroupVpo extends TaobaoObject {
		private static final long serialVersionUID = 1685192134649642961L;
		/**
		 * 字段列表
		 */
		@ApiListField("field_list")
		@ApiField("sys_custom_field_vpo")
		private List<SysCustomFieldVpo> fieldList;
		/**
		 * 花名册分组id
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 花名册分组名
		 */
		@ApiField("group_name")
		private String groupName;
	
		public List<SysCustomFieldVpo> getFieldList() {
			return this.fieldList;
		}
		public void setFieldList(List<SysCustomFieldVpo> fieldList) {
			this.fieldList = fieldList;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 8844699757764541513L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 花名册分组列表
		 */
		@ApiListField("group_list")
		@ApiField("field_group_vpo")
		private List<FieldGroupVpo> groupList;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<FieldGroupVpo> getGroupList() {
			return this.groupList;
		}
		public void setGroupList(List<FieldGroupVpo> groupList) {
			this.groupList = groupList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
