package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.listschedule response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkAttendsListscheduleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5591478532238676973L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 排班列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtScheduleForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5543494292959128688L;
		/**
		 * 审批id,结果集中没有的话表示没有审批单
		 */
		@ApiField("approve_id")
		private Long approveId;
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
		private static final long serialVersionUID = 5425818153412162384L;
		/**
		 * 分页用，表示是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 排班列表
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
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 8548466636292349313L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private AtScheduleListForTopVo result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public AtScheduleListForTopVo getResult() {
			return this.result;
		}
		public void setResult(AtScheduleListForTopVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
