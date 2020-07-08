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

	private static final long serialVersionUID = 4846944884899551463L;

	/** 
	 * 错误码  -1 系统异常 40035 参数错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 获取logintoken出参
	 */
	@ApiField("result")
	private GetLoginTokenResp result;

	/** 
	 * 接口是否调用成功
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
	 * 获取logintoken出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetLoginTokenResp extends TaobaoObject {
		private static final long serialVersionUID = 3822218573111639362L;
		/**
		 * 过期时长
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
