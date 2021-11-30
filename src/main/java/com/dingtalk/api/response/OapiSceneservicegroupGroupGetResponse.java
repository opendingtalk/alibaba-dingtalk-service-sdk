package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.group.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSceneservicegroupGroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3519643296949162658L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private GetGroupResponse result;


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

	public void setResult(GetGroupResponse result) {
		this.result = result;
	}
	public GetGroupResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetGroupResponse extends TaobaoObject {
		private static final long serialVersionUID = 1465495654675778623L;
		/**
		 * 群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 入群二维码
		 */
		@ApiField("group_url")
		private String groupUrl;
		/**
		 * 开放群ID
		 */
		@ApiField("open_conversationid")
		private String openConversationid;
		/**
		 * 开放服务群群组id
		 */
		@ApiField("open_groupsetid")
		private String openGroupsetid;
		/**
		 * 开放服务群团队id
		 */
		@ApiField("open_teamid")
		private String openTeamid;
		/**
		 * 服务群机器人Code
		 */
		@ApiField("robot_code")
		private String robotCode;
		/**
		 * 服务群机器人名称
		 */
		@ApiField("robot_name")
		private String robotName;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public String getGroupUrl() {
			return this.groupUrl;
		}
		public void setGroupUrl(String groupUrl) {
			this.groupUrl = groupUrl;
		}
		public String getOpenConversationid() {
			return this.openConversationid;
		}
		public void setOpenConversationid(String openConversationid) {
			this.openConversationid = openConversationid;
		}
		public String getOpenGroupsetid() {
			return this.openGroupsetid;
		}
		public void setOpenGroupsetid(String openGroupsetid) {
			this.openGroupsetid = openGroupsetid;
		}
		public String getOpenTeamid() {
			return this.openTeamid;
		}
		public void setOpenTeamid(String openTeamid) {
			this.openTeamid = openTeamid;
		}
		public String getRobotCode() {
			return this.robotCode;
		}
		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}
		public String getRobotName() {
			return this.robotName;
		}
		public void setRobotName(String robotName) {
			this.robotName = robotName;
		}
	}
	


}
