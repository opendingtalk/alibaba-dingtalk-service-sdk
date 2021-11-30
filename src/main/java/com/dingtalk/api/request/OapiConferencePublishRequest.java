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

import com.dingtalk.api.response.OapiConferencePublishResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.conference.publish request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiConferencePublishRequest extends BaseTaobaoRequest<OapiConferencePublishResponse> {
	
	

	/** 
	* 会务id
	 */
	private String conferenceId;

	/** 
	* 操作用户id
	 */
	private String userid;

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getConferenceId() {
		return this.conferenceId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.conference.publish";
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
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiConferencePublishResponse> getResponseClass() {
		return OapiConferencePublishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(conferenceId, "conferenceId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}