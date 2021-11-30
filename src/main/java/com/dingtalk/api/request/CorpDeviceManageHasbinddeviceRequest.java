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

import com.dingtalk.api.response.CorpDeviceManageHasbinddeviceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.manage.hasbinddevice request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpDeviceManageHasbinddeviceRequest extends BaseTaobaoRequest<CorpDeviceManageHasbinddeviceResponse> {
	
	

	/** 
	* 设备产品类型 产品编码：M1：9 C1：14 M2：15 D1：24
	 */
	private Long deviceServiceId;

	public void setDeviceServiceId(Long deviceServiceId) {
		this.deviceServiceId = deviceServiceId;
	}

	public Long getDeviceServiceId() {
		return this.deviceServiceId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.device.manage.hasbinddevice";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("device_service_id", this.deviceServiceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDeviceManageHasbinddeviceResponse> getResponseClass() {
		return CorpDeviceManageHasbinddeviceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceServiceId, "deviceServiceId");
	}
	

}