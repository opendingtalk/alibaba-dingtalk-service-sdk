package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.listcontact response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeListcontactResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8357399646678162298L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiListField("result")
	@ApiField("emp_field_info_vo")
	private List<EmpFieldInfoVo> result;

	/** 
	 * 调用是否成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(List<EmpFieldInfoVo> result) {
		this.result = result;
	}
	public List<EmpFieldInfoVo> getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 字段信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldVo extends TaobaoObject {
		private static final long serialVersionUID = 8126478733716352148L;
		/**
		 * 字段编码
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 字段业务分组
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 字段值文本说明
		 */
		@ApiField("label")
		private String label;
		/**
		 * 字段值
		 */
		@ApiField("value")
		private String value;
	
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
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpFieldInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 4662996867468171131L;
		/**
		 * 字段信息列表
		 */
		@ApiListField("field_list")
		@ApiField("emp_field_vo")
		private List<EmpFieldVo> fieldList;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<EmpFieldVo> getFieldList() {
			return this.fieldList;
		}
		public void setFieldList(List<EmpFieldVo> fieldList) {
			this.fieldList = fieldList;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
