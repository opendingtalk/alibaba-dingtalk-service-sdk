package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.querySourceByProductOrder response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderQuerySourceByProductOrderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7558529367151594939L;

	/** 
	 * 响应体
	 */
	@ApiField("result")
	private HsfResult result;


	public void setResult(HsfResult result) {
		this.result = result;
	}
	public HsfResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QuerySourceByProductOrderResp extends TaobaoObject {
		private static final long serialVersionUID = 5814459955836785726L;
		/**
		 * 销售订单id
		 */
		@ApiField("salesOrderId")
		private Long salesOrderId;
		/**
		 * 来源
		 */
		@ApiField("source")
		private String source;
	
		public Long getSalesOrderId() {
			return this.salesOrderId;
		}
		public void setSalesOrderId(Long salesOrderId) {
			this.salesOrderId = salesOrderId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
	}
	
	/**
	 * 响应体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HsfResult extends TaobaoObject {
		private static final long serialVersionUID = 4832526444696886932L;
		/**
		 * 返回码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 返回信息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 额外信息
		 */
		@ApiField("externalMsgInfo")
		private String externalMsgInfo;
		/**
		 * 调用结果
		 */
		@ApiListField("model")
		@ApiField("query_source_by_product_order_resp")
		private List<QuerySourceByProductOrderResp> model;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public String getExternalMsgInfo() {
			return this.externalMsgInfo;
		}
		public void setExternalMsgInfo(String externalMsgInfo) {
			this.externalMsgInfo = externalMsgInfo;
		}
		public List<QuerySourceByProductOrderResp> getModel() {
			return this.model;
		}
		public void setModel(List<QuerySourceByProductOrderResp> model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
