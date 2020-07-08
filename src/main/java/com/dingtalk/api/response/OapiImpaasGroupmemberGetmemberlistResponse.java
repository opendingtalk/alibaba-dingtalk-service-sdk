package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.getmemberlist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasGroupmemberGetmemberlistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3539249152159817888L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 群成员列表
	 */
	@ApiListField("member_list")
	@ApiField("group_member_info")
	private List<GroupMemberInfo> memberList;


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

	public void setMemberList(List<GroupMemberInfo> memberList) {
		this.memberList = memberList;
	}
	public List<GroupMemberInfo> getMemberList( ) {
		return this.memberList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 群成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 5312748814569288441L;
		/**
		 * 群成员扩展字段，业务自定义
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 群成员账号ID，类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * 群成员昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 群成员角色
		 */
		@ApiField("role")
		private Long role;
		/**
		 * 账号ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
		 */
		@ApiField("type")
		private String type;
	
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
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
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	


}
