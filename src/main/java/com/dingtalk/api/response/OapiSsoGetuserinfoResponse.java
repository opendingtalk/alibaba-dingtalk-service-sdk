package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sso.getuserinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSsoGetuserinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2365157347316962536L;

	/** 
	 * corp_info
	 */
	@ApiField("corp_info")
	private CorpInfo corpInfo;

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
	 * is_sys
	 */
	@ApiField("is_sys")
	private Boolean isSys;

	/** 
	 * user_info
	 */
	@ApiField("user_info")
	private UserInfo userInfo;


	public void setCorpInfo(CorpInfo corpInfo) {
		this.corpInfo = corpInfo;
	}
	public CorpInfo getCorpInfo( ) {
		return this.corpInfo;
	}

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

	public void setIsSys(Boolean isSys) {
		this.isSys = isSys;
	}
	public Boolean getIsSys( ) {
		return this.isSys;
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
		private static final long serialVersionUID = 2336218348162313273L;
		/**
		 * avatar
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * email
		 */
		@ApiField("email")
		private String email;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工在企业内的UserID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * corp_info
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CorpInfo extends TaobaoObject {
		private static final long serialVersionUID = 6182494734119448462L;
		/**
		 * 公司名字
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 公司corpid
		 */
		@ApiField("corpid")
		private String corpid;
	
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
	}
	


}
