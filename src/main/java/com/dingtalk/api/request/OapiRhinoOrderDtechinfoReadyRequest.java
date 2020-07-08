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

import com.dingtalk.api.response.OapiRhinoOrderDtechinfoReadyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtechinfo.ready request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.29
 */
public class OapiRhinoOrderDtechinfoReadyRequest extends BaseTaobaoRequest<OapiRhinoOrderDtechinfoReadyResponse> {
	
	

	/** 
	* 数字工艺包信息类型
	 */
	private String dtechInfoType;

	/** 
	* 生产订单id
	 */
	private Long productOrderId;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 用户id
	 */
	private String userJd;

	public void setDtechInfoType(String dtechInfoType) {
		this.dtechInfoType = dtechInfoType;
	}

	public String getDtechInfoType() {
		return this.dtechInfoType;
	}

	public void setProductOrderId(Long productOrderId) {
		this.productOrderId = productOrderId;
	}

	public Long getProductOrderId() {
		return this.productOrderId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setUserJd(String userJd) {
		this.userJd = userJd;
	}

	public String getUserJd() {
		return this.userJd;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.dtechinfo.ready";
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
		txtParams.put("dtech_info_type", this.dtechInfoType);
		txtParams.put("product_order_id", this.productOrderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("user_jd", this.userJd);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderDtechinfoReadyResponse> getResponseClass() {
		return OapiRhinoOrderDtechinfoReadyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dtechInfoType, "dtechInfoType");
		RequestCheckUtils.checkNotEmpty(productOrderId, "productOrderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}