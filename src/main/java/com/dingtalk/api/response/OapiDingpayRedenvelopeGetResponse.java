package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.redenvelope.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayRedenvelopeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2357174756526797815L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 红包查询结果
	 */
	@ApiField("result")
	private RedEnvelopeGetResult result;


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

	public void setResult(RedEnvelopeGetResult result) {
		this.result = result;
	}
	public RedEnvelopeGetResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 红包查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RedEnvelopeGetResult extends TaobaoObject {
		private static final long serialVersionUID = 7451241941281956955L;
		/**
		 * 企业订单号，企业传入
		 */
		@ApiField("corp_biz_no")
		private String corpBizNo;
		/**
		 * 红包祝福语
		 */
		@ApiField("greetings")
		private String greetings;
		/**
		 * 红包订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 红包领取金额
		 */
		@ApiField("pick_amount")
		private String pickAmount;
		/**
		 * 红包领取时间
		 */
		@ApiField("pick_time")
		private String pickTime;
		/**
		 * 红包接收人ID
		 */
		@ApiField("receiver_id")
		private String receiverId;
		/**
		 * 红包退款金额
		 */
		@ApiField("refund_amount")
		private String refundAmount;
		/**
		 * 红包退款时间
		 */
		@ApiField("refund_time")
		private String refundTime;
		/**
		 * 红包发送时间
		 */
		@ApiField("send_time")
		private String sendTime;
		/**
		 * 红包发送人ID，当红包类型为SINGLE_QUOTA时有值
		 */
		@ApiField("sender_id")
		private String senderId;
		/**
		 * 红包状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 红包主题ID
		 */
		@ApiField("theme_id")
		private String themeId;
		/**
		 * 红包金额
		 */
		@ApiField("total_amount")
		private String totalAmount;
		/**
		 * 红包类型
		 */
		@ApiField("type")
		private String type;
	
		public String getCorpBizNo() {
			return this.corpBizNo;
		}
		public void setCorpBizNo(String corpBizNo) {
			this.corpBizNo = corpBizNo;
		}
		public String getGreetings() {
			return this.greetings;
		}
		public void setGreetings(String greetings) {
			this.greetings = greetings;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getPickAmount() {
			return this.pickAmount;
		}
		public void setPickAmount(String pickAmount) {
			this.pickAmount = pickAmount;
		}
		public String getPickTime() {
			return this.pickTime;
		}
		public void setPickTime(String pickTime) {
			this.pickTime = pickTime;
		}
		public String getReceiverId() {
			return this.receiverId;
		}
		public void setReceiverId(String receiverId) {
			this.receiverId = receiverId;
		}
		public String getRefundAmount() {
			return this.refundAmount;
		}
		public void setRefundAmount(String refundAmount) {
			this.refundAmount = refundAmount;
		}
		public String getRefundTime() {
			return this.refundTime;
		}
		public void setRefundTime(String refundTime) {
			this.refundTime = refundTime;
		}
		public String getSendTime() {
			return this.sendTime;
		}
		public void setSendTime(String sendTime) {
			this.sendTime = sendTime;
		}
		public String getSenderId() {
			return this.senderId;
		}
		public void setSenderId(String senderId) {
			this.senderId = senderId;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getThemeId() {
			return this.themeId;
		}
		public void setThemeId(String themeId) {
			this.themeId = themeId;
		}
		public String getTotalAmount() {
			return this.totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	


}
