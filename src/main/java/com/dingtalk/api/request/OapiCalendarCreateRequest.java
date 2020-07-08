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
import com.dingtalk.api.response.OapiCalendarCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.01
 */
public class OapiCalendarCreateRequest extends BaseTaobaoRequest<OapiCalendarCreateResponse> {
	
	

	/** 
	* 创建日程实体
	 */
	private String createVo;

	public void setCreateVo(String createVo) {
		this.createVo = createVo;
	}

	public void setCreateVo(OpenCalendarCreateVo createVo) {
		this.createVo = new JSONWriter(false,false,true).write(createVo);
	}

	public String getCreateVo() {
		return this.createVo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.calendar.create";
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
		txtParams.put("create_vo", this.createVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarCreateResponse> getResponseClass() {
		return OapiCalendarCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 事项开始前提醒
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarReminderVo extends TaobaoObject {
		private static final long serialVersionUID = 7149317575714856325L;
		/**
		 * 距开始时多久进行提醒(单位:分钟)
		 */
		@ApiField("minutes")
		private Long minutes;
		/**
		 * 提醒类型:app-应用内;
		 */
		@ApiField("remind_type")
		private String remindType;
	
		public Long getMinutes() {
			return this.minutes;
		}
		public void setMinutes(Long minutes) {
			this.minutes = minutes;
		}
		public String getRemindType() {
			return this.remindType;
		}
		public void setRemindType(String remindType) {
			this.remindType = remindType;
		}
	}
	
	/**
	 * 结束时间
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DatetimeVo extends TaobaoObject {
		private static final long serialVersionUID = 4222549763655318954L;
		/**
		 * 时区
		 */
		@ApiField("timezone")
		private String timezone;
		/**
		 * 结束的unix时间戳(单位:毫秒)
		 */
		@ApiField("unix_timestamp")
		private Long unixTimestamp;
	
		public String getTimezone() {
			return this.timezone;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
		public Long getUnixTimestamp() {
			return this.unixTimestamp;
		}
		public void setUnixTimestamp(Long unixTimestamp) {
			this.unixTimestamp = unixTimestamp;
		}
	}
	
	/**
	 * 显示日程来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarSourceVo extends TaobaoObject {
		private static final long serialVersionUID = 3781558249323969767L;
		/**
		 * 日程来源
		 */
		@ApiField("title")
		private String title;
		/**
		 * 点击日程跳转目标地址
		 */
		@ApiField("url")
		private String url;
	
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 创建日程实体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCalendarCreateVo extends TaobaoObject {
		private static final long serialVersionUID = 8719438279613274787L;
		/**
		 * 业务方自己的主键
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 日程类型:task-任务;meeting-会议;notification-提醒
		 */
		@ApiField("calendar_type")
		private String calendarType;
		/**
		 * 创建者工号
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 备注
		 */
		@ApiField("description")
		private String description;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private DatetimeVo endTime;
		/**
		 * 地点
		 */
		@ApiField("location")
		private String location;
		/**
		 * 接收者工号
		 */
		@ApiListField("receiver_userids")
		@ApiField("string")
		private List<String> receiverUserids;
		/**
		 * 事项开始前提醒
		 */
		@ApiField("reminder")
		private OpenCalendarReminderVo reminder;
		/**
		 * 显示日程来源
		 */
		@ApiField("source")
		private OpenCalendarSourceVo source;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private DatetimeVo startTime;
		/**
		 * 主题
		 */
		@ApiField("summary")
		private String summary;
		/**
		 * 请求的唯一标识, 保证请求唯一性
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getCalendarType() {
			return this.calendarType;
		}
		public void setCalendarType(String calendarType) {
			this.calendarType = calendarType;
		}
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public DatetimeVo getEndTime() {
			return this.endTime;
		}
		public void setEndTime(DatetimeVo endTime) {
			this.endTime = endTime;
		}
		public String getLocation() {
			return this.location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public List<String> getReceiverUserids() {
			return this.receiverUserids;
		}
		public void setReceiverUserids(List<String> receiverUserids) {
			this.receiverUserids = receiverUserids;
		}
		public OpenCalendarReminderVo getReminder() {
			return this.reminder;
		}
		public void setReminder(OpenCalendarReminderVo reminder) {
			this.reminder = reminder;
		}
		public OpenCalendarSourceVo getSource() {
			return this.source;
		}
		public void setSource(OpenCalendarSourceVo source) {
			this.source = source;
		}
		public DatetimeVo getStartTime() {
			return this.startTime;
		}
		public void setStartTime(DatetimeVo startTime) {
			this.startTime = startTime;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}