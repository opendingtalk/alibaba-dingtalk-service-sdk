package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.applypay response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayOrderApplypayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7557943258975547313L;

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
	private OrderApplyPayOpenResponse result;

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

	public void setResult(OrderApplyPayOpenResponse result) {
		this.result = result;
	}
	public OrderApplyPayOpenResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderApplyPayOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 2221147941594384233L;
		/**
		 * 收银台需要的订单参数
		 */
		@ApiField("orderStr")
		private String orderStr;
	
		public String getOrderStr() {
			return this.orderStr;
		}
		public void setOrderStr(String orderStr) {
			this.orderStr = orderStr;
		}
	}
	


}
