package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoMosExecProductionorderCreatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.productionorder.creat request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.26
 */
public class OapiRhinoMosExecProductionorderCreatRequest extends BaseTaobaoRequest<OapiRhinoMosExecProductionorderCreatResponse> {
	
	

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 生产结束时间
	 */
	private Date productionEndTime;

	/** 
	* 生产开始时间
	 */
	private Date productionStartTime;

	/** 
	* 生产状态
	 */
	private String productionStatus;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setProductionEndTime(Date productionEndTime) {
		this.productionEndTime = productionEndTime;
	}

	public Date getProductionEndTime() {
		return this.productionEndTime;
	}

	public void setProductionStartTime(Date productionStartTime) {
		this.productionStartTime = productionStartTime;
	}

	public Date getProductionStartTime() {
		return this.productionStartTime;
	}

	public void setProductionStatus(String productionStatus) {
		this.productionStatus = productionStatus;
	}

	public String getProductionStatus() {
		return this.productionStatus;
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
		return "dingtalk.oapi.rhino.mos.exec.productionorder.creat";
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
		txtParams.put("order_id", this.orderId);
		txtParams.put("production_end_time", this.productionEndTime);
		txtParams.put("production_start_time", this.productionStartTime);
		txtParams.put("production_status", this.productionStatus);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecProductionorderCreatResponse> getResponseClass() {
		return OapiRhinoMosExecProductionorderCreatResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}