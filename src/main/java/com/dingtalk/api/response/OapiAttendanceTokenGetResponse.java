package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.token.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceTokenGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8564288363567553323L;

	/** 
	 * 方法调用结果
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 业务返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TokenVO extends TaobaoObject {
		private static final long serialVersionUID = 5156268256332722897L;
		/**
		 * 授权超时时间
		 */
		@ApiField("expire_time")
		private Long expireTime;
		/**
		 * 授权码
		 */
		@ApiField("token")
		private String token;
	
		public Long getExpireTime() {
			return this.expireTime;
		}
		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}
		public String getToken() {
			return this.token;
		}
		public void setToken(String token) {
			this.token = token;
		}
	}
	
	/**
	 * 方法调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4719624846177362391L;
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
		private TokenVO result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public TokenVO getResult() {
			return this.result;
		}
		public void setResult(TokenVO result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
