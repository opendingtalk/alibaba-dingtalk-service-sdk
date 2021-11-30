package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiFinanceLoanNotifyRepaymentResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.repayment request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.05
 */
public class OapiFinanceLoanNotifyRepaymentRequest extends BaseTaobaoRequest<OapiFinanceLoanNotifyRepaymentResponse> {
	
	

	/** 
	* 授信额度(单位：分)，授信成功必需
	 */
	private Long amount;

	/** 
	* 可用授信额度：等于授信总额度减去已经借款总额度
	 */
	private Long availableAmount;

	/** 
	* 还款银行名称
	 */
	private String bankName;

	/** 
	* 还款银行卡号
	 */
	private String bankcardNo;

	/** 
	* 本次还款时利息逾期天数(不包括已经还逾期的，没有则为0)：多笔分期还款逾期，求各逾期天数总和；如：1期逾期35天，第2期逾期4天，总逾期39天
	 */
	private Long currentIntOvdDays;

	/** 
	* 本次还款时逾期期次(不包括已经还的逾期，没有则为0)：如1,2=第1期+第2期都逾期
	 */
	private String currentOvdTerms;

	/** 
	* 本次已还利息(单位：分)
	 */
	private Long currentPaidInterest;

	/** 
	* 本次已还罚息(单位：分，精确2位小数，没有则为0)=本次本金罚息+本次利息罚息
	 */
	private Long currentPaidPenalty;

	/** 
	* 本次已还本金(单位：分)
	 */
	private Long currentPaidPrincipal;

	/** 
	* 本次已还总金额(单位：分)：已还本金+已还利息+已还罚息
	 */
	private Long currentPaidTotalAmount;

	/** 
	* 本次还款时本金逾期天数(不包括已经还逾期的，没有则为0)：多笔分期还款逾期，求各逾期天数总和；如：1期逾期35天，第2期逾期4天，总逾期39天
	 */
	private Long currentPrinOvdDays;

	/** 
	* 还款结果信息：失败原因等
	 */
	private String failReason;

	/** 
	* 还款失败原因(还款失败必传)：用户发送钉钉卡片消息
	 */
	private String failReasonToUser;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 借据编号
	 */
	private String loanOrderNo;

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
	* 已还利息(单位：分)
	 */
	private Long paidInterest;

	/** 
	* 已还罚息(单位：分，没有则为0)=本金罚息+利息罚息
	 */
	private Long paidPenalty;

	/** 
	* 已还本金(单位：分)
	 */
	private Long paidPrincipal;

	/** 
	* 已还总金额(单位：分)：已还本金+已还利息+已还罚息
	 */
	private Long paidTotalAmount;

	/** 
	* 应还利息(单位：分)
	 */
	private Long payableInterest;

	/** 
	* 应还罚息(单位：分，没有则为0)=本金罚息+利息罚息
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
	* 该期次是否已经全部还清：0 没有还清，1 全部还清
	 */
	private Long periodPaidAll;

	/** 
	* 该期次已还利息(单位：分)
	 */
	private Long periodPaidInterest;

	/** 
	* 该期次已还罚息(单位：分，精确2位小数，没有则为0)=该期次本金罚息+该期次利息罚息
	 */
	private Long periodPaidPenalty;

	/** 
	* 该期次已还本金(单位：分)
	 */
	private Long periodPaidPrincipal;

	/** 
	* 该期次已还总金额(单位：分)
	 */
	private Long periodPaidTotalAmount;

	/** 
	* 该期次应还利息(单位：分)
	 */
	private Long periodPayableInterest;

	/** 
	* 该期次应还罚息(单位：分，没有则为0)
	 */
	private Long periodPayablePenalty;

	/** 
	* 该期次应还本金(单位：分)
	 */
	private Long periodPayablePrincipal;

	/** 
	* 该期次应还总金额(单位：分)：应还本金+应还利息+应还罚息
	 */
	private Long periodPayableTotalAmount;

	/** 
	* 还款时间
	 */
	private String repayRealDate;

	/** 
	* 还款方式：RMT00 等额本息，RMT01 先息后本
	 */
	private String repayType;

	/** 
	* 还款编号：当前渠道唯一，用于处理重复通知问题
	 */
	private String repaymentNo;

	/** 
	* 还款期次：1=第1期
	 */
	private String repaymentTerms;

	/** 
	* 还款状态：SUCCESS=成功、FAIL=失败、PING=还款中
	 */
	private String status;

