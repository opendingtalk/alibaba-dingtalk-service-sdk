package com.dingtalk.api.request;

import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCateringOrderPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.order.push request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.15
 */
public class OapiCateringOrderPushRequest extends BaseTaobaoRequest<OapiCateringOrderPushResponse> {
	
	

	/** 
	* 实收总额(分)
	 */
	private Long feeActuallyPay;

	/** 
	* 折后费用(分)
	 */
	private Long feeAfterDiscount;

	/** 
	* 原始费用(分)
	 */
	private Long feeOriginal;

	/** 
	* 应付总额(分)
	 */
	private Long feeShouldPay;

	/** 
	* 订单详情
	 */
	private String orderDetails;

	/** 
	* 订单id
	 */
	private String orderId;

	/** 
	* 下单人的userId
	 */
	private String ordererUserId;

	/** 
	* 订单支付时间
	 */
	private Date paymentTime;

	/** 
	* 店铺id
	 */
	private String shopId;

	/** 
	* 店铺名称
	 */
	private String shopName;

	public void setFeeActuallyPay(Long feeActuallyPay) {
		this.feeActuallyPay = feeActuallyPay;
	}

	public Long getFeeActuallyPay() {
		return this.feeActuallyPay;
	}

	public void setFeeAfterDiscount(Long feeAfterDiscount) {
		this.feeAfterDiscount = feeAfterDiscount;
	}

	public Long getFeeAfterDiscount() {
		return this.feeAfterDiscount;
	}

	public void setFeeOriginal(Long feeOriginal) {
		this.feeOriginal = feeOriginal;
	}

	public Long getFeeOriginal() {
		return this.feeOriginal;
	}

	public void setFeeShouldPay(Long feeShouldPay) {
		this.feeShouldPay = feeShouldPay;
	}

	public Long getFeeShouldPay() {
		return this.feeShouldPay;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrdererUserId(String ordererUserId) {
		this.ordererUserId = ordererUserId;
	}

	public String getOrdererUserId() {
		return this.ordererUserId;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Date getPaymentTime() {
		return this.paymentTime;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopName() {
		return this.shopName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.order.push";
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
		txtParams.put("fee_actually_pay", this.feeActuallyPay);
		txtParams.put("fee_after_discount", this.feeAfterDiscount);
		txtParams.put("fee_original", this.feeOriginal);
		txtParams.put("fee_should_pay", this.feeShouldPay);
		txtParams.put("order_details", this.orderDetails);
		txtParams.put("order_id", this.orderId);
		txtParams.put("orderer_user_id", this.ordererUserId);
		txtParams.put("payment_time", this.paymentTime);
		txtParams.put("shop_id", this.shopId);
		txtParams.put("shop_name", this.shopName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringOrderPushResponse> getResponseClass() {
		return OapiCateringOrderPushResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}