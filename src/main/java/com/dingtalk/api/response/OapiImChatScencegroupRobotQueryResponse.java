package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.robot.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScencegroupRobotQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6593443789327544953L;

	/** 
	 * 统一错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 机器人
	 */
	@ApiField("robot")
	private OpenRobotQueryResponse robot;

	/** 
	 * 成功
	 */
	@ApiField("succ")
	private Boolean succ;


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

	public void setRobot(OpenRobotQueryResponse robot) {
		this.robot = robot;
	}
	public OpenRobotQueryResponse getRobot( ) {
		return this.robot;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 机器人
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRobotQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 5517583733885121474L;
		/**
		 * unionId（仅当userId无值时返回）
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
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
