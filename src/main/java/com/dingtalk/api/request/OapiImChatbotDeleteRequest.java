package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImChatbotDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chatbot.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImChatbotDeleteRequest extends BaseTaobaoRequest<OapiImChatbotDeleteResponse> {
	
	

	/** 
	* 开放的机器人userId
	 */
	private String chatbotUserId;

	/** 
	* 开放的会话conversationId
	 */
	private String openConversationId;

	public void setChatbotUserId(String chatbotUserId) {
		this.chatbotUserId = chatbotUserId;
	}

	public String getChatbotUserId() {
		return this.chatbotUserId;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chatbot.delete";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chatbot_user_id", this.chatbotUserId);
		txtParams.put("open_conversation_id", this.openConversationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatbotDeleteResponse> getResponseClass() {
		return OapiImChatbotDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotUserId, "chatbotUserId");
		RequestCheckUtils.checkMaxLength(chatbotUserId, 128, "chatbotUserId");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkMaxLength(openConversationId, 128, "openConversationId");
	}
	

}