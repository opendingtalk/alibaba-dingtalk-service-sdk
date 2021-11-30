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

import com.dingtalk.api.response.OapiFinanceLoanNotifyRepaymentOverdueResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.repayment.overdue request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.05
 */
public class OapiFinanceLoanNotifyRepaymentOverdueRequest extends BaseTaobaoRequest<OapiFinanceLoanNotifyRepaymentOverdueResponse> {
	
	

	/** 
	* 本次通知未还利息(单位：分)
	 */
	private Long currentUnpaidInterest;

	/** 
	* 本次通知未还罚息(单位：分，精确2位小数，没有则为0)=该期次本金罚息次+该期次利息罚息
	 */
	private Long currentUnpaidPenalty;

	/** 
	* 本次通知未还本金(单位：分）
	 */
	private Long currentUnpaidPrincipal;

	/** 
	* 本次通知未还总金额(单位：分)：未还本金+未还利息+未还罚息
	 */
	private Long currentUnpaidTotalAmount;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 利息逾期天数(没有则为0)
	 */
	private Long intOvdDays;

	/** 
	* 借据编号：还款对应的借据编号
	 */
	private String loanOrderNo;

	/** 
	* 渠道方名称
	 */
	private String openChannelName;

	/** 
	* 渠道方产品名称
	 */
	private String openProductName;

	/** 
	* 本次还款时逾期期数(不包括已经还逾期的，没有则为0)：如1=第1期逾期
	 */
	private String ovdTerms;

	/** 
	* 本次还款利息(单位：分)
	 */
	private Long paidInterest;

	/** 
	* 本次还款罚息(单位：分)
	 */
	private Long paidPenalty;

	/** 
	* 本次还款本金(单位：分)
	 */
	private Long paidPrincipal;

	/** 
	* 本次还款总金额(单位：分)：本次逾期本金+本次逾期利息+本次逾期罚息
	 */
	private Long paidTotalAmount;

	/** 
	* 期次对应借据应还利息(单位：分)
	 */
	private Long payableInterest;

	/** 
	* 期次对应借据应还罚息(单位：分，没有则为0)=本金罚息+利息罚息
	 */
	private Long payablePenalty;

	/** 
	* 期次对应借据应还本金(单位：分)
	 */
	private Long payablePrincipal;

	/** 
	* 期次对应借据应还总金额(单位：分)：应还本金+应还利息+应还罚息
	 */
	private Long payableTotalAmount;

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
	* 本金逾期天数(没有则为0)
	 */
	private Long prinOvdDays;

	/** 
	* 本次还款日期
	 */
	private String repayRealDate;

	/** 
	* 还款期数：如1=第1期
	 */
	private String repaymentTerms;

	/** 
	* 发送钉钉卡片消息：0 不发送，1 发送
	 */
	private Long sendDingDingMsg;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setCurrentUnpaidInterest(Long currentUnpaidInterest) {
		this.currentUnpaidInterest = currentUnpaidInterest;
	}

	public Long getCurrentUnpaidInterest() {
		return this.currentUnpaidInterest;
	}

	public void setCurrentUnpaidPenalty(Long currentUnpaidPenalty) {
		this.currentUnpaidPenalty = currentUnpaidPenalty;
	}

	public Long getCurrentUnpaidPenalty() {
		return this.currentUnpaidPenalty;
	}

	public void setCurrentUnpaidPrincipal(Long currentUnpaidPrincipal) {
		this.currentUnpaidPrincipal = currentUnpaidPrincipal;
	}

	public Long getCurrentUnpaidPrincipal() {
		return this.currentUnpaidPrincipal;
	}

	public void setCurrentUnpaidTotalAmount(Long currentUnpaidTotalAmount) {
		this.currentUnpaidTotalAmount = currentUnpaidTotalAmount;
	}

