package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.listorgbotbytypeandbottype response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpChatbotListorgbotbytypeandbottypeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8458826671544328164L;

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
	public static class ChatbotModel extends TaobaoObject {
		private static final long serialVersionUID = 5861851247826555294L;
		/**
		 * 机器人类型
		 */
		@ApiField("bot_type")
		private Long botType;
		/**
		 * 机器人简介
		 */
		@ApiField("breif")
		private String breif;
		/**
		 * 机器人id
		 */
		@ApiField("chatbot_id")
		private Long chatbotId;
		/**
		 * 企业corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 机器人详细描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 机器人头像
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * microappAgentId
		 */
		@ApiField("microapp_agent_id")
		private Long microappAgentId;
		/**
		 * 机器人名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * outgoingToken
		 */
		@ApiField("outgoing_token")
		private String outgoingToken;
		/**
		 * outgoingURL
		 */
		@ApiField("outgoing_url")
		private String outgoingUrl;
		/**
		 * 钉钉分配的type
		 */
		@ApiField("type")
		private String type;
	
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
		public Long getChatbotId() {
			return this.chatbotId;
		}
		public void setChatbotId(Long chatbotId) {
			this.chatbotId = chatbotId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getMicroappAgentId() {
			return this.microappAgentId;
		}
		public void setMicroappAgentId(Long microappAgentId) {
			this.microappAgentId = microappAgentId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
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
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 1885377991215792191L;
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
		@ApiField("chatbot_model")
		private List<ChatbotModel> resultList;
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
		public List<ChatbotModel> getResultList() {
			return this.resultList;
		}
		public void setResultList(List<ChatbotModel> resultList) {
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
