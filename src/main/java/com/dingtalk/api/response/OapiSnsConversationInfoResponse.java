package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.conversation.info response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsConversationInfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1367298969785642326L;

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
	 * 结果数据
	 */
	@ApiField("result")
	private SnsOpenGroupInfoResponse result;

	/** 
	 * 调用结果
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

	public void setResult(SnsOpenGroupInfoResponse result) {
		this.result = result;
	}
	public SnsOpenGroupInfoResponse getResult( ) {
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
	 * 结果数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SnsOpenGroupInfoResponse extends TaobaoObject {
		private static final long serialVersionUID = 3225292562548481117L;
		/**
		 * 群头像
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 会话ID
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 群主id
		 */
		@ApiField("owner_unionid")
		private String ownerUnionid;
		/**
		 * 机器人发消息地址
		 */
		@ApiField("robot_web_hook_url")
		private String robotWebHookUrl;
		/**
		 * 模板id
		 */
		@ApiField("template_id")
		private String templateId;
		/**
		 * 群名称
		 */
		@ApiField("title")
		private String title;
	
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public String getOwnerUnionid() {
			return this.ownerUnionid;
		}
		public void setOwnerUnionid(String ownerUnionid) {
			this.ownerUnionid = ownerUnionid;
		}
		public String getRobotWebHookUrl() {
			return this.robotWebHookUrl;
		}
		public void setRobotWebHookUrl(String robotWebHookUrl) {
			this.robotWebHookUrl = robotWebHookUrl;
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
