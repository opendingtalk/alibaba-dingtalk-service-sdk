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

import com.dingtalk.api.response.OapiRhinoMosExecWorkstationOperationCountResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.workstation.operation.count request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.13
 */
public class OapiRhinoMosExecWorkstationOperationCountRequest extends BaseTaobaoRequest<OapiRhinoMosExecWorkstationOperationCountResponse> {
	
	

	/** 
	* 工序执行状态
	 */
	private String statuses;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 工位
	 */
	private String workstationCode;

	public void setStatuses(String statuses) {
		this.statuses = statuses;
	}

	public String getStatuses() {
		return this.statuses;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setWorkstationCode(String workstationCode) {
		this.workstationCode = workstationCode;
	}

	public String getWorkstationCode() {
		return this.workstationCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.workstation.operation.count";
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
		txtParams.put("statuses", this.statuses);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("workstation_code", this.workstationCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecWorkstationOperationCountResponse> getResponseClass() {
		return OapiRhinoMosExecWorkstationOperationCountResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(statuses, "statuses");
		RequestCheckUtils.checkMaxListSize(statuses, 20, "statuses");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkNotEmpty(workstationCode, "workstationCode");
	}
	

}