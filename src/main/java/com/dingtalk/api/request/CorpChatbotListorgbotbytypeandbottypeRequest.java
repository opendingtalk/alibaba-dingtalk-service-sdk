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

import com.dingtalk.api.response.CorpChatbotListorgbotbytypeandbottypeResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.listorgbotbytypeandbottype request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.18
 */
public class CorpChatbotListorgbotbytypeandbottypeRequest extends BaseTaobaoRequest<CorpChatbotListorgbotbytypeandbottypeResponse> {
	
	

	/** 
	* 2-企业对内机器人，3-企业对外机器人
	 */
	private Long botType;

	/** 
	* 机器人类型(钉钉分配)
	 */
	private String type;

	public void setBotType(Long botType) {
		this.botType = botType;
	}

	public Long getBotType() {
		return this.botType;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.listorgbotbytypeandbottype";
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
		txtParams.put("bot_type", this.botType);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotListorgbotbytypeandbottypeResponse> getResponseClass() {
		return CorpChatbotListorgbotbytypeandbottypeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(botType, "botType");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}