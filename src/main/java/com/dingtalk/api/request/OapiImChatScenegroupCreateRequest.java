package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImChatScenegroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.07
 */
public class OapiImChatScenegroupCreateRequest extends BaseTaobaoRequest<OapiImChatScenegroupCreateResponse> {
	
	

	/** 
	* 禁止群成员私聊 若开启，普通群成员之间不能够加好友、单聊，且部分功能使用受限（管理员与非管理员之间不受影响）0-不开启，1-开启
	 */
	private Long addFriendForbidden;

	/** 
	* 群日历 若开启，群内容非好友同事的成员可相互发起钉钉日程 0-不开启，1-开启
	 */
	private Long allMembersCanCreateCalendar;

	/** 
	* 群会议 若开启，群内任意成员可发起视频和语音会议 0-不开启，1-开启
	 */
	private Long allMembersCanCreateMcsConf;

	/** 
	* 群禁言，0-默认，不禁言，1-全员禁言
	 */
	private Long chatBannedType;

	/** 
	* 禁止发送群邮件 若开启，群内成员不可再对本群发送群邮件 0-不开启，1-开启
	 */
	private Long groupEmailDisabled;

	/** 
	* 群直播 若开启，群内任意成员可发起群直播 0-不开启，1-开启
	 */
	private Long groupLiveSwitch;

	/** 
	* 群头像mediaId
	 */
	private String icon;

	/** 
	* 管理类型，0-默认，所有人可管理，1-仅群主可管理
	 */
	private Long managementType;

	/** 
	* 禁止非管理员向管理员发起单聊 若开启，非管理员不能向管理员发起单聊 0-不开启，1-开启
	 */
	private Long membersToAdminChat;

	/** 
	* @all 权限，0-默认，所有人，1-仅群主可@all
	 */
	private Long mentionAllAuthority;

	/** 
	* 仅群主和管理员可在群内发DING  0-不开启，1-开启
	 */
	private Long onlyAdminCanDing;

	/** 
	* 仅群主和管理员可置顶群消息 0-不开启，1-开启
	 */
	private Long onlyAdminCanSetMsgTop;

	/** 
	* 群主userid
	 */
	private String ownerUserId;

	/** 
	* 群可搜索，0-默认，不可搜索，1-可搜索
	 */
	private Long searchable;

	/** 
	* 新成员是否可查看聊天历史消息，0-默认，否，1-是
	 */
	private Long showHistoryType;

	/** 
	* 群管理员useridlist
	 */
	private String subadminIds;

	/** 
	* 群模板id
	 */
	private String templateId;

	/** 
	* 群名称
	 */
	private String title;

	/** 
	* 群成员useridlist
	 */
	private String userIds;

	/** 
	* 建群去重的业务id
	 */
	private String uuid;

	/** 
	* 入群验证，0：不入群验证（默认） 1：入群验证
	 */
	private Long validationType;

	public void setAddFriendForbidden(Long addFriendForbidden) {
		this.addFriendForbidden = addFriendForbidden;
	}

	public Long getAddFriendForbidden() {
		return this.addFriendForbidden;
	}

	public void setAllMembersCanCreateCalendar(Long allMembersCanCreateCalendar) {
		this.allMembersCanCreateCalendar = allMembersCanCreateCalendar;
	}

	public Long getAllMembersCanCreateCalendar() {
		return this.allMembersCanCreateCalendar;
	}

	public void setAllMembersCanCreateMcsConf(Long allMembersCanCreateMcsConf) {
		this.allMembersCanCreateMcsConf = allMembersCanCreateMcsConf;
	}

	public Long getAllMembersCanCreateMcsConf() {
		return this.allMembersCanCreateMcsConf;
	}

	public void setChatBannedType(Long chatBannedType) {
		this.chatBannedType = chatBannedType;
	}

	public Long getChatBannedType() {
		return this.chatBannedType;
	}

	public void setGroupEmailDisabled(Long groupEmailDisabled) {
		this.groupEmailDisabled = groupEmailDisabled;
	}

	public Long getGroupEmailDisabled() {
		return this.groupEmailDisabled;
	}

	public void setGroupLiveSwitch(Long groupLiveSwitch) {
		this.groupLiveSwitch = groupLiveSwitch;
	}

	public Long getGroupLiveSwitch() {
		return this.groupLiveSwitch;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setManagementType(Long managementType) {
		this.managementType = managementType;
	}

	public Long getManagementType() {
		return this.managementType;
	}

	public void setMembersToAdminChat(Long membersToAdminChat) {
		this.membersToAdminChat = membersToAdminChat;
	}

	public Long getMembersToAdminChat() {
		return this.membersToAdminChat;
	}

	public void setMentionAllAuthority(Long mentionAllAuthority) {
		this.mentionAllAuthority = mentionAllAuthority;
	}

	public Long getMentionAllAuthority() {
		return this.mentionAllAuthority;
	}

	public void setOnlyAdminCanDing(Long onlyAdminCanDing) {
		this.onlyAdminCanDing = onlyAdminCanDing;
	}

	public Long getOnlyAdminCanDing() {
		return this.onlyAdminCanDing;
	}

	public void setOnlyAdminCanSetMsgTop(Long onlyAdminCanSetMsgTop) {
		this.onlyAdminCanSetMsgTop = onlyAdminCanSetMsgTop;
	}

	public Long getOnlyAdminCanSetMsgTop() {
		return this.onlyAdminCanSetMsgTop;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setSearchable(Long searchable) {
		this.searchable = searchable;
	}

	public Long getSearchable() {
		return this.searchable;
	}

	public void setShowHistoryType(Long showHistoryType) {
		this.showHistoryType = showHistoryType;
	}

	public Long getShowHistoryType() {
		return this.showHistoryType;
	}

	public void setSubadminIds(String subadminIds) {
		this.subadminIds = subadminIds;
	}

	public String getSubadminIds() {
		return this.subadminIds;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setValidationType(Long validationType) {
		this.validationType = validationType;
	}

	public Long getValidationType() {
		return this.validationType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scenegroup.create";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("add_friend_forbidden", this.addFriendForbidden);
		txtParams.put("all_members_can_create_calendar", this.allMembersCanCreateCalendar);
		txtParams.put("all_members_can_create_mcs_conf", this.allMembersCanCreateMcsConf);
		txtParams.put("chat_banned_type", this.chatBannedType);
		txtParams.put("group_email_disabled", this.groupEmailDisabled);
		txtParams.put("group_live_switch", this.groupLiveSwitch);
		txtParams.put("icon", this.icon);
		txtParams.put("management_type", this.managementType);
		txtParams.put("members_to_admin_chat", this.membersToAdminChat);
		txtParams.put("mention_all_authority", this.mentionAllAuthority);
		txtParams.put("only_admin_can_ding", this.onlyAdminCanDing);
		txtParams.put("only_admin_can_set_msg_top", this.onlyAdminCanSetMsgTop);
		txtParams.put("owner_user_id", this.ownerUserId);
		txtParams.put("searchable", this.searchable);
		txtParams.put("show_history_type", this.showHistoryType);
		txtParams.put("subadmin_ids", this.subadminIds);
		txtParams.put("template_id", this.templateId);
		txtParams.put("title", this.title);
		txtParams.put("user_ids", this.userIds);
		txtParams.put("uuid", this.uuid);
		txtParams.put("validation_type", this.validationType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScenegroupCreateResponse> getResponseClass() {
		return OapiImChatScenegroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(ownerUserId, "ownerUserId");
		RequestCheckUtils.checkMaxListSize(subadminIds, 999, "subadminIds");
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxListSize(userIds, 999, "userIds");
	}
	

}