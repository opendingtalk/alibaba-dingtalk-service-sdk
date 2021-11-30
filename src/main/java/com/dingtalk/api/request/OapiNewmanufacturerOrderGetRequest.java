package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiNewmanufacturerOrderGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.newmanufacturer.order.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.17
 */
public class OapiNewmanufacturerOrderGetRequest extends BaseTaobaoRequest<OapiNewmanufacturerOrderGetResponse> {
	
	

	/** 
	* 订单号
	 */
	private String number;

	/** 
	* 租户
	 */
	private String tenantId;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.newmanufacturer.order.get";
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
		txtParams.put("number", this.number);
		txtParams.put("tenant_id", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiNewmanufacturerOrderGetResponse> getResponseClass() {
		return OapiNewmanufacturerOrderGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}