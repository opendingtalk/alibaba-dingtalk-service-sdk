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

import com.dingtalk.api.response.OapiRhinoTransportMaplocationQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.transport.maplocation.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.30
 */
public class OapiRhinoTransportMaplocationQueryRequest extends BaseTaobaoRequest<OapiRhinoTransportMaplocationQueryResponse> {
	
	

	/** 
	* 是否获取配置信息
	 */
	private Boolean includeConfig;

	/** 
	* poiCode list
	 */
	private String poiCodeList;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setIncludeConfig(Boolean includeConfig) {
		this.includeConfig = includeConfig;
	}

	public Boolean getIncludeConfig() {
		return this.includeConfig;
	}

	public void setPoiCodeList(String poiCodeList) {
		this.poiCodeList = poiCodeList;
	}

	public String getPoiCodeList() {
		return this.poiCodeList;
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
		return "dingtalk.oapi.rhino.transport.maplocation.query";
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
		txtParams.put("include_config", this.includeConfig);
		txtParams.put("poi_code_list", this.poiCodeList);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoTransportMaplocationQueryResponse> getResponseClass() {
		return OapiRhinoTransportMaplocationQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(poiCodeList, "poiCodeList");
		RequestCheckUtils.checkMaxListSize(poiCodeList, 20, "poiCodeList");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}