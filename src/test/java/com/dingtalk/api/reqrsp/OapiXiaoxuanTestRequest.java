package com.dingtalk.api.reqrsp;

import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Date;
import java.util.Map;

public class OapiXiaoxuanTestRequest extends BaseTaobaoRequest<OapiXiaoxuanTestResponse> {



	/**
	 * 4
	 */
	private String normalData;

	/**
	 * 3
	 */
	private String systemData;

	public void setNormalData(String normalData) {
		this.normalData = normalData;
	}

	public String getNormalData() {
		return this.normalData;
	}

	public void setSystemData(String systemData) {
		this.systemData = systemData;
	}

	public String getSystemData() {
		return this.systemData;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.xiaoxuan.test";
	}

	public String getTopApiCallType() {
		return DingTalkConstants.CALL_TYPE_OAPI;
	}

	public String getTopHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("normal_data", this.normalData);
		txtParams.put("system_data", this.systemData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiXiaoxuanTestResponse> getResponseClass() {
		return OapiXiaoxuanTestResponse.class;
	}

	public void check() throws ApiRuleException {
	}


}
