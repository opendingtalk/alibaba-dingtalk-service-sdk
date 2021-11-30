package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hrm.employee.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHrmEmployeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2781976456691491175L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 花名册分组列表
	 */
	@ApiListField("group_list")
	@ApiField("field_group_vpo")
	private List<FieldGroupVpo> groupList;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setGroupList(List<FieldGroupVpo> groupList) {
		this.groupList = groupList;
	}
	public List<FieldGroupVpo> getGroupList( ) {
		return this.groupList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SysCustomFieldVpo extends TaobaoObject {
		private static final long serialVersionUID = 8445318612959232637L;
		/**
		 * 人事管理员确认员工入职的时候，是否必填该字段
		 */
		@ApiField("confirm_entry_required")
		private Boolean confirmEntryRequired;
		/**
		 * 手机端通讯录个人信息页，是否显示该字段
		 */
		@ApiField("contact_client_flag")
		private Boolean contactClientFlag;
		/**
		 * 是否是通讯录字段，包括系统字段和扩展字段
		 */
		@ApiField("contact_flag")
		private Boolean contactFlag;
		/**
		 * 是否是通讯录系统字段
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
		 * 员工是否可编辑
		 */
		@ApiField("editable_by_emp")
		private Boolean editableByEmp;
		/**
		 * HR是否可编辑该字段
		 */
		@ApiField("editable_by_hr")
		private Boolean editableByHr;
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
		 * 字段类型，有TEXT,IMAGE,SELECT,TIME四种类型，与type_name一一对应
		 */
		@ApiField("field_type")
		private String fieldType;
		/**
		 * 员工查看个人档案时，该字段是否隐藏
		 */
		@ApiField("hidden_from_employee_flag")
		private Boolean hiddenFromEmployeeFlag;
		/**
		 * 花名册字段说明
		 */
		@ApiField("hint")
		private String hint;
		/**
		 * 是否无水印，仅针对图片类型的字段
		 */
		@ApiField("no_watermark")
		private Boolean noWatermark;
		/**
		 * 选项类花名册字段的选择内容，是一个json数组
		 */
		@ApiField("option_text")
		private String optionText;
		/**
		 * 是否必须
		 */
		@ApiField("required")
		private Boolean required;
		/**
		 * 智能人事花名册默认的系统字段，包含通讯录的系统字段和花名册新增的字段
		 */
		@ApiField("system_flag")
		private Boolean systemFlag;
		/**
		 * 类型名，有文本，图片，选项，时间四种类型
		 */
		@ApiField("type_name")
		private String typeName;
		/**
		 * 字段的值
		 */
		@ApiField("value")
		private String value;
		/**
		 * 员工填写入职登记表的时候，该字段是否可见
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
		private static final long serialVersionUID = 3421918259555579963L;
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
	


}
