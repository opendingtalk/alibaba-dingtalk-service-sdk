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

import com.dingtalk.api.response.OapiMessageIntelligentSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.intelligent.send request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.10
 */
public class OapiMessageIntelligentSendRequest extends BaseTaobaoRequest<OapiMessageIntelligentSendResponse> {
	
	

	/** 
	* 和钉钉侧约定的消息模板
	 */
	private String msgKey;

	/** 
	* 群的openConversationId,通过jsapi创建群返回的chatid
	 */
	private String openConversationId;

	/** 
	* 替换消息模板中的变量，必需是json格式,和模板配合使用，"还有$openTime$开场"则入参应该是{"$openTime$":"10"}
	 */
	private String paramJson;

	/** 
	* 接收者userId列表，必需在群内
	 */
	private String receiverList;

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setParamJson(String paramJson) {
		this.paramJson = paramJson;
	}

	public String getParamJson() {
		return this.paramJson;
	}

	public void setReceiverList(String receiverList) {
		this.receiverList = receiverList;
	}

	public String getReceiverList() {
		return this.receiverList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.intelligent.send";
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
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("param_json", this.paramJson);
		txtParams.put("receiver_list", this.receiverList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageIntelligentSendResponse> getResponseClass() {
		return OapiMessageIntelligentSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(paramJson, "paramJson");
		RequestCheckUtils.checkNotEmpty(receiverList, "receiverList");
		RequestCheckUtils.checkMaxListSize(receiverList, 20, "receiverList");
	}
	

}