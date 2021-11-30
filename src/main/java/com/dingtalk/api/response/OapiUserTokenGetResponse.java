package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.token.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserTokenGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7478444648641795856L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private UserToken4JsapiResponse result;


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

	public void setResult(UserToken4JsapiResponse result) {
		this.result = result;
	}
	public UserToken4JsapiResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserToken4JsapiResponse extends TaobaoObject {
		private static final long serialVersionUID = 8786522387289888296L;
		/**
		 * 个人token
		 */
		@ApiField("access_token")
		private String accessToken;
		/**
		 * token有效期
		 */
		@ApiField("expire_in")
		private Long expireIn;
	
		public String getAccessToken() {
			return this.accessToken;
		}
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		public Long getExpireIn() {
			return this.expireIn;
		}
		public void setExpireIn(Long expireIn) {
			this.expireIn = expireIn;
		}
	}
	


}
