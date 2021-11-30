package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dcc.order.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDccOrderQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8346418782451684481L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 1
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 1
	 */
	@ApiField("result")
	private OrderInfo result;

	/** 
	 * 1
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(OrderInfo result) {
		this.result = result;
	}
	public OrderInfo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderInfo extends TaobaoObject {
		private static final long serialVersionUID = 7378949138687724257L;
		/**
		 * 1
		 */
		@ApiField("create_time")
		private String createTime;
		/**
		 * 1
		 */
		@ApiField("order_detail")
		private String orderDetail;
		/**
		 * 1
		 */
		@ApiField("order_id")
		private String orderId;
	
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getOrderDetail() {
			return this.orderDetail;
		}
		public void setOrderDetail(String orderDetail) {
			this.orderDetail = orderDetail;
		}
		public String getOrderId() {
			return this.orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
	}
	


}
