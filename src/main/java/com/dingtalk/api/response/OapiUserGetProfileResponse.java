package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get.profile response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetProfileResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6354853535722116547L;

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
	private GetProfileResp result;

	/** 
	 * success
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

	public void setResult(GetProfileResp result) {
		this.result = result;
	}
	public GetProfileResp getResult( ) {
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
	public static class GetProfileResp extends TaobaoObject {
		private static final long serialVersionUID = 4455717559817152558L;
		/**
		 * imOpenId
		 */
		@ApiField("im_openid")
		private String imOpenid;
		/**
		 * nick
		 */
		@ApiField("nick")
		private String nick;
	
		public String getImOpenid() {
			return this.imOpenid;
		}
		public void setImOpenid(String imOpenid) {
			this.imOpenid = imOpenid;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	


}
