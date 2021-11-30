package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRhinoHumanresEmployeeProcessBestdeviceQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.process.bestdevice.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.06
 */
public class OapiRhinoHumanresEmployeeProcessBestdeviceQueryRequest extends BaseTaobaoRequest<OapiRhinoHumanresEmployeeProcessBestdeviceQueryResponse> {
	
	

	/** 
	* 可用设备型号
	 */
	private String availableDeviceModels;

	/** 
	* 人员工序关系
	 */
	private String employeeProcessCapacityUnits;

	/** 
	* 租户
	 */
	private String tenantId;

	/** 
	* 1
	 */
	private String userid;

	public void setAvailableDeviceModels(String availableDeviceModels) {
		this.availableDeviceModels = availableDeviceModels;
	}

	public void setAvailableDeviceModels(List<DeviceModelDto> availableDeviceModels) {
		this.availableDeviceModels = new JSONWriter(false,false,true).write(availableDeviceModels);
	}

	public String getAvailableDeviceModels() {
		return this.availableDeviceModels;
	}

	public void setEmployeeProcessCapacityUnits(String employeeProcessCapacityUnits) {
		this.employeeProcessCapacityUnits = employeeProcessCapacityUnits;
	}

	public void setEmployeeProcessCapacityUnits(List<EmployeeProcessCapacityUnitReq> employeeProcessCapacityUnits) {
		this.employeeProcessCapacityUnits = new JSONWriter(false,false,true).write(employeeProcessCapacityUnits);
	}

	public String getEmployeeProcessCapacityUnits() {
		return this.employeeProcessCapacityUnits;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.humanres.employee.process.bestdevice.query";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("available_device_models", this.availableDeviceModels);
		txtParams.put("employee_process_capacity_units", this.employeeProcessCapacityUnits);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoHumanresEmployeeProcessBestdeviceQueryResponse> getResponseClass() {
		return OapiRhinoHumanresEmployeeProcessBestdeviceQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(availableDeviceModels, 20, "availableDeviceModels");
		RequestCheckUtils.checkObjectMaxListSize(employeeProcessCapacityUnits, 20, "employeeProcessCapacityUnits");
	}
	
	/**
	 * 可用设备型号
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceModelDto extends TaobaoObject {
		private static final long serialVersionUID = 8211971143375947427L;
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
	}
	
	/**
	 * 人员工序关系
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmployeeProcessCapacityUnitReq extends TaobaoObject {
		private static final long serialVersionUID = 4758585253711893348L;
		/**
		 * 结构化工序id
		 */
		@ApiField("process_capacity_id")
		private Long processCapacityId;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
	
		public Long getProcessCapacityId() {
			return this.processCapacityId;
		}
		public void setProcessCapacityId(Long processCapacityId) {
			this.processCapacityId = processCapacityId;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	

}