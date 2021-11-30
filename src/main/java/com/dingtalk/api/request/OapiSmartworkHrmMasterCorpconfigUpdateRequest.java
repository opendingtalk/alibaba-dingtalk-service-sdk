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

import com.dingtalk.api.response.OapiSmartworkHrmMasterCorpconfigUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.corpconfig.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.17
 */
public class OapiSmartworkHrmMasterCorpconfigUpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmMasterCorpconfigUpdateResponse> {
	
	

	/** 
	* 业务类型
	 */
	private String scopeCode;

	/** 
	* 企业开通状态 1:开通 2:关闭
	 */
	private Long status;

	/** 
	* 租户id
	 */
	private Long tenantId;

	public void setScopeCode(String scopeCode) {
		this.scopeCode = scopeCode;
	}

	public String getScopeCode() {
		return this.scopeCode;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.master.corpconfig.update";
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
		txtParams.put("scope_code", this.scopeCode);
		txtParams.put("status", this.status);
		txtParams.put("tenant_id", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmMasterCorpconfigUpdateResponse> getResponseClass() {
		return OapiSmartworkHrmMasterCorpconfigUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(scopeCode, "scopeCode");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}