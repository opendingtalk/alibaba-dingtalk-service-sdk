package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.opencid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasConversationOpencidGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1548783551884339189L;

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
	@ApiField("open_conversation_id")
	private String openConversationId;


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
