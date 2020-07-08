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
import com.dingtalk.api.response.OapiCalendarV2EventCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.v2.event.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.25
 */
public class OapiCalendarV2EventCreateRequest extends BaseTaobaoRequest<OapiCalendarV2EventCreateResponse> {
	
	

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
		return "dingtalk.oapi.calendar.v2.event.create";
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

	public Class<OapiCalendarV2EventCreateResponse> getResponseClass() {
		return OapiCalendarV2EventCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 日程参与者，参与者最大人数为100(包括组织者)
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attendee extends TaobaoObject {
		private static final long serialVersionUID = 4682486793472396283L;
		/**
		 * 员工工号
		 */
		@ApiField("userid")
		private String userid;
	
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
		private static final long serialVersionUID = 1894828957218449866L;
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
	 * 会议开始前多少分钟提醒
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarReminderVo extends TaobaoObject {
		private static final long serialVersionUID = 3453756752644133973L;
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
	 * 地址信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LocationVo extends TaobaoObject {
		private static final long serialVersionUID = 1634597284345588399L;
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
		private static final long serialVersionUID = 4491643692419581425L;
		/**
		 * 日程参与者，参与者最大人数为100(包括组织者)
		 */
		@ApiListField("attendees")
		@ApiField("attendee")
		private List<Attendee> attendees;
		/**
		 * 目前只能传primary，表示创建的日程在“我的日程”下
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
		 * 地址信息
		 */
		@ApiField("location")
		private LocationVo location;
		/**
		 * 受限字段,仅支持传NONE或者APP
		 */
		@ApiField("notification_type")
		private String notificationType;
		/**
		 * 日程组织者
		 */
		@ApiField("organizer")
		private Attendee organizer;
		/**
		 * 会议开始前多少分钟提醒
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
		public LocationVo getLocation() {
			return this.location;
		}
		public void setLocation(LocationVo location) {
			this.location = location;
		}
		public String getNotificationType() {
			return this.notificationType;
		}
		public void setNotificationType(String notificationType) {
			this.notificationType = notificationType;
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