package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingmiRobotPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.robot.push request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.18
 */
public class OapiDingmiRobotPushRequest extends BaseTaobaoRequest<OapiDingmiRobotPushResponse> {
	
	

	/** 
	* 会话ID
	 */
	private String conversationId;

	/** 
	* 消息类型
	 */
	private String msgKey;

	/** 
	* 参考文档
	 */
	private String msgParam;

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getConversationId() {
		return this.conversationId;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.robot.push";
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
		txtParams.put("conversation_id", this.conversationId);
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("msg_param", this.msgParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiRobotPushResponse> getResponseClass() {
		return OapiDingmiRobotPushResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}