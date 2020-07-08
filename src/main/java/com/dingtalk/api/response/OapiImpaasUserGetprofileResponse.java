package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getprofile response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasUserGetprofileResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4187198921654258889L;

	/** 
	 * 错误码  -1 系统异常 40035 参数错误 400023 用户不存在
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 用户属性
	 */
	@ApiField("result")
	private GetProfileResp result;

	/** 
	 * 接口是否调用成功
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
	 * 用户属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetProfileResp extends TaobaoObject {
		private static final long serialVersionUID = 5221195648978553877L;
		/**
		 * 业务方的唯一id
		 */
		@ApiField("app_userid")
		private String appUserid;
		/**
		 * 头像的mediaid
		 */
		@ApiField("avatar_mediaid")
		private String avatarMediaid;
		/**
		 * 业务方渠道ID
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 附件信息
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * im的唯一id
		 */
		@ApiField("im_openid")
		private String imOpenid;
		/**
		 * 昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 用户状态 1 未激活 2 已激活 3 已注销
		 */
		@ApiField("status")
		private Long status;
	
		public String getAppUserid() {
			return this.appUserid;
		}
		public void setAppUserid(String appUserid) {
			this.appUserid = appUserid;
		}
		public String getAvatarMediaid() {
			return this.avatarMediaid;
		}
		public void setAvatarMediaid(String avatarMediaid) {
			this.avatarMediaid = avatarMediaid;
		}
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
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
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	


}
