package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationTypeUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5263964326976541424L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private LeaveTypeVo result;

	/** 
	 * 是否正确访问
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

	public void setResult(LeaveTypeVo result) {
		this.result = result;
	}
	public LeaveTypeVo getResult( ) {
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
	 * 结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveTypeVo extends TaobaoObject {
		private static final long serialVersionUID = 7492427429897423844L;
		/**
		 * 假期类型，普通假期或者加班转调休假期。(general_leave、lieu_leave其中一种)
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 每天折算的工作时长(百分之一 例如1天=10小时=1000)
		 */
		@ApiField("hours_in_per_day")
		private Long hoursInPerDay;
		/**
		 * 假期类型唯一标识
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * 假期名称
		 */
		@ApiField("leave_name")
		private String leaveName;
		/**
		 * 请假单位，可以按照天半天或者小时请假。(day、halfday、hour其中一种)
		 */
		@ApiField("leave_view_unit")
		private String leaveViewUnit;
		/**
		 * 是否按照自然日统计请假时长，当为false的时候，用户发起请假时候会根据用户在请假时间段内的排班情况来计算请假时长。
		 */
		@ApiField("natural_day_leave")
		private Boolean naturalDayLeave;
	
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public Long getHoursInPerDay() {
			return this.hoursInPerDay;
		}
		public void setHoursInPerDay(Long hoursInPerDay) {
			this.hoursInPerDay = hoursInPerDay;
		}
		public String getLeaveCode() {
			return this.leaveCode;
		}
		public void setLeaveCode(String leaveCode) {
			this.leaveCode = leaveCode;
		}
		public String getLeaveName() {
			return this.leaveName;
		}
		public void setLeaveName(String leaveName) {
			this.leaveName = leaveName;
		}
		public String getLeaveViewUnit() {
			return this.leaveViewUnit;
		}
		public void setLeaveViewUnit(String leaveViewUnit) {
			this.leaveViewUnit = leaveViewUnit;
		}
		public Boolean getNaturalDayLeave() {
			return this.naturalDayLeave;
		}
		public void setNaturalDayLeave(Boolean naturalDayLeave) {
			this.naturalDayLeave = naturalDayLeave;
		}
	}
	


}
