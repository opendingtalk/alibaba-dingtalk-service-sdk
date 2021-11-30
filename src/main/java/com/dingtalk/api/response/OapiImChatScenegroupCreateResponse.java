package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScenegroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6755161332337768859L;

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
	private OpenSceneGroupCreateResponse result;

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

	public void setResult(OpenSceneGroupCreateResponse result) {
		this.result = result;
	}
	public OpenSceneGroupCreateResponse getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenSceneGroupCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 7456837125428775117L;
		/**
		 * 会话id
		 */
		@ApiField("chat_id")
		private String chatId;
		/**
		 * 开放群id
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
	
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
	}
	


}
