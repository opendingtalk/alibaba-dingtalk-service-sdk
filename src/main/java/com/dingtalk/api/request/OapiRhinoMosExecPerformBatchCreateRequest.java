package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRhinoMosExecPerformBatchCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.batch.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.18
 */
public class OapiRhinoMosExecPerformBatchCreateRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformBatchCreateResponse> {
	
	

	/** 
	* 入参
	 */
	private String batchCreateOperationReq;

	public void setBatchCreateOperationReq(String batchCreateOperationReq) {
		this.batchCreateOperationReq = batchCreateOperationReq;
	}

	public void setBatchCreateOperationReq(BatchCreateOperationWithEntityReq batchCreateOperationReq) {
		this.batchCreateOperationReq = new JSONWriter(false,false,true).write(batchCreateOperationReq);
	}

	public String getBatchCreateOperationReq() {
		return this.batchCreateOperationReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.batch.create";
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
		txtParams.put("batch_create_operation_req", this.batchCreateOperationReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformBatchCreateResponse> getResponseClass() {
		return OapiRhinoMosExecPerformBatchCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 实体来源（暂未支持）
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 3456725912178151796L;
		/**
		 * sourceId
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * sourceType
		 */
		@ApiField("source_type")
		private String sourceType;
	
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
	}
	
	/**
	 * 实体条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EntityCondition extends TaobaoObject {
		private static final long serialVersionUID = 6685518916859316546L;
		/**
		 * 实体ids
		 */
		@ApiListField("entity_ids")
		@ApiField("number")
		private List<Long> entityIds;
		/**
		 * 实体来源（暂未支持）
		 */
		@ApiField("entity_source")
		private Source entitySource;
		/**
		 * 实体type
		 */
		@ApiField("entity_type")
		private String entityType;
	
		public List<Long> getEntityIds() {
			return this.entityIds;
		}
		public void setEntityIds(List<Long> entityIds) {
			this.entityIds = entityIds;
		}
		public Source getEntitySource() {
			return this.entitySource;
		}
		public void setEntitySource(Source entitySource) {
			this.entitySource = entitySource;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
	}
	
	/**
	 * 工序请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PerformOperationReq extends TaobaoObject {
		private static final long serialVersionUID = 5317525987284531252L;
		/**
		 * 上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 设备id
		 */
		@ApiListField("device_ids")
		@ApiField("number")
		private List<Long> deviceIds;
		/**
		 * flow版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序类型
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 工序唯一id
		 */
		@ApiField("operation_uid")
		private Long operationUid;
		/**
		 * 执行状态
		 */
		@ApiField("perform_status")
		private String performStatus;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 执行耗时
		 */
		@ApiField("process_cost_time")
		private String processCostTime;
		/**
		 * 执行完成时间
		 */
		@ApiField("process_end_time")
		private Date processEndTime;
		/**
		 * 执行开始时间
		 */
		@ApiField("process_start_time")
		private Date processStartTime;
		/**
		 * 工序类型码
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工段
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 工号
		 */
		@ApiListField("work_nos")
		@ApiField("string")
		private List<String> workNos;
		/**
		 * 工作站
		 */
		@ApiField("workstation_code")
		private String workstationCode;
	
		public String getContext() {
			return this.context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public void setContextString(String context) {
			this.context = context;
		}
		
		public List<Long> getDeviceIds() {
			return this.deviceIds;
		}
		public void setDeviceIds(List<Long> deviceIds) {
			this.deviceIds = deviceIds;
		}
		public Long getFlowVersion() {
			return this.flowVersion;
		}
		public void setFlowVersion(Long flowVersion) {
			this.flowVersion = flowVersion;
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
		public String getPerformStatus() {
			return this.performStatus;
		}
		public void setPerformStatus(String performStatus) {
			this.performStatus = performStatus;
		}
		public Long getPriority() {
			return this.priority;
		}
		public void setPriority(Long priority) {
			this.priority = priority;
		}
		public String getProcessCostTime() {
			return this.processCostTime;
		}
		public void setProcessCostTime(String processCostTime) {
			this.processCostTime = processCostTime;
		}
		public Date getProcessEndTime() {
			return this.processEndTime;
		}
		public void setProcessEndTime(Date processEndTime) {
			this.processEndTime = processEndTime;
		}
		public Date getProcessStartTime() {
			return this.processStartTime;
		}
		public void setProcessStartTime(Date processStartTime) {
			this.processStartTime = processStartTime;
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
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchCreateOperationWithEntityReq extends TaobaoObject {
		private static final long serialVersionUID = 4219763544284716527L;
		/**
		 * 实体条件
		 */
		@ApiField("entity_condition")
		private EntityCondition entityCondition;
		/**
		 * 订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 工序请求
		 */
		@ApiListField("perform_operation_reqs")
		@ApiField("perform_operation_req")
		private List<PerformOperationReq> performOperationReqs;
		/**
		 * 来源
		 */
		@ApiField("source")
		private Source source;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public EntityCondition getEntityCondition() {
			return this.entityCondition;
		}
		public void setEntityCondition(EntityCondition entityCondition) {
			this.entityCondition = entityCondition;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public List<PerformOperationReq> getPerformOperationReqs() {
			return this.performOperationReqs;
		}
		public void setPerformOperationReqs(List<PerformOperationReq> performOperationReqs) {
			this.performOperationReqs = performOperationReqs;
		}
		public Source getSource() {
			return this.source;
		}
		public void setSource(Source source) {
			this.source = source;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}