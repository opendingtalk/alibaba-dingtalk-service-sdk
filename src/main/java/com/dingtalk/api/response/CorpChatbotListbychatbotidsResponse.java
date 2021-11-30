package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.listbychatbotids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpChatbotListbychatbotidsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1521985975125172144L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ChatbotResultVo extends TaobaoObject {
		private static final long serialVersionUID = 4878782871127644844L;
		/**
		 * 0-正常，1-只服务端可管理
		 */
		@ApiField("authority")
		private Long authority;
		/**
		 * 2-企业对内机器人，3-企业对外机器人
		 */
		@ApiField("bot_type")
		private Long botType;
		/**
		 * 机器人简介
		 */
		@ApiField("breif")
		private String breif;
		/**
		 * 机器人chatbotId
		 */
		@ApiField("chatbot_id")
		private String chatbotId;
		/**
		 * 机器人详细介绍
		 */
		@ApiField("description")
		private String description;
		/**
		 * INCOMING = 1,OUTGOING = 2,INOUT = 3
		 */
		@ApiField("function")
		private Long function;
		/**
		 * 机器人头像
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 向群添加机器人时是否可改头像：0-不可必，1-可改
		 */
		@ApiField("icon_mdify")
		private Long iconMdify;
		/**
		 * 手机端是否能添加机器人：0-移动端不能加，1-移动端能添加
		 */
		@ApiField("mobile_switch")
		private Long mobileSwitch;
		/**
		 * 机器人名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 向群添加机器人时是否可改名字：0-不可必，1-可改
		 */
		@ApiField("name_modify")
		private Long nameModify;
		/**
		 * 是否支持单聊：0-不要单聊，1需要单聊
		 */
		@ApiField("oto_support")
		private Long otoSupport;
		/**
		 * 机器人消息回调时在header中添加的token,用于对钉钉鉴权
		 */
		@ApiField("outgoing_token")
		private String outgoingToken;
		/**
		 * 机器人回调地址
		 */
		@ApiField("outgoing_url")
		private String outgoingUrl;
		/**
		 * 机器人预览图
		 */
		@ApiField("preview_media_id")
		private String previewMediaId;
	
		public Long getAuthority() {
			return this.authority;
		}
		public void setAuthority(Long authority) {
			this.authority = authority;
		}
		public Long getBotType() {
			return this.botType;
		}
		public void setBotType(Long botType) {
			this.botType = botType;
		}
		public String getBreif() {
			return this.breif;
		}
		public void setBreif(String breif) {
			this.breif = breif;
		}
		public String getChatbotId() {
			return this.chatbotId;
		}
		public void setChatbotId(String chatbotId) {
			this.chatbotId = chatbotId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getFunction() {
			return this.function;
		}
		public void setFunction(Long function) {
			this.function = function;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getIconMdify() {
			return this.iconMdify;
		}
		public void setIconMdify(Long iconMdify) {
			this.iconMdify = iconMdify;
		}
		public Long getMobileSwitch() {
			return this.mobileSwitch;
		}
		public void setMobileSwitch(Long mobileSwitch) {
			this.mobileSwitch = mobileSwitch;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getNameModify() {
			return this.nameModify;
		}
		public void setNameModify(Long nameModify) {
			this.nameModify = nameModify;
		}
		public Long getOtoSupport() {
			return this.otoSupport;
		}
		public void setOtoSupport(Long otoSupport) {
			this.otoSupport = otoSupport;
		}
		public String getOutgoingToken() {
			return this.outgoingToken;
		}
		public void setOutgoingToken(String outgoingToken) {
			this.outgoingToken = outgoingToken;
		}
		public String getOutgoingUrl() {
			return this.outgoingUrl;
		}
		public void setOutgoingUrl(String outgoingUrl) {
			this.outgoingUrl = outgoingUrl;
		}
		public String getPreviewMediaId() {
			return this.previewMediaId;
		}
		public void setPreviewMediaId(String previewMediaId) {
			this.previewMediaId = previewMediaId;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 8313268152343233276L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiListField("result_list")
		@ApiField("chatbot_result_vo")
		private List<ChatbotResultVo> resultList;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<ChatbotResultVo> getResultList() {
			return this.resultList;
		}
		public void setResultList(List<ChatbotResultVo> resultList) {
			this.resultList = resultList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
