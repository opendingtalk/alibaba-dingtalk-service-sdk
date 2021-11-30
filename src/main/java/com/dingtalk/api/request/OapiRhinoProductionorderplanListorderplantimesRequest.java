package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoProductionorderplanListorderplantimesResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.productionorderplan.listorderplantimes request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.16
 */
public class OapiRhinoProductionorderplanListorderplantimesRequest extends BaseTaobaoRequest<OapiRhinoProductionorderplanListorderplantimesResponse> {
	
	

	/** 
	* 表示当前token所属的企业对外开放的ID
	 */
	private String corpId;

	/** 
	* 此值表示调用方是ISV时,ISV在钉钉上的企业ID
	 */
	private Long isvOrgId;

	/** 
	* 这里是微应用ID
	 */
	private Long microappAgentId;

	/** 
	* 订单ID
	 */
	private String orderIds;

	/** 
	* 表示当前token所属的企业ID
	 */
	private Long orgId;

	/** 
	* token是企业对ISV的哪个套件授权的      * @param microappAgentId 业务参数,这里是微应用ID
	 */
	private String suiteKey;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 证书类型
	 */
	private Long tokenGrantType;

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

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}
	public void setOrderIdsString(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getOrderIds() {
		return this.orderIds;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.productionorderplan.listorderplantimes";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("order_ids", this.orderIds);
		txtParams.put("org_id", this.orgId);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("token_grant_type", this.tokenGrantType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoProductionorderplanListorderplantimesResponse> getResponseClass() {
		return OapiRhinoProductionorderplanListorderplantimesResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(orderIds, 20, "orderIds");
	}
	

}