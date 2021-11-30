package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiCalendarV2EventUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.v2.event.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.16
 */
public class OapiCalendarV2EventUpdateRequest extends BaseTaobaoRequest<OapiCalendarV2EventUpdateResponse> {
	
	

	/** 
	* 开放平台应用对应的AgentId
	 */
	private Long agentid;

	/** 
	* 日程创建对象
	 */
	private String event;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEvent(Event event) {
		this.event = new JSONWriter(false,false,true).write(event);
	}

	public String getEvent() {
		return this.event;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.calendar.v2.event.update";
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
		txtParams.put("event", this.event);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarV2EventUpdateResponse> getResponseClass() {
		return OapiCalendarV2EventUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 日程参与者，参与人数最多100人，包括组织者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attendee extends TaobaoObject {
		private static final long serialVersionUID = 2644249139481711162L;
		/**
		 * 添加或者删除状态，add:添加；remove:删除；若通过该接口新增或删除参会人，则该字段必填
		 */
		@ApiField("attendee_status")
		private String attendeeStatus;
		/**
		 * 员工工号,若通过该接口新增或删除参会人，则该字段必填
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
	
	/**
	 * 结束时间
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DateTime extends TaobaoObject {
		private static final long serialVersionUID = 5575611251172843482L;
		/**
		 * 日期，全天日程使用，格式必须为'yyyy-mm-dd',和timestamp字段互斥，该字段有值时，则忽略timestamp字段
		 */
		@ApiField("date")
		private String date;
		/**
		 * 时间戳，单位为秒。非全天日程使用，与date字段互斥
		 */
		@ApiField("timestamp")
		private Long timestamp;
		/**
		 * 时区信息，默认为"AsiaShanghai"。date有值时，timezone 为 UTC；
		 */
		@ApiField("timezone")
		private String timezone;
	
		public String getDate() {
			return this.date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Long getTimestamp() {
			return this.timestamp;
		}
		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
		public String getTimezone() {
			return this.timezone;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
	}
	
	/**
	 * 会议开始前提醒
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarReminderVo extends TaobaoObject {
		private static final long serialVersionUID = 3192875528732341566L;
		/**
		 * 提醒方式.app表示应用内提醒
		 */
		@ApiField("method")
		private String method;
		/**
		 * 开始前提醒的分钟数,有效值为0，5，15，30，60，1440
		 */
		@ApiField("minutes")
		private Long minutes;
	
		public String getMethod() {
			return this.method;
		}
		public void setMethod(String method) {
			this.method = method;
		}
		public Long getMinutes() {
			return this.minutes;
		}
		public void setMinutes(Long minutes) {
			this.minutes = minutes;
		}
	}
	
	/**
	 * 地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LocationVo extends TaobaoObject {
		private static final long serialVersionUID = 8554777392452918197L;
		/**
		 * 纬度
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 经度
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * 地址详情
		 */
		@ApiField("place")
		private String place;
	
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getPlace() {
			return this.place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
	}
	
	/**
	 * 日程创建对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Event extends TaobaoObject {
		private static final long serialVersionUID = 5553715298595167129L;
		/**
		 * 日程参与者，参与人数最多100人，包括组织者
		 */
		@ApiListField("attendees")
		@ApiField("attendee")
		private List<Attendee> attendees;
		/**
		 * 日历ID,目前仅支持传primary,表示修改当前用户“我的日程”下的日程
		 */
		@ApiField("calendar_id")
		private String calendarId;
		/**
		 * 日程描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 结束时间
		 */
		@ApiField("end")
		private DateTime end;
		/**
		 * 日程Id
		 */
		@ApiField("event_id")
		private String eventId;
		/**
		 * 地址
		 */
		@ApiField("location")
		private LocationVo location;
		/**
		 * 日程组织者,暂不支持修改
		 */
		@ApiField("organizer")
		private Attendee organizer;
		/**
		 * 会议开始前提醒
		 */
		@ApiField("reminder")
		private OpenCalendarReminderVo reminder;
		/**
		 * 开始时间
		 */
		@ApiField("start")
		private DateTime start;
		/**
		 * 日程主题
		 */
		@ApiField("summary")
		private String summary;
	
		public List<Attendee> getAttendees() {
			return this.attendees;
		}
		public void setAttendees(List<Attendee> attendees) {
			this.attendees = attendees;
		}
		public String getCalendarId() {
			return this.calendarId;
		}
		public void setCalendarId(String calendarId) {
			this.calendarId = calendarId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public DateTime getEnd() {
			return this.end;
		}
		public void setEnd(DateTime end) {
			this.end = end;
		}
		public String getEventId() {
			return this.eventId;
		}
		public void setEventId(String eventId) {
			this.eventId = eventId;
		}
		public LocationVo getLocation() {
			return this.location;
		}
		public void setLocation(LocationVo location) {
			this.location = location;
		}
		public Attendee getOrganizer() {
			return this.organizer;
		}
		public void setOrganizer(Attendee organizer) {
			this.organizer = organizer;
		}
		public OpenCalendarReminderVo getReminder() {
			return this.reminder;
		}
		public void setReminder(OpenCalendarReminderVo reminder) {
			this.reminder = reminder;
		}
		public DateTime getStart() {
			return this.start;
		}
		public void setStart(DateTime start) {
			this.start = start;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
	}
	

}