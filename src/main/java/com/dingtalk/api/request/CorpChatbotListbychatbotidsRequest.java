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

import com.dingtalk.api.response.CorpChatbotListbychatbotidsResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.listbychatbotids request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.18
 */
public class CorpChatbotListbychatbotidsRequest extends BaseTaobaoRequest<CorpChatbotListbychatbotidsResponse> {
	
	

	/** 
	* chatbotId列表
	 */
	private String chatbotIds;

	public void setChatbotIds(String chatbotIds) {
		this.chatbotIds = chatbotIds;
	}

	public String getChatbotIds() {
		return this.chatbotIds;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.listbychatbotids";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("chatbot_ids", this.chatbotIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotListbychatbotidsResponse> getResponseClass() {
		return CorpChatbotListbychatbotidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotIds, "chatbotIds");
		RequestCheckUtils.checkMaxListSize(chatbotIds, 20, "chatbotIds");
	}
	

}