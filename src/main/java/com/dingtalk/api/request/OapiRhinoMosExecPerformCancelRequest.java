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

import com.dingtalk.api.response.OapiRhinoMosExecPerformCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecPerformCancelRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformCancelResponse> {
	
	

	/** 
	* 执行上下文
	 */
	private String context;

	/** 
	* 工序执行记录ID列表
	 */
	private String operationPerformRecordIds;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 是否停止调度
	 */
	private Boolean stopSchedule;

	/** 
	* 租户ID列表
	 */
	private String tenantId;

	/** 
	* 系统参数
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

	public void setStopSchedule(Boolean stopSchedule) {
		this.stopSchedule = stopSchedule;
	}

	public Boolean getStopSchedule() {
		return this.stopSchedule;
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
		return "dingtalk.oapi.rhino.mos.exec.perform.cancel";
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
		txtParams.put("operation_perform_record_ids", this.operationPerformRecordIds);
		txtParams.put("order_id", this.orderId);
		txtParams.put("stop_schedule", this.stopSchedule);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformCancelResponse> getResponseClass() {
		return OapiRhinoMosExecPerformCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operationPerformRecordIds, "operationPerformRecordIds");
		RequestCheckUtils.checkMaxListSize(operationPerformRecordIds, 500, "operationPerformRecordIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}