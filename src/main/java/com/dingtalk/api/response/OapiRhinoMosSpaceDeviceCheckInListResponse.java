package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.device.check.in.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosSpaceDeviceCheckInListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5329314816856316858L;

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
	 * 结果
	 */
	@ApiListField("model")
	@ApiField("prod_workstation_device_check_dto")
	private List<ProdWorkstationDeviceCheckDto> model;


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

	public void setModel(List<ProdWorkstationDeviceCheckDto> model) {
		this.model = model;
	}
	public List<ProdWorkstationDeviceCheckDto> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationDeviceCheckDto extends TaobaoObject {
		private static final long serialVersionUID = 4542157218833366287L;
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
		 * 登入登出状态
		 */
		@ApiField("check_status")
		private String checkStatus;
		/**
		 * device_id
		 */
		@ApiField("device_id")
		private Long deviceId;
		/**
		 * 站位code
		 */
		@ApiField("prod_workstation_code")
		private String prodWorkstationCode;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
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
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
		public String getProdWorkstationCode() {
			return this.prodWorkstationCode;
		}
		public void setProdWorkstationCode(String prodWorkstationCode) {
			this.prodWorkstationCode = prodWorkstationCode;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
