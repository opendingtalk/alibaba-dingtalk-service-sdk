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
import com.dingtalk.api.response.OapiRhinoMosExecPerformConditionalStartResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.conditional.start request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecPerformConditionalStartRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformConditionalStartResponse> {
	
	

	/** 
	* 执行设备ID列表
	 */
	private String deviceIds;

	/** 
	* 实体条件
	 */
	private String entityCondition;

	/** 
	* 工序ID列表
	 */
	private String operationUids;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 系统参数
	 */
	private String userid;

	/** 
	* 执行员工列表
	 */
	private String workNos;

	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
	}

	public String getDeviceIds() {
		return this.deviceIds;
	}

	public void setEntityCondition(String entityCondition) {
		this.entityCondition = entityCondition;
	}

	public void setEntityCondition(EntityCondition entityCondition) {
		this.entityCondition = new JSONWriter(false,false,true).write(entityCondition);
	}

	public String getEntityCondition() {
		return this.entityCondition;
	}

	public void setOperationUids(String operationUids) {
		this.operationUids = operationUids;
	}

	public String getOperationUids() {
		return this.operationUids;
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

	public void setWorkNos(String workNos) {
		this.workNos = workNos;
	}

	public String getWorkNos() {
		return this.workNos;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.conditional.start";
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
		txtParams.put("device_ids", this.deviceIds);
		txtParams.put("entity_condition", this.entityCondition);
		txtParams.put("operation_uids", this.operationUids);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		txtParams.put("work_nos", this.workNos);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformConditionalStartResponse> getResponseClass() {
		return OapiRhinoMosExecPerformConditionalStartResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deviceIds, 20, "deviceIds");
		RequestCheckUtils.checkMaxListSize(operationUids, 500, "operationUids");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkMaxListSize(workNos, 20, "workNos");
	}
	
	/**
	 * 实体来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 7886243538297755532L;
		/**
		 * 实体来源ID
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 实体来源类型
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
		private static final long serialVersionUID = 3424575278328423157L;
		/**
		 * 实体ID列表
		 */
		@ApiListField("entity_ids")
		@ApiField("number")
		private List<Long> entityIds;
		/**
		 * 实体来源
		 */
		@ApiField("entity_source")
		private Source entitySource;
		/**
		 * 实体类型
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
	

}