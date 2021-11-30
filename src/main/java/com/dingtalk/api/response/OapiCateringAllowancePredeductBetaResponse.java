package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.allowance.prededuct.beta response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringAllowancePredeductBetaResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1828862361558261667L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 预抵扣结果
	 */
	@ApiField("result")
	private CateringOpenPreDeductResponse result;


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

	public void setResult(CateringOpenPreDeductResponse result) {
		this.result = result;
	}
	public CateringOpenPreDeductResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 预抵扣结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CateringOpenPreDeductResponse extends TaobaoObject {
		private static final long serialVersionUID = 1753583432642898685L;
		/**
		 * 已经预抵扣的金额
		 */
		@ApiField("deducted_amount")
		private Long deductedAmount;
		/**
		 * 餐补规则编码
		 */
		@ApiField("meal_plan_no")
		private String mealPlanNo;
	
		public Long getDeductedAmount() {
			return this.deductedAmount;
		}
		public void setDeductedAmount(Long deductedAmount) {
			this.deductedAmount = deductedAmount;
		}
		public String getMealPlanNo() {
			return this.mealPlanNo;
		}
		public void setMealPlanNo(String mealPlanNo) {
			this.mealPlanNo = mealPlanNo;
		}
	}
	


}
