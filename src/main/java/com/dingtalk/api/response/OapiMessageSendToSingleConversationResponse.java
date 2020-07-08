package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.send_to_single_conversation response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMessageSendToSingleConversationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5847698655433472125L;

	/** 
	 * 错误码 0 表示成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 推送消息标识
	 */
	@ApiField("msg_id")
	private String msgId;


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

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
