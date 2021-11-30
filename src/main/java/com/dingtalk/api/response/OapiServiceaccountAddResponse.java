package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceaccountAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5536286184725292235L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 服务号的unionid
	 */
	@ApiField("unionid")
	private String unionid;


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

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getUnionid( ) {
		return this.unionid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
