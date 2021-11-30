package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiSmartdeviceDeviceQuerybyidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.device.querybyid request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.19
 */
public class OapiSmartdeviceDeviceQuerybyidRequest extends BaseTaobaoRequest<OapiSmartdeviceDeviceQuerybyidResponse> {
	
	

	/** 
	* 设备查询对象
	 */
	private String deviceQueryVo;

	public void setDeviceQueryVo(String deviceQueryVo) {
		this.deviceQueryVo = deviceQueryVo;
	}

	public void setDeviceQueryVo(DeviceQueryVo deviceQueryVo) {
		this.deviceQueryVo = new JSONWriter(false,false,true).write(deviceQueryVo);
	}

	public String getDeviceQueryVo() {
		return this.deviceQueryVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.device.querybyid";
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
		txtParams.put("device_query_vo", this.deviceQueryVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDeviceQuerybyidResponse> getResponseClass() {
		return OapiSmartdeviceDeviceQuerybyidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 设备查询对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceQueryVo extends TaobaoObject {
		private static final long serialVersionUID = 6831755329614691718L;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private String deviceId;
	
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}
	

}