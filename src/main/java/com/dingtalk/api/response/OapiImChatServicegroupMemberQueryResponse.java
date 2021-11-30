package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.member.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatServicegroupMemberQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1584135119163736841L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ServiceGroupMemberQueryResponse result;

	/** 
	 * 是否成功
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

	public void setResult(ServiceGroupMemberQueryResponse result) {
		this.result = result;
	}
	public ServiceGroupMemberQueryResponse getResult( ) {
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
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Members extends TaobaoObject {
		private static final long serialVersionUID = 6181753256491969262L;
		/**
		 * 成员的ID
		 */
		@ApiField("dingtalk_id")
		private String dingtalkId;
		/**
		 * 群昵称
		 */
		@ApiField("group_nick_name")
		private String groupNickName;
		/**
		 * 昵称
		 */
		@ApiField("nick_name")
		private String nickName;
		/**
		 * 角色，2-管理员、3-普通成员
		 */
		@ApiField("role")
		private String role;
		/**
		 * 员工Id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDingtalkId() {
			return this.dingtalkId;
		}
		public void setDingtalkId(String dingtalkId) {
			this.dingtalkId = dingtalkId;
		}
		public String getGroupNickName() {
			return this.groupNickName;
		}
		public void setGroupNickName(String groupNickName) {
			this.groupNickName = groupNickName;
		}
		public String getNickName() {
			return this.nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceGroupMemberQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 5897648494499553297L;
		/**
		 * 成员列表
		 */
		@ApiListField("members")
		@ApiField("members")
		private List<Members> members;
		/**
		 * 成员总数
		 */
		@ApiField("total_count")
		private Long totalCount;
	
		public List<Members> getMembers() {
			return this.members;
		}
		public void setMembers(List<Members> members) {
			this.members = members;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}
	


}
