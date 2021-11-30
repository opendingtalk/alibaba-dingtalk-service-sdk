package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.department.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryDepartmentGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5885429217231225928L;

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
	 * result
	 */
	@ApiField("result")
	private OpenIndustryDeptInfo result;

	/** 
	 * 成功
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

	public void setResult(OpenIndustryDeptInfo result) {
		this.result = result;
	}
	public OpenIndustryDeptInfo getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIndustryDeptInfo extends TaobaoObject {
		private static final long serialVersionUID = 8692958176847286124L;
		/**
		 * 通讯录类型，行业相关
		 */
		@ApiField("contact_type")
		private String contactType;
		/**
		 * 部门类型，行业相关
		 */
		@ApiField("dept_type")
		private String deptType;
		/**
		 * 部门属性
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 部门名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 父部门ID
		 */
		@ApiField("super_id")
		private Long superId;
	
		public String getContactType() {
			return this.contactType;
		}
		public void setContactType(String contactType) {
			this.contactType = contactType;
		}
		public String getDeptType() {
			return this.deptType;
		}
		public void setDeptType(String deptType) {
			this.deptType = deptType;
		}
		public String getFeature() {
			return this.feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getSuperId() {
			return this.superId;
		}
		public void setSuperId(Long superId) {
			this.superId = superId;
		}
	}
	


}
