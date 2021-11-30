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

import com.dingtalk.api.response.CorpChatbotUpdateorgbotResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.updateorgbot request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpChatbotUpdateorgbotRequest extends BaseTaobaoRequest<CorpChatbotUpdateorgbotResponse> {
	
	

	/** 
	* 创建时返回的机器人Id
	 */
	private Long chatbotId;

	/** 
	* 头像的mediaId
	 */
	private String icon;

	/** 
	* 机器人名字
	 */
	private String name;

	public void setChatbotId(Long chatbotId) {
		this.chatbotId = chatbotId;
	}

	public Long getChatbotId() {
		return this.chatbotId;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.updateorgbot";
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
		txtParams.put("chatbot_id", this.chatbotId);
		txtParams.put("icon", this.icon);
		txtParams.put("name", this.name);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotUpdateorgbotResponse> getResponseClass() {
		return CorpChatbotUpdateorgbotResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotId, "chatbotId");
		RequestCheckUtils.checkNotEmpty(icon, "icon");
		RequestCheckUtils.checkNotEmpty(name, "name");
	}
	

}