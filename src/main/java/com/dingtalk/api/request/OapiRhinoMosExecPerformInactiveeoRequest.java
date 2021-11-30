package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiRhinoMosExecPerformInactiveeoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.inactiveeo request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.01
 */
public class OapiRhinoMosExecPerformInactiveeoRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformInactiveeoResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(SpecificEntitiesAndSpecificOperationsReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.inactiveeo";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformInactiveeoResponse> getResponseClass() {
		return OapiRhinoMosExecPerformInactiveeoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 实体和工序
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EntityOperation extends TaobaoObject {
		private static final long serialVersionUID = 4877628349385826464L;
		/**
		 * 实体ID
		 */
		@ApiField("entity_id")
		private Long entityId;
		/**
		 * 工序ID
		 */
		@ApiField("operation_uid")
		private Long operationUid;
	
		public Long getEntityId() {
			return this.entityId;
		}
		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}
		public Long getOperationUid() {
			return this.operationUid;
		}
		public void setOperationUid(Long operationUid) {
			this.operationUid = operationUid;
		}
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SpecificEntitiesAndSpecificOperationsReq extends TaobaoObject {
		private static final long serialVersionUID = 5569298744279399819L;
		/**
		 * 实体和工序
		 */
		@ApiListField("entity_operations")
		@ApiField("entity_operation")
		private List<EntityOperation> entityOperations;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 扩展参数
		 */
		@ApiField("userid")
		private String userid;
	
		public List<EntityOperation> getEntityOperations() {
			return this.entityOperations;
		}
		public void setEntityOperations(List<EntityOperation> entityOperations) {
			this.entityOperations = entityOperations;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
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