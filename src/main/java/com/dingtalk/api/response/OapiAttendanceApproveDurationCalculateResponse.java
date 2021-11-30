package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.duration.calculate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceApproveDurationCalculateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2565514116875216391L;

	/** 
	 * 0代表成功，其他代表失败
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * demo
	 */
	@ApiField("result")
	private TopDurationVo result;


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

	public void setResult(TopDurationVo result) {
		this.result = result;
	}
	public TopDurationVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopDayDurationVo extends TaobaoObject {
		private static final long serialVersionUID = 2524433241892819764L;
		/**
		 * 日期
		 */
		@ApiField("date")
		private String date;
		/**
		 * 每日时长
		 */
		@ApiField("duration")
		private String duration;
	
		public String getDate() {
			return this.date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
	}
	
	/**
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopDurationVo extends TaobaoObject {
		private static final long serialVersionUID = 3846864312293511196L;
		/**
		 * 总时长
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * demo
		 */
		@ApiListField("duration_details")
		@ApiField("top_day_duration_vo")
		private List<TopDayDurationVo> durationDetails;
	
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public List<TopDayDurationVo> getDurationDetails() {
			return this.durationDetails;
		}
		public void setDurationDetails(List<TopDayDurationVo> durationDetails) {
			this.durationDetails = durationDetails;
		}
	}
	


}
