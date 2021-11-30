package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.userAuthInfo.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceUserAuthInfoQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6671716293369744623L;

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
	 * 认证信息
	 */
	@ApiField("result")
	private OpenCustomerAuthInfo result;

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

	public void setResult(OpenCustomerAuthInfo result) {
		this.result = result;
	}
	public OpenCustomerAuthInfo getResult( ) {
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
	 * 认证信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCustomerAuthInfo extends TaobaoObject {
		private static final long serialVersionUID = 1593751796355495916L;
		/**
		 * 姓名
		 */
		@ApiField("cert_name")
		private String certName;
		/**
		 * 身份证号
		 */
		@ApiField("id_card_no")
		private String idCardNo;
		/**
		 * 钉钉指数分
		 */
		@ApiField("scores")
		private String scores;
		/**
		 * 手机号
		 */
		@ApiField("user_mobile")
		private String userMobile;
	
		public String getCertName() {
			return this.certName;
		}
		public void setCertName(String certName) {
			this.certName = certName;
		}
		public String getIdCardNo() {
			return this.idCardNo;
		}
		public void setIdCardNo(String idCardNo) {
			this.idCardNo = idCardNo;
		}
		public String getScores() {
			return this.scores;
		}
		public void setScores(String scores) {
			this.scores = scores;
		}
		public String getUserMobile() {
			return this.userMobile;
		}
		public void setUserMobile(String userMobile) {
			this.userMobile = userMobile;
		}
	}
	


}