	/** 
	* 还款类型：SYSTERM=系统代扣、ONTIME=按期还款、ADVANCE=提前还款、OVERDUE=逾期还款
	 */
	private String type;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Long getAvailableAmount() {
		return this.availableAmount;
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

	public void setCurrentIntOvdDays(Long currentIntOvdDays) {
		this.currentIntOvdDays = currentIntOvdDays;
	}

	public Long getCurrentIntOvdDays() {
		return this.currentIntOvdDays;
	}

	public void setCurrentOvdTerms(String currentOvdTerms) {
		this.currentOvdTerms = currentOvdTerms;
	}

	public String getCurrentOvdTerms() {
		return this.currentOvdTerms;
	}

	public void setCurrentPaidInterest(Long currentPaidInterest) {
		this.currentPaidInterest = currentPaidInterest;
	}

	public Long getCurrentPaidInterest() {
		return this.currentPaidInterest;
	}

	public void setCurrentPaidPenalty(Long currentPaidPenalty) {
		this.currentPaidPenalty = currentPaidPenalty;
	}

	public Long getCurrentPaidPenalty() {
		return this.currentPaidPenalty;
	}

	public void setCurrentPaidPrincipal(Long currentPaidPrincipal) {
		this.currentPaidPrincipal = currentPaidPrincipal;
	}

	public Long getCurrentPaidPrincipal() {
		return this.currentPaidPrincipal;
	}

	public void setCurrentPaidTotalAmount(Long currentPaidTotalAmount) {
		this.currentPaidTotalAmount = currentPaidTotalAmount;
	}

	public Long getCurrentPaidTotalAmount() {
		return this.currentPaidTotalAmount;
	}

	public void setCurrentPrinOvdDays(Long currentPrinOvdDays) {
		this.currentPrinOvdDays = currentPrinOvdDays;
	}

	public Long getCurrentPrinOvdDays() {
		return this.currentPrinOvdDays;
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

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setLoanOrderNo(String loanOrderNo) {
		this.loanOrderNo = loanOrderNo;
	}

	public String getLoanOrderNo() {
		return this.loanOrderNo;
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

	public void setPeriodPaidAll(Long periodPaidAll) {
		this.periodPaidAll = periodPaidAll;
	}

	public Long getPeriodPaidAll() {
		return this.periodPaidAll;
	}

	public void setPeriodPaidInterest(Long periodPaidInterest) {
		this.periodPaidInterest = periodPaidInterest;
	}

	public Long getPeriodPaidInterest() {
		return this.periodPaidInterest;
	}

	public void setPeriodPaidPenalty(Long periodPaidPenalty) {
		this.periodPaidPenalty = periodPaidPenalty;
	}

	public Long getPeriodPaidPenalty() {
		return this.periodPaidPenalty;
	}

	public void setPeriodPaidPrincipal(Long periodPaidPrincipal) {
		this.periodPaidPrincipal = periodPaidPrincipal;
	}

	public Long getPeriodPaidPrincipal() {
		return this.periodPaidPrincipal;
	}

	public void setPeriodPaidTotalAmount(Long periodPaidTotalAmount) {
		this.periodPaidTotalAmount = periodPaidTotalAmount;
	}

	public Long getPeriodPaidTotalAmount() {
		return this.periodPaidTotalAmount;
	}

	public void setPeriodPayableInterest(Long periodPayableInterest) {
		this.periodPayableInterest = periodPayableInterest;
	}

	public Long getPeriodPayableInterest() {
		return this.periodPayableInterest;
	}

	public void setPeriodPayablePenalty(Long periodPayablePenalty) {
		this.periodPayablePenalty = periodPayablePenalty;
	}

	public Long getPeriodPayablePenalty() {
		return this.periodPayablePenalty;
	}

	public void setPeriodPayablePrincipal(Long periodPayablePrincipal) {
		this.periodPayablePrincipal = periodPayablePrincipal;
	}

	public Long getPeriodPayablePrincipal() {
		return this.periodPayablePrincipal;
	}

	public void setPeriodPayableTotalAmount(Long periodPayableTotalAmount) {
		this.periodPayableTotalAmount = periodPayableTotalAmount;
	}

	public Long getPeriodPayableTotalAmount() {
		return this.periodPayableTotalAmount;
	}

	public void setRepayRealDate(String repayRealDate) {
		this.repayRealDate = repayRealDate;
	}

	public String getRepayRealDate() {
		return this.repayRealDate;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getRepayType() {
		return this.repayType;
	}

	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}

	public String getRepaymentNo() {
		return this.repaymentNo;
	}

	public void setRepaymentTerms(String repaymentTerms) {
		this.repaymentTerms = repaymentTerms;
	}

	public String getRepaymentTerms() {
		return this.repaymentTerms;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.notify.repayment";
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
		txtParams.put("amount", this.amount);
		txtParams.put("available_amount", this.availableAmount);
		txtParams.put("bank_name", this.bankName);
		txtParams.put("bankcard_no", this.bankcardNo);
		txtParams.put("current_int_ovd_days", this.currentIntOvdDays);
		txtParams.put("current_ovd_terms", this.currentOvdTerms);
		txtParams.put("current_paid_interest", this.currentPaidInterest);
		txtParams.put("current_paid_penalty", this.currentPaidPenalty);
		txtParams.put("current_paid_principal", this.currentPaidPrincipal);
		txtParams.put("current_paid_total_amount", this.currentPaidTotalAmount);
		txtParams.put("current_prin_ovd_days", this.currentPrinOvdDays);
		txtParams.put("fail_reason", this.failReason);
		txtParams.put("fail_reason_to_user", this.failReasonToUser);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("loan_order_no", this.loanOrderNo);
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
		txtParams.put("period_paid_all", this.periodPaidAll);
		txtParams.put("period_paid_interest", this.periodPaidInterest);
		txtParams.put("period_paid_penalty", this.periodPaidPenalty);
		txtParams.put("period_paid_principal", this.periodPaidPrincipal);
		txtParams.put("period_paid_total_amount", this.periodPaidTotalAmount);
		txtParams.put("period_payable_interest", this.periodPayableInterest);
		txtParams.put("period_payable_penalty", this.periodPayablePenalty);
		txtParams.put("period_payable_principal", this.periodPayablePrincipal);
		txtParams.put("period_payable_total_amount", this.periodPayableTotalAmount);
		txtParams.put("repay_real_date", this.repayRealDate);
		txtParams.put("repay_type", this.repayType);
		txtParams.put("repayment_no", this.repaymentNo);
		txtParams.put("repayment_terms", this.repaymentTerms);
		txtParams.put("status", this.status);
		txtParams.put("type", this.type);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanNotifyRepaymentResponse> getResponseClass() {
		return OapiFinanceLoanNotifyRepaymentResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(amount, "amount");
		RequestCheckUtils.checkNotEmpty(availableAmount, "availableAmount");
		RequestCheckUtils.checkNotEmpty(bankName, "bankName");
		RequestCheckUtils.checkNotEmpty(bankcardNo, "bankcardNo");
		RequestCheckUtils.checkNotEmpty(currentIntOvdDays, "currentIntOvdDays");
		RequestCheckUtils.checkNotEmpty(currentOvdTerms, "currentOvdTerms");
		RequestCheckUtils.checkNotEmpty(currentPaidInterest, "currentPaidInterest");
		RequestCheckUtils.checkNotEmpty(currentPaidPenalty, "currentPaidPenalty");
		RequestCheckUtils.checkNotEmpty(currentPaidPrincipal, "currentPaidPrincipal");
		RequestCheckUtils.checkNotEmpty(currentPaidTotalAmount, "currentPaidTotalAmount");
		RequestCheckUtils.checkNotEmpty(currentPrinOvdDays, "currentPrinOvdDays");
		RequestCheckUtils.checkNotEmpty(failReason, "failReason");
		RequestCheckUtils.checkNotEmpty(failReasonToUser, "failReasonToUser");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(loanOrderNo, "loanOrderNo");
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
		RequestCheckUtils.checkNotEmpty(periodPaidAll, "periodPaidAll");
		RequestCheckUtils.checkNotEmpty(periodPaidInterest, "periodPaidInterest");
		RequestCheckUtils.checkNotEmpty(periodPaidPenalty, "periodPaidPenalty");
		RequestCheckUtils.checkNotEmpty(periodPaidPrincipal, "periodPaidPrincipal");
		RequestCheckUtils.checkNotEmpty(periodPaidTotalAmount, "periodPaidTotalAmount");
		RequestCheckUtils.checkNotEmpty(periodPayableInterest, "periodPayableInterest");
		RequestCheckUtils.checkNotEmpty(periodPayablePenalty, "periodPayablePenalty");
		RequestCheckUtils.checkNotEmpty(periodPayablePrincipal, "periodPayablePrincipal");
		RequestCheckUtils.checkNotEmpty(periodPayableTotalAmount, "periodPayableTotalAmount");
		RequestCheckUtils.checkNotEmpty(repayRealDate, "repayRealDate");
		RequestCheckUtils.checkNotEmpty(repayType, "repayType");
		RequestCheckUtils.checkNotEmpty(repaymentNo, "repaymentNo");
		RequestCheckUtils.checkNotEmpty(repaymentTerms, "repaymentTerms");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}