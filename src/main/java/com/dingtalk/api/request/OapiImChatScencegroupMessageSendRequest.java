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

import com.dingtalk.api.response.OapiImChatScencegroupMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.21
 */
public class OapiImChatScencegroupMessageSendRequest extends BaseTaobaoRequest<OapiImChatScencegroupMessageSendResponse> {
	
	

	/** 
	* @人的手机号列表
	 */
	private String atMobiles;

	/** 
	* 是否@所有人
	 */
	private Boolean isAtAll;

	/** 
	* 消息模板内容替换参数-多媒体类型
	 */
	private String msgMediaIdParamMap;

	/** 
	* 消息模板内容替换参数-普通文本类型
	 */
	private String msgParamMap;

	/** 
	* 模板ID
	 */
	private String msgTemplateId;

	/** 
	* 消息接收人手机号列表（不设置任何接收人则全部可见）
	 */
	private String receiverMobiles;

	/** 
	* 消息接收人 unionId 列表（不设置任何接收人则全部可见）
	 */
	private String receiverUnionIds;

	/** 
	* 消息接收人 userId 列表 （不设置任何接收人则全部可见）
	 */
	private String receiverUserIds;

	/** 
	* 用于发送卡片的机器人编码，与场景群模板中的机器人编码保持一致
	 */
	private String robotCode;

	/** 
	* 接收消息的群的openConversationId
	 */
	private String targetOpenConversationId;

	public void setAtMobiles(String atMobiles) {
		this.atMobiles = atMobiles;
	}

	public String getAtMobiles() {
		return this.atMobiles;
	}

	public void setIsAtAll(Boolean isAtAll) {
		this.isAtAll = isAtAll;
	}

	public Boolean getIsAtAll() {
		return this.isAtAll;
	}

	public void setMsgMediaIdParamMap(String msgMediaIdParamMap) {
		this.msgMediaIdParamMap = msgMediaIdParamMap;
	}
	public void setMsgMediaIdParamMapString(String msgMediaIdParamMap) {
		this.msgMediaIdParamMap = msgMediaIdParamMap;
	}

	public String getMsgMediaIdParamMap() {
		return this.msgMediaIdParamMap;
	}

	public void setMsgParamMap(String msgParamMap) {
		this.msgParamMap = msgParamMap;
	}
	public void setMsgParamMapString(String msgParamMap) {
		this.msgParamMap = msgParamMap;
	}

	public String getMsgParamMap() {
		return this.msgParamMap;
	}

	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}

	public String getMsgTemplateId() {
		return this.msgTemplateId;
	}

	public void setReceiverMobiles(String receiverMobiles) {
		this.receiverMobiles = receiverMobiles;
	}

	public String getReceiverMobiles() {
		return this.receiverMobiles;
	}

	public void setReceiverUnionIds(String receiverUnionIds) {
		this.receiverUnionIds = receiverUnionIds;
	}

	public String getReceiverUnionIds() {
		return this.receiverUnionIds;
	}

	public void setReceiverUserIds(String receiverUserIds) {
		this.receiverUserIds = receiverUserIds;
	}

	public String getReceiverUserIds() {
		return this.receiverUserIds;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setTargetOpenConversationId(String targetOpenConversationId) {
		this.targetOpenConversationId = targetOpenConversationId;
	}

	public String getTargetOpenConversationId() {
		return this.targetOpenConversationId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scencegroup.message.send";
	}

	private String topResponseType ;

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
		txtParams.put("at_mobiles", this.atMobiles);
		txtParams.put("is_at_all", this.isAtAll);
		txtParams.put("msg_media_id_param_map", this.msgMediaIdParamMap);
		txtParams.put("msg_param_map", this.msgParamMap);
		txtParams.put("msg_template_id", this.msgTemplateId);
		txtParams.put("receiver_mobiles", this.receiverMobiles);
		txtParams.put("receiver_union_ids", this.receiverUnionIds);
		txtParams.put("receiver_user_ids", this.receiverUserIds);
		txtParams.put("robot_code", this.robotCode);
		txtParams.put("target_open_conversation_id", this.targetOpenConversationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScencegroupMessageSendResponse> getResponseClass() {
		return OapiImChatScencegroupMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(atMobiles, 999, "atMobiles");
		RequestCheckUtils.checkNotEmpty(msgTemplateId, "msgTemplateId");
		RequestCheckUtils.checkMaxListSize(receiverMobiles, 999, "receiverMobiles");
		RequestCheckUtils.checkMaxListSize(receiverUnionIds, 999, "receiverUnionIds");
		RequestCheckUtils.checkMaxListSize(receiverUserIds, 999, "receiverUserIds");
		RequestCheckUtils.checkNotEmpty(robotCode, "robotCode");
		RequestCheckUtils.checkNotEmpty(targetOpenConversationId, "targetOpenConversationId");
	}
	

}