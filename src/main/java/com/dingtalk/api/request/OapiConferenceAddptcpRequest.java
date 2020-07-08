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

import com.dingtalk.api.response.OapiConferenceAddptcpResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.conference.addptcp request
 * 
 * @author top auto create
 * @since 1.0, 2018.11.20
 */
public class OapiConferenceAddptcpRequest extends BaseTaobaoRequest<OapiConferenceAddptcpResponse> {
	
	

	/** 
	* 会务id
	 */
	private String conferenceId;

	/** 
	* 参会人id列表
	 */
	private String participantUseridList;

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

	public void setParticipantUseridList(String participantUseridList) {
		this.participantUseridList = participantUseridList;
	}

	public String getParticipantUseridList() {
		return this.participantUseridList;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.conference.addptcp";
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
		txtParams.put("participant_userid_list", this.participantUseridList);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiConferenceAddptcpResponse> getResponseClass() {
		return OapiConferenceAddptcpResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(conferenceId, "conferenceId");
		RequestCheckUtils.checkNotEmpty(participantUseridList, "participantUseridList");
		RequestCheckUtils.checkMaxListSize(participantUseridList, 2000, "participantUseridList");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}