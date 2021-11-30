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

import com.dingtalk.api.response.OapiImChatScencegroupRobotQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.robot.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.26
 */
public class OapiImChatScencegroupRobotQueryRequest extends BaseTaobaoRequest<OapiImChatScencegroupRobotQueryResponse> {
	
	

	/** 
	* 群标识
	 */
	private String openConversationId;

	/** 
	* 群模板关联的群机器人robotCode
	 */
	private String robotCode;

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scencegroup.robot.query";
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
		txtParams.put("robot_code", this.robotCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScencegroupRobotQueryResponse> getResponseClass() {
		return OapiImChatScencegroupRobotQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(robotCode, "robotCode");
	}
	

}