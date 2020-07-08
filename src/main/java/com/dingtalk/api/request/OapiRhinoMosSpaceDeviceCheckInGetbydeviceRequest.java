package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoMosSpaceDeviceCheckInGetbydeviceResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.device.check.in.getbydevice request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.31
 */
public class OapiRhinoMosSpaceDeviceCheckInGetbydeviceRequest extends BaseTaobaoRequest<OapiRhinoMosSpaceDeviceCheckInGetbydeviceResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.space.device.check.in.getbydevice";
	}

	private String topResponseType ;

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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosSpaceDeviceCheckInGetbydeviceResponse> getResponseClass() {
		return OapiRhinoMosSpaceDeviceCheckInGetbydeviceResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}