package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.get_sns_token response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsGetSnsTokenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2393846634428883624L;

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
	 * sns_token的过期时间
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * 用户授权的token
	 */
	@ApiField("sns_token")
	private String snsToken;


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

	public void setSnsToken(String snsToken) {
		this.snsToken = snsToken;
	}
	public String getSnsToken( ) {
		return this.snsToken;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
