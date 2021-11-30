package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasConversationSendmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.sendmessage request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiImpaasConversationSendmessageRequest extends BaseTaobaoRequest<OapiImpaasConversationSendmessageResponse> {
	
	

	/** 
	* 群id
	 */
	private String chatid;

	/** 
	* 消息内容
	 */
	private String content;

	/** 
	* 1. 优惠券 2 系统消息
	 */
	private Long type;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public void setContentString(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversation.sendmessage";
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
		txtParams.put("content", this.content);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasConversationSendmessageResponse> getResponseClass() {
		return OapiImpaasConversationSendmessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}