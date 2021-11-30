package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mcs.conference.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMcsConferenceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7317814541568558318L;

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
	 * 会议信息详情
	 */
	@ApiField("result")
	private MoziConfInfoModel result;


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

	public void setResult(MoziConfInfoModel result) {
		this.result = result;
	}
	public MoziConfInfoModel getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 用户信息详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Userlist extends TaobaoObject {
		private static final long serialVersionUID = 6817265487799661418L;
		/**
		 * 用户主状态
		 */
		@ApiField("attend_status")
		private Long attendStatus;
		/**
		 * 入会时间
		 */
		@ApiField("join_time")
		private Long joinTime;
		/**
		 * 用户昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 用户角色
		 */
		@ApiField("role")
		private Long role;
		/**
		 * 用户子状态
		 */
		@ApiField("sub_status")
		private Long subStatus;
		/**
		 * 用户来源
		 */
		@ApiField("uid_domain")
		private String uidDomain;
	
		public Long getAttendStatus() {
			return this.attendStatus;
		}
		public void setAttendStatus(Long attendStatus) {
			this.attendStatus = attendStatus;
		}
		public Long getJoinTime() {
			return this.joinTime;
		}
		public void setJoinTime(Long joinTime) {
			this.joinTime = joinTime;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Long getRole() {
			return this.role;
		}
		public void setRole(Long role) {
			this.role = role;
		}
		public Long getSubStatus() {
			return this.subStatus;
		}
		public void setSubStatus(Long subStatus) {
			this.subStatus = subStatus;
		}
		public String getUidDomain() {
			return this.uidDomain;
		}
		public void setUidDomain(String uidDomain) {
			this.uidDomain = uidDomain;
		}
	}
	
	/**
	 * 会议信息详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MoziConfInfoModel extends TaobaoObject {
		private static final long serialVersionUID = 1876825557612339929L;
		/**
		 * 会议开始时间
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 会议标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 用户信息详情
		 */
		@ApiListField("user_list")
		@ApiField("userlist")
		private List<Userlist> userList;
	
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<Userlist> getUserList() {
			return this.userList;
		}
		public void setUserList(List<Userlist> userList) {
			this.userList = userList;
		}
	}
	


}
