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

import com.dingtalk.api.response.OapiRobotMessageSendgroupResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.sendgroup request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.03
 */
public class OapiRobotMessageSendgroupRequest extends BaseTaobaoRequest<OapiRobotMessageSendgroupResponse> {
	
	

	/** 
	* 申请到的消息模板唯一标识符
	 */
	private String msgKey;

	/** 
	* 消息模板中，变量本次替换的值
	 */
	private String msgParam;

	/** 
	* 群机器人webhook中的token
	 */
	private String token;

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

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.sendgroup";
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
		txtParams.put("msg_param", this.msgParam);
		txtParams.put("token", this.token);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageSendgroupResponse> getResponseClass() {
		return OapiRobotMessageSendgroupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(msgParam, "msgParam");
		RequestCheckUtils.checkNotEmpty(token, "token");
	}
	

}