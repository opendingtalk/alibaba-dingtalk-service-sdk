package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoMosExecPerformQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecPerformQueryRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformQueryResponse> {
	
	

	/** 
	* 生效条件
	 */
	private String activeCondition;

	/** 
	* 实体ID列表
	 */
	private String entityIds;

	/** 
	* 实体类型
	 */
	private String entityType;

	/** 
	* 工序列表
	 */
	private String operationUids;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 执行状态
	 */
	private String performStatusList;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	/** 
	* 执行工位列表
	 */
	private String workstationCodes;

	public void setActiveCondition(String activeCondition) {
		this.activeCondition = activeCondition;
	}

	public String getActiveCondition() {
		return this.activeCondition;
	}

	public void setEntityIds(String entityIds) {
		this.entityIds = entityIds;
	}

	public String getEntityIds() {
		return this.entityIds;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityType() {
		return this.entityType;
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

	public void setPerformStatusList(String performStatusList) {
		this.performStatusList = performStatusList;
	}

	public String getPerformStatusList() {
		return this.performStatusList;
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

	public void setWorkstationCodes(String workstationCodes) {
		this.workstationCodes = workstationCodes;
	}

	public String getWorkstationCodes() {
		return this.workstationCodes;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.query";
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
		txtParams.put("active_condition", this.activeCondition);
		txtParams.put("entity_ids", this.entityIds);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("operation_uids", this.operationUids);
		txtParams.put("order_id", this.orderId);
		txtParams.put("perform_status_list", this.performStatusList);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		txtParams.put("workstation_codes", this.workstationCodes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformQueryResponse> getResponseClass() {
		return OapiRhinoMosExecPerformQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(entityIds, 500, "entityIds");
		RequestCheckUtils.checkNotEmpty(entityType, "entityType");
		RequestCheckUtils.checkMaxListSize(operationUids, 500, "operationUids");
		RequestCheckUtils.checkMaxListSize(performStatusList, 20, "performStatusList");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkMaxListSize(workstationCodes, 20, "workstationCodes");
	}
	

}