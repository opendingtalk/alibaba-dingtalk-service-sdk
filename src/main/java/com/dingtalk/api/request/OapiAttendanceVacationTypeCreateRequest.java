package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAttendanceVacationTypeCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.27
 */
public class OapiAttendanceVacationTypeCreateRequest extends BaseTaobaoRequest<OapiAttendanceVacationTypeCreateResponse> {
	
	

	/** 
	* 假期类型，普通假期或者加班转调休假期。(general_leave、lieu_leave其中一种)
	 */
	private String bizType;

	/** 
	* 调休假有效期规则(validity_type:有效类型 absolute_time(绝对时间)、relative_time(相对时间)其中一种 validity_value:延长日期(当validity_type为absolute_time该值该值不为空且满足yy-mm格式 validity_type为relative_time该值为大于1的整数))
	 */
	private String extras;

	/** 
	* 不需要余额控制的请假类型（如事假），默认false
	 */
	private Boolean freedomLeave;

	/** 
	* 每天折算的工作时长(百分之一 例如1天=10小时=1000)
	 */
	private Long hoursInPerDay;

	/** 
	* 请假证明
	 */
	private String leaveCertificate;

	/** 
	* 取整，up或者down
	 */
	private String leaveHourCeil;

	/** 
	* 假期名称
	 */
	private String leaveName;

	/** 
	* 是否开启请假时长是否向上取整
	 */
	private Boolean leaveTimeCeil;

	/** 
	* 请假时长向上取整时的最小时长单位：hour-不足1小时按照1小时计算；halfHour-不足半小时按照半小时计算
	 */
	private String leaveTimeCeilMinUnit;

	/** 
	* 请假单位，可以按照天半天或者小时请假。(day、halfDay、hour其中一种)
	 */
	private String leaveViewUnit;

	/** 
	* 最大请假时长
	 */
	private Long maxLeaveTime;

	/** 
	* 请假时，最小请假时长（请假单位为hour时生效），请假时长小于该值时自动取该值，有效值：[0, 23]
	 */
	private Long minLeaveHour;

	/** 
	* 是否按照自然日统计请假时长，当为false的时候，用户发起请假时候会根据用户在请假时间段内的排班情况来计算请假时长
	 */
	private Boolean naturalDayLeave;

	/** 
	* 操作者ID
	 */
	private String opUserid;

	/** 
	* 是否带薪假期
	 */
	private Boolean paidLeave;

	/** 
	* 限时提交规则
	 */
	private String submitTimeRule;

	/** 
	* 该假期类型的“适用范围”规则列表，不填默认为全公司
	 */
	private String visibilityRules;

	/** 
	* 新员工请假：何时可以请假（entry-入职开始 、formal-转正后）
	 */
	private String whenCanLeave;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getExtras() {
		return this.extras;
	}

	public void setFreedomLeave(Boolean freedomLeave) {
		this.freedomLeave = freedomLeave;
	}

	public Boolean getFreedomLeave() {
		return this.freedomLeave;
	}

	public void setHoursInPerDay(Long hoursInPerDay) {
		this.hoursInPerDay = hoursInPerDay;
	}

	public Long getHoursInPerDay() {
		return this.hoursInPerDay;
	}

	public void setLeaveCertificate(String leaveCertificate) {
		this.leaveCertificate = leaveCertificate;
	}

	public void setLeaveCertificate(LeaveCertificate leaveCertificate) {
		this.leaveCertificate = new JSONWriter(false,false,true).write(leaveCertificate);
	}

	public String getLeaveCertificate() {
		return this.leaveCertificate;
	}

	public void setLeaveHourCeil(String leaveHourCeil) {
		this.leaveHourCeil = leaveHourCeil;
	}

