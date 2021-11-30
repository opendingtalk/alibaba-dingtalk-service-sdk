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

import com.dingtalk.api.response.OapiRobotIntelligentMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.intelligent.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.09
 */
public class OapiRobotIntelligentMessageSendRequest extends BaseTaobaoRequest<OapiRobotIntelligentMessageSendResponse> {
	
	

	/** 
	* at人的unionId列表
	 */
	private String atUnionIds;

	/** 
	* 申请到的消息模板唯一标识符
	 */
	private String msgKey;

	/** 
	* 消息模板中，变量本次替换的值
	 */
	private String msgParam;

	/** 
	* 开放的群ID
	 */
	private String openConversationId;

	/** 
	* 消息接收者的unionId列表，如果不传则表示群全员可见
	 */
	private String receiverUnionIds;

	public void setAtUnionIds(String atUnionIds) {
		this.atUnionIds = atUnionIds;
	}

	public String getAtUnionIds() {
		return this.atUnionIds;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setMsgParam(String msgParam) {
		this.msgParam = msgParam;
	}

	public String getMsgParam() {
		return this.msgParam;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setReceiverUnionIds(String receiverUnionIds) {
		this.receiverUnionIds = receiverUnionIds;
	}

	public String getReceiverUnionIds() {
		return this.receiverUnionIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.intelligent.message.send";
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
		txtParams.put("at_union_ids", this.atUnionIds);
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("msg_param", this.msgParam);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("receiver_union_ids", this.receiverUnionIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotIntelligentMessageSendResponse> getResponseClass() {
		return OapiRobotIntelligentMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(atUnionIds, 999, "atUnionIds");
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(msgParam, "msgParam");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkMaxListSize(receiverUnionIds, 999, "receiverUnionIds");
	}
	

}