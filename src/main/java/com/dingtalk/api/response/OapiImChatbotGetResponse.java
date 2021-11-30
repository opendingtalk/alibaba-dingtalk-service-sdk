package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chatbot.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatbotGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7183336885125955218L;

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
	 * 开放的机器人实例列表
	 */
	@ApiListField("result")
	@ApiField("chatbot_instance_v_o")
	private List<ChatbotInstanceVO> result;


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

	public void setResult(List<ChatbotInstanceVO> result) {
		this.result = result;
	}
	public List<ChatbotInstanceVO> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 开放的机器人实例列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ChatbotInstanceVO extends TaobaoObject {
		private static final long serialVersionUID = 4894312264358866325L;
		/**
		 * 机器人userId
		 */
		@ApiField("chatbot_user_id")
		private String chatbotUserId;
	
		public String getChatbotUserId() {
			return this.chatbotUserId;
		}
		public void setChatbotUserId(String chatbotUserId) {
			this.chatbotUserId = chatbotUserId;
		}
	}
	


}
