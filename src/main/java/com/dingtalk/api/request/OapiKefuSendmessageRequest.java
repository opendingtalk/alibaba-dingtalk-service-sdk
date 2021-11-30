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

import com.dingtalk.api.response.OapiKefuSendmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kefu.sendmessage request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiKefuSendmessageRequest extends BaseTaobaoRequest<OapiKefuSendmessageResponse> {
	
	

	/** 
	* 消息体
	 */
	private String content;

	/** 
	* 消费者id
	 */
	private String customerid;

	/** 
	* 消息类型
	 */
	private String msgtype;

	/** 
	* 客服服务id
	 */
	private Long serviceid;

	/** 
	* 消息token
	 */
	private String token;

	/** 
	* 客服id
	 */
	private String userid;

	public void setContent(String content) {
		this.content = content;
	}
	public void setContentString(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtype() {
		return this.msgtype;
	}

	public void setServiceid(Long serviceid) {
		this.serviceid = serviceid;
	}

	public Long getServiceid() {
		return this.serviceid;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kefu.sendmessage";
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
		txtParams.put("customerid", this.customerid);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("serviceid", this.serviceid);
		txtParams.put("token", this.token);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKefuSendmessageResponse> getResponseClass() {
		return OapiKefuSendmessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(customerid, "customerid");
		RequestCheckUtils.checkNotEmpty(msgtype, "msgtype");
		RequestCheckUtils.checkNotEmpty(serviceid, "serviceid");
		RequestCheckUtils.checkNotEmpty(token, "token");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}