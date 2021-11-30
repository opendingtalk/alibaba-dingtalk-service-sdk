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

import com.dingtalk.api.response.OapiConferenceGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.conference.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiConferenceGetRequest extends BaseTaobaoRequest<OapiConferenceGetResponse> {
	
	

	/** 
	* 会务Id
	 */
	private String conferenceId;

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getConferenceId() {
		return this.conferenceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.conference.get";
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
		txtParams.put("conference_id", this.conferenceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiConferenceGetResponse> getResponseClass() {
		return OapiConferenceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(conferenceId, "conferenceId");
	}
	

}