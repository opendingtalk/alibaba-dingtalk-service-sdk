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

	private static final long serialVersionUID = 4487557517753277938L;

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
	 * 适用范围规则列表：哪些部门/员工可以使用该假期类型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveVisibilityRuleVo extends TaobaoObject {
		private static final long serialVersionUID = 2433822229538289611L;
		/**
		 * 规则类型：dept-部门；staff-员工；label-角色
		 */
		@ApiField("type")
		private String type;
		/**
		 * 规则数据：当type=staff时，为员工userId列表；当type=dept时，为部门id列表；当type=label时，为角色id列表
		 */
		@ApiListField("visible")
		@ApiField("string")
		private List<String> visible;
	
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<String> getVisible() {
			return this.visible;
		}
		public void setVisible(List<String> visible) {
			this.visible = visible;
		}
	}
	
	/**
	 * 请假证明类
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveCertificateVo extends TaobaoObject {
		private static final long serialVersionUID = 7329627193939613138L;
		/**
		 * 超过多长时间需提供请假证明
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 是否开启请假证明
		 */
		@ApiField("enable")
		private Boolean enable;
		/**
		 * 请假提示文案
		 */
		@ApiField("prompt_information")
		private String promptInformation;
		/**
		 * 请假证明单位hour，day
		 */
		@ApiField("unit")
		private String unit;
	
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
		}
		public Boolean getEnable() {
			return this.enable;
		}
		public void setEnable(Boolean enable) {
			this.enable = enable;
		}
		public String getPromptInformation() {
			return this.promptInformation;
		}
		public void setPromptInformation(String promptInformation) {
			this.promptInformation = promptInformation;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 限时提交规则
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubmitTimeRuleVo extends TaobaoObject {
		private static final long serialVersionUID = 4658299675958835579L;
		/**
		 * 是否开启限时提交功能：仅且为true时开启
		 */
		@ApiField("enable_time_limit")
		private Boolean enableTimeLimit;
		/**
		 * 限制类型：before-提前；after-补交
		 */
		@ApiField("time_type")
		private String timeType;
		/**
		 * 时间单位：day-天；hour-小时
		 */
		@ApiField("time_unit")
		private String timeUnit;
		/**
		 * 限制值：timeUnit=day时，有效值范围[0~30] 天；timeUnit=hour时，有效值范围[0~24] 小时
		 */
		@ApiField("time_value")
		private Long timeValue;
	
		public Boolean getEnableTimeLimit() {
			return this.enableTimeLimit;
		}
		public void setEnableTimeLimit(Boolean enableTimeLimit) {
			this.enableTimeLimit = enableTimeLimit;
		}
		public String getTimeType() {
			return this.timeType;
		}
		public void setTimeType(String timeType) {
			this.timeType = timeType;
		}
		public String getTimeUnit() {
			return this.timeUnit;
		}
		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}
		public Long getTimeValue() {
			return this.timeValue;
		}
		public void setTimeValue(Long timeValue) {
			this.timeValue = timeValue;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 1779177483728986374L;
		/**
		 * 假期类型，普通假期或者加班转调休假期。(general_leave、lieu_leave其中一种)
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 不需要余额控制的请假类型（如事假）
		 */
		@ApiField("freedom_leave")
		private Boolean freedomLeave;
		/**
		 * 每天折算的工作时长(百分之一 例如1天=10小时=1000)
		 */
		@ApiField("hours_in_per_day")
		private Long hoursInPerDay;
		/**
		 * 请假证明类
		 */
		@ApiField("leave_certificate")
		private LeaveCertificateVo leaveCertificate;
		/**
		 * 假期类型唯一标识
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * 取整字段， up或者down
		 */
		@ApiField("leave_hour_ceil")
		private String leaveHourCeil;
		/**
		 * 假期名称
		 */
		@ApiField("leave_name")
		private String leaveName;
		/**
		 * 是否开启请假时长是否向上取整
		 */
		@ApiField("leave_time_ceil")
		private Boolean leaveTimeCeil;
		/**
		 * 请假时长向上取整时的最小时长单位：hour-不足1小时按照1小时计算；halfHour-不足半小时按照半小时计算
		 */
		@ApiField("leave_time_ceil_min_unit")
		private String leaveTimeCeilMinUnit;
		/**
		 * 请假单位，可以按照天半天或者小时请假。(day、halfDay、hour其中一种)
		 */
		@ApiField("leave_view_unit")
		private String leaveViewUnit;
		/**
		 * 最大请假时间
		 */
		@ApiField("max_leave_time")
		private Long maxLeaveTime;
		/**
		 * 请假时，最小请假时长（请假单位为hour时生效），请假时长小于该值时自动取该值，有效值：[0, 23]
		 */
		@ApiField("min_leave_hour")
		private Long minLeaveHour;
		/**
		 * 是否按照自然日统计请假时长，当为false的时候，用户发起请假时候会根据用户在请假时间段内的排班情况来计算请假时长。
		 */
		@ApiField("natural_day_leave")
		private String naturalDayLeave;
		/**
		 * 是否带薪假期
		 */
		@ApiField("paid_leave")
		private Boolean paidLeave;
		/**
		 * 开放接口自定义的:external oa后台新建的：inner
		 */
		@ApiField("source")
		private String source;
		/**
		 * 限时提交规则
		 */
		@ApiField("submit_time_rule")
		private SubmitTimeRuleVo submitTimeRule;
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
		/**
		 * 适用范围规则列表：哪些部门员工可以使用该假期类型
		 */
		@ApiListField("visibility_rules")
		@ApiField("leave_visibility_rule_vo")
		private List<LeaveVisibilityRuleVo> visibilityRules;
		/**
		 * 新员工请假：何时可以请假（entry-入职开始 、formal-转正后）
		 */
		@ApiField("when_can_leave")
		private String whenCanLeave;
	
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public Boolean getFreedomLeave() {
			return this.freedomLeave;
		}
		public void setFreedomLeave(Boolean freedomLeave) {
			this.freedomLeave = freedomLeave;
		}
		public Long getHoursInPerDay() {
			return this.hoursInPerDay;
		}
		public void setHoursInPerDay(Long hoursInPerDay) {
			this.hoursInPerDay = hoursInPerDay;
		}
		public LeaveCertificateVo getLeaveCertificate() {
			return this.leaveCertificate;
		}
		public void setLeaveCertificate(LeaveCertificateVo leaveCertificate) {
			this.leaveCertificate = leaveCertificate;
		}
		public String getLeaveCode() {
			return this.leaveCode;
		}
		public void setLeaveCode(String leaveCode) {
			this.leaveCode = leaveCode;
		}
		public String getLeaveHourCeil() {
			return this.leaveHourCeil;
		}
		public void setLeaveHourCeil(String leaveHourCeil) {
			this.leaveHourCeil = leaveHourCeil;
		}
		public String getLeaveName() {
			return this.leaveName;
		}
		public void setLeaveName(String leaveName) {
			this.leaveName = leaveName;
		}
		public Boolean getLeaveTimeCeil() {
			return this.leaveTimeCeil;
		}
		public void setLeaveTimeCeil(Boolean leaveTimeCeil) {
			this.leaveTimeCeil = leaveTimeCeil;
		}
		public String getLeaveTimeCeilMinUnit() {
			return this.leaveTimeCeilMinUnit;
		}
		public void setLeaveTimeCeilMinUnit(String leaveTimeCeilMinUnit) {
			this.leaveTimeCeilMinUnit = leaveTimeCeilMinUnit;
		}
		public String getLeaveViewUnit() {
			return this.leaveViewUnit;
		}
		public void setLeaveViewUnit(String leaveViewUnit) {
			this.leaveViewUnit = leaveViewUnit;
		}
		public Long getMaxLeaveTime() {
			return this.maxLeaveTime;
		}
		public void setMaxLeaveTime(Long maxLeaveTime) {
			this.maxLeaveTime = maxLeaveTime;
		}
		public Long getMinLeaveHour() {
			return this.minLeaveHour;
		}
		public void setMinLeaveHour(Long minLeaveHour) {
			this.minLeaveHour = minLeaveHour;
		}
		public String getNaturalDayLeave() {
			return this.naturalDayLeave;
		}
		public void setNaturalDayLeave(String naturalDayLeave) {
			this.naturalDayLeave = naturalDayLeave;
		}
		public Boolean getPaidLeave() {
			return this.paidLeave;
		}
		public void setPaidLeave(Boolean paidLeave) {
			this.paidLeave = paidLeave;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public SubmitTimeRuleVo getSubmitTimeRule() {
			return this.submitTimeRule;
		}
		public void setSubmitTimeRule(SubmitTimeRuleVo submitTimeRule) {
			this.submitTimeRule = submitTimeRule;
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
		public List<LeaveVisibilityRuleVo> getVisibilityRules() {
			return this.visibilityRules;
		}
		public void setVisibilityRules(List<LeaveVisibilityRuleVo> visibilityRules) {
			this.visibilityRules = visibilityRules;
		}
		public String getWhenCanLeave() {
			return this.whenCanLeave;
		}
		public void setWhenCanLeave(String whenCanLeave) {
			this.whenCanLeave = whenCanLeave;
		}
	}
	


}
