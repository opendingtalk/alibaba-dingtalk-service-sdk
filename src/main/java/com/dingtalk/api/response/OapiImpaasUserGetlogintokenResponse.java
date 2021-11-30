package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getlogintoken response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasUserGetlogintokenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8181957782932983967L;

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

	/** 
	 * result
	 */
	@ApiField("result")
	private GetLoginTokenResp result;

	/** 
	 * success
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

	public void setResult(GetLoginTokenResp result) {
		this.result = result;
	}
	public GetLoginTokenResp getResult( ) {
		return this.result;
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
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetLoginTokenResp extends TaobaoObject {
		private static final long serialVersionUID = 7597894534594911236L;
		/**
		 * expire
		 */
		@ApiField("expire")
		private Long expire;
		/**
		 * loginToken
		 */
		@ApiField("login_token")
		private String loginToken;
	
		public Long getExpire() {
			return this.expire;
		}
		public void setExpire(Long expire) {
			this.expire = expire;
		}
		public String getLoginToken() {
			return this.loginToken;
		}
		public void setLoginToken(String loginToken) {
			this.loginToken = loginToken;
		}
	}
	


}
