package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSmartdeviceQrQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.qr.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.26
 */
public class OapiSmartdeviceQrQueryRequest extends BaseTaobaoRequest<OapiSmartdeviceQrQueryResponse> {
	
	

	/** 
	* 二维码内容
	 */
	private String qrContent;

	public void setQrContent(String qrContent) {
		this.qrContent = qrContent;
	}

	public String getQrContent() {
		return this.qrContent;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.qr.query";
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
		txtParams.put("qr_content", this.qrContent);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceQrQueryResponse> getResponseClass() {
		return OapiSmartdeviceQrQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}