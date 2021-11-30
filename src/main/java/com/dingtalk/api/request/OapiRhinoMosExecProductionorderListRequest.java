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

import com.dingtalk.api.response.OapiRhinoMosExecProductionorderListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.productionorder.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.26
 */
public class OapiRhinoMosExecProductionorderListRequest extends BaseTaobaoRequest<OapiRhinoMosExecProductionorderListResponse> {
	
	

	/** 
	* 订单ID
	 */
	private String orderIds;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getOrderIds() {
		return this.orderIds;
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
		return "dingtalk.oapi.rhino.mos.exec.productionorder.list";
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
		txtParams.put("order_ids", this.orderIds);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecProductionorderListResponse> getResponseClass() {
		return OapiRhinoMosExecProductionorderListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(orderIds, 20, "orderIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}