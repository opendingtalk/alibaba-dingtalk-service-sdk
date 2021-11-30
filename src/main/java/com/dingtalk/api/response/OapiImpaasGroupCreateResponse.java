package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasGroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2111628266834394586L;

	/** 
	 * 群ID
	 */
	@ApiField("chatid")
	private String chatid;

	/** 
	 * 错误码，0为成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息描述
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setChatid(String chatid) {
		this.chatid = chatid;
	}
	public String getChatid( ) {
		return this.chatid;
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
