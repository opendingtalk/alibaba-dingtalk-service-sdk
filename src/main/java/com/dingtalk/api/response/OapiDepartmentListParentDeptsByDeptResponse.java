package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list_parent_depts_by_dept response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDepartmentListParentDeptsByDeptResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6564623768226785559L;

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

	/** 
	 * parentIds
	 */
	@ApiListField("parentIds")
	@ApiField("number")
	private List<Long> parentIds;


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

	public void setParentIds(List<Long> parentIds) {
		this.parentIds = parentIds;
	}
	public List<Long> getParentIds( ) {
		return this.parentIds;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
