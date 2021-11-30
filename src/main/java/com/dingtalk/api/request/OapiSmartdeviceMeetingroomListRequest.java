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

import com.dingtalk.api.response.OapiSmartdeviceMeetingroomListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.meetingroom.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.16
 */
public class OapiSmartdeviceMeetingroomListRequest extends BaseTaobaoRequest<OapiSmartdeviceMeetingroomListResponse> {
	
	

	/** 
	* 如果为null,那么就从头开始查询.
	 */
	private String cursor;

	/** 
	* 最大500
	 */
	private Long size;

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.meetingroom.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceMeetingroomListResponse> getResponseClass() {
		return OapiSmartdeviceMeetingroomListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}