package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.worker.checkin.batch.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosSpaceWorkerCheckinBatchListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8727256956326815478L;

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
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("prod_workstation_worker_check_dto")
	private List<ProdWorkstationWorkerCheckDto> model;


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

	public void setModel(List<ProdWorkstationWorkerCheckDto> model) {
		this.model = model;
	}
	public List<ProdWorkstationWorkerCheckDto> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationWorkerCheckDto extends TaobaoObject {
		private static final long serialVersionUID = 2738684487761266917L;
		/**
		 * 登入时间
		 */
		@ApiField("check_in_time")
		private Date checkInTime;
		/**
		 * 登出时间
		 */
		@ApiField("check_out_time")
		private Date checkOutTime;
		/**
		 * 登录状态
		 */
		@ApiField("check_status")
		private String checkStatus;
		/**
		 * 租户
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
		/**
		 * 工位
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public Date getCheckInTime() {
			return this.checkInTime;
		}
		public void setCheckInTime(Date checkInTime) {
			this.checkInTime = checkInTime;
		}
		public Date getCheckOutTime() {
			return this.checkOutTime;
		}
		public void setCheckOutTime(Date checkOutTime) {
			this.checkOutTime = checkOutTime;
		}
		public String getCheckStatus() {
			return this.checkStatus;
		}
		public void setCheckStatus(String checkStatus) {
			this.checkStatus = checkStatus;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
		public String getWorkstationCode() {
			return this.workstationCode;
		}
		public void setWorkstationCode(String workstationCode) {
			this.workstationCode = workstationCode;
		}
	}
	


}
