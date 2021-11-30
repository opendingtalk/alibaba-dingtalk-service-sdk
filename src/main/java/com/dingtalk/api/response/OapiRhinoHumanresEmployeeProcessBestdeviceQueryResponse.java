package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.process.bestdevice.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresEmployeeProcessBestdeviceQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6153759533812654858L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外返回信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * code
	 */
	@ApiField("hsfcode")
	private Long hsfcode;

	/** 
	 * 结果
	 */
	@ApiListField("model")
	@ApiField("employee_process_device_capacity_dto")
	private List<EmployeeProcessDeviceCapacityDto> model;

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setHsfcode(Long hsfcode) {
		this.hsfcode = hsfcode;
	}
	public Long getHsfcode( ) {
		return this.hsfcode;
	}

	public void setModel(List<EmployeeProcessDeviceCapacityDto> model) {
		this.model = model;
	}
	public List<EmployeeProcessDeviceCapacityDto> getModel( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmployeeProcessDeviceCapacityDto extends TaobaoObject {
		private static final long serialVersionUID = 8732432413356752186L;
		/**
		 * 设备型号id
		 */
		@ApiField("device_model_id")
		private String deviceModelId;
		/**
		 * 设备型号版本
		 */
		@ApiField("device_model_version")
		private String deviceModelVersion;
		/**
		 * 结构化工序id
		 */
		@ApiField("process_capacity_id")
		private Long processCapacityId;
		/**
		 * 生产次数
		 */
		@ApiField("production_quantity")
		private Long productionQuantity;
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
	
		public String getDeviceModelId() {
			return this.deviceModelId;
		}
		public void setDeviceModelId(String deviceModelId) {
			this.deviceModelId = deviceModelId;
		}
		public String getDeviceModelVersion() {
			return this.deviceModelVersion;
		}
		public void setDeviceModelVersion(String deviceModelVersion) {
			this.deviceModelVersion = deviceModelVersion;
		}
		public Long getProcessCapacityId() {
			return this.processCapacityId;
		}
		public void setProcessCapacityId(Long processCapacityId) {
			this.processCapacityId = processCapacityId;
		}
		public Long getProductionQuantity() {
			return this.productionQuantity;
		}
		public void setProductionQuantity(Long productionQuantity) {
			this.productionQuantity = productionQuantity;
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
	}
	


}
