package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCalendarListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7331287239932535354L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * api返回的结果对象
	 */
	@ApiField("result")
	private OpenCalendarListResponse result;

	/** 
	 * 调用成功标识位
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

	public void setResult(OpenCalendarListResponse result) {
		this.result = result;
	}
	public OpenCalendarListResponse getResult( ) {
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
	 * 参与者,考虑性能问题，该字段不向外透出
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attendees extends TaobaoObject {
		private static final long serialVersionUID = 1363116285576819216L;
		/**
		 * 展示姓名
		 */
		@ApiField("display_name")
		private String displayName;
		/**
		 * 是否组织者
		 */
		@ApiField("organizer")
		private Boolean organizer;
		/**
		 * 响应状态（accepted, declined, needsAction）
		 */
		@ApiField("response_status")
		private String responseStatus;
		/**
		 * 是否自己
		 */
		@ApiField("self")
		private Boolean self;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDisplayName() {
			return this.displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public Boolean getOrganizer() {
			return this.organizer;
		}
		public void setOrganizer(Boolean organizer) {
			this.organizer = organizer;
		}
		public String getResponseStatus() {
			return this.responseStatus;
		}
		public void setResponseStatus(String responseStatus) {
			this.responseStatus = responseStatus;
		}
		public Boolean getSelf() {
			return this.self;
		}
		public void setSelf(Boolean self) {
			this.self = self;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 组织者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class User extends TaobaoObject {
		private static final long serialVersionUID = 6592785529996291948L;
		/**
		 * 展示姓名
		 */
		@ApiField("display_name")
		private String displayName;
		/**
		 * 是否自己
		 */
		@ApiField("self")
		private Boolean self;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getDisplayName() {
			return this.displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public Boolean getSelf() {
			return this.self;
		}
		public void setSelf(Boolean self) {
			this.self = self;
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
		private static final long serialVersionUID = 6195591266856831544L;
		/**
		 * 全天事件的时候使用 yyyy-MM-dd（date_time和date不可以同时出现）
		 */
		@ApiField("date")
		private String date;
		/**
		 * 时间 'yyyy-MM-ddTHH:mm:ssZ',
		 */
		@ApiField("date_time")
		private String dateTime;
		/**
		 * 时区
		 */
		@ApiField("time_zone")
		private String timeZone;
	
		public String getDate() {
			return this.date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDateTime() {
			return this.dateTime;
		}
		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}
		public String getTimeZone() {
			return this.timeZone;
		}
		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}
	}
	
	/**
	 * 日程的实体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Items extends TaobaoObject {
		private static final long serialVersionUID = 1667662341422256416L;
		/**
		 * 参与者,考虑性能问题，该字段不向外透出
		 */
		@ApiListField("attendees")
		@ApiField("attendees")
		private List<Attendees> attendees;
		/**
		 * 创建时间
		 */
		@ApiField("created")
		private DateTime created;
		/**
		 * 内容描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 结束时间
		 */
		@ApiField("end")
		private DateTime end;
		/**
		 * 日程跨域唯一id，用于唯一标识一组关联日程事件
		 */
		@ApiField("i_cal_uid")
		private String iCalUid;
		/**
		 * 日程事件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 地点
		 */
		@ApiField("location")
		private String location;
		/**
		 * 组织者
		 */
		@ApiField("organizer")
		private User organizer;
		/**
		 * 循环的规则
		 */
		@ApiListField("recurrence")
		@ApiField("string")
		private List<String> recurrence;
		/**
		 * 响应状态（accepted, declined, needsAction）
		 */
		@ApiField("response_status")
		private String responseStatus;
		/**
		 * 开始时间
		 */
		@ApiField("start")
		private DateTime start;
		/**
		 * 状态（confirmed、cancelled）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 标题简述
		 */
		@ApiField("summary")
		private String summary;
		/**
		 * 最后一次更新时间
		 */
		@ApiField("updated")
		private DateTime updated;
	
		public List<Attendees> getAttendees() {
			return this.attendees;
		}
		public void setAttendees(List<Attendees> attendees) {
			this.attendees = attendees;
		}
		public DateTime getCreated() {
			return this.created;
		}
		public void setCreated(DateTime created) {
			this.created = created;
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
		public String getiCalUid() {
			return this.iCalUid;
		}
		public void setiCalUid(String iCalUid) {
			this.iCalUid = iCalUid;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getLocation() {
			return this.location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public User getOrganizer() {
			return this.organizer;
		}
		public void setOrganizer(User organizer) {
			this.organizer = organizer;
		}
		public List<String> getRecurrence() {
			return this.recurrence;
		}
		public void setRecurrence(List<String> recurrence) {
			this.recurrence = recurrence;
		}
		public String getResponseStatus() {
			return this.responseStatus;
		}
		public void setResponseStatus(String responseStatus) {
			this.responseStatus = responseStatus;
		}
		public DateTime getStart() {
			return this.start;
		}
		public void setStart(DateTime start) {
			this.start = start;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public DateTime getUpdated() {
			return this.updated;
		}
		public void setUpdated(DateTime updated) {
			this.updated = updated;
		}
	}
	
	/**
	 * api返回的结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarListResponse extends TaobaoObject {
		private static final long serialVersionUID = 3475946515826747512L;
		/**
		 * 日程的实体
		 */
		@ApiListField("items")
		@ApiField("items")
		private List<Items> items;
		/**
		 * 请求结果若还有更多，则返回下一页的token值
		 */
		@ApiField("next_page_token")
		private String nextPageToken;
		/**
		 * 文件夹描述
		 */
		@ApiField("summary")
		private String summary;
	
		public List<Items> getItems() {
			return this.items;
		}
		public void setItems(List<Items> items) {
			this.items = items;
		}
		public String getNextPageToken() {
			return this.nextPageToken;
		}
		public void setNextPageToken(String nextPageToken) {
			this.nextPageToken = nextPageToken;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
	}
	


}
