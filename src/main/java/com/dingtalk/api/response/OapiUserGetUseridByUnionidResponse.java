package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getUseridByUnionid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetUseridByUnionidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5611292726321177648L;

	/** 
	 * contactType
	 */
	@ApiField("contactType")
	private Long contactType;

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
	 * userid
	 */
	@ApiField("userid")
	private String userid;


	public void setContactType(Long contactType) {
		this.contactType = contactType;
	}
	public Long getContactType( ) {
		return this.contactType;
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

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
