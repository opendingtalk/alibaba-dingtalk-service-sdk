package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkPayTradePaymentCreateResponse;

/**
 * TOP API: dingtalk.pay.trade.payment.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.16
 */
public class DingtalkPayTradePaymentCreateRequest extends BaseTaobaoRequest<DingtalkPayTradePaymentCreateResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.pay.trade.payment.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkPayTradePaymentCreateResponse> getResponseClass() {
		return DingtalkPayTradePaymentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}