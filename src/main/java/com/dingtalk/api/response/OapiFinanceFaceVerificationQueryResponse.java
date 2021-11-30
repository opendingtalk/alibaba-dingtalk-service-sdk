package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.faceVerification.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceFaceVerificationQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1199518848723583878L;

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
	 * 查询结果
	 */
	@ApiField("result")
	private OpenFaceVerificationQueryResult result;

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

	public void setResult(OpenFaceVerificationQueryResult result) {
		this.result = result;
	}
	public OpenFaceVerificationQueryResult getResult( ) {
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
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFaceVerificationQueryResult extends TaobaoObject {
		private static final long serialVersionUID = 2872695717614998581L;
		/**
		 * 人脸照片，BASE64编码
		 */
		@ApiField("alive_photo")
		private String alivePhoto;
	
		public String getAlivePhoto() {
			return this.alivePhoto;
		}
		public void setAlivePhoto(String alivePhoto) {
			this.alivePhoto = alivePhoto;
		}
	}
	


}
