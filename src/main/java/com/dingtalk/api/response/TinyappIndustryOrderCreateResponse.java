package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.tinyapp.industry.order.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TinyappIndustryOrderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3522366592978759913L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private IndustryOrderCreateOpenResponse result;


	public void setResult(IndustryOrderCreateOpenResponse result) {
		this.result = result;
	}
	public IndustryOrderCreateOpenResponse getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IndustryOrderCreateOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 4381638748857541179L;
		/**
		 * 业务错误码
		 */
		@ApiField("biz_error_code")
		private String bizErrorCode;
		/**
		 * 业务错误码描述
		 */
		@ApiField("biz_error_msg")
		private String bizErrorMsg;
		/**
		 * 扩展信息，Json格式
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 钉钉订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 支付url，用于通过jsapi唤起收银台
		 */
		@ApiField("pay_url")
		private String payUrl;
		/**
		 * 业务是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getBizErrorCode() {
			return this.bizErrorCode;
		}
		public void setBizErrorCode(String bizErrorCode) {
			this.bizErrorCode = bizErrorCode;
		}
		public String getBizErrorMsg() {
			return this.bizErrorMsg;
		}
		public void setBizErrorMsg(String bizErrorMsg) {
			this.bizErrorMsg = bizErrorMsg;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getPayUrl() {
			return this.payUrl;
		}
		public void setPayUrl(String payUrl) {
			this.payUrl = payUrl;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
