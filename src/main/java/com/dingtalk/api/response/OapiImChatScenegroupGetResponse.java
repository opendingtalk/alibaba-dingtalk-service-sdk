package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScenegroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8189853516687975875L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private DecorationGroupQueryResponse result;

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

	public void setResult(DecorationGroupQueryResponse result) {
		this.result = result;
	}
	public DecorationGroupQueryResponse getResult( ) {
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
	 * 群配置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ManagementOptions extends TaobaoObject {
		private static final long serialVersionUID = 4792315816486922429L;
		/**
		 * 群禁言，0-默认，不禁言，1-全员禁言
		 */
		@ApiField("chat_banned_type")
		private String chatBannedType;
		/**
		 * 管理类型，0-默认，所有人可管理，1-仅群主可管理
		 */
		@ApiField("management_type")
		private String managementType;
		/**
		 * @all 权限，0-默认，所有人，1-仅群主可@all
		 */
		@ApiField("mention_all_authority")
		private String mentionAllAuthority;
		/**
		 * 群可搜索，0-默认，不可搜索，1-可搜索
		 */
		@ApiField("searchable")
		private String searchable;
		/**
		 * 新成员是否可查看聊天历史消息，0-默认，否，1-是
		 */
		@ApiField("show_history_type")
		private String showHistoryType;
		/**
		 * 入群验证，0：不入群验证（默认） 1：入群验证
		 */
		@ApiField("validation_type")
		private String validationType;
	
		public String getChatBannedType() {
			return this.chatBannedType;
		}
		public void setChatBannedType(String chatBannedType) {
			this.chatBannedType = chatBannedType;
		}
		public String getManagementType() {
			return this.managementType;
		}
		public void setManagementType(String managementType) {
			this.managementType = managementType;
		}
		public String getMentionAllAuthority() {
			return this.mentionAllAuthority;
		}
		public void setMentionAllAuthority(String mentionAllAuthority) {
			this.mentionAllAuthority = mentionAllAuthority;
		}
		public String getSearchable() {
			return this.searchable;
		}
		public void setSearchable(String searchable) {
			this.searchable = searchable;
		}
		public String getShowHistoryType() {
			return this.showHistoryType;
		}
		public void setShowHistoryType(String showHistoryType) {
			this.showHistoryType = showHistoryType;
		}
		public String getValidationType() {
			return this.validationType;
		}
		public void setValidationType(String validationType) {
			this.validationType = validationType;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DecorationGroupQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 3649361781711393243L;
		/**
		 * 入群链接（需特殊申请才返回）
		 */
		@ApiField("group_url")
		private String groupUrl;
		/**
		 * 群头像
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 群配置
		 */
		@ApiField("management_options")
		private ManagementOptions managementOptions;
		/**
		 * 群成员数量
		 */
		@ApiField("member_amount")
		private Long memberAmount;
		/**
		 * 群id
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 群主id
		 */
		@ApiField("owner_staff_id")
		private String ownerStaffId;
		/**
		 * 场景化数据，在特定场景群有数据
		 */
		@ApiField("scene_data")
		private String sceneData;
		/**
		 * 群管理id
		 */
		@ApiListField("sub_admin_staff_ids")
		@ApiField("string")
		private List<String> subAdminStaffIds;
		/**
		 * 模板id
		 */
		@ApiField("template_id")
		private String templateId;
		/**
		 * 群标题
		 */
		@ApiField("title")
		private String title;
	
		public String getGroupUrl() {
			return this.groupUrl;
		}
		public void setGroupUrl(String groupUrl) {
			this.groupUrl = groupUrl;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public ManagementOptions getManagementOptions() {
			return this.managementOptions;
		}
		public void setManagementOptions(ManagementOptions managementOptions) {
			this.managementOptions = managementOptions;
		}
		public Long getMemberAmount() {
			return this.memberAmount;
		}
		public void setMemberAmount(Long memberAmount) {
			this.memberAmount = memberAmount;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public String getOwnerStaffId() {
			return this.ownerStaffId;
		}
		public void setOwnerStaffId(String ownerStaffId) {
			this.ownerStaffId = ownerStaffId;
		}
		public String getSceneData() {
			return this.sceneData;
		}
		public void setSceneData(String sceneData) {
			this.sceneData = sceneData;
		}
		public List<String> getSubAdminStaffIds() {
			return this.subAdminStaffIds;
		}
		public void setSubAdminStaffIds(List<String> subAdminStaffIds) {
			this.subAdminStaffIds = subAdminStaffIds;
		}
		public String getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
