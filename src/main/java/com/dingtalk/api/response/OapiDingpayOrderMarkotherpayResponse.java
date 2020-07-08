package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.markotherpay response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayOrderMarkotherpayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5573564938511795341L;

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
	private OrderMarkOtherPayOpenResponse result;

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

	public void setResult(OrderMarkOtherPayOpenResponse result) {
		this.result = result;
	}
	public OrderMarkOtherPayOpenResponse getResult( ) {
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
	public static class OrderMarkOtherPayOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 7651447776895215626L;
		/**
		 * 标记结果
		 */
		@ApiField("result_map")
		private String resultMap;
	
		public String getResultMap() {
			return this.resultMap;
		}
		public void setResultMap(String resultMap) {
			this.resultMap = resultMap;
		}
		public void setResultMapString(String resultMap) {
			this.resultMap = resultMap;
		}
		
	}
	


}
