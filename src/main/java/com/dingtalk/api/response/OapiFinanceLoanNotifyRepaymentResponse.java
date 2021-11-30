package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.notify.repayment response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceLoanNotifyRepaymentResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5466481429588539855L;

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
	 * 通用结果模型
	 */
	@ApiField("result")
	private OpenCommonResult result;

	/** 
	 * true 成功，false 异常
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

	public void setResult(OpenCommonResult result) {
		this.result = result;
	}
	public OpenCommonResult getResult( ) {
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
	 * 通用结果模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCommonResult extends TaobaoObject {
		private static final long serialVersionUID = 3194184397898848672L;
		/**
		 * 结果：Y 成功, N 失败
		 */
		@ApiField("result")
		private String result;
	
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
	}
	


}
