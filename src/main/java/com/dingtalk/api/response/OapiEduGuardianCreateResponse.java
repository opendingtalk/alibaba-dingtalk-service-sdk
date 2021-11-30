package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.guardian.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGuardianCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3471539946323141376L;

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
	 * 结果
	 */
	@ApiField("result")
	private OpenEduUserCreateResponse result;

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

	public void setResult(OpenEduUserCreateResponse result) {
		this.result = result;
	}
	public OpenEduUserCreateResponse getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduUserCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 3464397954545844984L;
		/**
		 * 业务id
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
