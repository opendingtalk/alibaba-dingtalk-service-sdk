package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8295611817837452667L;

	/** 
	 * dentry
	 */
	@ApiField("dentry")
	private String dentry;

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


	public void setDentry(String dentry) {
		this.dentry = dentry;
	}
	public String getDentry( ) {
		return this.dentry;
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
