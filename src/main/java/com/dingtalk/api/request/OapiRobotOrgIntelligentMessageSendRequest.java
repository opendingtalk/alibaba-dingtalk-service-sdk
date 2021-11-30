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

import com.dingtalk.api.response.OapiRobotOrgIntelligentMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.org.intelligent.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.28
 */
public class OapiRobotOrgIntelligentMessageSendRequest extends BaseTaobaoRequest<OapiRobotOrgIntelligentMessageSendResponse> {
	
	

	/** 
	* at人的userid列表，英文逗号分隔
	 */
	private String atUserIds;

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
	* 接收者userid列表，英文逗号分隔，不传表示全员接收
	 */
	private String receiverUserIds;

	public void setAtUserIds(String atUserIds) {
		this.atUserIds = atUserIds;
	}

	public String getAtUserIds() {
		return this.atUserIds;
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

	public void setReceiverUserIds(String receiverUserIds) {
		this.receiverUserIds = receiverUserIds;
	}

	public String getReceiverUserIds() {
		return this.receiverUserIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.org.intelligent.message.send";
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
		txtParams.put("at_user_ids", this.atUserIds);
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("msg_param", this.msgParam);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("receiver_user_ids", this.receiverUserIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotOrgIntelligentMessageSendResponse> getResponseClass() {
		return OapiRobotOrgIntelligentMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(atUserIds, 999, "atUserIds");
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(msgParam, "msgParam");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkMaxListSize(receiverUserIds, 999, "receiverUserIds");
	}
	

}