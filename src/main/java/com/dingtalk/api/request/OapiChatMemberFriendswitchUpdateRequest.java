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

import com.dingtalk.api.response.OapiChatMemberFriendswitchUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.member.friendswitch.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.15
 */
public class OapiChatMemberFriendswitchUpdateRequest extends BaseTaobaoRequest<OapiChatMemberFriendswitchUpdateResponse> {
	
	

	/** 
	* 会话Id
	 */
	private String chatid;

	/** 
	* true开启禁止开关，false关闭禁止开关
	 */
	private Boolean isProhibit;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setIsProhibit(Boolean isProhibit) {
		this.isProhibit = isProhibit;
	}

	public Boolean getIsProhibit() {
		return this.isProhibit;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.member.friendswitch.update";
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
		txtParams.put("chatid", this.chatid);
		txtParams.put("is_prohibit", this.isProhibit);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatMemberFriendswitchUpdateResponse> getResponseClass() {
		return OapiChatMemberFriendswitchUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(isProhibit, "isProhibit");
	}
	

}