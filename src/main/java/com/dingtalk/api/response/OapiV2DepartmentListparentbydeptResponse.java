package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listparentbydept response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentListparentbydeptResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5215154627548777777L;

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
	 * 父部门ID列表
	 */
	@ApiField("result")
	private DeptListParentByDeptIdResponse result;


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

	public void setResult(DeptListParentByDeptIdResponse result) {
		this.result = result;
	}
	public DeptListParentByDeptIdResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 父部门ID列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptListParentByDeptIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 8888461575369723515L;
		/**
		 * 该部门的所有父部门id列表
		 */
		@ApiListField("parent_id_list")
		@ApiField("number")
		private List<Long> parentIdList;
	
		public List<Long> getParentIdList() {
			return this.parentIdList;
		}
		public void setParentIdList(List<Long> parentIdList) {
			this.parentIdList = parentIdList;
		}
	}
	


}
