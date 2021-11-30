package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiGettokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.gettoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.28
 */
public class OapiGettokenRequest extends BaseTaobaoRequest<OapiGettokenResponse> {
	
	

	/** 
	* 应用的唯一标识key
	 */
	private String appkey;

	/** 
	* 应用的密钥
	 */
	private String appsecret;

	/** 
	* 企业的corpid
	 */
	private String corpid;

	/** 
	* 企业的密钥
	 */
	private String corpsecret;

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getAppsecret() {
		return this.appsecret;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setCorpsecret(String corpsecret) {
		this.corpsecret = corpsecret;
	}

	public String getCorpsecret() {
		return this.corpsecret;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.gettoken";
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
		txtParams.put("appkey", this.appkey);
		txtParams.put("appsecret", this.appsecret);
		txtParams.put("corpid", this.corpid);
		txtParams.put("corpsecret", this.corpsecret);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiGettokenResponse> getResponseClass() {
		return OapiGettokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}