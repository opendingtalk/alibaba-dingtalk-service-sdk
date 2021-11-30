package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4655963523131396294L;

	/** 
	 * chat_info
	 */
	@ApiField("chat_info")
	private ChatInfo chatInfo;

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


	public void setChatInfo(ChatInfo chatInfo) {
		this.chatInfo = chatInfo;
	}
	public ChatInfo getChatInfo( ) {
		return this.chatInfo;
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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * chat_info
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ChatInfo extends TaobaoObject {
		private static final long serialVersionUID = 7539245319615212394L;
		/**
		 * agentidlist
		 */
		@ApiListField("agentidlist")
		@ApiField("string")
		private List<String> agentidlist;
		/**
		 * 是否全员禁用 0 不禁言 1 全员禁言
		 */
		@ApiField("chatBannedType")
		private Long chatBannedType;
		/**
		 * conversationTag
		 */
		@ApiField("conversationTag")
		private Long conversationTag;
		/**
		 * extidlist
		 */
		@ApiListField("extidlist")
		@ApiField("string")
		private List<String> extidlist;
		/**
		 * 群头像mediaId
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 仅群主和群管理员可管理 0否 1 是
		 */
		@ApiField("managementType")
		private Long managementType;
		/**
		 * 尽群主和管理员可@所有人 0 否 1 是
		 */
		@ApiField("mentionAllAuthority")
		private Long mentionAllAuthority;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * owner
		 */
		@ApiField("owner")
		private String owner;
		/**
		 * 是否可以搜索群名 0 不可以 1可以搜索
		 */
		@ApiField("searchable")
		private Long searchable;
		/**
		 * 新成员可查看聊天历史 0否 1是
		 */
		@ApiField("showHistoryType")
		private Long showHistoryType;
		/**
		 * 群状态 1-正常 2-已解散
		 */
		@ApiField("status")
		private Long status;
		/**
		 * useridlist
		 */
		@ApiListField("useridlist")
		@ApiField("string")
		private List<String> useridlist;
		/**
		 * 入群需群主或群管理员同意 0不需要 1需要
		 */
		@ApiField("validationType")
		private Long validationType;
	
		public List<String> getAgentidlist() {
			return this.agentidlist;
		}
		public void setAgentidlist(List<String> agentidlist) {
			this.agentidlist = agentidlist;
		}
		public Long getChatBannedType() {
			return this.chatBannedType;
		}
		public void setChatBannedType(Long chatBannedType) {
			this.chatBannedType = chatBannedType;
		}
		public Long getConversationTag() {
			return this.conversationTag;
		}
		public void setConversationTag(Long conversationTag) {
			this.conversationTag = conversationTag;
		}
		public List<String> getExtidlist() {
			return this.extidlist;
		}
		public void setExtidlist(List<String> extidlist) {
			this.extidlist = extidlist;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getManagementType() {
			return this.managementType;
		}
		public void setManagementType(Long managementType) {
			this.managementType = managementType;
		}
		public Long getMentionAllAuthority() {
			return this.mentionAllAuthority;
		}
		public void setMentionAllAuthority(Long mentionAllAuthority) {
			this.mentionAllAuthority = mentionAllAuthority;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwner() {
			return this.owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public Long getSearchable() {
			return this.searchable;
		}
		public void setSearchable(Long searchable) {
			this.searchable = searchable;
		}
		public Long getShowHistoryType() {
			return this.showHistoryType;
		}
		public void setShowHistoryType(Long showHistoryType) {
			this.showHistoryType = showHistoryType;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public List<String> getUseridlist() {
			return this.useridlist;
		}
		public void setUseridlist(List<String> useridlist) {
			this.useridlist = useridlist;
		}
		public Long getValidationType() {
			return this.validationType;
		}
		public void setValidationType(Long validationType) {
			this.validationType = validationType;
		}
	}
	


}
