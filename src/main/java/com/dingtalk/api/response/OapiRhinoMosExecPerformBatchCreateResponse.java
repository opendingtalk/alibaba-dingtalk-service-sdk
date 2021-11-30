package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.batch.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecPerformBatchCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4721713367456586633L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("operation_perform_dto")
	private List<OperationPerformDto> model;


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

	public void setModel(List<OperationPerformDto> model) {
		this.model = model;
	}
	public List<OperationPerformDto> getModel( ) {
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
	public static class OperationPerformDto extends TaobaoObject {
		private static final long serialVersionUID = 5774168188814581889L;
		/**
		 * 是否生效
		 */
		@ApiField("active")
		private String active;
		/**
		 * 批量id
		 */
		@ApiField("batch_id")
		private Long batchId;
		/**
		 * 上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 创建类型
		 */
		@ApiField("create_type")
		private String createType;
		/**
		 * 设备id
		 */
		@ApiListField("device_ids")
		@ApiField("number")
		private List<Long> deviceIds;
		/**
		 * 实体id
		 */
		@ApiField("entity_id")
		private Long entityId;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * flow版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 执行记录id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 工序类型
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 工序uid
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 执行状态
		 */
		@ApiField("perform_status")
		private String performStatus;
		/**
		 * 执行类型
		 */
		@ApiField("perform_type")
		private String performType;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 工序类型code
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工序处理结束时间
		 */
		@ApiField("processing_end_time")
		private Date processingEndTime;
		/**
		 * 工序处理开始时间
		 */
		@ApiField("processing_start_time")
		private Date processingStartTime;
		/**
		 * 工段
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * sourceId
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * source类型
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 工号
		 */
		@ApiListField("work_nos")
		@ApiField("string")
		private List<String> workNos;
		/**
		 * 站位
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public String getActive() {
			return this.active;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public Long getBatchId() {
			return this.batchId;
		}
		public void setBatchId(Long batchId) {
			this.batchId = batchId;
		}
		public String getContext() {
			return this.context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public void setContextString(String context) {
			this.context = context;
		}
		
		public String getCreateType() {
			return this.createType;
		}
		public void setCreateType(String createType) {
			this.createType = createType;
		}
		public List<Long> getDeviceIds() {
			return this.deviceIds;
		}
		public void setDeviceIds(List<Long> deviceIds) {
			this.deviceIds = deviceIds;
		}
		public Long getEntityId() {
			return this.entityId;
		}
		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getPerformStatus() {
			return this.performStatus;
		}
		public void setPerformStatus(String performStatus) {
			this.performStatus = performStatus;
		}
		public String getPerformType() {
			return this.performType;
		}
		public void setPerformType(String performType) {
			this.performType = performType;
		}
		public Long getPriority() {
			return this.priority;
		}
		public void setPriority(Long priority) {
			this.priority = priority;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public Date getProcessingEndTime() {
			return this.processingEndTime;
		}
		public void setProcessingEndTime(Date processingEndTime) {
			this.processingEndTime = processingEndTime;
		}
		public Date getProcessingStartTime() {
			return this.processingStartTime;
		}
		public void setProcessingStartTime(Date processingStartTime) {
			this.processingStartTime = processingStartTime;
		}
		public String getSectionCode() {
			return this.sectionCode;
		}
		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public List<String> getWorkNos() {
			return this.workNos;
		}
		public void setWorkNos(List<String> workNos) {
			this.workNos = workNos;
		}
		public String getWorkstationCode() {
			return this.workstationCode;
		}
		public void setWorkstationCode(String workstationCode) {
			this.workstationCode = workstationCode;
		}
	}
	


}
