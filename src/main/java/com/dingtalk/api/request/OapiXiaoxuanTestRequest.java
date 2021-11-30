package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiXiaoxuanTestResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoxuan.test request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.14
 */
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

	private String topResponseType ;

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