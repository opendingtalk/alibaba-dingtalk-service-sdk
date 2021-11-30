package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiRhinoMosSpaceDeviceCheckOutResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.device.check.out request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.07
 */
public class OapiRhinoMosSpaceDeviceCheckOutRequest extends BaseTaobaoRequest<OapiRhinoMosSpaceDeviceCheckOutResponse> {
	
	

	/** 
	* param_prod_workstation_device_batch_check_req
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ProdWorkstationDeviceBatchCheckReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.space.device.check.out";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosSpaceDeviceCheckOutResponse> getResponseClass() {
		return OapiRhinoMosSpaceDeviceCheckOutResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * param_prod_workstation_device_batch_check_req
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationDeviceBatchCheckReq extends TaobaoObject {
		private static final long serialVersionUID = 1118424598434161455L;
		/**
		 * 设备id列表
		 */
		@ApiListField("device_ids")
		@ApiField("number")
		private List<Long> deviceIds;
		/**
		 * 站位code
		 */
		@ApiField("prod_workstation_code")
		private String prodWorkstationCode;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 用户ID
		 */
		@ApiField("userid")
		private String userid;
	
		public List<Long> getDeviceIds() {
			return this.deviceIds;
		}
		public void setDeviceIds(List<Long> deviceIds) {
			this.deviceIds = deviceIds;
		}
		public String getProdWorkstationCode() {
			return this.prodWorkstationCode;
		}
		public void setProdWorkstationCode(String prodWorkstationCode) {
			this.prodWorkstationCode = prodWorkstationCode;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}