package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiXiaoqianTest2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoqian.test2 request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.07
 */
public class OapiXiaoqianTest2Request extends BaseTaobaoRequest<OapiXiaoqianTest2Response> {
	
	

	/** 
	* 2
	 */
	private String test1;

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTest1() {
		return this.test1;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.xiaoqian.test2";
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
		txtParams.put("test1", this.test1);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiXiaoqianTest2Response> getResponseClass() {
		return OapiXiaoqianTest2Response.class;
	}

	public void check() throws ApiRuleException {
	}
	

}