package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.bill.batchquery response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayBillBatchqueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1774542792418144825L;

	/** 
	 * 错误代码
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
	private BillBatchQueryOpenResponse result;

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

	public void setResult(BillBatchQueryOpenResponse result) {
		this.result = result;
	}
	public BillBatchQueryOpenResponse getResult( ) {
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
	 * billList
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingPayBillOpenBo extends TaobaoObject {
		private static final long serialVersionUID = 7892517178826335297L;
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
		 * INCOME收入、EXPENSE支出
		 */
		@ApiField("bill_category")
		private String billCategory;
		/**
		 * 账单号
		 */
		@ApiField("bill_no")
		private String billNo;
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
		 * 订单号
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
		 * 收款方真实账号
		 */
		@ApiField("pay_channel_payee_real_uid")
		private String payChannelPayeeRealUid;
		/**
		 * 支付渠道方付款者实际出资UID
		 */
		@ApiField("pay_channel_payer_real_uid")
		private String payChannelPayerRealUid;
		/**
		 * 收款者corpId或者userId
		 */
		@ApiField("payee_id")
		private String payeeId;
		/**
		 * 收款者类型
		 */
		@ApiField("payee_user_type")
		private String payeeUserType;
		/**
		 * 付款者corpId或者userId
		 */
		@ApiField("payer_id")
		private String payerId;
		/**
		 * 付款者类型
		 */
		@ApiField("payer_user_type")
		private String payerUserType;
		/**
		 * 记账主体corpId或者userId
		 */
		@ApiField("principal_id")
		private String principalId;
		/**
		 * 收款人账户类型
		 */
		@ApiField("receiptor_type")
		private String receiptorType;
		/**
		 * 来源应用ID
		 */
		@ApiField("source_app_id")
		private String sourceAppId;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 中止操作员id
		 */
		@ApiField("termination_operator_id")
		private String terminationOperatorId;
		/**
		 * 中止支付原因
		 */
		@ApiField("termination_reason")
		private String terminationReason;
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
		public String getBillCategory() {
			return this.billCategory;
		}
		public void setBillCategory(String billCategory) {
			this.billCategory = billCategory;
		}
		public String getBillNo() {
			return this.billNo;
		}
		public void setBillNo(String billNo) {
			this.billNo = billNo;
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
		public String getPayChannelPayeeRealUid() {
			return this.payChannelPayeeRealUid;
		}
		public void setPayChannelPayeeRealUid(String payChannelPayeeRealUid) {
			this.payChannelPayeeRealUid = payChannelPayeeRealUid;
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
		public String getPrincipalId() {
			return this.principalId;
		}
		public void setPrincipalId(String principalId) {
			this.principalId = principalId;
		}
		public String getReceiptorType() {
			return this.receiptorType;
		}
		public void setReceiptorType(String receiptorType) {
			this.receiptorType = receiptorType;
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
		public String getTerminationOperatorId() {
			return this.terminationOperatorId;
		}
		public void setTerminationOperatorId(String terminationOperatorId) {
			this.terminationOperatorId = terminationOperatorId;
		}
		public String getTerminationReason() {
			return this.terminationReason;
		}
		public void setTerminationReason(String terminationReason) {
			this.terminationReason = terminationReason;
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
	public static class BillBatchQueryOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 2292123181422926575L;
		/**
		 * billList
		 */
		@ApiListField("bill_list")
		@ApiField("ding_pay_bill_open_bo")
		private List<DingPayBillOpenBo> billList;
		/**
		 * 当前页码
		 */
		@ApiField("current_page_num")
		private Long currentPageNum;
		/**
		 * 如果nextKey不为空，说明还有翻页数据
		 */
		@ApiField("next_key")
		private String nextKey;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 总记录条数
		 */
		@ApiField("total_count")
		private Long totalCount;
		/**
		 * 总页数
		 */
		@ApiField("total_page")
		private Long totalPage;
	
		public List<DingPayBillOpenBo> getBillList() {
			return this.billList;
		}
		public void setBillList(List<DingPayBillOpenBo> billList) {
			this.billList = billList;
		}
		public Long getCurrentPageNum() {
			return this.currentPageNum;
		}
		public void setCurrentPageNum(Long currentPageNum) {
			this.currentPageNum = currentPageNum;
		}
		public String getNextKey() {
			return this.nextKey;
		}
		public void setNextKey(String nextKey) {
			this.nextKey = nextKey;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
		public Long getTotalPage() {
			return this.totalPage;
		}
		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}
	}
	


}
