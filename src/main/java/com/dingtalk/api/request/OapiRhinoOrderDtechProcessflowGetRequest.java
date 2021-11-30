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

import com.dingtalk.api.response.OapiRhinoOrderDtechProcessflowGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.processflow.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.29
 */
public class OapiRhinoOrderDtechProcessflowGetRequest extends BaseTaobaoRequest<OapiRhinoOrderDtechProcessflowGetResponse> {
	
	

	/** 
	* 生产订单id
	 */
	private Long bizIdProductOrder;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 用户id
	 */
	private String userId;

	public void setBizIdProductOrder(Long bizIdProductOrder) {
		this.bizIdProductOrder = bizIdProductOrder;
	}

	public Long getBizIdProductOrder() {
		return this.bizIdProductOrder;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.dtech.processflow.get";
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
		txtParams.put("biz_id_product_order", this.bizIdProductOrder);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderDtechProcessflowGetResponse> getResponseClass() {
		return OapiRhinoOrderDtechProcessflowGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizIdProductOrder, "bizIdProductOrder");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}