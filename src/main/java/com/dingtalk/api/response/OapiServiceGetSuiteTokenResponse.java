package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_suite_token response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceGetSuiteTokenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4738726764728941815L;

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
	 * 有效期7200秒，过期之前要主动更新（建议ISV服务端做定时器主动更新，而不是依赖钉钉的定时推送）
	 */
	@ApiField("expires_in")
	private Long expiresIn;

	/** 
	 * 应用套件access_token
	 */
	@ApiField("suite_access_token")
	private String suiteAccessToken;


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

	public void setSuiteAccessToken(String suiteAccessToken) {
		this.suiteAccessToken = suiteAccessToken;
	}
	public String getSuiteAccessToken( ) {
		return this.suiteAccessToken;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
