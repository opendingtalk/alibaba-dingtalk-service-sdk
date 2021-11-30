package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingpayFundTransAppPayResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.fund.trans.app.pay request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.30
 */
public class OapiDingpayFundTransAppPayRequest extends BaseTaobaoRequest<OapiDingpayFundTransAppPayResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.fund.trans.app.pay";
	}

	private String topResponseType ;

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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayFundTransAppPayResponse> getResponseClass() {
		return OapiDingpayFundTransAppPayResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}