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

import com.dingtalk.api.response.OapiImpaasNewretailSendstaffmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.newretail.sendstaffmessage request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiImpaasNewretailSendstaffmessageRequest extends BaseTaobaoRequest<OapiImpaasNewretailSendstaffmessageResponse> {
	
	

	/** 
	* 消息体
	 */
	private String content;

	/** 
	* 0系统消息
	 */
	private Long msgType;

	/** 
	* 系统账号
	 */
	private String sender;

	/** 
	* 用账号列表
	 */
	private String useridList;

	public void setContent(String content) {
		this.content = content;
	}
	public void setContentString(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setMsgType(Long msgType) {
		this.msgType = msgType;
	}

	public Long getMsgType() {
		return this.msgType;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return this.sender;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.newretail.sendstaffmessage";
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
		txtParams.put("msg_type", this.msgType);
		txtParams.put("sender", this.sender);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasNewretailSendstaffmessageResponse> getResponseClass() {
		return OapiImpaasNewretailSendstaffmessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(useridList, 100, "useridList");
	}
	

}