	public Long getCurrentUnpaidTotalAmount() {
		return this.currentUnpaidTotalAmount;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setIntOvdDays(Long intOvdDays) {
		this.intOvdDays = intOvdDays;
	}

	public Long getIntOvdDays() {
		return this.intOvdDays;
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

	public void setOpenProductName(String openProductName) {
		this.openProductName = openProductName;
	}

	public String getOpenProductName() {
		return this.openProductName;
	}

	public void setOvdTerms(String ovdTerms) {
		this.ovdTerms = ovdTerms;
	}

	public String getOvdTerms() {
		return this.ovdTerms;
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

	public void setPrinOvdDays(Long prinOvdDays) {
		this.prinOvdDays = prinOvdDays;
	}

	public Long getPrinOvdDays() {
		return this.prinOvdDays;
	}

	public void setRepayRealDate(String repayRealDate) {
		this.repayRealDate = repayRealDate;
	}

	public String getRepayRealDate() {
		return this.repayRealDate;
	}

	public void setRepaymentTerms(String repaymentTerms) {
		this.repaymentTerms = repaymentTerms;
	}

	public String getRepaymentTerms() {
		return this.repaymentTerms;
	}

	public void setSendDingDingMsg(Long sendDingDingMsg) {
		this.sendDingDingMsg = sendDingDingMsg;
	}

	public Long getSendDingDingMsg() {
		return this.sendDingDingMsg;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.notify.repayment.overdue";
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
		txtParams.put("current_unpaid_interest", this.currentUnpaidInterest);
		txtParams.put("current_unpaid_penalty", this.currentUnpaidPenalty);
		txtParams.put("current_unpaid_principal", this.currentUnpaidPrincipal);
		txtParams.put("current_unpaid_total_amount", this.currentUnpaidTotalAmount);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("int_ovd_days", this.intOvdDays);
		txtParams.put("loan_order_no", this.loanOrderNo);
		txtParams.put("open_channel_name", this.openChannelName);
		txtParams.put("open_product_name", this.openProductName);
		txtParams.put("ovd_terms", this.ovdTerms);
		txtParams.put("paid_interest", this.paidInterest);
		txtParams.put("paid_penalty", this.paidPenalty);
		txtParams.put("paid_principal", this.paidPrincipal);
		txtParams.put("paid_total_amount", this.paidTotalAmount);
		txtParams.put("payable_interest", this.payableInterest);
		txtParams.put("payable_penalty", this.payablePenalty);
		txtParams.put("payable_principal", this.payablePrincipal);
		txtParams.put("payable_total_amount", this.payableTotalAmount);
		txtParams.put("period_paid_interest", this.periodPaidInterest);
		txtParams.put("period_paid_penalty", this.periodPaidPenalty);
		txtParams.put("period_paid_principal", this.periodPaidPrincipal);
		txtParams.put("period_paid_total_amount", this.periodPaidTotalAmount);
		txtParams.put("period_payable_interest", this.periodPayableInterest);
		txtParams.put("period_payable_penalty", this.periodPayablePenalty);
		txtParams.put("period_payable_principal", this.periodPayablePrincipal);
		txtParams.put("period_payable_total_amount", this.periodPayableTotalAmount);
		txtParams.put("prin_ovd_days", this.prinOvdDays);
		txtParams.put("repay_real_date", this.repayRealDate);
		txtParams.put("repayment_terms", this.repaymentTerms);
		txtParams.put("send_ding_ding_msg", this.sendDingDingMsg);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanNotifyRepaymentOverdueResponse> getResponseClass() {
		return OapiFinanceLoanNotifyRepaymentOverdueResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(currentUnpaidInterest, "currentUnpaidInterest");
		RequestCheckUtils.checkNotEmpty(currentUnpaidPenalty, "currentUnpaidPenalty");
		RequestCheckUtils.checkNotEmpty(currentUnpaidPrincipal, "currentUnpaidPrincipal");
		RequestCheckUtils.checkNotEmpty(currentUnpaidTotalAmount, "currentUnpaidTotalAmount");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(intOvdDays, "intOvdDays");
		RequestCheckUtils.checkNotEmpty(loanOrderNo, "loanOrderNo");
		RequestCheckUtils.checkNotEmpty(openChannelName, "openChannelName");
		RequestCheckUtils.checkNotEmpty(openProductName, "openProductName");
		RequestCheckUtils.checkNotEmpty(ovdTerms, "ovdTerms");
		RequestCheckUtils.checkNotEmpty(paidInterest, "paidInterest");
		RequestCheckUtils.checkNotEmpty(paidPenalty, "paidPenalty");
		RequestCheckUtils.checkNotEmpty(paidPrincipal, "paidPrincipal");
		RequestCheckUtils.checkNotEmpty(paidTotalAmount, "paidTotalAmount");
		RequestCheckUtils.checkNotEmpty(payableInterest, "payableInterest");
		RequestCheckUtils.checkNotEmpty(payablePenalty, "payablePenalty");
		RequestCheckUtils.checkNotEmpty(payablePrincipal, "payablePrincipal");
		RequestCheckUtils.checkNotEmpty(payableTotalAmount, "payableTotalAmount");
		RequestCheckUtils.checkNotEmpty(periodPaidInterest, "periodPaidInterest");
		RequestCheckUtils.checkNotEmpty(periodPaidPenalty, "periodPaidPenalty");
		RequestCheckUtils.checkNotEmpty(periodPaidPrincipal, "periodPaidPrincipal");
		RequestCheckUtils.checkNotEmpty(periodPaidTotalAmount, "periodPaidTotalAmount");
		RequestCheckUtils.checkNotEmpty(periodPayableInterest, "periodPayableInterest");
		RequestCheckUtils.checkNotEmpty(periodPayablePenalty, "periodPayablePenalty");
		RequestCheckUtils.checkNotEmpty(periodPayablePrincipal, "periodPayablePrincipal");
		RequestCheckUtils.checkNotEmpty(periodPayableTotalAmount, "periodPayableTotalAmount");
		RequestCheckUtils.checkNotEmpty(prinOvdDays, "prinOvdDays");
		RequestCheckUtils.checkNotEmpty(repayRealDate, "repayRealDate");
		RequestCheckUtils.checkNotEmpty(repaymentTerms, "repaymentTerms");
		RequestCheckUtils.checkNotEmpty(sendDingDingMsg, "sendDingDingMsg");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}