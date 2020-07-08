package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.productionorder.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecProductionorderListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6621333964361393138L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 生产订单信息
	 */
	@ApiListField("result")
	@ApiField("production_order_dto")
	private List<ProductionOrderDto> result;


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

	public void setResult(List<ProductionOrderDto> result) {
		this.result = result;
	}
	public List<ProductionOrderDto> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 生产订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductionOrderDto extends TaobaoObject {
		private static final long serialVersionUID = 3716142443329219871L;
		/**
		 * 外部订单ID
		 */
		@ApiField("order_external_id")
		private String orderExternalId;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 生产结束时间
		 */
		@ApiField("production_end_time")
		private Date productionEndTime;
		/**
		 * 生产开始时间
		 */
		@ApiField("production_start_time")
		private Date productionStartTime;
		/**
		 * 生产状态
		 */
		@ApiField("production_status")
		private String productionStatus;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getOrderExternalId() {
			return this.orderExternalId;
		}
		public void setOrderExternalId(String orderExternalId) {
			this.orderExternalId = orderExternalId;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Date getProductionEndTime() {
			return this.productionEndTime;
		}
		public void setProductionEndTime(Date productionEndTime) {
			this.productionEndTime = productionEndTime;
		}
		public Date getProductionStartTime() {
			return this.productionStartTime;
		}
		public void setProductionStartTime(Date productionStartTime) {
			this.productionStartTime = productionStartTime;
		}
		public String getProductionStatus() {
			return this.productionStatus;
		}
		public void setProductionStatus(String productionStatus) {
			this.productionStatus = productionStatus;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
