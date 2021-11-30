package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoProductionorderplanGetproductionorderplaninfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.productionorderplan.getproductionorderplaninfo request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.16
 */
public class OapiRhinoProductionorderplanGetproductionorderplaninfoRequest extends BaseTaobaoRequest<OapiRhinoProductionorderplanGetproductionorderplaninfoResponse> {
	
	

	/** 
	* 微应用ID
	 */
	private Long microappAgentId;

	/** 
	* 生产订单ID
	 */
	private Long productionOrderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setProductionOrderId(Long productionOrderId) {
		this.productionOrderId = productionOrderId;
	}

	public Long getProductionOrderId() {
		return this.productionOrderId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.productionorderplan.getproductionorderplaninfo";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("production_order_id", this.productionOrderId);
		txtParams.put("tenant_id", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoProductionorderplanGetproductionorderplaninfoResponse> getResponseClass() {
		return OapiRhinoProductionorderplanGetproductionorderplaninfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}