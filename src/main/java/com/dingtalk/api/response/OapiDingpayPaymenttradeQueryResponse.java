package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.paymenttrade.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayPaymenttradeQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4348435164738122666L;

	/** 
	 * 付款交易查询结果
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
	 * 付款交易订单
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TradeOrderVo extends TaobaoObject {
		private static final long serialVersionUID = 1162979589122517229L;
		/**
		 * 订单金额（单位分）
		 */
		@ApiField("amount")
		private Long amount;
		/**
		 * 交易币种
		 */
		@ApiField("currency")
		private String currency;
		/**
		 * 订单号
		 */
		@ApiField("orderNo")
		private String orderNo;
		/**
		 * 订单状态
		 */
		@ApiField("orderStatus")
		private String orderStatus;
		/**
		 * 付款标识(支付渠道返回的标识)
		 */
		@ApiField("paymentId")
		private String paymentId;
		/**
		 * 订单主体标识
		 */
		@ApiField("principalId")
		private String principalId;
		/**
		 * 订单主体类型，企业(B)或个人(C)
		 */
		@ApiField("principalType")
		private String principalType;
	
		public Long getAmount() {
			return this.amount;
		}
		public void setAmount(Long amount) {
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
	 * 付款交易查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3267612755717467632L;
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
		 * 付款交易订单
		 */
		@ApiField("result")
		private TradeOrderVo result;
		/**
		 * 请求是否成功
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
