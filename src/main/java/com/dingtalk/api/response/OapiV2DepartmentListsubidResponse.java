package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listsubid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentListsubidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7533328919336298165L;

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
	 * 子部门信息
	 */
	@ApiField("result")
	private DeptListSubIdResponse result;


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

	public void setResult(DeptListSubIdResponse result) {
		this.result = result;
	}
	public DeptListSubIdResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 子部门信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptListSubIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 3115545529371159978L;
		/**
		 * 子部门列表
		 */
		@ApiListField("dept_id_list")
		@ApiField("number")
		private List<Long> deptIdList;
	
		public List<Long> getDeptIdList() {
			return this.deptIdList;
		}
		public void setDeptIdList(List<Long> deptIdList) {
			this.deptIdList = deptIdList;
		}
	}
	


}
