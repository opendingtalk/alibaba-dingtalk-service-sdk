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

import com.dingtalk.api.response.OapiCustomizeConversationUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customize.conversation.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiCustomizeConversationUpdateRequest extends BaseTaobaoRequest<OapiCustomizeConversationUpdateResponse> {
	
	

	/** 
	* 会话id
	 */
	private String chatId;

	/** 
	* extensionKey
	 */
	private String extensionKey;

	/** 
	* extensionValue
	 */
	private String extensionValue;

	/** 
	* 员工账号
	 */
	private String userid;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

	public String getExtensionKey() {
		return this.extensionKey;
	}

	public void setExtensionValue(String extensionValue) {
		this.extensionValue = extensionValue;
	}

	public String getExtensionValue() {
		return this.extensionValue;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customize.conversation.update";
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
		txtParams.put("chat_id", this.chatId);
		txtParams.put("extension_key", this.extensionKey);
		txtParams.put("extension_value", this.extensionValue);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomizeConversationUpdateResponse> getResponseClass() {
		return OapiCustomizeConversationUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatId, "chatId");
		RequestCheckUtils.checkNotEmpty(extensionKey, "extensionKey");
		RequestCheckUtils.checkNotEmpty(extensionValue, "extensionValue");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}