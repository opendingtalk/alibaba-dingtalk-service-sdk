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

import com.dingtalk.api.response.OapiSmartdeviceDevicememberSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.devicemember.sync request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.13
 */
public class OapiSmartdeviceDevicememberSyncRequest extends BaseTaobaoRequest<OapiSmartdeviceDevicememberSyncResponse> {
	
	

	/** 
	* 需新增的userIds（与del_userids必填其一）
	 */
	private String addUserids;

	/** 
	* 需移除的userIds（与add_userids必填其一）
	 */
	private String delUserids;

	/** 
	* 设备id
	 */
	private Long deviceId;

	public void setAddUserids(String addUserids) {
		this.addUserids = addUserids;
	}

	public String getAddUserids() {
		return this.addUserids;
	}

	public void setDelUserids(String delUserids) {
		this.delUserids = delUserids;
	}

	public String getDelUserids() {
		return this.delUserids;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Long getDeviceId() {
		return this.deviceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.devicemember.sync";
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
		txtParams.put("add_userids", this.addUserids);
		txtParams.put("del_userids", this.delUserids);
		txtParams.put("device_id", this.deviceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceDevicememberSyncResponse> getResponseClass() {
		return OapiSmartdeviceDevicememberSyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(addUserids, 200, "addUserids");
		RequestCheckUtils.checkMaxListSize(delUserids, 200, "delUserids");
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
	}
	

}