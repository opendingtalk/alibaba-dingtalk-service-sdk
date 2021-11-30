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

import com.dingtalk.api.response.OapiSmartdeviceFacegroupDeviceListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.facegroup.device.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceFacegroupDeviceListRequest extends BaseTaobaoRequest<OapiSmartdeviceFacegroupDeviceListResponse> {
	
	

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 游标，第一次传 <=0的值，后续传本调用的返回值
	 */
	private Long cursor;

	/** 
	* 查询模式：all-企业所有设备；bound-本组已关联设备
	 */
	private String mode;

	/** 
	* 分页大小
	 */
	private Long size;

	/** 
	* 需查询的设备类型
	 */
	private String type;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMode() {
		return this.mode;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.facegroup.device.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("mode", this.mode);
		txtParams.put("size", this.size);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceFacegroupDeviceListResponse> getResponseClass() {
		return OapiSmartdeviceFacegroupDeviceListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkMaxLength(bizId, 23, "bizId");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(mode, "mode");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 20L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}