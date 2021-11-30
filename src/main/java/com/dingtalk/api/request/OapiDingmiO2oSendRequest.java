package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingmiO2oSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.o2o.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.27
 */
public class OapiDingmiO2oSendRequest extends BaseTaobaoRequest<OapiDingmiO2oSendResponse> {
	
	

	/** 
	* 消息类型
	 */
	private String msgKey;

	/** 
	* 消息内容
	 */
	private String msgParam;

	/** 
	* 员工id
	 */
	private String userid;

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

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.o2o.send";
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
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiO2oSendResponse> getResponseClass() {
		return OapiDingmiO2oSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}