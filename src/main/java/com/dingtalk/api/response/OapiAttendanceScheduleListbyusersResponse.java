package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.listbyusers response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceScheduleListbyusersResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2699116885661296475L;

	/** 
	 * 错误码
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
	@ApiListField("result")
	@ApiField("top_schedule_vo")
	private List<TopScheduleVo> result;

	/** 
	 * 成功标记
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

	public void setResult(List<TopScheduleVo> result) {
		this.result = result;
	}
	public List<TopScheduleVo> getResult( ) {
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
	 * demo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopScheduleVo extends TaobaoObject {
		private static final long serialVersionUID = 7781638426621458284L;
		/**
		 * 审批单id
		 */
		@ApiField("approve_id")
		private Long approveId;
		/**
		 * 考勤类型，上班下班
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 是否休息
		 */
		@ApiField("is_rest")
		private String isRest;
		/**
		 * 计划打卡时间
		 */
		@ApiField("plan_check_time")
		private Date planCheckTime;
		/**
		 * 班次版本
		 */
		@ApiField("shift_id")
		private Long shiftId;
		/**
		 * 班次id
		 */
		@ApiField("shift_version")
		private Long shiftVersion;
		/**
		 * 用户userId
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工作天
		 */
		@ApiField("work_date")
		private Date workDate;
	
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
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIsRest() {
			return this.isRest;
		}
		public void setIsRest(String isRest) {
			this.isRest = isRest;
		}
		public Date getPlanCheckTime() {
			return this.planCheckTime;
		}
		public void setPlanCheckTime(Date planCheckTime) {
			this.planCheckTime = planCheckTime;
		}
		public Long getShiftId() {
			return this.shiftId;
		}
		public void setShiftId(Long shiftId) {
			this.shiftId = shiftId;
		}
		public Long getShiftVersion() {
			return this.shiftVersion;
		}
		public void setShiftVersion(Long shiftVersion) {
			this.shiftVersion = shiftVersion;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public Date getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Date workDate) {
			this.workDate = workDate;
		}
	}
	


}
