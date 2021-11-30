package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.listschedule response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceListscheduleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5715661266228274469L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private AtScheduleListForTopVo result;


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

	public void setResult(AtScheduleListForTopVo result) {
		this.result = result;
	}
	public AtScheduleListForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * schedules
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtScheduleForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 3695866916583665713L;
		/**
		 * 审批id,结果集中没有的话表示没有审批单
		 */
		@ApiField("approve_id")
		private Long approveId;
		/**
		 * 调整后的卡点时间
		 */
		@ApiField("changed_check_time")
		private Date changedCheckTime;
		/**
		 * 打卡类型，Onduty表示上班打卡，OffDuty表示下班打卡
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 考勤班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班次配置id，结果集中没有的话表示使用全局班次配置
		 */
		@ApiField("class_setting_id")
		private Long classSettingId;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 打卡时间
		 */
		@ApiField("plan_check_time")
		private Date planCheckTime;
		/**
		 * 排班id
		 */
		@ApiField("plan_id")
		private Long planId;
		/**
		 * userId
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getApproveId() {
			return this.approveId;
		}
		public void setApproveId(Long approveId) {
			this.approveId = approveId;
		}
		public Date getChangedCheckTime() {
			return this.changedCheckTime;
		}
		public void setChangedCheckTime(Date changedCheckTime) {
			this.changedCheckTime = changedCheckTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public Long getClassSettingId() {
			return this.classSettingId;
		}
		public void setClassSettingId(Long classSettingId) {
			this.classSettingId = classSettingId;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public Date getPlanCheckTime() {
			return this.planCheckTime;
		}
		public void setPlanCheckTime(Date planCheckTime) {
			this.planCheckTime = planCheckTime;
		}
		public Long getPlanId() {
			return this.planId;
		}
		public void setPlanId(Long planId) {
			this.planId = planId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtScheduleListForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 1372758262484384375L;
		/**
		 * 分页用，表示是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * schedules
		 */
		@ApiListField("schedules")
		@ApiField("at_schedule_for_top_vo")
		private List<AtScheduleForTopVo> schedules;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<AtScheduleForTopVo> getSchedules() {
			return this.schedules;
		}
		public void setSchedules(List<AtScheduleForTopVo> schedules) {
			this.schedules = schedules;
		}
	}
	


}
