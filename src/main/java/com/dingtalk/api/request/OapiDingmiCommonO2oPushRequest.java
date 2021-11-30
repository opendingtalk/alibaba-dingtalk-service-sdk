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

import com.dingtalk.api.response.OapiDingmiCommonO2oPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.common.o2o.push request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.28
 */
public class OapiDingmiCommonO2oPushRequest extends BaseTaobaoRequest<OapiDingmiCommonO2oPushResponse> {
	
	

	/** 
	* 机器人id
	 */
	private String chatbotId;

	/** 
	* 模板key
	 */
	private String msgKey;

	/** 
	* 模块替换值
	 */
	private String msgParam;

	/** 
	* 用户在服务号所在企业的用户id
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
		return "dingtalk.oapi.dingmi.common.o2o.push";
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

	public Class<OapiDingmiCommonO2oPushResponse> getResponseClass() {
		return OapiDingmiCommonO2oPushResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkNotEmpty(msgParam, "msgParam");
		RequestCheckUtils.checkNotEmpty(staffId, "staffId");
	}
	

}