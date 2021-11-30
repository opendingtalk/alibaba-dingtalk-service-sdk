package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.send_to_conversation response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMessageSendToConversationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1321772995393178474L;

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
	 * 如果是群，返回跟发送者同一家企业的一组工号；如果是个人聊天，只返回发送者同一家企业的一个工号；不在同一家企业，发送失败
	 */
	@ApiField("receiver")
	private String receiver;


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

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiver( ) {
		return this.receiver;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
