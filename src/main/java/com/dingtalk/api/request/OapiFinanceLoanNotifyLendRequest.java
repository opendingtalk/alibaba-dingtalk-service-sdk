package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiFinanceLoanNotifyLendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.lend request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.25
 */
public class OapiFinanceLoanNotifyLendRequest extends BaseTaobaoRequest<OapiFinanceLoanNotifyLendResponse> {
	
	

	/** 
	* 借据更新时间(影响授信可用额度等金额变化)
	 */
	private String amountUpdateTime;

	/** 
	* 剩余可用可借额度(单位：分)
	 */
	private Long availableLimit;

	/** 
	* 收款银行名称
	 */
	private String bankName;

	/** 
	* 收款银行卡号
	 */
	private String bankcardNo;

	/** 
	* 每月账单日，如每月3号
	 */
	private Long billDate;

	/** 
	* 账单分期期次信息，借款失败时传空数组
	 */
	private String billInfoList;

	/** 
	* 授信总额度
	 */
	private Long creditAmount;

	/** 
	* 日利率(精确4位小数，百分之*)
	 */
	private String dailyInterestRate;

	/** 
	* 优惠券id：不存在传0，多个使用,分隔
	 */
	private String discountsId;

	/** 
	* 放款失败原因：失败时值不能为空（尽可能详细）
	 */
	private String failReason;

	/** 
	* 支用时失败原因，失败时必传
	 */
	private String failReasonToUser;

	/** 
	* 首期账单日：与每月账单日相同可不传
	 */
	private String firstBillDate;

	/** 
	* 首期还款日：与每月还款日相同可不传
	 */
	private String firstRepayDate;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 最后还款日
	 */
	private String lastRepayDate;

	/** 
	* 借款支用金额(单位：分)
	 */
	private Long loanAmount;

	/** 
	* 借据生效时间（成功）：用户支用金额申请提交后，行方审核完成时间
	 */
	private String loanEffectiveTime;

	/** 
	* 结清日期：最后一期(逾期)还款成功完成结束时间
	 */
	private String loanEndTime;

	/** 
	* 借据流水号：没有传0
	 */
	private String loanOrderFlowNo;

	/** 
	* 借据编号
	 */
	private String loanOrderNo;

	/** 
	* 分期申请提交时间：用户支用金额申请提交时间
	 */
	private String loanSubmitTime;

	/** 
	* 入账成功(打款到用户银行卡)时间：用户支用金额申请提交后&行方审核通过后向用户银行卡打款时间
	 */
	private String loanTxnTime;

	/** 
	* 借款用途
	 */
	private String loanUsage;

	/** 
	* 渠道方名称
	 */
	private String openChannelName;

	/** 
	* 渠道方产品码
	 */
	private String openProductCode;

	/** 
	* 渠道方产品名称
	 */
	private String openProductName;

	/** 
	* 渠道方产品类型
	 */
	private String openProductType;

	/** 
	* 借据已还利息(单位：分)
	 */
	private Long paidInterest;

	/** 
	* 借据已还罚息(单位：分，没有则为0)=本金罚息+利息罚息
	 */
	private Long paidPenalty;

	/** 
	* 借据已还本金(单位：分)
	 */
	private Long paidPrincipal;

	/** 
	* 借据已还总金额(单位：分)：已还本金+已还利息+已还罚息
	 */
	private Long paidTotalAmount;

	/** 
	* 应还利息(单位：分)
	 */
	private Long payableInterest;

	/** 
	* 借据应还罚息(单位：分，没有则为0)=本金罚息+利息罚息
	 */
	private Long payablePenalty;

	/** 
	* 应还本金(单位：分)
	 */
	private Long payablePrincipal;

	/** 
	* 应还总金额(单位：分)：应还本金+应还利息+应还罚息
	 */
	private Long payableTotalAmount;

	/** 
	* 优惠券减免金额(单位：分)：不存在传0
	 */
	private Long reductionTotalAmount;

	/** 
	* 每月还款日，如每月5号
	 */
	private Long repayDate;

	/** 
	* 还款方式：RMT00 等额本息，RMT01 先息后本
	 */
	private String repayType;

