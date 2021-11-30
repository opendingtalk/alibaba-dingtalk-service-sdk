package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRetailUserTokenCheckResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.user.token.check request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.09
 */
public class OapiRetailUserTokenCheckRequest extends BaseTaobaoRequest<OapiRetailUserTokenCheckResponse> {
	
	

	/** 
	* 业务身份
	 */
	private String channel;

	/** 
	* token信息
	 */
	private String token;

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.retail.user.token.check";
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
		txtParams.put("channel", this.channel);
		txtParams.put("token", this.token);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRetailUserTokenCheckResponse> getResponseClass() {
		return OapiRetailUserTokenCheckResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}