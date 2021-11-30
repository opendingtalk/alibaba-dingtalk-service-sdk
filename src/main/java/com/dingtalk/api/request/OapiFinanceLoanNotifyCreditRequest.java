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

import com.dingtalk.api.response.OapiFinanceLoanNotifyCreditResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.credit request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.25
 */
public class OapiFinanceLoanNotifyCreditRequest extends BaseTaobaoRequest<OapiFinanceLoanNotifyCreditResponse> {
	
	

	/** 
	* 授信额度(单位：分)，授信成功必需
	 */
	private Long amount;

	/** 
	* 可用授信额度
	 */
	private Long availableAmount;

	/** 
	* 授信金额变化值： 等于0(默认) 不变，大于0 增加，小于0 减少
	 */
	private Long changeAmount;

	/** 
	* 授信完成时间
	 */
	private String completeTime;

	/** 
	* 授信编号
	 */
	private String creditNo;

	/** 
	* 授信类型：null或0(默认) 授信额度无变化，1 授信额度有变化，变化值见changeAmount
	 */
	private Long creditType;

	/** 
	* 日利率(精确4位小数，百分之*)，样例：0.0125
	 */
	private String dailyInterestRate;

	/** 
	* 扩展信息
	 */
	private String extension;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 下一次申请日期
	 */
	private String nextApplyDay;

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
	* 拒绝原因错误码，授信失败必需
	 */
	private String refuseCode;

	/** 
	* 拒绝原因，授信失败必需
	 */
	private String refuseReason;

	/** 
	* 授信结果：0 未提交，1 授信申请中，2 授信成功审批通过，3 授信失败审批拒绝
	 */
	private Long status;

	/** 
	* 授信提交申请时间
	 */
	private String submitTime;

	/** 
	* 手机号
	 */
	private String userMobile;

	/** 
	* 年利率(精确2位小数，百分之*)，样例：5.45
	 */
	private String yearInterestRate;

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

	public void setChangeAmount(Long changeAmount) {
		this.changeAmount = changeAmount;
	}

	public Long getChangeAmount() {
		return this.changeAmount;
	}

	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}

	public String getCompleteTime() {
		return this.completeTime;
	}

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getCreditNo() {
		return this.creditNo;
	}

	public void setCreditType(Long creditType) {
		this.creditType = creditType;
	}

	public Long getCreditType() {
		return this.creditType;
	}

	public void setDailyInterestRate(String dailyInterestRate) {
		this.dailyInterestRate = dailyInterestRate;
	}

	public String getDailyInterestRate() {
		return this.dailyInterestRate;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setNextApplyDay(String nextApplyDay) {
		this.nextApplyDay = nextApplyDay;
	}

	public String getNextApplyDay() {
		return this.nextApplyDay;
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

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setYearInterestRate(String yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}

	public String getYearInterestRate() {
		return this.yearInterestRate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.notify.credit";
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
		txtParams.put("change_amount", this.changeAmount);
		txtParams.put("complete_time", this.completeTime);
		txtParams.put("credit_no", this.creditNo);
		txtParams.put("credit_type", this.creditType);
		txtParams.put("daily_interest_rate", this.dailyInterestRate);
		txtParams.put("extension", this.extension);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("next_apply_day", this.nextApplyDay);
		txtParams.put("open_channel_name", this.openChannelName);
		txtParams.put("open_product_code", this.openProductCode);
		txtParams.put("open_product_name", this.openProductName);
		txtParams.put("open_product_type", this.openProductType);
		txtParams.put("refuse_code", this.refuseCode);
		txtParams.put("refuse_reason", this.refuseReason);
		txtParams.put("status", this.status);
		txtParams.put("submit_time", this.submitTime);
		txtParams.put("user_mobile", this.userMobile);
		txtParams.put("year_interest_rate", this.yearInterestRate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanNotifyCreditResponse> getResponseClass() {
		return OapiFinanceLoanNotifyCreditResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(amount, "amount");
		RequestCheckUtils.checkNotEmpty(availableAmount, "availableAmount");
		RequestCheckUtils.checkNotEmpty(changeAmount, "changeAmount");
		RequestCheckUtils.checkNotEmpty(completeTime, "completeTime");
		RequestCheckUtils.checkNotEmpty(creditNo, "creditNo");
		RequestCheckUtils.checkNotEmpty(creditType, "creditType");
		RequestCheckUtils.checkNotEmpty(dailyInterestRate, "dailyInterestRate");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(nextApplyDay, "nextApplyDay");
		RequestCheckUtils.checkNotEmpty(openChannelName, "openChannelName");
		RequestCheckUtils.checkNotEmpty(openProductCode, "openProductCode");
		RequestCheckUtils.checkNotEmpty(openProductName, "openProductName");
		RequestCheckUtils.checkNotEmpty(openProductType, "openProductType");
		RequestCheckUtils.checkNotEmpty(refuseCode, "refuseCode");
		RequestCheckUtils.checkNotEmpty(refuseReason, "refuseReason");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(submitTime, "submitTime");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
		RequestCheckUtils.checkNotEmpty(yearInterestRate, "yearInterestRate");
	}
	

}