package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.face.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduFaceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5739686889731622619L;

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
	private TopQueryFaceIdResponse result;

	/** 
	 * 调用是否成功
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

	public void setResult(TopQueryFaceIdResponse result) {
		this.result = result;
	}
	public TopQueryFaceIdResponse getResult( ) {
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
	public static class TopQueryFaceIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 7714136594976815535L;
		/**
		 * 是否录入过人脸
		 */
		@ApiField("has_record_face")
		private Boolean hasRecordFace;
	
		public Boolean getHasRecordFace() {
			return this.hasRecordFace;
		}
		public void setHasRecordFace(Boolean hasRecordFace) {
			this.hasRecordFace = hasRecordFace;
		}
	}
	


}
