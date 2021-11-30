package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chatbot.message.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiChatbotMessageSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7296382246137917393L;

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
	 * result
	 */
	@ApiField("result")
	private OtoMessageResponeModel result;

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

	public void setResult(OtoMessageResponeModel result) {
		this.result = result;
	}
	public OtoMessageResponeModel getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OtoMessageResponeModel extends TaobaoObject {
		private static final long serialVersionUID = 3231163116544537815L;
		/**
		 * 加密的消息id
		 */
		@ApiField("message_id")
		private String messageId;
	
		public String getMessageId() {
			return this.messageId;
		}
		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}
	}
	


}
