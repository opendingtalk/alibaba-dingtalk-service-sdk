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

import com.dingtalk.api.response.OapiImChatScencegroupMessageQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.message.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.06
 */
public class OapiImChatScencegroupMessageQueryRequest extends BaseTaobaoRequest<OapiImChatScencegroupMessageQueryResponse> {
	
	

	/** 
	* 群标识
	 */
	private String openConversationId;

	/** 
	* 消息标识
	 */
	private String openMsgId;

	/** 
	* 消息发送人的unionId（跟userId二选一）
	 */
	private String senderUnionId;

	/** 
	* 消息发送人的userId（跟unionId二选一）
	 */
	private String senderUserid;

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setOpenMsgId(String openMsgId) {
		this.openMsgId = openMsgId;
	}

	public String getOpenMsgId() {
		return this.openMsgId;
	}

	public void setSenderUnionId(String senderUnionId) {
		this.senderUnionId = senderUnionId;
	}

	public String getSenderUnionId() {
		return this.senderUnionId;
	}

	public void setSenderUserid(String senderUserid) {
		this.senderUserid = senderUserid;
	}

	public String getSenderUserid() {
		return this.senderUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scencegroup.message.query";
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
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("open_msg_id", this.openMsgId);
		txtParams.put("sender_union_id", this.senderUnionId);
		txtParams.put("sender_userid", this.senderUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScencegroupMessageQueryResponse> getResponseClass() {
		return OapiImChatScencegroupMessageQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(openMsgId, "openMsgId");
	}
	

}