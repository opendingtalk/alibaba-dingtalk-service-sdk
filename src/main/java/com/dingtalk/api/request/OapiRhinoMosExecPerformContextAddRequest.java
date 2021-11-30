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

import com.dingtalk.api.response.OapiRhinoMosExecPerformContextAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.context.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.22
 */
public class OapiRhinoMosExecPerformContextAddRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformContextAddResponse> {
	
	

	/** 
	* 上下文
	 */
	private String context;

	/** 
	* 工序执行记录ID列表
	 */
	private String operationRecordIds;

	/** 
	* 订单ID
	 */
	private String orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 业务参数，先预留ID
	 */
	private String userid;

	public void setContext(String context) {
		this.context = context;
	}
	public void setContextString(String context) {
		this.context = context;
	}

	public String getContext() {
		return this.context;
	}

	public void setOperationRecordIds(String operationRecordIds) {
		this.operationRecordIds = operationRecordIds;
	}

	public String getOperationRecordIds() {
		return this.operationRecordIds;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
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

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.context.add";
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
		txtParams.put("context", this.context);
		txtParams.put("operation_record_ids", this.operationRecordIds);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformContextAddResponse> getResponseClass() {
		return OapiRhinoMosExecPerformContextAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(context, "context");
		RequestCheckUtils.checkNotEmpty(operationRecordIds, "operationRecordIds");
		RequestCheckUtils.checkMaxListSize(operationRecordIds, 100, "operationRecordIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}