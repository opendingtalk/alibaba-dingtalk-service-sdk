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

import com.dingtalk.api.response.OapiAppstoreOrdersSpecialCanalUpdateOrderResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.orders.special_canal.update_order request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.20
 */
public class OapiAppstoreOrdersSpecialCanalUpdateOrderRequest extends BaseTaobaoRequest<OapiAppstoreOrdersSpecialCanalUpdateOrderResponse> {
	
	

	/** 
	* 钉钉订单id
	 */
	private String dingOrderId;

	/** 
	* 状态。已支付是3，已完成是4，已取消是1
	 */
	private Long status;

	public void setDingOrderId(String dingOrderId) {
		this.dingOrderId = dingOrderId;
	}

	public String getDingOrderId() {
		return this.dingOrderId;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.orders.special_canal.update_order";
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
		txtParams.put("ding_order_id", this.dingOrderId);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreOrdersSpecialCanalUpdateOrderResponse> getResponseClass() {
		return OapiAppstoreOrdersSpecialCanalUpdateOrderResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dingOrderId, "dingOrderId");
		RequestCheckUtils.checkNotEmpty(status, "status");
	}
	

}