package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiDingpayPaymenttradeQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.paymenttrade.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.06
 */
public class OapiDingpayPaymenttradeQueryRequest extends BaseTaobaoRequest<OapiDingpayPaymenttradeQueryResponse> {
	
	

	/** 
	* 查询请求参数
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(PaymentTradeQueryOpenRequest param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.paymenttrade.query";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayPaymenttradeQueryResponse> getResponseClass() {
		return OapiDingpayPaymenttradeQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PaymentTradeQueryOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 3572642827179444395L;
		/**
		 * 钉钉交易订单号
		 */
		@ApiField("orderNo")
		private String orderNo;
	
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
	}
	

}