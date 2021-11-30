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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupDeviceUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.device.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupDeviceUpdateRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupDeviceUpdateResponse> {
	
	

	/** 
	* 需新增的设备id列表
	 */
	private String addDeviceIds;

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 需移除的设备id列表
	 */
	private String delDeviceIds;

	public void setAddDeviceIds(String addDeviceIds) {
		this.addDeviceIds = addDeviceIds;
	}

	public String getAddDeviceIds() {
		return this.addDeviceIds;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setDelDeviceIds(String delDeviceIds) {
		this.delDeviceIds = delDeviceIds;
	}

	public String getDelDeviceIds() {
		return this.delDeviceIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.device.update";
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
		txtParams.put("add_device_ids", this.addDeviceIds);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("del_device_ids", this.delDeviceIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupDeviceUpdateResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupDeviceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(addDeviceIds, 20, "addDeviceIds");
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkMaxListSize(delDeviceIds, 20, "delDeviceIds");
	}
	

}