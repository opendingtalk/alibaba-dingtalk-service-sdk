package com.dingtalk.api.reqrsp;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.create response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationTypeCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7277778698668978284L;

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
     * 该假期类型的“适用范围”规则列表
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class LeaveVisibilityRuleVo extends TaobaoObject {
        private static final long serialVersionUID = 6172257275264832621L;
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
     * 业务结果
     *
     * @author top auto create
     * @since 1.0, null
     */
    public static class LeaveTypeVo extends TaobaoObject {
        private static final long serialVersionUID = 1179946111945939379L;
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
         * 请假单位，可以按照天半天或者小时请假。(day、halfDay、hour其中一种)
         */
        @ApiField("leave_view_unit")
        private String leaveViewUnit;
        /**
         * 是否按照自然日统计请假时长，当为false的时候，用户发起请假时候会根据用户在请假时间段内的排班情况来计算请假时长。
         */
        @ApiField("natural_day_leave")
        private Boolean naturalDayLeave;
        /**
         * 是否带薪假期
         */
        @ApiField("paid_leave")
        private Boolean paidLeave;
        /**
         * 该假期类型的“适用范围”规则列表
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
        public Boolean getPaidLeave() {
            return this.paidLeave;
        }
        public void setPaidLeave(Boolean paidLeave) {
            this.paidLeave = paidLeave;
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
