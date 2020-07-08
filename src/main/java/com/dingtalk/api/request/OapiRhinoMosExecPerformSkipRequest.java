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

import com.dingtalk.api.response.OapiRhinoMosExecPerformSkipResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.skip request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiRhinoMosExecPerformSkipRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformSkipResponse> {
	
	

	/** 
	* corp_id
	 */
	private String corpId;

	/** 
	* isv_org_id
	 */
	private Long isvOrgId;

	/** 
	* operation_perform_record_ids
	 */
	private String operationPerformRecordIds;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* org_id
	 */
	private Long orgId;

	/** 
	* suite_key
	 */
	private String suiteKey;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* token_grant_type
	 */
	private Long tokenGrantType;

	/** 
	* user_id
	 */
	private String userId;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setOperationPerformRecordIds(String operationPerformRecordIds) {
		this.operationPerformRecordIds = operationPerformRecordIds;
	}

	public String getOperationPerformRecordIds() {
		return this.operationPerformRecordIds;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.skip";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("isv_org_id", this.isvOrgId);
		txtParams.put("operation_perform_record_ids", this.operationPerformRecordIds);
		txtParams.put("order_id", this.orderId);
		txtParams.put("org_id", this.orgId);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("token_grant_type", this.tokenGrantType);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformSkipResponse> getResponseClass() {
		return OapiRhinoMosExecPerformSkipResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operationPerformRecordIds, "operationPerformRecordIds");
		RequestCheckUtils.checkMaxListSize(operationPerformRecordIds, 500, "operationPerformRecordIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}