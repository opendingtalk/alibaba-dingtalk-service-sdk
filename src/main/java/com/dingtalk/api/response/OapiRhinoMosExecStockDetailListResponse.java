package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.stock.detail.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecStockDetailListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7725239455163974434L;

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
	 * 工序数量
	 */
	@ApiListField("model")
	@ApiField("operation_stock_detail_d_t_o")
	private List<OperationStockDetailDTO> model;

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

	public void setModel(List<OperationStockDetailDTO> model) {
		this.model = model;
	}
	public List<OperationStockDetailDTO> getModel( ) {
		return this.model;
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
	 * 工序数量
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationStockDetailDTO extends TaobaoObject {
		private static final long serialVersionUID = 4134458726645147119L;
		/**
		 * 工序ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 堆货时长
		 */
		@ApiField("stock_time")
		private String stockTime;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 工位
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getStockTime() {
			return this.stockTime;
		}
		public void setStockTime(String stockTime) {
			this.stockTime = stockTime;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getWorkstationCode() {
			return this.workstationCode;
		}
		public void setWorkstationCode(String workstationCode) {
			this.workstationCode = workstationCode;
		}
	}
	


}
