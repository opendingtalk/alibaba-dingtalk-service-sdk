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

import com.dingtalk.api.response.OapiMiniappDeploywindowQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.miniapp.deploywindow.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.28
 */
public class OapiMiniappDeploywindowQueryRequest extends BaseTaobaoRequest<OapiMiniappDeploywindowQueryResponse> {
	
	

	/** 
	* 查询参数
	 */
	private String modelKey;

	public void setModelKey(String modelKey) {
		this.modelKey = modelKey;
	}

	public String getModelKey() {
		return this.modelKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.miniapp.deploywindow.query";
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
		txtParams.put("model_key", this.modelKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMiniappDeploywindowQueryResponse> getResponseClass() {
		return OapiMiniappDeploywindowQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(modelKey, "modelKey");
	}
	

}