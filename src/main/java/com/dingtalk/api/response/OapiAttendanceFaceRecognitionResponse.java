package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.face.recognition response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceFaceRecognitionResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8258214229297167964L;

	/** 
	 * 错误码，0代表成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * demo
	 */
	@ApiField("result")
	private TopUserInfoVO result;


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

	public void setResult(TopUserInfoVO result) {
		this.result = result;
	}
	public TopUserInfoVO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopUserInfoVO extends TaobaoObject {
		private static final long serialVersionUID = 2771893154525855964L;
		/**
		 * 识别出来的员工userId
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
