package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationTypeListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2777733257716115995L;

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
	 * result
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 5713646187845894576L;
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
		private String naturalDayLeave;
		/**
		 * 开放接口自定义的:external oa后台新建的：inner
		 */
		@ApiField("source")
		private String source;
		/**
		 * 有效类型 absolute_time(绝对时间)、relative_time(相对时间)其中一种
		 */
		@ApiField("validity_type")
		private String validityType;
		/**
		 * 延长日期(当validity_type为absolute_time该值该值不为空且满足yy-mm格式 validity_type为relative_time该值为大于1的整数)
		 */
		@ApiField("validity_value")
		private String validityValue;
	
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
		public String getNaturalDayLeave() {
			return this.naturalDayLeave;
		}
		public void setNaturalDayLeave(String naturalDayLeave) {
			this.naturalDayLeave = naturalDayLeave;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getValidityType() {
			return this.validityType;
		}
		public void setValidityType(String validityType) {
			this.validityType = validityType;
		}
		public String getValidityValue() {
			return this.validityValue;
		}
		public void setValidityValue(String validityValue) {
			this.validityValue = validityValue;
		}
	}
	


}
