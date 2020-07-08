package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chatbot.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatbotAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8157213874996479399L;

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
	public static class ChatbotInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 1343254575342218819L;
		/**
		 * 机器人实例userId
		 */
		@ApiField("chatbot_user_id")
		private String chatbotUserId;
		/**
		 * 机器人发消息时的地址
		 */
		@ApiField("webhook")
		private String webhook;
	
		public String getChatbotUserId() {
			return this.chatbotUserId;
		}
		public void setChatbotUserId(String chatbotUserId) {
			this.chatbotUserId = chatbotUserId;
		}
		public String getWebhook() {
			return this.webhook;
		}
		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2437595726838394498L;
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
		@ApiField("result")
		private ChatbotInstanceVo result;
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
		public ChatbotInstanceVo getResult() {
			return this.result;
		}
		public void setResult(ChatbotInstanceVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
