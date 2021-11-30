package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiCalendarV2AttendeeUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.v2.attendee.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.16
 */
public class OapiCalendarV2AttendeeUpdateRequest extends BaseTaobaoRequest<OapiCalendarV2AttendeeUpdateResponse> {
	
	

	/** 
	* 开放平台应用对应的AgentId
	 */
	private Long agentid;

	/** 
	* 参与者列表
	 */
	private String attendees;

	/** 
	* 日历id,目前仅支持传primary，表示修改的是“我的日程”下的日程
	 */
	private String calendarId;

	/** 
	* 加密后的日程Id
	 */
	private String eventId;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setAttendees(String attendees) {
		this.attendees = attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = new JSONWriter(false,false,true).write(attendees);
	}

	public String getAttendees() {
		return this.attendees;
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
		return "dingtalk.oapi.calendar.v2.attendee.update";
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
		txtParams.put("attendees", this.attendees);
		txtParams.put("calendar_id", this.calendarId);
		txtParams.put("event_id", this.eventId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarV2AttendeeUpdateResponse> getResponseClass() {
		return OapiCalendarV2AttendeeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(attendees, 20, "attendees");
		RequestCheckUtils.checkNotEmpty(calendarId, "calendarId");
		RequestCheckUtils.checkMaxLength(calendarId, 64, "calendarId");
		RequestCheckUtils.checkNotEmpty(eventId, "eventId");
		RequestCheckUtils.checkMaxLength(eventId, 64, "eventId");
	}
	
	/**
	 * 参与者列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attendee extends TaobaoObject {
		private static final long serialVersionUID = 1711536181161151429L;
		/**
		 * 添加或者删除状态，add:添加；remove:删除
		 */
		@ApiField("attendee_status")
		private String attendeeStatus;
		/**
		 * 员工工号
		 */
		@ApiField("userid")
		private String userid;
	
		public String getAttendeeStatus() {
			return this.attendeeStatus;
		}
		public void setAttendeeStatus(String attendeeStatus) {
			this.attendeeStatus = attendeeStatus;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}