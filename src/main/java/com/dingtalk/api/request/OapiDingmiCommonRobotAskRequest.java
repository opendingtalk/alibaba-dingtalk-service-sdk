package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingmiCommonRobotAskResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.common.robot.ask request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.03
 */
public class OapiDingmiCommonRobotAskRequest extends BaseTaobaoRequest<OapiDingmiCommonRobotAskResponse> {
	
	

	/** 
	* 问题内容
	 */
	private String question;

	/** 
	* 机器人唯一标识
	 */
	private String robotAppKey;

	/** 
	* 会话id为了跟踪某一次会话
	 */
	private String sessionUuid;

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setRobotAppKey(String robotAppKey) {
		this.robotAppKey = robotAppKey;
	}

	public String getRobotAppKey() {
		return this.robotAppKey;
	}

	public void setSessionUuid(String sessionUuid) {
		this.sessionUuid = sessionUuid;
	}

	public String getSessionUuid() {
		return this.sessionUuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.common.robot.ask";
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
		txtParams.put("question", this.question);
		txtParams.put("robot_app_key", this.robotAppKey);
		txtParams.put("session_uuid", this.sessionUuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiCommonRobotAskResponse> getResponseClass() {
		return OapiDingmiCommonRobotAskResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}