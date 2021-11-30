package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGettokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.gettoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGettokenRequest extends BaseTaobaoRequest<OapiSnsGettokenResponse> {
	
	

	/** 
	* 由钉钉开放平台提供给开放应用的唯一标识
	 */
	private String appid;

	/** 
	* 由钉钉开放平台提供的密钥
	 */
	private String appsecret;

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getAppsecret() {
		return this.appsecret;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.gettoken";
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

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_GET;

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
		txtParams.put("appid", this.appid);
		txtParams.put("appsecret", this.appsecret);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGettokenResponse> getResponseClass() {
		return OapiSnsGettokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}