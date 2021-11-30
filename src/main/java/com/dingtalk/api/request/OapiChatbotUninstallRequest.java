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

import com.dingtalk.api.response.OapiChatbotUninstallResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chatbot.uninstall request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.25
 */
public class OapiChatbotUninstallRequest extends BaseTaobaoRequest<OapiChatbotUninstallResponse> {
	
	

	/** 
	* 机器人id(钉钉分配)
	 */
	private String chatbotId;

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chatbot.uninstall";
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
		txtParams.put("chatbot_id", this.chatbotId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatbotUninstallResponse> getResponseClass() {
		return OapiChatbotUninstallResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotId, "chatbotId");
	}
	

}