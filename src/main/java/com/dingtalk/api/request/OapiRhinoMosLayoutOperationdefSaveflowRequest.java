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
import com.dingtalk.api.response.OapiRhinoMosLayoutOperationdefSaveflowResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.layout.operationdef.saveflow request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiRhinoMosLayoutOperationdefSaveflowRequest extends BaseTaobaoRequest<OapiRhinoMosLayoutOperationdefSaveflowResponse> {
	
	

	/** 
	* 是否生效
	 */
	private Boolean active;

	/** 
	* 工序版本(指定版本时版本如果已经存在则幂等)
	 */
	private Long flowVersion;

	/** 
	* 工序定义列表
	 */
	private String operationDefs;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 来源系统
	 */
	private String source;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 是否暂存
	 */
	private Boolean tmpSave;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setFlowVersion(Long flowVersion) {
		this.flowVersion = flowVersion;
	}

	public Long getFlowVersion() {
		return this.flowVersion;
	}

	public void setOperationDefs(String operationDefs) {
		this.operationDefs = operationDefs;
	}

	public void setOperationDefs(List<OperationDefDto> operationDefs) {
		this.operationDefs = new JSONWriter(false,false,true).write(operationDefs);
	}

	public String getOperationDefs() {
		return this.operationDefs;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTmpSave(Boolean tmpSave) {
		this.tmpSave = tmpSave;
	}

	public Boolean getTmpSave() {
		return this.tmpSave;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.layout.operationdef.saveflow";
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
		txtParams.put("active", this.active);
		txtParams.put("flow_version", this.flowVersion);
		txtParams.put("operation_defs", this.operationDefs);
		txtParams.put("order_id", this.orderId);
		txtParams.put("source", this.source);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("tmp_save", this.tmpSave);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosLayoutOperationdefSaveflowResponse> getResponseClass() {
		return OapiRhinoMosLayoutOperationdefSaveflowResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(active, "active");
		RequestCheckUtils.checkObjectMaxListSize(operationDefs, 500, "operationDefs");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	
	/**
	 * 工序执行器分配
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationExecutorAssignDto extends TaobaoObject {
		private static final long serialVersionUID = 1299471169129428981L;
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
		private static final long serialVersionUID = 8289332577318856666L;
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
		private static final long serialVersionUID = 6737455794233273546L;
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
		private static final long serialVersionUID = 5158145489299987221L;
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
		private static final long serialVersionUID = 7445313572461632314L;
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
	 * 工序定义列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationDefDto extends TaobaoObject {
		private static final long serialVersionUID = 6499874928365552458L;
		/**
		 * 适用尺码
		 */
		@ApiField("applicable_size_code")
		private String applicableSizeCode;
		/**
		 * 是否需要自动调度
		 */
		@ApiField("auto_schedule")
		private Boolean autoSchedule;
		/**
		 * 业务编码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 业务来源
		 */
		@ApiField("biz_source")
		private String bizSource;
		/**
		 * 进入条件：ANY_MATCHALL_MATCH
		 */
		@ApiField("enter_condition")
		private String enterCondition;
		/**
		 * 执行系统
		 */
		@ApiField("exec_system")
		private String execSystem;
		/**
		 * PaaSflowID（只用于返回，保存会自增）
		 */
		@ApiField("flow_id")
		private Long flowId;
		/**
		 * 工序版本(指定版本时版本如果已经存在则幂等)
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 后续工序外部ID列表
		 */
		@ApiListField("next_operation_external_ids")
		@ApiField("string")
		private List<String> nextOperationExternalIds;
		/**
		 * 后续工序ID列表（只用于返回，保存请设置nextVirtualIds）
		 */
		@ApiListField("next_operation_uids")
		@ApiField("number")
		private List<Long> nextOperationUids;
		/**
		 * 工序执行器分配
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
		 * 工序类型：ASSISTQUALITY_INSPECTTECHNOLOGY
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 工序唯一ID（保存时已存在则复用，不存在会自增）
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 工序能力类型：SJPPTR等
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工段CODE：F-SLC..
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 工段名称：缝制-碎料裁床..
		 */
		@ApiField("section_name")
		private String sectionName;
		/**
		 * 是否跳过(不生产)
		 */
		@ApiField("skip")
		private Boolean skip;
		/**
		 * 标准工时秒
		 */
		@ApiField("std_cost")
		private String stdCost;
		/**
		 * 分配单元列表
		 */
		@ApiListField("work_units")
		@ApiField("work_unit_dto")
		private List<WorkUnitDto> workUnits;
	
		public String getApplicableSizeCode() {
			return this.applicableSizeCode;
		}
		public void setApplicableSizeCode(String applicableSizeCode) {
			this.applicableSizeCode = applicableSizeCode;
		}
		public Boolean getAutoSchedule() {
			return this.autoSchedule;
		}
		public void setAutoSchedule(Boolean autoSchedule) {
			this.autoSchedule = autoSchedule;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getBizSource() {
			return this.bizSource;
		}
		public void setBizSource(String bizSource) {
			this.bizSource = bizSource;
		}
		public String getEnterCondition() {
			return this.enterCondition;
		}
		public void setEnterCondition(String enterCondition) {
			this.enterCondition = enterCondition;
		}
		public String getExecSystem() {
			return this.execSystem;
		}
		public void setExecSystem(String execSystem) {
			this.execSystem = execSystem;
		}
		public Long getFlowId() {
			return this.flowId;
		}
		public void setFlowId(Long flowId) {
			this.flowId = flowId;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getNextOperationExternalIds() {
			return this.nextOperationExternalIds;
		}
		public void setNextOperationExternalIds(List<String> nextOperationExternalIds) {
			this.nextOperationExternalIds = nextOperationExternalIds;
		}
		public List<Long> getNextOperationUids() {
			return this.nextOperationUids;
		}
		public void setNextOperationUids(List<Long> nextOperationUids) {
			this.nextOperationUids = nextOperationUids;
		}
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
		public String getOperationType() {
			return this.operationType;
		}
		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSectionName() {
			return this.sectionName;
		}
		public void setSectionName(String sectionName) {
			this.sectionName = sectionName;
		}
		public Boolean getSkip() {
			return this.skip;
		}
		public void setSkip(Boolean skip) {
			this.skip = skip;
		}
		public String getStdCost() {
			return this.stdCost;
		}
		public void setStdCost(String stdCost) {
			this.stdCost = stdCost;
		}
		public List<WorkUnitDto> getWorkUnits() {
			return this.workUnits;
		}
		public void setWorkUnits(List<WorkUnitDto> workUnits) {
			this.workUnits = workUnits;
		}
	}
	

}