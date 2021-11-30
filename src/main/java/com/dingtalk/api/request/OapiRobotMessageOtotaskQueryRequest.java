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

import com.dingtalk.api.response.OapiRobotMessageOtotaskQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.ototask.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.06
 */
public class OapiRobotMessageOtotaskQueryRequest extends BaseTaobaoRequest<OapiRobotMessageOtotaskQueryResponse> {
	
	

	/** 
	* 申请到的企业机器人唯一标识符
	 */
	private String chatbotId;

	/** 
	* 用于查询发送进度的唯一标识
	 */
	private String processQueryKey;

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public void setProcessQueryKey(String processQueryKey) {
		this.processQueryKey = processQueryKey;
	}

	public String getProcessQueryKey() {
		return this.processQueryKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.ototask.query";
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
		txtParams.put("process_query_key", this.processQueryKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageOtotaskQueryResponse> getResponseClass() {
		return OapiRobotMessageOtotaskQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotId, "chatbotId");
		RequestCheckUtils.checkNotEmpty(processQueryKey, "processQueryKey");
	}
	

}