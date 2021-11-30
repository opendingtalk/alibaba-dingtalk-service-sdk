package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1577979252759593132L;

	/** 
	 * chatid
	 */
	@ApiField("chatid")
	private String chatid;

	/** 
	 * conversationTag
	 */
	@ApiField("conversationTag")
	private Long conversationTag;

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

	/** 
	 * openConversationId
	 */
	@ApiField("openConversationId")
	private String openConversationId;


	public void setChatid(String chatid) {
		this.chatid = chatid;
	}
	public String getChatid( ) {
		return this.chatid;
	}

	public void setConversationTag(Long conversationTag) {
		this.conversationTag = conversationTag;
	}
	public Long getConversationTag( ) {
		return this.conversationTag;
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

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}
	public String getOpenConversationId( ) {
		return this.openConversationId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
