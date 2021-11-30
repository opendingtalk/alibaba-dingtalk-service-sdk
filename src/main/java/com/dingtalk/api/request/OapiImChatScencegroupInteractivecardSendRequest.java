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

import com.dingtalk.api.response.OapiImChatScencegroupInteractivecardSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.interactivecard.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.11
 */
public class OapiImChatScencegroupInteractivecardSendRequest extends BaseTaobaoRequest<OapiImChatScencegroupInteractivecardSendResponse> {
	
	

	/** 
	* 卡片模板内容替换参数-多媒体类型
	 */
	private String cardMediaidParamMap;

	/** 
	* 卡片模板内容替换参数-普通文本类型
	 */
	private String cardParamMap;

	/** 
	* 卡片模板ID
	 */
	private String cardTemplateId;

	/** 
	* 唯一标示卡片的外部编码
	 */
	private String outTrackId;

	/** 
	* 接收卡片的人的userId
	 */
	private String receiverUseridList;

	/** 
	* 用于发送卡片的机器人编码，与场景群模板中的机器人编码保持一致
	 */
	private String robotCode;

	/** 
	* 接收卡片的群的openConversationId
	 */
	private String targetOpenConversationId;

	public void setCardMediaidParamMap(String cardMediaidParamMap) {
		this.cardMediaidParamMap = cardMediaidParamMap;
	}
	public void setCardMediaidParamMapString(String cardMediaidParamMap) {
		this.cardMediaidParamMap = cardMediaidParamMap;
	}

	public String getCardMediaidParamMap() {
		return this.cardMediaidParamMap;
	}

	public void setCardParamMap(String cardParamMap) {
		this.cardParamMap = cardParamMap;
	}
	public void setCardParamMapString(String cardParamMap) {
		this.cardParamMap = cardParamMap;
	}

	public String getCardParamMap() {
		return this.cardParamMap;
	}

	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}

	public void setOutTrackId(String outTrackId) {
		this.outTrackId = outTrackId;
	}

	public String getOutTrackId() {
		return this.outTrackId;
	}

	public void setReceiverUseridList(String receiverUseridList) {
		this.receiverUseridList = receiverUseridList;
	}

	public String getReceiverUseridList() {
		return this.receiverUseridList;
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
		return "dingtalk.oapi.im.chat.scencegroup.interactivecard.send";
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
		txtParams.put("card_mediaid_param_map", this.cardMediaidParamMap);
		txtParams.put("card_param_map", this.cardParamMap);
		txtParams.put("card_template_id", this.cardTemplateId);
		txtParams.put("out_track_id", this.outTrackId);
		txtParams.put("receiver_userid_list", this.receiverUseridList);
		txtParams.put("robot_code", this.robotCode);
		txtParams.put("target_open_conversation_id", this.targetOpenConversationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScencegroupInteractivecardSendResponse> getResponseClass() {
		return OapiImChatScencegroupInteractivecardSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cardTemplateId, "cardTemplateId");
		RequestCheckUtils.checkNotEmpty(outTrackId, "outTrackId");
		RequestCheckUtils.checkMaxListSize(receiverUseridList, 999, "receiverUseridList");
		RequestCheckUtils.checkNotEmpty(robotCode, "robotCode");
		RequestCheckUtils.checkNotEmpty(targetOpenConversationId, "targetOpenConversationId");
	}
	

}