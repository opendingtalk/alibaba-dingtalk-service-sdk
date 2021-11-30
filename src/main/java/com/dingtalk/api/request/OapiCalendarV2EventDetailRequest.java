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

import com.dingtalk.api.response.OapiCalendarV2EventDetailResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.v2.event.detail request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.16
 */
public class OapiCalendarV2EventDetailRequest extends BaseTaobaoRequest<OapiCalendarV2EventDetailResponse> {
	
	

	/** 
	* 开放平台应用对应的AgentId
	 */
	private Long agentid;

	/** 
	* 日历ID,目前仅支持传primary,表示修改当前用户“我的日程”下的日程
	 */
	private String calendarId;

	/** 
	* 日程Id
	 */
	private String eventId;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getCalendarId() {
		return this.calendarId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventId() {
		return this.eventId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.calendar.v2.event.detail";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("calendar_id", this.calendarId);
		txtParams.put("event_id", this.eventId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarV2EventDetailResponse> getResponseClass() {
		return OapiCalendarV2EventDetailResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(calendarId, "calendarId");
		RequestCheckUtils.checkMaxLength(calendarId, 64, "calendarId");
		RequestCheckUtils.checkNotEmpty(eventId, "eventId");
		RequestCheckUtils.checkMaxLength(eventId, 64, "eventId");
	}
	

}