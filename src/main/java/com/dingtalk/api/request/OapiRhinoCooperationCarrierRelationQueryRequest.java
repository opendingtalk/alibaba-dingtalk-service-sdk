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

import com.dingtalk.api.response.OapiRhinoCooperationCarrierRelationQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.cooperation.carrier.relation.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.27
 */
public class OapiRhinoCooperationCarrierRelationQueryRequest extends BaseTaobaoRequest<OapiRhinoCooperationCarrierRelationQueryResponse> {
	
	

	/** 
	* 载具绑定实体id
	 */
	private String bindObjId;

	/** 
	* 被绑定实体类型
	 */
	private String bindObjType;

	/** 
	* 载具id List
	 */
	private String carrierIds;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setBindObjId(String bindObjId) {
		this.bindObjId = bindObjId;
	}

	public String getBindObjId() {
		return this.bindObjId;
	}

	public void setBindObjType(String bindObjType) {
		this.bindObjType = bindObjType;
	}

	public String getBindObjType() {
		return this.bindObjType;
	}

	public void setCarrierIds(String carrierIds) {
		this.carrierIds = carrierIds;
	}

	public String getCarrierIds() {
		return this.carrierIds;
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
		return "dingtalk.oapi.rhino.cooperation.carrier.relation.query";
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
		txtParams.put("bind_obj_id", this.bindObjId);
		txtParams.put("bind_obj_type", this.bindObjType);
		txtParams.put("carrier_ids", this.carrierIds);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoCooperationCarrierRelationQueryResponse> getResponseClass() {
		return OapiRhinoCooperationCarrierRelationQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bindObjId, "bindObjId");
		RequestCheckUtils.checkNotEmpty(bindObjType, "bindObjType");
		RequestCheckUtils.checkNotEmpty(carrierIds, "carrierIds");
		RequestCheckUtils.checkMaxListSize(carrierIds, 20, "carrierIds");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}