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

import com.dingtalk.api.response.OapiRhinoDeviceBaseinfoRelateddeviceListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.baseinfo.relateddevice.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.27
 */
public class OapiRhinoDeviceBaseinfoRelateddeviceListRequest extends BaseTaobaoRequest<OapiRhinoDeviceBaseinfoRelateddeviceListResponse> {
	
	

	/** 
	* 设备id
	 */
	private Long deviceId;

	/** 
	* 查询类型（01）
	 */
	private Long queryType;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Long getDeviceId() {
		return this.deviceId;
	}

	public void setQueryType(Long queryType) {
		this.queryType = queryType;
	}

	public Long getQueryType() {
		return this.queryType;
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
		return "dingtalk.oapi.rhino.device.baseinfo.relateddevice.list";
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
		txtParams.put("device_id", this.deviceId);
		txtParams.put("query_type", this.queryType);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoDeviceBaseinfoRelateddeviceListResponse> getResponseClass() {
		return OapiRhinoDeviceBaseinfoRelateddeviceListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}