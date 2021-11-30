package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleavestatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetleavestatusResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2737174933951846983L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 业务结果
	 */
	@ApiField("result")
	private LeaveStatusListVO result;

	/** 
	 * 请求是否成功
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

	public void setResult(LeaveStatusListVO result) {
		this.result = result;
	}
	public LeaveStatusListVO getResult( ) {
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
	 * 请假状态列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveStatusVO extends TaobaoObject {
		private static final long serialVersionUID = 7647252493859631134L;
		/**
		 * 假期时长*100，例如用户请假时长为1天，该值就等于100
		 */
		@ApiField("duration_percent")
		private Long durationPercent;
		/**
		 * 请假单位：“percent_day”表示天，“percent_hour”表示小时
		 */
		@ApiField("duration_unit")
		private String durationUnit;
		/**
		 * 请假结束时间，时间戳
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 假期类型code
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * 请假开始时间，时间戳
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getDurationPercent() {
			return this.durationPercent;
		}
		public void setDurationPercent(Long durationPercent) {
			this.durationPercent = durationPercent;
		}
		public String getDurationUnit() {
			return this.durationUnit;
		}
		public void setDurationUnit(String durationUnit) {
			this.durationUnit = durationUnit;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getLeaveCode() {
			return this.leaveCode;
		}
		public void setLeaveCode(String leaveCode) {
			this.leaveCode = leaveCode;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 业务结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveStatusListVO extends TaobaoObject {
		private static final long serialVersionUID = 5242676681579755233L;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 请假状态列表
		 */
		@ApiListField("leave_status")
		@ApiField("leave_status_v_o")
		private List<LeaveStatusVO> leaveStatus;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<LeaveStatusVO> getLeaveStatus() {
			return this.leaveStatus;
		}
		public void setLeaveStatus(List<LeaveStatusVO> leaveStatus) {
			this.leaveStatus = leaveStatus;
		}
	}
	


}
