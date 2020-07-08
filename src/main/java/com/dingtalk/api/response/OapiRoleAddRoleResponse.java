package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.add_role response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRoleAddRoleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3481957981781674614L;

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
	 * roleId
	 */
	@ApiField("roleId")
	private Long roleId;


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

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getRoleId( ) {
		return this.roleId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
