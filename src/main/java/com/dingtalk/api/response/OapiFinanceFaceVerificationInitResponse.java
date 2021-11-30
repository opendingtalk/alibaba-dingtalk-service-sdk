package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.faceVerification.init response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceFaceVerificationInitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3518838742389222839L;

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
	private OpenFaceVerificationInitResult result;

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

	public void setResult(OpenFaceVerificationInitResult result) {
		this.result = result;
	}
	public OpenFaceVerificationInitResult getResult( ) {
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
	public static class OpenFaceVerificationInitResult extends TaobaoObject {
		private static final long serialVersionUID = 5217676447817245233L;
		/**
		 * 人脸识别业务编码
		 */
		@ApiField("business_id")
		private String businessId;
		/**
		 * 人脸识别请求编码
		 */
		@ApiField("request_code")
		private String requestCode;
	
		public String getBusinessId() {
			return this.businessId;
		}
		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}
		public String getRequestCode() {
			return this.requestCode;
		}
		public void setRequestCode(String requestCode) {
			this.requestCode = requestCode;
		}
	}
	


}
