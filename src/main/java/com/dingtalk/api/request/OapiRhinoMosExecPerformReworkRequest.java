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

import com.dingtalk.api.response.OapiRhinoMosExecPerformReworkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.rework request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecPerformReworkRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformReworkResponse> {
	
	

	/** 
	* 执行上下文
	 */
	private String context;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 要重新开始的工序执行ID
	 */
	private Long reworkStartId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 要失效的工序执行ID列表
	 */
	private String toInactiveIds;

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

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setReworkStartId(Long reworkStartId) {
		this.reworkStartId = reworkStartId;
	}

	public Long getReworkStartId() {
		return this.reworkStartId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setToInactiveIds(String toInactiveIds) {
		this.toInactiveIds = toInactiveIds;
	}

	public String getToInactiveIds() {
		return this.toInactiveIds;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.rework";
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
		txtParams.put("order_id", this.orderId);
		txtParams.put("rework_start_id", this.reworkStartId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("to_inactive_ids", this.toInactiveIds);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformReworkResponse> getResponseClass() {
		return OapiRhinoMosExecPerformReworkResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reworkStartId, "reworkStartId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkNotEmpty(toInactiveIds, "toInactiveIds");
		RequestCheckUtils.checkMaxListSize(toInactiveIds, 500, "toInactiveIds");
	}
	

}