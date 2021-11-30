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

import com.dingtalk.api.response.OapiRobotMessageSendotoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.sendoto request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.08
 */
public class OapiRobotMessageSendotoRequest extends BaseTaobaoRequest<OapiRobotMessageSendotoResponse> {
	
	

	/** 
	* 申请到的企业机器人唯一标识符
	 */
	private String chatbotId;

	/** 
	* 申请到的消息模板唯一标识符
	 */
	private String msgKey;

	/** 
	* 消息模板中，变量本次替换的值
	 */
	private String msgParam;

	/** 
	* 员工的userid
	 */
	private String staffId;

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
	}

	public String getChatbotId() {
		return this.chatbotId;
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

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.sendoto";
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
		txtParams.put("chatbot_id", this.chatbotId);
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("msg_param", this.msgParam);
		txtParams.put("staff_id", this.staffId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageSendotoResponse> getResponseClass() {
		return OapiRobotMessageSendotoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotId, "chatbotId");
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(msgParam, "msgParam");
		RequestCheckUtils.checkNotEmpty(staffId, "staffId");
	}
	

}