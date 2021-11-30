package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7399787894656633697L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 成功信息
	 */
	@ApiField("result")
	private DeptCreateResponse result;


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

	public void setResult(DeptCreateResponse result) {
		this.result = result;
	}
	public DeptCreateResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 成功信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 8745271875369262555L;
		/**
		 * 部门ID
		 */
		@ApiField("dept_id")
		private Long deptId;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
	}
	


}
