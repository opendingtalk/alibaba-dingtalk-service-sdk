package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoMosSpacePoiInsertResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.poi.insert request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.02
 */
public class OapiRhinoMosSpacePoiInsertRequest extends BaseTaobaoRequest<OapiRhinoMosSpacePoiInsertResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.space.poi.insert";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosSpacePoiInsertResponse> getResponseClass() {
		return OapiRhinoMosSpacePoiInsertResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}