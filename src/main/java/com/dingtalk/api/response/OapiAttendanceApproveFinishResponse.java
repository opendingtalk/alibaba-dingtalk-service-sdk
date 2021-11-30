package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.finish response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceApproveFinishResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1823985599243976316L;

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
		private static final long serialVersionUID = 3415622842969159177L;
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
		private static final long serialVersionUID = 2184435635462111948L;
		/**
		 * 总时长
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * demo
		 */
		@ApiListField("durationDetail")
		@ApiField("top_day_duration_vo")
		private List<TopDayDurationVo> durationDetail;
	
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public List<TopDayDurationVo> getDurationDetail() {
			return this.durationDetail;
		}
		public void setDurationDetail(List<TopDayDurationVo> durationDetail) {
			this.durationDetail = durationDetail;
		}
	}
	


}
