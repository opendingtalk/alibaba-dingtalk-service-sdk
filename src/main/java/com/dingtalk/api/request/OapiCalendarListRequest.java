package com.dingtalk.api.request;

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
import com.dingtalk.api.response.OapiCalendarListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.21
 */
public class OapiCalendarListRequest extends BaseTaobaoRequest<OapiCalendarListResponse> {
	
	

	/** 
	* 钉钉日历文件夹的对外id，默认是自己的默认文件夹
	 */
	private String calendarFolderId;

	/** 
	* 日程跨域唯一id，用于唯一标识一组关联日程事件
	 */
	private String iCalUid;

	/** 
	* 结果返回的最多数量，默认250，最多返回2500
	 */
	private Long maxResults;

	/** 
	* 查询对应页，值有上一次请求返回的结果里对应nextPageToken
	 */
	private String pageToken;

	/** 
	* 是否需要展开循环日程
	 */
	private Boolean singleEvents;

	/** 
	* 查询时间上限
	 */
	private String timeMax;

	/** 
	* 查询时间下限
	 */
	private String timeMin;

	/** 
	* 员工ID
	 */
	private String userId;

	public void setCalendarFolderId(String calendarFolderId) {
		this.calendarFolderId = calendarFolderId;
	}

	public String getCalendarFolderId() {
		return this.calendarFolderId;
	}

	public void setiCalUid(String iCalUid) {
		this.iCalUid = iCalUid;
	}

	public String getiCalUid() {
		return this.iCalUid;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}

	public String getPageToken() {
		return this.pageToken;
	}

	public void setSingleEvents(Boolean singleEvents) {
		this.singleEvents = singleEvents;
	}

	public Boolean getSingleEvents() {
		return this.singleEvents;
	}

	public void setTimeMax(String timeMax) {
		this.timeMax = timeMax;
	}

	public void setTimeMax(DateTime timeMax) {
		this.timeMax = new JSONWriter(false,false,true).write(timeMax);
	}

	public String getTimeMax() {
		return this.timeMax;
	}

	public void setTimeMin(String timeMin) {
		this.timeMin = timeMin;
	}

	public void setTimeMin(DateTime timeMin) {
		this.timeMin = new JSONWriter(false,false,true).write(timeMin);
	}

	public String getTimeMin() {
		return this.timeMin;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.calendar.list";
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
		txtParams.put("calendar_folder_id", this.calendarFolderId);
		txtParams.put("i_cal_uid", this.iCalUid);
		txtParams.put("max_results", this.maxResults);
		txtParams.put("page_token", this.pageToken);
		txtParams.put("single_events", this.singleEvents);
		txtParams.put("time_max", this.timeMax);
		txtParams.put("time_min", this.timeMin);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarListResponse> getResponseClass() {
		return OapiCalendarListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userId, "userId");
	}
	
	/**
	 * 查询时间下限
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DateTime extends TaobaoObject {
		private static final long serialVersionUID = 7328612659759941785L;
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
	

}