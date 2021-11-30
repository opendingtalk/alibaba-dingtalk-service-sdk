package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.microapp.industry.order.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MicroappIndustryOrderQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4814958255517751672L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private IndustryOrderQueryOpenResponse result;


	public void setResult(IndustryOrderQueryOpenResponse result) {
		this.result = result;
	}
	public IndustryOrderQueryOpenResponse getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IndustryOrderQueryOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 8129596499958693689L;
		/**
		 * 业务金额(分)
		 */
		@ApiField("biz_amount")
		private Long bizAmount;
		/**
		 * 业务码，钉钉统一分配
		 */
		@ApiField("biz_code")
		private String bizCode;
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
		 * 业务产品码
		 */
		@ApiField("biz_prod_id")
		private String bizProdId;
		/**
		 * 扩展信息，Json格式
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 外部流水号
		 */
		@ApiField("out_biz_no")
		private String outBizNo;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 业务操作是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getBizAmount() {
			return this.bizAmount;
		}
		public void setBizAmount(Long bizAmount) {
			this.bizAmount = bizAmount;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
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
		public String getBizProdId() {
			return this.bizProdId;
		}
		public void setBizProdId(String bizProdId) {
			this.bizProdId = bizProdId;
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
		public String getOutBizNo() {
			return this.outBizNo;
		}
		public void setOutBizNo(String outBizNo) {
			this.outBizNo = outBizNo;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
