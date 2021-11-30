package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingpayVirtualaccountQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.virtualaccount.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingpayVirtualaccountQueryRequest extends BaseTaobaoRequest<OapiDingpayVirtualaccountQueryResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private String extension;

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.virtualaccount.query";
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
		txtParams.put("extension", this.extension);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayVirtualaccountQueryResponse> getResponseClass() {
		return OapiDingpayVirtualaccountQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}