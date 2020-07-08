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
import com.dingtalk.api.response.OapiSmartdeviceBindCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.bind.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.16
 */
public class OapiSmartdeviceBindCreateRequest extends BaseTaobaoRequest<OapiSmartdeviceBindCreateResponse> {
	
	

	/** 
	* 设备请求信息
	 */
	private String deviceBindReqVo;

	public void setDeviceBindReqVo(String deviceBindReqVo) {
		this.deviceBindReqVo = deviceBindReqVo;
	}

	public void setDeviceBindReqVo(DeviceBindReqVo deviceBindReqVo) {
		this.deviceBindReqVo = new JSONWriter(false,false,true).write(deviceBindReqVo);
	}

	public String getDeviceBindReqVo() {
		return this.deviceBindReqVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.bind.create";
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
		txtParams.put("device_bind_req_vo", this.deviceBindReqVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceBindCreateResponse> getResponseClass() {
		return OapiSmartdeviceBindCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 设备请求信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceBindReqVo extends TaobaoObject {
		private static final long serialVersionUID = 8876585474461875565L;
		/**
		 * 设备在3方的唯一标识
		 */
		@ApiField("biz_device_identity")
		private String bizDeviceIdentity;
		/**
		 * 设备MAC
		 */
		@ApiField("device_mac")
		private String deviceMac;
		/**
		 * 产品型号ID
		 */
		@ApiField("device_service_id")
		private Long deviceServiceId;
		/**
		 * 设备SN
		 */
		@ApiField("device_sn")
		private String deviceSn;
		/**
		 * 设备昵称
		 */
		@ApiField("nick")
		private String nick;
	
		public String getBizDeviceIdentity() {
			return this.bizDeviceIdentity;
		}
		public void setBizDeviceIdentity(String bizDeviceIdentity) {
			this.bizDeviceIdentity = bizDeviceIdentity;
		}
		public String getDeviceMac() {
			return this.deviceMac;
		}
		public void setDeviceMac(String deviceMac) {
			this.deviceMac = deviceMac;
		}
		public Long getDeviceServiceId() {
			return this.deviceServiceId;
		}
		public void setDeviceServiceId(Long deviceServiceId) {
			this.deviceServiceId = deviceServiceId;
		}
		public String getDeviceSn() {
			return this.deviceSn;
		}
		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	

}