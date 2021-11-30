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

import com.dingtalk.api.response.OapiCrmAppGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.app.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.24
 */
public class OapiCrmAppGetRequest extends BaseTaobaoRequest<OapiCrmAppGetResponse> {
	
	

	/** 
	* 业务表示,crm颁发或者申请
	 */
	private String bizKey;

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizKey() {
		return this.bizKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.app.get";
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
		txtParams.put("biz_key", this.bizKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmAppGetResponse> getResponseClass() {
		return OapiCrmAppGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizKey, "bizKey");
	}
	

}