package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.interactivecard.callback.register response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScencegroupInteractivecardCallbackRegisterResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4567421897398977756L;

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
	 * 业务返回结果
	 */
	@ApiField("result")
	private InteractiveCardCallbackCreateResponse result;

	/** 
	 * 成功
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

	public void setResult(InteractiveCardCallbackCreateResponse result) {
		this.result = result;
	}
	public InteractiveCardCallbackCreateResponse getResult( ) {
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
	 * 业务返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InteractiveCardCallbackCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 7393353627847779964L;
		/**
		 * api签名密钥
		 */
		@ApiField("apiSecret")
		private String apiSecret;
		/**
		 * 业务回调地址
		 */
		@ApiField("callbackUrl")
		private String callbackUrl;
	
		public String getApiSecret() {
			return this.apiSecret;
		}
		public void setApiSecret(String apiSecret) {
			this.apiSecret = apiSecret;
		}
		public String getCallbackUrl() {
			return this.callbackUrl;
		}
		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}
	}
	


}