	/** 
	* 状态：APPLYING 支用申请中，CREDIT_SUCCESS 审核通过，CREDIT_FAILED 审核不通过借款申请失败，USE_SUCCESS 支用成功：打款到用户银行卡成功，USE_FAILED 支用失败，NORMAL 还款中，OVERDUE 逾期，CLEAR 结清，WRITEOFF 核销
	 */
	private String status;

	/** 
	* 分期总期数
	 */
	private Long totalTerm;

	/** 
	* 手机号
	 */
	private String userMobile;

	/** 
	* 年利率(精确2位小数，百分之*)
	 */
	private String yearLoanInterestRate;

	public void setAmountUpdateTime(String amountUpdateTime) {
		this.amountUpdateTime = amountUpdateTime;
	}

	public String getAmountUpdateTime() {
		return this.amountUpdateTime;
	}

	public void setAvailableLimit(Long availableLimit) {
		this.availableLimit = availableLimit;
	}

	public Long getAvailableLimit() {
		return this.availableLimit;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getBankcardNo() {
		return this.bankcardNo;
	}

	public void setBillDate(Long billDate) {
		this.billDate = billDate;
	}

	public Long getBillDate() {
		return this.billDate;
	}

	public void setBillInfoList(String billInfoList) {
		this.billInfoList = billInfoList;
	}

	public void setBillInfoList(List<BillInfo> billInfoList) {
		this.billInfoList = new JSONWriter(false,false,true).write(billInfoList);
	}

	public String getBillInfoList() {
		return this.billInfoList;
	}

	public void setCreditAmount(Long creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Long getCreditAmount() {
		return this.creditAmount;
	}

	public void setDailyInterestRate(String dailyInterestRate) {
		this.dailyInterestRate = dailyInterestRate;
	}

	public String getDailyInterestRate() {
		return this.dailyInterestRate;
	}

	public void setDiscountsId(String discountsId) {
		this.discountsId = discountsId;
	}

	public String getDiscountsId() {
		return this.discountsId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getFailReason() {
		return this.failReason;
	}

	public void setFailReasonToUser(String failReasonToUser) {
		this.failReasonToUser = failReasonToUser;
	}

	public String getFailReasonToUser() {
		return this.failReasonToUser;
	}

	public void setFirstBillDate(String firstBillDate) {
		this.firstBillDate = firstBillDate;
	}

	public String getFirstBillDate() {
		return this.firstBillDate;
	}

	public void setFirstRepayDate(String firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}

	public String getFirstRepayDate() {
		return this.firstRepayDate;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setLastRepayDate(String lastRepayDate) {
		this.lastRepayDate = lastRepayDate;
	}

	public String getLastRepayDate() {
		return this.lastRepayDate;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Long getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanEffectiveTime(String loanEffectiveTime) {
		this.loanEffectiveTime = loanEffectiveTime;
	}

	public String getLoanEffectiveTime() {
		return this.loanEffectiveTime;
	}

	public void setLoanEndTime(String loanEndTime) {
		this.loanEndTime = loanEndTime;
	}

	public String getLoanEndTime() {
		return this.loanEndTime;
	}

	public void setLoanOrderFlowNo(String loanOrderFlowNo) {
		this.loanOrderFlowNo = loanOrderFlowNo;
	}

	public String getLoanOrderFlowNo() {
		return this.loanOrderFlowNo;
	}

	public void setLoanOrderNo(String loanOrderNo) {
		this.loanOrderNo = loanOrderNo;
	}

	public String getLoanOrderNo() {
		return this.loanOrderNo;
	}

	public void setLoanSubmitTime(String loanSubmitTime) {
		this.loanSubmitTime = loanSubmitTime;
	}

	public String getLoanSubmitTime() {
		return this.loanSubmitTime;
	}

	public void setLoanTxnTime(String loanTxnTime) {
		this.loanTxnTime = loanTxnTime;
	}

	public String getLoanTxnTime() {
		return this.loanTxnTime;
	}

	public void setLoanUsage(String loanUsage) {
		this.loanUsage = loanUsage;
	}

	public String getLoanUsage() {
		return this.loanUsage;
	}

	public void setOpenChannelName(String openChannelName) {
		this.openChannelName = openChannelName;
	}

	public String getOpenChannelName() {
		return this.openChannelName;
	}

	public void setOpenProductCode(String openProductCode) {
		this.openProductCode = openProductCode;
	}

	public String getOpenProductCode() {
		return this.openProductCode;
	}

	public void setOpenProductName(String openProductName) {
		this.openProductName = openProductName;
	}

	public String getOpenProductName() {
		return this.openProductName;
	}

	public void setOpenProductType(String openProductType) {
		this.openProductType = openProductType;
	}

	public String getOpenProductType() {
		return this.openProductType;
	}

	public void setPaidInterest(Long paidInterest) {
		this.paidInterest = paidInterest;
	}

	public Long getPaidInterest() {
		return this.paidInterest;
	}

	public void setPaidPenalty(Long paidPenalty) {
		this.paidPenalty = paidPenalty;
	}

	public Long getPaidPenalty() {
		return this.paidPenalty;
	}

	public void setPaidPrincipal(Long paidPrincipal) {
		this.paidPrincipal = paidPrincipal;
	}

	public Long getPaidPrincipal() {
		return this.paidPrincipal;
	}

	public void setPaidTotalAmount(Long paidTotalAmount) {
		this.paidTotalAmount = paidTotalAmount;
	}

	public Long getPaidTotalAmount() {
		return this.paidTotalAmount;
	}

	public void setPayableInterest(Long payableInterest) {
		this.payableInterest = payableInterest;
	}

	public Long getPayableInterest() {
		return this.payableInterest;
	}

	public void setPayablePenalty(Long payablePenalty) {
		this.payablePenalty = payablePenalty;
	}

	public Long getPayablePenalty() {
		return this.payablePenalty;
	}

	public void setPayablePrincipal(Long payablePrincipal) {
		this.payablePrincipal = payablePrincipal;
	}

	public Long getPayablePrincipal() {
		return this.payablePrincipal;
	}

	public void setPayableTotalAmount(Long payableTotalAmount) {
		this.payableTotalAmount = payableTotalAmount;
	}

	public Long getPayableTotalAmount() {
		return this.payableTotalAmount;
	}

	public void setReductionTotalAmount(Long reductionTotalAmount) {
		this.reductionTotalAmount = reductionTotalAmount;
	}

	public Long getReductionTotalAmount() {
		return this.reductionTotalAmount;
	}

	public void setRepayDate(Long repayDate) {
		this.repayDate = repayDate;
	}

	public Long getRepayDate() {
		return this.repayDate;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getRepayType() {
		return this.repayType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setYearLoanInterestRate(String yearLoanInterestRate) {
		this.yearLoanInterestRate = yearLoanInterestRate;
	}

	public String getYearLoanInterestRate() {
		return this.yearLoanInterestRate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.notify.lend";
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
		txtParams.put("amount_update_time", this.amountUpdateTime);
		txtParams.put("available_limit", this.availableLimit);
		txtParams.put("bank_name", this.bankName);
		txtParams.put("bankcard_no", this.bankcardNo);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_info_list", this.billInfoList);
		txtParams.put("credit_amount", this.creditAmount);
		txtParams.put("daily_interest_rate", this.dailyInterestRate);
		txtParams.put("discounts_id", this.discountsId);
		txtParams.put("fail_reason", this.failReason);
		txtParams.put("fail_reason_to_user", this.failReasonToUser);
		txtParams.put("first_bill_date", this.firstBillDate);
		txtParams.put("first_repay_date", this.firstRepayDate);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("last_repay_date", this.lastRepayDate);
		txtParams.put("loan_amount", this.loanAmount);
		txtParams.put("loan_effective_time", this.loanEffectiveTime);
		txtParams.put("loan_end_time", this.loanEndTime);
		txtParams.put("loan_order_flow_no", this.loanOrderFlowNo);
		txtParams.put("loan_order_no", this.loanOrderNo);
		txtParams.put("loan_submit_time", this.loanSubmitTime);
		txtParams.put("loan_txn_time", this.loanTxnTime);
		txtParams.put("loan_usage", this.loanUsage);
		txtParams.put("open_channel_name", this.openChannelName);
		txtParams.put("open_product_code", this.openProductCode);
		txtParams.put("open_product_name", this.openProductName);
		txtParams.put("open_product_type", this.openProductType);
		txtParams.put("paid_interest", this.paidInterest);
		txtParams.put("paid_penalty", this.paidPenalty);
		txtParams.put("paid_principal", this.paidPrincipal);
		txtParams.put("paid_total_amount", this.paidTotalAmount);
		txtParams.put("payable_interest", this.payableInterest);
		txtParams.put("payable_penalty", this.payablePenalty);
		txtParams.put("payable_principal", this.payablePrincipal);
		txtParams.put("payable_total_amount", this.payableTotalAmount);
		txtParams.put("reduction_total_amount", this.reductionTotalAmount);
		txtParams.put("repay_date", this.repayDate);
		txtParams.put("repay_type", this.repayType);
		txtParams.put("status", this.status);
		txtParams.put("total_term", this.totalTerm);
		txtParams.put("user_mobile", this.userMobile);
		txtParams.put("year_loan_interest_rate", this.yearLoanInterestRate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanNotifyLendResponse> getResponseClass() {
		return OapiFinanceLoanNotifyLendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(amountUpdateTime, "amountUpdateTime");
		RequestCheckUtils.checkNotEmpty(availableLimit, "availableLimit");
		RequestCheckUtils.checkNotEmpty(bankName, "bankName");
		RequestCheckUtils.checkNotEmpty(bankcardNo, "bankcardNo");
		RequestCheckUtils.checkNotEmpty(billDate, "billDate");
		RequestCheckUtils.checkObjectMaxListSize(billInfoList, 360, "billInfoList");
		RequestCheckUtils.checkNotEmpty(creditAmount, "creditAmount");
		RequestCheckUtils.checkNotEmpty(dailyInterestRate, "dailyInterestRate");
		RequestCheckUtils.checkNotEmpty(discountsId, "discountsId");
		RequestCheckUtils.checkNotEmpty(failReason, "failReason");
		RequestCheckUtils.checkNotEmpty(failReasonToUser, "failReasonToUser");
		RequestCheckUtils.checkNotEmpty(firstBillDate, "firstBillDate");
		RequestCheckUtils.checkNotEmpty(firstRepayDate, "firstRepayDate");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(lastRepayDate, "lastRepayDate");
		RequestCheckUtils.checkNotEmpty(loanAmount, "loanAmount");
		RequestCheckUtils.checkNotEmpty(loanEffectiveTime, "loanEffectiveTime");
		RequestCheckUtils.checkNotEmpty(loanEndTime, "loanEndTime");
		RequestCheckUtils.checkNotEmpty(loanOrderFlowNo, "loanOrderFlowNo");
		RequestCheckUtils.checkNotEmpty(loanOrderNo, "loanOrderNo");
		RequestCheckUtils.checkNotEmpty(loanSubmitTime, "loanSubmitTime");
		RequestCheckUtils.checkNotEmpty(loanTxnTime, "loanTxnTime");
		RequestCheckUtils.checkNotEmpty(loanUsage, "loanUsage");
		RequestCheckUtils.checkNotEmpty(openChannelName, "openChannelName");
		RequestCheckUtils.checkNotEmpty(openProductCode, "openProductCode");
		RequestCheckUtils.checkNotEmpty(openProductName, "openProductName");
		RequestCheckUtils.checkNotEmpty(openProductType, "openProductType");
		RequestCheckUtils.checkNotEmpty(paidInterest, "paidInterest");
		RequestCheckUtils.checkNotEmpty(paidPenalty, "paidPenalty");
		RequestCheckUtils.checkNotEmpty(paidPrincipal, "paidPrincipal");
		RequestCheckUtils.checkNotEmpty(paidTotalAmount, "paidTotalAmount");
		RequestCheckUtils.checkNotEmpty(payableInterest, "payableInterest");
		RequestCheckUtils.checkNotEmpty(payablePenalty, "payablePenalty");
		RequestCheckUtils.checkNotEmpty(payablePrincipal, "payablePrincipal");
		RequestCheckUtils.checkNotEmpty(payableTotalAmount, "payableTotalAmount");
		RequestCheckUtils.checkNotEmpty(reductionTotalAmount, "reductionTotalAmount");
		RequestCheckUtils.checkNotEmpty(repayDate, "repayDate");
		RequestCheckUtils.checkNotEmpty(repayType, "repayType");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(totalTerm, "totalTerm");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
		RequestCheckUtils.checkNotEmpty(yearLoanInterestRate, "yearLoanInterestRate");
	}
	
	/**
	 * 账单分期期次信息，借款失败时传空数组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BillInfo extends TaobaoObject {
		private static final long serialVersionUID = 2387384446859498676L;
		/**
		 * 本期账单日，样例
		 */
		@ApiField("bill_date")
		private String billDate;
		/**
		 * 期次已还罚息(单位：分，没有则为0)=本金罚息+利息罚息
		 */
		@ApiField("paid_penalty")
		private Long paidPenalty;
		/**
		 * 期次已还利息(单位：分)
		 */
		@ApiField("paid_pnterest")
		private Long paidPnterest;
		/**
		 * 期次已还本金(单位：分)
		 */
		@ApiField("paid_principal")
		private Long paidPrincipal;
		/**
		 * 期次已还总金额(单位：分)：已还本金+已还利息+已还罚息
		 */
		@ApiField("paid_total_amount")
		private Long paidTotalAmount;
		/**
		 * 期次应还利息(单位：分)
		 */
		@ApiField("payable_interest")
		private Long payableInterest;
		/**
		 * 期次应还罚息(单位：分，没有则为0)=本金罚息+利息罚息
		 */
		@ApiField("payable_penalty")
		private Long payablePenalty;
		/**
		 * 期次应还本金(单位：分)
		 */
		@ApiField("payable_principal")
		private Long payablePrincipal;
		/**
		 * 期次应还总金额(单位：分)：应还本金+应还利息+应还罚息
		 */
		@ApiField("payable_total_amount")
		private Long payableTotalAmount;
		/**
		 * 本期还款日，如每月5号
		 */
		@ApiField("repay_date")
		private String repayDate;
		/**
		 * 本期还款状态：INIT 未还款、ONGOING 还款中、PAID 已还清、OVERDUE 已逾期、FAIL 还款失败
		 */
		@ApiField("status")
		private String status;
		/**
		 * 本期期次：2=第2期
		 */
		@ApiField("terms")
		private String terms;
	
		public String getBillDate() {
			return this.billDate;
		}
		public void setBillDate(String billDate) {
			this.billDate = billDate;
		}
		public Long getPaidPenalty() {
			return this.paidPenalty;
		}
		public void setPaidPenalty(Long paidPenalty) {
			this.paidPenalty = paidPenalty;
		}
		public Long getPaidPnterest() {
			return this.paidPnterest;
		}
		public void setPaidPnterest(Long paidPnterest) {
			this.paidPnterest = paidPnterest;
		}
		public Long getPaidPrincipal() {
			return this.paidPrincipal;
		}
		public void setPaidPrincipal(Long paidPrincipal) {
			this.paidPrincipal = paidPrincipal;
		}
		public Long getPaidTotalAmount() {
			return this.paidTotalAmount;
		}
		public void setPaidTotalAmount(Long paidTotalAmount) {
			this.paidTotalAmount = paidTotalAmount;
		}
		public Long getPayableInterest() {
			return this.payableInterest;
		}
		public void setPayableInterest(Long payableInterest) {
			this.payableInterest = payableInterest;
		}
		public Long getPayablePenalty() {
			return this.payablePenalty;
		}
		public void setPayablePenalty(Long payablePenalty) {
			this.payablePenalty = payablePenalty;
		}
		public Long getPayablePrincipal() {
			return this.payablePrincipal;
		}
		public void setPayablePrincipal(Long payablePrincipal) {
			this.payablePrincipal = payablePrincipal;
		}
		public Long getPayableTotalAmount() {
			return this.payableTotalAmount;
		}
		public void setPayableTotalAmount(Long payableTotalAmount) {
			this.payableTotalAmount = payableTotalAmount;
		}
		public String getRepayDate() {
			return this.repayDate;
		}
		public void setRepayDate(String repayDate) {
			this.repayDate = repayDate;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTerms() {
			return this.terms;
		}
		public void setTerms(String terms) {
			this.terms = terms;
		}
	}
	

}