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
import com.dingtalk.api.response.OapiSmartdeviceEventPostResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.event.post request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.25
 */
public class OapiSmartdeviceEventPostRequest extends BaseTaobaoRequest<OapiSmartdeviceEventPostResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String deviceEventVo;

	public void setDeviceEventVo(String deviceEventVo) {
		this.deviceEventVo = deviceEventVo;
	}

	public void setDeviceEventVo(DeviceEventVo deviceEventVo) {
		this.deviceEventVo = new JSONWriter(false,false,true).write(deviceEventVo);
	}

	public String getDeviceEventVo() {
		return this.deviceEventVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.event.post";
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
		txtParams.put("device_event_vo", this.deviceEventVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceEventPostResponse> getResponseClass() {
		return OapiSmartdeviceEventPostResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeviceEventVo extends TaobaoObject {
		private static final long serialVersionUID = 2311114857476497576L;
		/**
		 * json格式的数据体
		 */
		@ApiField("data")
		private String data;
		/**
		 * 设备名称
		 */
		@ApiField("dn")
		private String dn;
		/**
		 * 产品key
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * 事件对应的topic
		 */
		@ApiField("topic")
		private String topic;
	
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getDn() {
			return this.dn;
		}
		public void setDn(String dn) {
			this.dn = dn;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getTopic() {
			return this.topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
	}
	

}