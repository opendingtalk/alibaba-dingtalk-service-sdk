package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.order.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreInternalOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4436278815953682411L;

	/** 
	 * 服务调用成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务调用成功
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 订单信息
	 */
	@ApiField("result")
	private InAppGoodsOrderVo result;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(InAppGoodsOrderVo result) {
		this.result = result;
	}
	public InAppGoodsOrderVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InAppGoodsOrderVo extends TaobaoObject {
		private static final long serialVersionUID = 1166765342695553935L;
		/**
		 * 内购商品订单号
		 */
		@ApiField("biz_order_id")
		private Long bizOrderId;
		/**
		 * 购买商品的企业开放Id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 订单创建时间
		 */
		@ApiField("create_timestamp")
		private Long createTimestamp;
		/**
		 * 订购的服务结束时间
		 */
		@ApiField("end_timestamp")
		private Long endTimestamp;
		/**
		 * 内购商品码
		 */
		@ApiField("goods_code")
		private String goodsCode;
		/**
		 * 内购商品规格码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 订单支付时间
		 */
		@ApiField("paid_timestamp")
		private Long paidTimestamp;
		/**
		 * 订购数量，周期型商品此字段为空
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 订购的服务开始时间
		 */
		@ApiField("start_timestamp")
		private Long startTimestamp;
		/**
		 * 订单状态，0 - 订单关闭，3 - 订单支付，4 - 订单创建
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 实际支付总金额，单位为分(RMB)
		 */
		@ApiField("total_actual_pay_fee")
		private Long totalActualPayFee;
	
		public Long getBizOrderId() {
			return this.bizOrderId;
		}
		public void setBizOrderId(Long bizOrderId) {
			this.bizOrderId = bizOrderId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}
		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}
		public Long getEndTimestamp() {
			return this.endTimestamp;
		}
		public void setEndTimestamp(Long endTimestamp) {
			this.endTimestamp = endTimestamp;
		}
		public String getGoodsCode() {
			return this.goodsCode;
		}
		public void setGoodsCode(String goodsCode) {
			this.goodsCode = goodsCode;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public Long getPaidTimestamp() {
			return this.paidTimestamp;
		}
		public void setPaidTimestamp(Long paidTimestamp) {
			this.paidTimestamp = paidTimestamp;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getStartTimestamp() {
			return this.startTimestamp;
		}
		public void setStartTimestamp(Long startTimestamp) {
			this.startTimestamp = startTimestamp;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getTotalActualPayFee() {
			return this.totalActualPayFee;
		}
		public void setTotalActualPayFee(Long totalActualPayFee) {
			this.totalActualPayFee = totalActualPayFee;
		}
	}
	


}
