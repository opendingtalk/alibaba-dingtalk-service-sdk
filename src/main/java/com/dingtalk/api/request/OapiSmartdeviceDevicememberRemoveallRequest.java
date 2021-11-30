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

import com.dingtalk.api.response.OapiSmartdeviceDevicememberRemoveallResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.devicemember.removeall request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.08
 */
public class OapiSmartdeviceDevicememberRemoveallRequest extends BaseTaobaoRequest<OapiSmartdeviceDevicememberRemoveallResponse> {
	
	

	/** 
	* 设备id
	 */
	private Long deviceId;

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Long getDeviceId() {
		return this.deviceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.devicemember.removeall";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDevicememberRemoveallResponse> getResponseClass() {
		return OapiSmartdeviceDevicememberRemoveallResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
	}
	

}