package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatServicegroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4841653351168418383L;

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
	private ServiceGroupCreateResponse result;

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

	public void setResult(ServiceGroupCreateResponse result) {
		this.result = result;
	}
	public ServiceGroupCreateResponse getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceGroupCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 7599186226178212931L;
		/**
		 * 开放的会话chatId
		 */
		@ApiField("chat_id")
		private String chatId;
		/**
		 * 开放的会话ID
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 群链接
		 */
		@ApiField("url")
		private String url;
	
		public String getChatId() {
			return this.chatId;
		}
		public void setChatId(String chatId) {
			this.chatId = chatId;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
