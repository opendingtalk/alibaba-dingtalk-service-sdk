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

import com.dingtalk.api.response.OapiRhinoMosExecClothesScrapResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.scrap request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecClothesScrapRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesScrapResponse> {
	
	

	/** 
	* 衣服ID列表
	 */
	private String entityIds;

	/** 
	* 扩展属性
	 */
	private String extProperties;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setEntityIds(String entityIds) {
		this.entityIds = entityIds;
	}

	public String getEntityIds() {
		return this.entityIds;
	}

	public void setExtProperties(String extProperties) {
		this.extProperties = extProperties;
	}
	public void setExtPropertiesString(String extProperties) {
		this.extProperties = extProperties;
	}

	public String getExtProperties() {
		return this.extProperties;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
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
		return "dingtalk.oapi.rhino.mos.exec.clothes.scrap";
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
		txtParams.put("entity_ids", this.entityIds);
		txtParams.put("ext_properties", this.extProperties);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecClothesScrapResponse> getResponseClass() {
		return OapiRhinoMosExecClothesScrapResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(entityIds, "entityIds");
		RequestCheckUtils.checkMaxListSize(entityIds, 500, "entityIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}