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

import com.dingtalk.api.response.OapiRhinoMosExecPerformContextRemoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.context.remove request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.13
 */
public class OapiRhinoMosExecPerformContextRemoveRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformContextRemoveResponse> {
	
	

	/** 
	* 上下文KEY
	 */
	private String keys;

	/** 
	* 工序执行ID列表
	 */
	private String operationRecordIds;

	/** 
	* 租户ID
	 */
	private String tenantId;

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getKeys() {
		return this.keys;
	}

	public void setOperationRecordIds(String operationRecordIds) {
		this.operationRecordIds = operationRecordIds;
	}

	public String getOperationRecordIds() {
		return this.operationRecordIds;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.context.remove";
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
		txtParams.put("keys", this.keys);
		txtParams.put("operation_record_ids", this.operationRecordIds);
		txtParams.put("tenant_id", this.tenantId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformContextRemoveResponse> getResponseClass() {
		return OapiRhinoMosExecPerformContextRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(keys, 500, "keys");
		RequestCheckUtils.checkNotEmpty(operationRecordIds, "operationRecordIds");
		RequestCheckUtils.checkMaxListSize(operationRecordIds, 500, "operationRecordIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}