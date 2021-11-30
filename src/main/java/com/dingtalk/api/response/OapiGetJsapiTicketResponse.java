package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.get_jsapi_ticket response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiGetJsapiTicketResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4123781981278121628L;

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
	 * 票据过期时间
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * 用于JS API的临时票据
	 */
	@ApiField("ticket")
	private String ticket;


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

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public Long getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getTicket( ) {
		return this.ticket;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
