package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get_admin_scope response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetAdminScopeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3688891287864996928L;

	/** 
	 * result
	 */
	@ApiListField("dept_ids")
	@ApiField("number")
	private List<Long> deptIds;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setDeptIds(List<Long> deptIds) {
		this.deptIds = deptIds;
	}
	public List<Long> getDeptIds( ) {
		return this.deptIds;
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
