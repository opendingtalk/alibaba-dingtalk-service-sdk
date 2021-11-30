package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkOapiAttendanceIsResponse;

/**
 * TOP API: dingtalk.oapi.attendance.is request
 * 
 * @author top auto create
 * @since 1.0, 2019.01.16
 */
public class DingtalkOapiAttendanceIsRequest extends BaseTaobaoRequest<DingtalkOapiAttendanceIsResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.is";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkOapiAttendanceIsResponse> getResponseClass() {
		return DingtalkOapiAttendanceIsResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}