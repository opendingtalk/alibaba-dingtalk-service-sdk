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

import com.dingtalk.api.response.OapiRhinoOrderGetProductOrderInfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.getProductOrderInfo request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.12
 */
public class OapiRhinoOrderGetProductOrderInfoRequest extends BaseTaobaoRequest<OapiRhinoOrderGetProductOrderInfoResponse> {
	
	

	/** 
	* 是否需要返回销售订单信息
	 */
	private Boolean includeSalesOrderInfo;

	/** 
	* 生产订单id
	 */
	private Long productOrderId;

	/** 
	* 租户id
	 */
	private String tenantId;

	public void setIncludeSalesOrderInfo(Boolean includeSalesOrderInfo) {
		this.includeSalesOrderInfo = includeSalesOrderInfo;
	}

	public Boolean getIncludeSalesOrderInfo() {
		return this.includeSalesOrderInfo;
	}

	public void setProductOrderId(Long productOrderId) {
		this.productOrderId = productOrderId;
	}

	public Long getProductOrderId() {
		return this.productOrderId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.getProductOrderInfo";
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
		txtParams.put("includeSalesOrderInfo", this.includeSalesOrderInfo);
		txtParams.put("productOrderId", this.productOrderId);
		txtParams.put("tenantId", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderGetProductOrderInfoResponse> getResponseClass() {
		return OapiRhinoOrderGetProductOrderInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(includeSalesOrderInfo, "includeSalesOrderInfo");
		RequestCheckUtils.checkNotEmpty(productOrderId, "productOrderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}