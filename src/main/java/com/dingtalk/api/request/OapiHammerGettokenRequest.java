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

import com.dingtalk.api.response.OapiHammerGettokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hammer.gettoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.11.22
 */
public class OapiHammerGettokenRequest extends BaseTaobaoRequest<OapiHammerGettokenResponse> {
	
	

	/** 
	* appId
	 */
	private String hammerClientId;

	/** 
	* appSecret
	 */
	private String hammmerClientSecret;

	public void setHammerClientId(String hammerClientId) {
		this.hammerClientId = hammerClientId;
	}

	public String getHammerClientId() {
		return this.hammerClientId;
	}

	public void setHammmerClientSecret(String hammmerClientSecret) {
		this.hammmerClientSecret = hammmerClientSecret;
	}

	public String getHammmerClientSecret() {
		return this.hammmerClientSecret;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hammer.gettoken";
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

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_GET;

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
		txtParams.put("hammerClientId", this.hammerClientId);
		txtParams.put("hammmerClientSecret", this.hammmerClientSecret);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHammerGettokenResponse> getResponseClass() {
		return OapiHammerGettokenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(hammerClientId, "hammerClientId");
		RequestCheckUtils.checkNotEmpty(hammmerClientSecret, "hammmerClientSecret");
	}
	

}