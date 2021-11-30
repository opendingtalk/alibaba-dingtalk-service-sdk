package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiXiaoxuanPreTest1Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoxuan.pre.test1 request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.18
 */
public class OapiXiaoxuanPreTest1Request extends BaseTaobaoRequest<OapiXiaoxuanPreTest1Response> {
	
	

	/** 
	* 1
	 */
	private String name;

	/** 
	* 1
	 */
	private String systemData;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSystemData(String systemData) {
		this.systemData = systemData;
	}

	public String getSystemData() {
		return this.systemData;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.xiaoxuan.pre.test1";
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
		txtParams.put("name", this.name);
		txtParams.put("systemData", this.systemData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiXiaoxuanPreTest1Response> getResponseClass() {
		return OapiXiaoxuanPreTest1Response.class;
	}

	public void check() throws ApiRuleException {
	}
	

}