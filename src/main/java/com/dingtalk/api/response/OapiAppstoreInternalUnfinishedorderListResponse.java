package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.unfinishedorder.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreInternalUnfinishedorderListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4567579879439363999L;

	/** 
	 * 服务结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务结果描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private PageModel result;


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

	public void setResult(PageModel result) {
		this.result = result;
	}
	public PageModel getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 订单信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InAppGoodsOrderVO extends TaobaoObject {
		private static final long serialVersionUID = 1559324675737999598L;
		/**
		 * 订单号
		 */
		@ApiField("biz_order_id")
		private Long bizOrderId;
		/**
		 * 购买商品的企业开放Id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 订单创建时间戳
		 */
		@ApiField("create_timestamp")
		private Long createTimestamp;
		/**
		 * 商品码
		 */
		@ApiField("goods_code")
		private String goodsCode;
		/**
		 * 内购商品规格码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 订单支付时间戳
		 */
		@ApiField("paid_timestamp")
		private Long paidTimestamp;
		/**
		 * 订购数量，周期型商品该字段为空
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 订单状态，3 - 已支付状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 实际支付总金额，CNY(分)
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
	
	/**
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageModel extends TaobaoObject {
		private static final long serialVersionUID = 3578684826259255991L;
		/**
		 * 订单信息列表
		 */
		@ApiListField("items")
		@ApiField("in_app_goods_order_v_o")
		private List<InAppGoodsOrderVO> items;
		/**
		 * 总记录数
		 */
		@ApiField("total")
		private Long total;
	
		public List<InAppGoodsOrderVO> getItems() {
			return this.items;
		}
		public void setItems(List<InAppGoodsOrderVO> items) {
			this.items = items;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	


}
