package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list_parent_depts response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDepartmentListParentDeptsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1692174679857615772L;

	/** 
	 * department
	 */
	@ApiField("department")
	private String department;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment( ) {
		return this.department;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
