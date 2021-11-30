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

import com.dingtalk.api.response.OapiRhinoOrderListProductOrderInfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.listProductOrderInfo request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.13
 */
public class OapiRhinoOrderListProductOrderInfoRequest extends BaseTaobaoRequest<OapiRhinoOrderListProductOrderInfoResponse> {
	
	

	/** 
	* 是否需要返回销售订单信息
	 */
	private Boolean includeSalesOrderVO;

	/** 
	* 订单id列表
	 */
	private String productOrderIds;

	/** 
	* 租户id
	 */
	private String tenantId;

	public void setIncludeSalesOrderVO(Boolean includeSalesOrderVO) {
		this.includeSalesOrderVO = includeSalesOrderVO;
	}

	public Boolean getIncludeSalesOrderVO() {
		return this.includeSalesOrderVO;
	}

	public void setProductOrderIds(String productOrderIds) {
		this.productOrderIds = productOrderIds;
	}

	public String getProductOrderIds() {
		return this.productOrderIds;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.listProductOrderInfo";
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
		txtParams.put("includeSalesOrderVO", this.includeSalesOrderVO);
		txtParams.put("productOrderIds", this.productOrderIds);
		txtParams.put("tenantId", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderListProductOrderInfoResponse> getResponseClass() {
		return OapiRhinoOrderListProductOrderInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(includeSalesOrderVO, "includeSalesOrderVO");
		RequestCheckUtils.checkNotEmpty(productOrderIds, "productOrderIds");
		RequestCheckUtils.checkMaxListSize(productOrderIds, 20, "productOrderIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}