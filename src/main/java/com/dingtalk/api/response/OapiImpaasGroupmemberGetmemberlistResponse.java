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

	private static final long serialVersionUID = 2399371665128265134L;

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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 8631292259718514589L;
		/**
		 * ext
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * id
		 */
		@ApiField("id")
		private String id;
		/**
		 * nick
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * role
		 */
		@ApiField("role")
		private Long role;
		/**
		 * type
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
