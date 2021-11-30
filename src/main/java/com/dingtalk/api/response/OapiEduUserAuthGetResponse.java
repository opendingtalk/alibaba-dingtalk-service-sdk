package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.auth.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduUserAuthGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1314322473121259361L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 业务返回结果
	 */
	@ApiField("result")
	private UserGetRequest result;


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

	public void setResult(UserGetRequest result) {
		this.result = result;
	}
	public UserGetRequest getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 业务返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserGetRequest extends TaobaoObject {
		private static final long serialVersionUID = 8618872486718171152L;
		/**
		 * 是否实名认证
		 */
		@ApiField("real_authed")
		private Boolean realAuthed;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Boolean getRealAuthed() {
			return this.realAuthed;
		}
		public void setRealAuthed(Boolean realAuthed) {
			this.realAuthed = realAuthed;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
