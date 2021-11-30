package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiRhinoMosLayoutOperationdefsEditassignResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.layout.operationdefs.editassign request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.23
 */
public class OapiRhinoMosLayoutOperationdefsEditassignRequest extends BaseTaobaoRequest<OapiRhinoMosLayoutOperationdefsEditassignResponse> {
	
	

	/** 
	* 分配信息修改明细列表
	 */
	private String assignInfoModifyItems;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setAssignInfoModifyItems(String assignInfoModifyItems) {
		this.assignInfoModifyItems = assignInfoModifyItems;
	}

	public void setAssignInfoModifyItems(List<AssignInfoModifyItem> assignInfoModifyItems) {
		this.assignInfoModifyItems = new JSONWriter(false,false,true).write(assignInfoModifyItems);
	}

	public String getAssignInfoModifyItems() {
		return this.assignInfoModifyItems;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
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
		return "dingtalk.oapi.rhino.mos.layout.operationdefs.editassign";
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
		txtParams.put("assign_info_modify_items", this.assignInfoModifyItems);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosLayoutOperationdefsEditassignResponse> getResponseClass() {
		return OapiRhinoMosLayoutOperationdefsEditassignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(assignInfoModifyItems, 500, "assignInfoModifyItems");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	
	/**
	 * 工序执行器分配列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationExecutorAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 1682799777835818638L;
		/**
		 * 工序执行器ID
		 */
		@ApiField("executor_id")
		private String executorId;
		/**
		 * 排序值
		 */
		@ApiField("order_num")
		private Long orderNum;
	
		public String getExecutorId() {
			return this.executorId;
		}
		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}
		public Long getOrderNum() {
			return this.orderNum;
		}
		public void setOrderNum(Long orderNum) {
			this.orderNum = orderNum;
		}
	}
	
	/**
	 * 设备分配列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 8438699939687148959L;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private Long deviceId;
		/**
		 * 设备模型ID
		 */
		@ApiField("device_model_id")
		private String deviceModelId;
		/**
		 * 设备模型名称
		 */
		@ApiField("device_model_name")
		private String deviceModelName;
		/**
		 * 设备模型版本
		 */
		@ApiField("device_model_version")
		private String deviceModelVersion;
	
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceModelId() {
			return this.deviceModelId;
		}
		public void setDeviceModelId(String deviceModelId) {
			this.deviceModelId = deviceModelId;
		}
		public String getDeviceModelName() {
			return this.deviceModelName;
		}
		public void setDeviceModelName(String deviceModelName) {
			this.deviceModelName = deviceModelName;
		}
		public String getDeviceModelVersion() {
			return this.deviceModelVersion;
		}
		public void setDeviceModelVersion(String deviceModelVersion) {
			this.deviceModelVersion = deviceModelVersion;
		}
	}
	
	/**
	 * 人员分配列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkerAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 7253199579322425395L;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	
	/**
	 * 站位分配
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkstationAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 1357998557147177323L;
		/**
		 * 站位编码
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public String getWorkstationCode() {
			return this.workstationCode;
		}
		public void setWorkstationCode(String workstationCode) {
			this.workstationCode = workstationCode;
		}
	}
	
	/**
	 * 分配单元列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WorkUnitDto extends TaobaoObject {
		private static final long serialVersionUID = 3636542758787952872L;
		/**
		 * 设备分配列表
		 */
		@ApiListField("device_assigns")
		@ApiField("device_assign_dto")
		private List<DeviceAssignDto> deviceAssigns;
		/**
		 * 人员分配列表
		 */
		@ApiListField("worker_assigns")
		@ApiField("worker_assign_dto")
		private List<WorkerAssignDto> workerAssigns;
		/**
		 * 站位分配
		 */
		@ApiListField("workstation_assigns")
		@ApiField("workstation_assign_dto")
		private List<WorkstationAssignDto> workstationAssigns;
	
		public List<DeviceAssignDto> getDeviceAssigns() {
			return this.deviceAssigns;
		}
		public void setDeviceAssigns(List<DeviceAssignDto> deviceAssigns) {
			this.deviceAssigns = deviceAssigns;
		}
		public List<WorkerAssignDto> getWorkerAssigns() {
			return this.workerAssigns;
		}
		public void setWorkerAssigns(List<WorkerAssignDto> workerAssigns) {
			this.workerAssigns = workerAssigns;
		}
		public List<WorkstationAssignDto> getWorkstationAssigns() {
			return this.workstationAssigns;
		}
		public void setWorkstationAssigns(List<WorkstationAssignDto> workstationAssigns) {
			this.workstationAssigns = workstationAssigns;
		}
	}
	
	/**
	 * 分配信息修改明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AssignInfoModifyItem extends TaobaoObject {
		private static final long serialVersionUID = 3742146367281473635L;
		/**
		 * 工序执行器分配列表
		 */
		@ApiListField("operation_executor_assigns")
		@ApiField("operation_executor_assign_dto")
		private List<OperationExecutorAssignDto> operationExecutorAssigns;
		/**
		 * 工序外部ID
		 */
		@ApiField("operation_external_id")
		private String operationExternalId;
		/**
		 * 工序唯一ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 分配单元列表
		 */
		@ApiListField("work_units")
		@ApiField("work_unit_dto")
		private List<WorkUnitDto> workUnits;
	
		public List<OperationExecutorAssignDto> getOperationExecutorAssigns() {
			return this.operationExecutorAssigns;
		}
		public void setOperationExecutorAssigns(List<OperationExecutorAssignDto> operationExecutorAssigns) {
			this.operationExecutorAssigns = operationExecutorAssigns;
		}
		public String getOperationExternalId() {
			return this.operationExternalId;
		}
		public void setOperationExternalId(String operationExternalId) {
			this.operationExternalId = operationExternalId;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public List<WorkUnitDto> getWorkUnits() {
			return this.workUnits;
		}
		public void setWorkUnits(List<WorkUnitDto> workUnits) {
			this.workUnits = workUnits;
		}
	}
	

}