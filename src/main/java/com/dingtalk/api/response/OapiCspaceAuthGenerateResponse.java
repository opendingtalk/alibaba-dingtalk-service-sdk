package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.auth.generate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceAuthGenerateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3796546767471828924L;

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
	 * result
	 */
	@ApiField("result")
	private IsvAuthCodeResult result;

	/** 
	 * 请求是否成功
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

	public void setResult(IsvAuthCodeResult result) {
		this.result = result;
	}
	public IsvAuthCodeResult getResult( ) {
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
	public static class IsvAuthCodeResult extends TaobaoObject {
		private static final long serialVersionUID = 7685376642932285514L;
		/**
		 * 授权码有效期，unix时间戳，单位ms
		 */
		@ApiField("expire_time")
		private Date expireTime;
		/**
		 * isv访问授权码
		 */
		@ApiField("isv_code")
		private String isvCode;
	
		public Date getExpireTime() {
			return this.expireTime;
		}
		public void setExpireTime(Date expireTime) {
			this.expireTime = expireTime;
		}
		public String getIsvCode() {
			return this.isvCode;
		}
		public void setIsvCode(String isvCode) {
			this.isvCode = isvCode;
		}
	}
	


}
