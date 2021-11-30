package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiRhinoMosExecPerformCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.20
 */
public class OapiRhinoMosExecPerformCreateRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformCreateResponse> {
	
	

	/** 
	* 工序执行记录
	 */
	private String operations;

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

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public void setOperations(List<OperationReq> operations) {
		this.operations = new JSONWriter(false,false,true).write(operations);
	}

	public String getOperations() {
		return this.operations;
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
		return "dingtalk.oapi.rhino.mos.exec.perform.create";
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
		txtParams.put("operations", this.operations);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformCreateResponse> getResponseClass() {
		return OapiRhinoMosExecPerformCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(operations, 500, "operations");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	
	/**
	 * 工序执行记录
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationReq extends TaobaoObject {
		private static final long serialVersionUID = 1489335491791256291L;
		/**
		 * 执行上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 设备ID列表
		 */
		@ApiListField("device_ids")
		@ApiField("number")
		private List<Long> deviceIds;
		/**
		 * 实体ID
		 */
		@ApiField("entity_id")
		private Long entityId;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 排位布局版本
		 */
		@ApiField("flow_version")
		private Long flowVersion;
		/**
		 * 工序类型
		 */
		@ApiField("operation_type")
		private String operationType;
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
		 * 工序执行耗时，单位秒
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
		 * 工序能力类型
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工段
		 */
		@ApiField("section_code")
		private String sectionCode;
		/**
		 * 来源ID
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 来源类型
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 执行人工号
		 */
		@ApiListField("work_nos")
		@ApiField("string")
		private List<String> workNos;
		/**
		 * 执行工位
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