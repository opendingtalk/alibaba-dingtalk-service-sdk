package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.getuserinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsGetuserinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4616424655659536329L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * user_info
	 */
	@ApiField("user_info")
	private UserInfo userInfo;


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

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserInfo getUserInfo( ) {
		return this.userInfo;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * user_info
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserInfo extends TaobaoObject {
		private static final long serialVersionUID = 6466841875697941389L;
		/**
		 * 跨组织统一ID
		 */
		@ApiField("associatedUnionId")
		private String associatedUnionId;
		/**
		 * 钉钉Id
		 */
		@ApiField("dingId")
		private String dingId;
		/**
		 * maskedMobile
		 */
		@ApiField("maskedMobile")
		private String maskedMobile;
		/**
		 * 用户在钉钉上面的昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 用户在当前开放应用内的唯一标识
		 */
		@ApiField("openid")
		private String openid;
		/**
		 * 用户在当前开放应用所属的钉钉开放平台账号内的唯一标识
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getAssociatedUnionId() {
			return this.associatedUnionId;
		}
		public void setAssociatedUnionId(String associatedUnionId) {
			this.associatedUnionId = associatedUnionId;
		}
		public String getDingId() {
			return this.dingId;
		}
		public void setDingId(String dingId) {
			this.dingId = dingId;
		}
		public String getMaskedMobile() {
			return this.maskedMobile;
		}
		public void setMaskedMobile(String maskedMobile) {
			this.maskedMobile = maskedMobile;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getOpenid() {
			return this.openid;
		}
		public void setOpenid(String openid) {
			this.openid = openid;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	


}
