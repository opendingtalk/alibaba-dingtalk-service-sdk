package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listparentbyuser response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentListparentbyuserResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2478587719634343931L;

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
	 * 成功数据信息
	 */
	@ApiField("result")
	private DeptListParentByUserResponse result;


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

	public void setResult(DeptListParentByUserResponse result) {
		this.result = result;
	}
	public DeptListParentByUserResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 父部门列表集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptParentResponse extends TaobaoObject {
		private static final long serialVersionUID = 7861922616263611974L;
		/**
		 * 父部门列表
		 */
		@ApiListField("parent_dept_id_list")
		@ApiField("number")
		private List<Long> parentDeptIdList;
	
		public List<Long> getParentDeptIdList() {
			return this.parentDeptIdList;
		}
		public void setParentDeptIdList(List<Long> parentDeptIdList) {
			this.parentDeptIdList = parentDeptIdList;
		}
	}
	
	/**
	 * 成功数据信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptListParentByUserResponse extends TaobaoObject {
		private static final long serialVersionUID = 3339255978131314735L;
		/**
		 * 父部门列表集合
		 */
		@ApiListField("parent_list")
		@ApiField("dept_parent_response")
		private List<DeptParentResponse> parentList;
	
		public List<DeptParentResponse> getParentList() {
			return this.parentList;
		}
		public void setParentList(List<DeptParentResponse> parentList) {
			this.parentList = parentList;
		}
	}
	


}
