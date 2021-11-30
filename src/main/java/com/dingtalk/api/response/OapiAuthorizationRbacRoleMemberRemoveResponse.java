package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.member.remove response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthorizationRbacRoleMemberRemoveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1822553473433812621L;

	/** 
	 * errmsg
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errcode
	 */
	@ApiField("errmsg")
	private String errmsg;

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
