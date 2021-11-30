package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.paymenttrade.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayPaymenttradeCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3248949165118964962L;

	/** 
	 * 付款交易创建结果
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 交易订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TradeOrderVo extends TaobaoObject {
		private static final long serialVersionUID = 4187494295459973772L;
		/**
		 * 订单金额（单位分）
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 订单金额币种
		 */
		@ApiField("currency")
		private String currency;
		/**
		 * 订单标识
		 */
		@ApiField("orderNo")
		private String orderNo;
		/**
		 * 订单状态
		 */
		@ApiField("orderStatus")
		private String orderStatus;
		/**
		 * 付款标识,支付渠道返回的标识
		 */
		@ApiField("paymentId")
		private String paymentId;
		/**
		 * 订单主体标识
		 */
		@ApiField("principalId")
		private String principalId;
		/**
		 * 订单主体类型
		 */
		@ApiField("principalType")
		private String principalType;
	
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return this.currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getOrderStatus() {
			return this.orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getPaymentId() {
			return this.paymentId;
		}
		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}
		public String getPrincipalId() {
			return this.principalId;
		}
		public void setPrincipalId(String principalId) {
			this.principalId = principalId;
		}
		public String getPrincipalType() {
			return this.principalType;
		}
		public void setPrincipalType(String principalType) {
			this.principalType = principalType;
		}
	}
	
	/**
	 * 付款交易创建结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5426845546269953581L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误码描述
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 交易订单信息
		 */
		@ApiField("result")
		private TradeOrderVo result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public TradeOrderVo getResult() {
			return this.result;
		}
		public void setResult(TradeOrderVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
