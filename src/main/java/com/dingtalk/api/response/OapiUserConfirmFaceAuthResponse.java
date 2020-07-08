package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.confirm_face_auth response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserConfirmFaceAuthResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5548879557578624356L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 实名认证的结果
	 */
	@ApiField("result")
	private FaceAuthResult result;


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

	public void setResult(FaceAuthResult result) {
		this.result = result;
	}
	public FaceAuthResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 实名认证的结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FaceAuthResult extends TaobaoObject {
		private static final long serialVersionUID = 2685352738243825744L;
		/**
		 * 身份证号码
		 */
		@ApiField("IDCardNo")
		private String iDCardNo;
		/**
		 * 用户输入的姓名
		 */
		@ApiField("name")
		private String name;
	
		public String getiDCardNo() {
			return this.iDCardNo;
		}
		public void setiDCardNo(String iDCardNo) {
			this.iDCardNo = iDCardNo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
