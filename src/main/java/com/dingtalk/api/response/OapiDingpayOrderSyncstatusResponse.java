package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.syncstatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayOrderSyncstatusResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6791542952191435767L;

	/** 
	 * 钉钉错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private OrderSyncStatusOpenResponse result;

	/** 
	 * 是否成功
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

	public void setResult(OrderSyncStatusOpenResponse result) {
		this.result = result;
	}
	public OrderSyncStatusOpenResponse getResult( ) {
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
	 * orders
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Orders extends TaobaoObject {
		private static final long serialVersionUID = 1317761179773245143L;
		/**
		 * 金额（单位：分）
		 */
		@ApiField("amount")
		private Long amount;
		/**
		 * 发起支付操作员userId
		 */
		@ApiField("apply_pay_operator_userid")
		private String applyPayOperatorUserid;
		/**
		 * 业务代码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 创单操作员userId
		 */
		@ApiField("create_operator_userid")
		private String createOperatorUserid;
		/**
		 * 扩展属性
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 申请支付时间
		 */
		@ApiField("gmt_apply_pay")
		private Date gmtApplyPay;
		/**
		 * 创单时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 记录更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 完成付款时间
		 */
		@ApiField("gmt_pay")
		private Date gmtPay;
		/**
		 * 钉支付订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 外部流水号
		 */
		@ApiField("out_biz_no")
		private String outBizNo;
		/**
		 * 支付渠道
		 */
		@ApiField("pay_channel")
		private String payChannel;
		/**
		 * 支付渠道方流水号
		 */
		@ApiField("pay_channel_biz_no")
		private String payChannelBizNo;
		/**
		 * 支付渠道方付款者UID
		 */
		@ApiField("pay_channel_payer_real_uid")
		private String payChannelPayerRealUid;
		/**
		 * 收款方corpId或者userId
		 */
		@ApiField("payee_id")
		private String payeeId;
		/**
		 * 收款方类型
		 */
		@ApiField("payee_user_type")
		private String payeeUserType;
		/**
		 * 付款方corpId或者userId
		 */
		@ApiField("payer_id")
		private String payerId;
		/**
		 * 付款方类型
		 */
		@ApiField("payer_user_type")
		private String payerUserType;
		/**
		 * 来源应用ID
		 */
		@ApiField("source_app_id")
		private String sourceAppId;
		/**
		 * 订单状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getAmount() {
			return this.amount;
		}
		public void setAmount(Long amount) {
			this.amount = amount;
		}
		public String getApplyPayOperatorUserid() {
			return this.applyPayOperatorUserid;
		}
		public void setApplyPayOperatorUserid(String applyPayOperatorUserid) {
			this.applyPayOperatorUserid = applyPayOperatorUserid;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getCreateOperatorUserid() {
			return this.createOperatorUserid;
		}
		public void setCreateOperatorUserid(String createOperatorUserid) {
			this.createOperatorUserid = createOperatorUserid;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public void setExtensionString(String extension) {
			this.extension = extension;
		}
		
		public Date getGmtApplyPay() {
			return this.gmtApplyPay;
		}
		public void setGmtApplyPay(Date gmtApplyPay) {
			this.gmtApplyPay = gmtApplyPay;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Date getGmtPay() {
			return this.gmtPay;
		}
		public void setGmtPay(Date gmtPay) {
			this.gmtPay = gmtPay;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getOutBizNo() {
			return this.outBizNo;
		}
		public void setOutBizNo(String outBizNo) {
			this.outBizNo = outBizNo;
		}
		public String getPayChannel() {
			return this.payChannel;
		}
		public void setPayChannel(String payChannel) {
			this.payChannel = payChannel;
		}
		public String getPayChannelBizNo() {
			return this.payChannelBizNo;
		}
		public void setPayChannelBizNo(String payChannelBizNo) {
			this.payChannelBizNo = payChannelBizNo;
		}
		public String getPayChannelPayerRealUid() {
			return this.payChannelPayerRealUid;
		}
		public void setPayChannelPayerRealUid(String payChannelPayerRealUid) {
			this.payChannelPayerRealUid = payChannelPayerRealUid;
		}
		public String getPayeeId() {
			return this.payeeId;
		}
		public void setPayeeId(String payeeId) {
			this.payeeId = payeeId;
		}
		public String getPayeeUserType() {
			return this.payeeUserType;
		}
		public void setPayeeUserType(String payeeUserType) {
			this.payeeUserType = payeeUserType;
		}
		public String getPayerId() {
			return this.payerId;
		}
		public void setPayerId(String payerId) {
			this.payerId = payerId;
		}
		public String getPayerUserType() {
			return this.payerUserType;
		}
		public void setPayerUserType(String payerUserType) {
			this.payerUserType = payerUserType;
		}
		public String getSourceAppId() {
			return this.sourceAppId;
		}
		public void setSourceAppId(String sourceAppId) {
			this.sourceAppId = sourceAppId;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderSyncStatusOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 5889187112664596252L;
		/**
		 * orders
		 */
		@ApiListField("orders")
		@ApiField("orders")
		private List<Orders> orders;
	
		public List<Orders> getOrders() {
			return this.orders;
		}
		public void setOrders(List<Orders> orders) {
			this.orders = orders;
		}
	}
	


}
