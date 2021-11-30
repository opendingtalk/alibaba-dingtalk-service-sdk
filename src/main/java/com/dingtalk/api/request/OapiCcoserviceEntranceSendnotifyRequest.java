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

import com.dingtalk.api.response.OapiCcoserviceEntranceSendnotifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ccoservice.entrance.sendnotify request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiCcoserviceEntranceSendnotifyRequest extends BaseTaobaoRequest<OapiCcoserviceEntranceSendnotifyResponse> {
	
	

	/** 
	* 微应用ID
	 */
	private Long appId;

	/** 
	* 文本的通知
	 */
	private String content;

	/** 
	* 员工ID
	 */
	private String userid;

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ccoservice.entrance.sendnotify";
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
		txtParams.put("app_id", this.appId);
		txtParams.put("content", this.content);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCcoserviceEntranceSendnotifyResponse> getResponseClass() {
		return OapiCcoserviceEntranceSendnotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appId, "appId");
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}