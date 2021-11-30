package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6855582497785434584L;

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
	@ApiField("emp_field_info_v_o")
	private List<EmpFieldInfoVO> result;

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

	public void setResult(List<EmpFieldInfoVO> result) {
		this.result = result;
	}
	public List<EmpFieldInfoVO> getResult( ) {
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
	public static class EmpFieldVO extends TaobaoObject {
		private static final long serialVersionUID = 8548779729215119798L;
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
		 * 字段值翻译
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
	public static class EmpFieldInfoVO extends TaobaoObject {
		private static final long serialVersionUID = 1837991881953262715L;
		/**
		 * 字段信息列表
		 */
		@ApiListField("field_list")
		@ApiField("emp_field_v_o")
		private List<EmpFieldVO> fieldList;
		/**
		 * 是否是合伙伙伴
		 */
		@ApiField("partner")
		private Boolean partner;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<EmpFieldVO> getFieldList() {
			return this.fieldList;
		}
		public void setFieldList(List<EmpFieldVO> fieldList) {
			this.fieldList = fieldList;
		}
		public Boolean getPartner() {
			return this.partner;
		}
		public void setPartner(Boolean partner) {
			this.partner = partner;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
