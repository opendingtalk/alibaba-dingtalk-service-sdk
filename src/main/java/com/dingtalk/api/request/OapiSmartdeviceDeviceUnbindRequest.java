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
import com.dingtalk.api.response.OapiSmartdeviceDeviceUnbindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.device.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.07
 */
public class OapiSmartdeviceDeviceUnbindRequest extends BaseTaobaoRequest<OapiSmartdeviceDeviceUnbindResponse> {
	
	

	/** 
	* 解绑参数
	 */
	private String deviceUnbindVo;

	public void setDeviceUnbindVo(String deviceUnbindVo) {
		this.deviceUnbindVo = deviceUnbindVo;
	}

	public void setDeviceUnbindVo(DeviceUnbindVo deviceUnbindVo) {
		this.deviceUnbindVo = new JSONWriter(false,false,true).write(deviceUnbindVo);
	}

	public String getDeviceUnbindVo() {
		return this.deviceUnbindVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.device.unbind";
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
		txtParams.put("device_unbind_vo", this.deviceUnbindVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDeviceUnbindResponse> getResponseClass() {
		return OapiSmartdeviceDeviceUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 解绑参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceUnbindVo extends TaobaoObject {
		private static final long serialVersionUID = 4895472715976499731L;
		/**
		 * 设备id，和设备名称不能同时为空
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 设备名称，和设备id不能同时为空
		 */
		@ApiField("device_name")
		private String deviceName;
		/**
		 * 产品标识
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * 操作者id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceName() {
			return this.deviceName;
		}
		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}