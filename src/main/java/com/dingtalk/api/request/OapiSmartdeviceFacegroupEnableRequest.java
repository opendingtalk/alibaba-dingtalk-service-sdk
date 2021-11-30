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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupEnableResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.enable request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupEnableRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupEnableResponse> {
	
	

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 设备id列表
	 */
	private String deviceIds;

	/** 
	* true-启用识别；false-禁用识别
	 */
	private Boolean enable;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setDeviceIds(String deviceIds) {
		this.deviceIds = deviceIds;
	}

	public String getDeviceIds() {
		return this.deviceIds;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.enable";
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
		txtParams.put("biz_id", this.bizId);
		txtParams.put("device_ids", this.deviceIds);
		txtParams.put("enable", this.enable);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupEnableResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupEnableResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkMaxListSize(deviceIds, 20, "deviceIds");
		RequestCheckUtils.checkNotEmpty(enable, "enable");
	}
	

}