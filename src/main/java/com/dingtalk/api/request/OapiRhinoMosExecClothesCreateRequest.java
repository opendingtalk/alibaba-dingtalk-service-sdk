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
import com.dingtalk.api.response.OapiRhinoMosExecClothesCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiRhinoMosExecClothesCreateRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesCreateResponse> {
	
	

	/** 
	* 工序信息
	 */
	private String additionalOperations;

	/** 
	* 衣服状态是否自动开启
	 */
	private Boolean autoStart;

	/** 
	* 业务类型
	 */
	private String bizType;

	/** 
	* 衣服详情
	 */
	private String clothes;

	/** 
	* 实体类型
	 */
	private String entityType;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 来源
	 */
	private String source;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setAdditionalOperations(String additionalOperations) {
		this.additionalOperations = additionalOperations;
	}

	public void setAdditionalOperations(List<AddtionalOperation> additionalOperations) {
		this.additionalOperations = new JSONWriter(false,false,true).write(additionalOperations);
	}

	public String getAdditionalOperations() {
		return this.additionalOperations;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}

	public void setClothes(List<ClothesInfoReq> clothes) {
		this.clothes = new JSONWriter(false,false,true).write(clothes);
	}

	public String getClothes() {
		return this.clothes;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityType() {
		return this.entityType;
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

	public void setSource(Source source) {
		this.source = new JSONWriter(false,false,true).write(source);
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

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.create";
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
		txtParams.put("additional_operations", this.additionalOperations);
		txtParams.put("auto_start", this.autoStart);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("clothes", this.clothes);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("order_id", this.orderId);
		txtParams.put("source", this.source);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecClothesCreateResponse> getResponseClass() {
		return OapiRhinoMosExecClothesCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(additionalOperations, 500, "additionalOperations");
		RequestCheckUtils.checkObjectMaxListSize(clothes, 20, "clothes");
		RequestCheckUtils.checkNotEmpty(entityType, "entityType");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
	}
	
	/**
	 * 工序信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddtionalOperation extends TaobaoObject {
		private static final long serialVersionUID = 8736967399239729246L;
		/**
		 * 上下文
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
		 * 工序执行状态
		 */
		@ApiField("perform_status")
		private String performStatus;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 工序执行完成时间
		 */
		@ApiField("process_end_time")
		private Date processEndTime;
		/**
		 * 工序执行开始时间
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
		 * 执行人
		 */
		@ApiListField("work_nos")
		@ApiField("string")
		private List<String> workNos;
		/**
		 * 工位
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
	 * 来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 4288812257516184252L;
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
	 * 衣服详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesInfoReq extends TaobaoObject {
		private static final long serialVersionUID = 3517875653569429777L;
		/**
		 * 颜色code
		 */
		@ApiField("color_code")
		private String colorCode;
		/**
		 * 颜色名
		 */
		@ApiField("color_name")
		private String colorName;
		/**
		 * 数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 衣服完成时间
		 */
		@ApiField("finish_time")
		private Date finishTime;
		/**
		 * 尺码code
		 */
		@ApiField("size_code")
		private String sizeCode;
		/**
		 * 尺码名称
		 */
		@ApiField("size_name")
		private String sizeName;
		/**
		 * 衣服开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
	
		public String getColorCode() {
			return this.colorCode;
		}
		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}
		public String getColorName() {
			return this.colorName;
		}
		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Date getFinishTime() {
			return this.finishTime;
		}
		public void setFinishTime(Date finishTime) {
			this.finishTime = finishTime;
		}
		public String getSizeCode() {
			return this.sizeCode;
		}
		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}
		public String getSizeName() {
			return this.sizeName;
		}
		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
	}
	

}