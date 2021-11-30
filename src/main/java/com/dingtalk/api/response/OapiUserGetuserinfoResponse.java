package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getuserinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetuserinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8838464465622141252L;

	/** 
	 * deviceId
	 */
	@ApiField("deviceId")
	private String deviceId;

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
	 * sys_level
	 */
	@ApiField("sys_level")
	private String sysLevel;

	/** 
	 * userid
	 */
	@ApiField("userid")
	private String userid;


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
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

	public void setSysLevel(String sysLevel) {
		this.sysLevel = sysLevel;
	}
	public String getSysLevel( ) {
		return this.sysLevel;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
