package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.getuserinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserGetuserinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1164462554442672482L;

	/** 
	 * 错误码, 0代表成功，其它代表失败。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private UserGetByCodeResponse result;


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

	public void setResult(UserGetByCodeResponse result) {
		this.result = result;
	}
	public UserGetByCodeResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserGetByCodeResponse extends TaobaoObject {
		private static final long serialVersionUID = 7884485559251161329L;
		/**
		 * 用户统一id
		 */
		@ApiField("associated_unionid")
		private String associatedUnionid;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 用户名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否为管理员
		 */
		@ApiField("sys")
		private Boolean sys;
		/**
		 * 员工级别。 1：主管理员 2：子管理员 100：老板 0：其他（如普通员工）
		 */
		@ApiField("sys_level")
		private Long sysLevel;
		/**
		 * 用户unionId
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAssociatedUnionid() {
			return this.associatedUnionid;
		}
		public void setAssociatedUnionid(String associatedUnionid) {
			this.associatedUnionid = associatedUnionid;
		}
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getSys() {
			return this.sys;
		}
		public void setSys(Boolean sys) {
			this.sys = sys;
		}
		public Long getSysLevel() {
			return this.sysLevel;
		}
		public void setSysLevel(Long sysLevel) {
			this.sysLevel = sysLevel;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
