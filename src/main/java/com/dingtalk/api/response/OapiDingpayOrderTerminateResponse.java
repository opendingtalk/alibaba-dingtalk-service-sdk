package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.terminate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayOrderTerminateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2249749356614537531L;

	/** 
	 * 钉钉错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * result
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private OrderTerminationOpenResponse result;

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

	public void setResult(OrderTerminationOpenResponse result) {
		this.result = result;
	}
	public OrderTerminationOpenResponse getResult( ) {
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
	 * 终止结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderTerminateResultItem extends TaobaoObject {
		private static final long serialVersionUID = 2712349416588235893L;
		/**
		 * 订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 是否终止
		 */
		@ApiField("terminated")
		private Boolean terminated;
	
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public Boolean getTerminated() {
			return this.terminated;
		}
		public void setTerminated(Boolean terminated) {
			this.terminated = terminated;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderTerminationOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 7113412317427494442L;
		/**
		 * 终止结果列表
		 */
		@ApiListField("terminate_result")
		@ApiField("order_terminate_result_item")
		private List<OrderTerminateResultItem> terminateResult;
	
		public List<OrderTerminateResultItem> getTerminateResult() {
			return this.terminateResult;
		}
		public void setTerminateResult(List<OrderTerminateResultItem> terminateResult) {
			this.terminateResult = terminateResult;
		}
	}
	


}
