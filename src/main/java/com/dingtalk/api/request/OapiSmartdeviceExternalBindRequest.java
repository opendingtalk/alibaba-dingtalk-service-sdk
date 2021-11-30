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
import com.dingtalk.api.response.OapiSmartdeviceExternalBindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.external.bind request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.25
 */
public class OapiSmartdeviceExternalBindRequest extends BaseTaobaoRequest<OapiSmartdeviceExternalBindResponse> {
	
	

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
		return "dingtalk.oapi.smartdevice.external.bind";
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

	public Class<OapiSmartdeviceExternalBindResponse> getResponseClass() {
		return OapiSmartdeviceExternalBindResponse.class;
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
		private static final long serialVersionUID = 4574323825584832623L;
		/**
		 * 设备名称
		 */
		@ApiField("dn")
		private String dn;
		/**
		 * 扩展信息
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * mac地址
		 */
		@ApiField("mac")
		private String mac;
		/**
		 * 设备昵称
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 外部设备id
		 */
		@ApiField("outid")
		private String outid;
		/**
		 * 产品key
		 */
		@ApiField("pk")
		private String pk;
		/**
		 * sn地址
		 */
		@ApiField("sn")
		private String sn;
	
		public String getDn() {
			return this.dn;
		}
		public void setDn(String dn) {
			this.dn = dn;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getMac() {
			return this.mac;
		}
		public void setMac(String mac) {
			this.mac = mac;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getOutid() {
			return this.outid;
		}
		public void setOutid(String outid) {
			this.outid = outid;
		}
		public String getPk() {
			return this.pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getSn() {
			return this.sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
	}
	

}