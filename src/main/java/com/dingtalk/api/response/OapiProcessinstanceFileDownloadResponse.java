package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.file.download response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessinstanceFileDownloadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3225424694331272911L;

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
	 * 返回数据
	 */
	@ApiField("result")
	private AppSpaceResponse result;

	/** 
	 * 成功标识
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

	public void setResult(AppSpaceResponse result) {
		this.result = result;
	}
	public AppSpaceResponse getResult( ) {
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
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AppSpaceResponse extends TaobaoObject {
		private static final long serialVersionUID = 8263411242389251115L;
		/**
		 * 临时授权码
		 */
		@ApiField("auth_code")
		private String authCode;
		/**
		 * 钉盘空间id
		 */
		@ApiField("space_id")
		private Long spaceId;
	
		public String getAuthCode() {
			return this.authCode;
		}
		public void setAuthCode(String authCode) {
			this.authCode = authCode;
		}
		public Long getSpaceId() {
			return this.spaceId;
		}
		public void setSpaceId(Long spaceId) {
			this.spaceId = spaceId;
		}
	}
	


}
