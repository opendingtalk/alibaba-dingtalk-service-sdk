package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.certify.queryUserCertifyInfoOpen response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCertifyQueryUserCertifyInfoOpenResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6464166913344986565L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private YunQi2018CertifyVO result;


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

	public void setResult(YunQi2018CertifyVO result) {
		this.result = result;
	}
	public YunQi2018CertifyVO getResult( ) {
		return this.result;
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
	public static class YunQi2018CertifyVO extends TaobaoObject {
		private static final long serialVersionUID = 8513881571623963663L;
		/**
		 * 实名时的脸图
		 */
		@ApiField("certify_face_image")
		private String certifyFaceImage;
		/**
		 * 是否已实名
		 */
		@ApiField("has_certify")
		private Boolean hasCertify;
		/**
		 * 是否需要补录脸
		 */
		@ApiField("need_enter_face")
		private Boolean needEnterFace;
	
		public String getCertifyFaceImage() {
			return this.certifyFaceImage;
		}
		public void setCertifyFaceImage(String certifyFaceImage) {
			this.certifyFaceImage = certifyFaceImage;
		}
		public Boolean getHasCertify() {
			return this.hasCertify;
		}
		public void setHasCertify(Boolean hasCertify) {
			this.hasCertify = hasCertify;
		}
		public Boolean getNeedEnterFace() {
			return this.needEnterFace;
		}
		public void setNeedEnterFace(Boolean needEnterFace) {
			this.needEnterFace = needEnterFace;
		}
	}
	


}
