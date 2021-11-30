package com.dingtalk.api.reqrsp;

import java.util.Date;
import java.util.Map;

import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

public class CorpMessageCorpconversionSendmockRequest extends BaseTaobaoRequest<CorpMessageCorpconversionSendmockResponse> {
	
	private Long microappAgentId;
	private String toUser;
	private String toParty;
	private String messageType;
	private String message;
	
	public Long getMicroappAgentId() {
		return microappAgentId;
	}

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public String getToUser() {
		return toUser;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public String getToParty() {
		return toParty;
	}

	public void setToParty(String toParty) {
		this.toParty = toParty;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public String getApiMethodName() {
		return "dingtalk.corp.message.corpconversation.sendmock";
	}

	public String getTopApiCallType() {
		return DingTalkConstants.CALL_TYPE_TOP;
	}

	public String getTopHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("microappAgentId", this.microappAgentId);
		txtParams.put("toUser", this.toUser);
		txtParams.put("toParty", this.toParty);
		txtParams.put("messageType", this.messageType);
		txtParams.put("message", this.message);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Long getTimestamp() {
		return (new Date()).getTime();
	}

	public Class<CorpMessageCorpconversionSendmockResponse> getResponseClass() {
		return CorpMessageCorpconversionSendmockResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(microappAgentId, "microappAgentId");
		RequestCheckUtils.checkNotEmpty(toUser, "toUser");
		RequestCheckUtils.checkNotEmpty(toParty, "toParty");
		RequestCheckUtils.checkNotEmpty(messageType, "messageType");
		RequestCheckUtils.checkNotEmpty(message, "message");
	}

}
