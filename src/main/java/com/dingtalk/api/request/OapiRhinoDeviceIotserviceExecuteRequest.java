package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiRhinoDeviceIotserviceExecuteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.iotservice.execute request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.27
 */
public class OapiRhinoDeviceIotserviceExecuteRequest extends BaseTaobaoRequest<OapiRhinoDeviceIotserviceExecuteResponse> {
	
	

	/** 
	* 设备id
	 */
	private Long deviceId;

	/** 
	* servReq
	 */
	private String servReq;

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

	public void setServReq(String servReq) {
		this.servReq = servReq;
	}

	public void setServReq(ServReq servReq) {
		this.servReq = new JSONWriter(false,false,true).write(servReq);
	}

	public String getServReq() {
		return this.servReq;
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
		return "dingtalk.oapi.rhino.device.iotservice.execute";
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
		txtParams.put("serv_req", this.servReq);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoDeviceIotserviceExecuteResponse> getResponseClass() {
		return OapiRhinoDeviceIotserviceExecuteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	
	/**
	 * servReq
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServReq extends TaobaoObject {
		private static final long serialVersionUID = 4228394672456191834L;
		/**
		 * 服务调用参数
		 */
		@ApiField("param")
		private String param;
		/**
		 * 服务名称
		 */
		@ApiField("serv_name")
		private String servName;
	
		public String getParam() {
			return this.param;
		}
		public void setParam(String param) {
			this.param = param;
		}
		public String getServName() {
			return this.servName;
		}
		public void setServName(String servName) {
			this.servName = servName;
		}
	}
	

}