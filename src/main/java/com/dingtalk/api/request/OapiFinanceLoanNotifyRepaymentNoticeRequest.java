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

import com.dingtalk.api.response.OapiFinanceLoanNotifyRepaymentNoticeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.repayment.notice request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.05
 */
public class OapiFinanceLoanNotifyRepaymentNoticeRequest extends BaseTaobaoRequest<OapiFinanceLoanNotifyRepaymentNoticeResponse> {
	
	

	/** 
	* 身份证号
	 */
	private String idCardNo;

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
	* 本次还款时逾期期数(不包括已经还逾期的，没有则为0)：如1,2=第1期+第2期都逾期
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
	* 本次还款日期
	 */
	private String repayRealDate;

	/** 
	* 还款期数：如1=第1期
	 */
	private String repaymentTerms;

	/** 
	* 手机号
	 */
	private String userMobile;

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

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.notify.repayment.notice";
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
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("loan_order_no", this.loanOrderNo);
		txtParams.put("open_channel_name", this.openChannelName);
		txtParams.put("open_product_name", this.openProductName);
		txtParams.put("ovd_terms", this.ovdTerms);
		txtParams.put("paid_interest", this.paidInterest);
		txtParams.put("paid_penalty", this.paidPenalty);
		txtParams.put("paid_principal", this.paidPrincipal);
		txtParams.put("paid_total_amount", this.paidTotalAmount);
		txtParams.put("repay_real_date", this.repayRealDate);
		txtParams.put("repayment_terms", this.repaymentTerms);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanNotifyRepaymentNoticeResponse> getResponseClass() {
		return OapiFinanceLoanNotifyRepaymentNoticeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(loanOrderNo, "loanOrderNo");
		RequestCheckUtils.checkNotEmpty(openChannelName, "openChannelName");
		RequestCheckUtils.checkNotEmpty(openProductName, "openProductName");
		RequestCheckUtils.checkNotEmpty(ovdTerms, "ovdTerms");
		RequestCheckUtils.checkNotEmpty(paidInterest, "paidInterest");
		RequestCheckUtils.checkNotEmpty(paidPenalty, "paidPenalty");
		RequestCheckUtils.checkNotEmpty(paidPrincipal, "paidPrincipal");
		RequestCheckUtils.checkNotEmpty(paidTotalAmount, "paidTotalAmount");
		RequestCheckUtils.checkNotEmpty(repayRealDate, "repayRealDate");
		RequestCheckUtils.checkNotEmpty(repaymentTerms, "repaymentTerms");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}