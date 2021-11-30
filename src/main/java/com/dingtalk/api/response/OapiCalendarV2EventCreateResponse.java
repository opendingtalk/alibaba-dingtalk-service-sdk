package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.v2.event.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCalendarV2EventCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3231525142338517726L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 日程对象
	 */
	@ApiField("result")
	private Event result;

	/** 
	 * 结果是否正确
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(Event result) {
		this.result = result;
	}
	public Event getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 日程参与者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attendee extends TaobaoObject {
		private static final long serialVersionUID = 3868838226759482139L;
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
		private static final long serialVersionUID = 6648538654719992411L;
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
		private static final long serialVersionUID = 3389875125184662683L;
		/**
		 * 提醒方式.app表示应用内提醒
		 */
		@ApiField("method")
		private String method;
		/**
		 * 会议开始前多少分钟提醒
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
		private static final long serialVersionUID = 3424564357271972774L;
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
		 * 地址
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
	 * 日程对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Event extends TaobaoObject {
		private static final long serialVersionUID = 1687841819369336834L;
		/**
		 * 日程参与者
		 */
		@ApiListField("attendees")
		@ApiField("attendee")
		private List<Attendee> attendees;
		/**
		 * primary表示创建的日程在“我的日程”下
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
		 * 日程id
		 */
		@ApiField("event_id")
		private String eventId;
		/**
		 * 地址
		 */
		@ApiField("location")
		private LocationVo location;
		/**
		 * 提醒方式
		 */
		@ApiField("notification_type")
		private String notificationType;
		/**
		 * 日程组织者
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
