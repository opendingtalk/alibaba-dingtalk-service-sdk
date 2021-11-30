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
import com.dingtalk.api.response.OapiSmartdeviceDeviceUpdatenickResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.device.updatenick request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.07
 */
public class OapiSmartdeviceDeviceUpdatenickRequest extends BaseTaobaoRequest<OapiSmartdeviceDeviceUpdatenickResponse> {
	
	

	/** 
	* 昵称修改参数
	 */
	private String deviceNickModifyVo;

	public void setDeviceNickModifyVo(String deviceNickModifyVo) {
		this.deviceNickModifyVo = deviceNickModifyVo;
	}

	public void setDeviceNickModifyVo(DeviceNickModifyVo deviceNickModifyVo) {
		this.deviceNickModifyVo = new JSONWriter(false,false,true).write(deviceNickModifyVo);
	}

	public String getDeviceNickModifyVo() {
		return this.deviceNickModifyVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.device.updatenick";
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
		txtParams.put("device_nick_modify_vo", this.deviceNickModifyVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDeviceUpdatenickResponse> getResponseClass() {
		return OapiSmartdeviceDeviceUpdatenickResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 昵称修改参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceNickModifyVo extends TaobaoObject {
		private static final long serialVersionUID = 2647673495677297821L;
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
		 * 新的昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 产品标识
		 */
		@ApiField("pk")
		private String pk;
	
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
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
	}
	

}