	public String getLeaveHourCeil() {
		return this.leaveHourCeil;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public String getLeaveName() {
		return this.leaveName;
	}

	public void setLeaveTimeCeil(Boolean leaveTimeCeil) {
		this.leaveTimeCeil = leaveTimeCeil;
	}

	public Boolean getLeaveTimeCeil() {
		return this.leaveTimeCeil;
	}

	public void setLeaveTimeCeilMinUnit(String leaveTimeCeilMinUnit) {
		this.leaveTimeCeilMinUnit = leaveTimeCeilMinUnit;
	}

	public String getLeaveTimeCeilMinUnit() {
		return this.leaveTimeCeilMinUnit;
	}

	public void setLeaveViewUnit(String leaveViewUnit) {
		this.leaveViewUnit = leaveViewUnit;
	}

	public String getLeaveViewUnit() {
		return this.leaveViewUnit;
	}

	public void setMaxLeaveTime(Long maxLeaveTime) {
		this.maxLeaveTime = maxLeaveTime;
	}

	public Long getMaxLeaveTime() {
		return this.maxLeaveTime;
	}

	public void setMinLeaveHour(Long minLeaveHour) {
		this.minLeaveHour = minLeaveHour;
	}

	public Long getMinLeaveHour() {
		return this.minLeaveHour;
	}

	public void setNaturalDayLeave(Boolean naturalDayLeave) {
		this.naturalDayLeave = naturalDayLeave;
	}

	public Boolean getNaturalDayLeave() {
		return this.naturalDayLeave;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setPaidLeave(Boolean paidLeave) {
		this.paidLeave = paidLeave;
	}

	public Boolean getPaidLeave() {
		return this.paidLeave;
	}

	public void setSubmitTimeRule(String submitTimeRule) {
		this.submitTimeRule = submitTimeRule;
	}

	public void setSubmitTimeRule(SubmitTimeRuleVO submitTimeRule) {
		this.submitTimeRule = new JSONWriter(false,false,true).write(submitTimeRule);
	}

	public String getSubmitTimeRule() {
		return this.submitTimeRule;
	}

	public void setVisibilityRules(String visibilityRules) {
		this.visibilityRules = visibilityRules;
	}

	public void setVisibilityRules(List<LeaveVisibilityRuleVo> visibilityRules) {
		this.visibilityRules = new JSONWriter(false,false,true).write(visibilityRules);
	}

	public String getVisibilityRules() {
		return this.visibilityRules;
	}

	public void setWhenCanLeave(String whenCanLeave) {
		this.whenCanLeave = whenCanLeave;
	}

	public String getWhenCanLeave() {
		return this.whenCanLeave;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.type.create";
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
		txtParams.put("biz_type", this.bizType);
		txtParams.put("extras", this.extras);
		txtParams.put("freedom_leave", this.freedomLeave);
		txtParams.put("hours_in_per_day", this.hoursInPerDay);
		txtParams.put("leave_certificate", this.leaveCertificate);
		txtParams.put("leave_hour_ceil", this.leaveHourCeil);
		txtParams.put("leave_name", this.leaveName);
		txtParams.put("leave_time_ceil", this.leaveTimeCeil);
		txtParams.put("leave_time_ceil_min_unit", this.leaveTimeCeilMinUnit);
		txtParams.put("leave_view_unit", this.leaveViewUnit);
		txtParams.put("max_leave_time", this.maxLeaveTime);
		txtParams.put("min_leave_hour", this.minLeaveHour);
		txtParams.put("natural_day_leave", this.naturalDayLeave);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("paid_leave", this.paidLeave);
		txtParams.put("submit_time_rule", this.submitTimeRule);
		txtParams.put("visibility_rules", this.visibilityRules);
		txtParams.put("when_can_leave", this.whenCanLeave);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationTypeCreateResponse> getResponseClass() {
		return OapiAttendanceVacationTypeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(hoursInPerDay, "hoursInPerDay");
		RequestCheckUtils.checkNotEmpty(leaveName, "leaveName");
		RequestCheckUtils.checkNotEmpty(leaveViewUnit, "leaveViewUnit");
		RequestCheckUtils.checkNotEmpty(naturalDayLeave, "naturalDayLeave");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkObjectMaxListSize(visibilityRules, 100, "visibilityRules");
	}
	
	/**
	 * 该假期类型的“适用范围”规则列表，不填默认为全公司
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveVisibilityRuleVo extends TaobaoObject {
		private static final long serialVersionUID = 7329337526263532197L;
		/**
		 * 规则类型：dept-部门；staff-员工；label-角色
		 */
		@ApiField("type")
		private String type;
		/**
		 * 规则数据：当type=staff时，传员工userId列表；当type=dept时，传部门id列表；当type=label时，传角色id列表
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
	 * 限时提交规则
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubmitTimeRuleVO extends TaobaoObject {
		private static final long serialVersionUID = 2847867895216545757L;
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
	 * 请假证明
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveCertificate extends TaobaoObject {
		private static final long serialVersionUID = 5686949781252473818L;
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
	

}