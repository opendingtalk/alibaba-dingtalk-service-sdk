package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.invite.shareurl.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProjectInviteShareurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6455712258157236852L;

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
	 * 响应结果
	 */
	@ApiField("result")
	private Result result;

	/** 
	 * 是否成功
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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 2492248324377826884L;
		/**
		 * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天）。
		 */
		@ApiField("expire_seconds")
		private Long expireSeconds;
		/**
		 * 圈子专属链接
		 */
		@ApiField("h5_url_circle")
		private String h5UrlCircle;
		/**
		 * 群专属链接
		 */
		@ApiField("h5_url_group")
		private String h5UrlGroup;
	
		public Long getExpireSeconds() {
			return this.expireSeconds;
		}
		public void setExpireSeconds(Long expireSeconds) {
			this.expireSeconds = expireSeconds;
		}
		public String getH5UrlCircle() {
			return this.h5UrlCircle;
		}
		public void setH5UrlCircle(String h5UrlCircle) {
			this.h5UrlCircle = h5UrlCircle;
		}
		public String getH5UrlGroup() {
			return this.h5UrlGroup;
		}
		public void setH5UrlGroup(String h5UrlGroup) {
			this.h5UrlGroup = h5UrlGroup;
		}
	}
	


}
