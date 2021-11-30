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

import com.dingtalk.api.response.OapiAtsMessageSystemaccountSendmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.message.systemaccount.sendmessage request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.27
 */
public class OapiAtsMessageSystemaccountSendmessageRequest extends BaseTaobaoRequest<OapiAtsMessageSystemaccountSendmessageResponse> {
	
	

	/** 
	* 模板内容value
	 */
	private String content;

	/** 
	* 消息模板code
	 */
	private String messageBizCode;

	/** 
	* 用户ID
	 */
	private String openid;

	public void setContent(String content) {
		this.content = content;
	}
	public void setContentString(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setMessageBizCode(String messageBizCode) {
		this.messageBizCode = messageBizCode;
	}

	public String getMessageBizCode() {
		return this.messageBizCode;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOpenid() {
		return this.openid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.message.systemaccount.sendmessage";
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
		txtParams.put("content", this.content);
		txtParams.put("message_biz_code", this.messageBizCode);
		txtParams.put("openid", this.openid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsMessageSystemaccountSendmessageResponse> getResponseClass() {
		return OapiAtsMessageSystemaccountSendmessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(messageBizCode, "messageBizCode");
		RequestCheckUtils.checkNotEmpty(openid, "openid");
	}
	

}