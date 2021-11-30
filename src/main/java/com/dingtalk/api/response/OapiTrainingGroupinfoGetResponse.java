package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.training.groupinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiTrainingGroupinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6887333378967976642L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回群信息
	 */
	@ApiField("result")
	private GroupInfo result;


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

	public void setResult(GroupInfo result) {
		this.result = result;
	}
	public GroupInfo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 群信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupInfo extends TaobaoObject {
		private static final long serialVersionUID = 6773296937713799384L;
		/**
		 * 群id
		 */
		@ApiField("conversation_id")
		private String conversationId;
		/**
		 * 群创建时间
		 */
		@ApiField("create_at")
		private Long createAt;
		/**
		 * 群头像
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 邀请链接
		 */
		@ApiField("invite_url")
		private String inviteUrl;
		/**
		 * 群成员数
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 群状态：1、available（可用），2、dismiss(解散），3、full（已满）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 群名称
		 */
		@ApiField("title")
		private String title;
	
		public String getConversationId() {
			return this.conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public Long getCreateAt() {
			return this.createAt;
		}
		public void setCreateAt(Long createAt) {
			this.createAt = createAt;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public String getInviteUrl() {
			return this.inviteUrl;
		}
		public void setInviteUrl(String inviteUrl) {
			this.inviteUrl = inviteUrl;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
