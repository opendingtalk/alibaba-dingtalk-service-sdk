package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.result.listbyids response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceScheduleResultListbyidsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6721696869196796693L;

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
	@ApiField("top_schedule_result_vo")
	private List<TopScheduleResultVo> result;

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

	public void setResult(List<TopScheduleResultVo> result) {
		this.result = result;
	}
	public List<TopScheduleResultVo> getResult( ) {
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
	public static class TopScheduleResultVo extends TaobaoObject {
		private static final long serialVersionUID = 4122512314168187285L;
		/**
		 * 审批业务类型
		 */
		@ApiField("approve_biz_type")
		private Long approveBizType;
		/**
		 * 关联的审批id
		 */
		@ApiField("approve_id")
		private Long approveId;
		/**
		 * 关联的审批标签
		 */
		@ApiField("approve_tag_name")
		private String approveTagName;
		/**
		 * 迟到早退线
		 */
		@ApiField("base_check_time")
		private Date baseCheckTime;
		/**
		 * 考勤类型，上班下班
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 公司id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
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
		 * 是否合法
		 */
		@ApiField("is_legal")
		private String isLegal;
		/**
		 * 位置结果
		 */
		@ApiField("location_result")
		private String locationResult;
		/**
		 * 计划打卡时间
		 */
		@ApiField("plan_check_time")
		private Date planCheckTime;
		/**
		 * 打卡记录
		 */
		@ApiField("record_id")
		private Long recordId;
		/**
		 * 排班id
		 */
		@ApiField("schedule_id")
		private Long scheduleId;
		/**
		 * 时间结果
		 */
		@ApiField("time_result")
		private String timeResult;
		/**
		 * 打卡时间
		 */
		@ApiField("user_check_time")
		private Date userCheckTime;
		/**
		 * 用户userId
		 */
		@ApiField("user_id")
		private String userId;
		/**
		 * 工作天
		 */
		@ApiField("work_date")
		private Date workDate;
	
		public Long getApproveBizType() {
			return this.approveBizType;
		}
		public void setApproveBizType(Long approveBizType) {
			this.approveBizType = approveBizType;
		}
		public Long getApproveId() {
			return this.approveId;
		}
		public void setApproveId(Long approveId) {
			this.approveId = approveId;
		}
		public String getApproveTagName() {
			return this.approveTagName;
		}
		public void setApproveTagName(String approveTagName) {
			this.approveTagName = approveTagName;
		}
		public Date getBaseCheckTime() {
			return this.baseCheckTime;
		}
		public void setBaseCheckTime(Date baseCheckTime) {
			this.baseCheckTime = baseCheckTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
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
		public String getIsLegal() {
			return this.isLegal;
		}
		public void setIsLegal(String isLegal) {
			this.isLegal = isLegal;
		}
		public String getLocationResult() {
			return this.locationResult;
		}
		public void setLocationResult(String locationResult) {
			this.locationResult = locationResult;
		}
		public Date getPlanCheckTime() {
			return this.planCheckTime;
		}
		public void setPlanCheckTime(Date planCheckTime) {
			this.planCheckTime = planCheckTime;
		}
		public Long getRecordId() {
			return this.recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public Long getScheduleId() {
			return this.scheduleId;
		}
		public void setScheduleId(Long scheduleId) {
			this.scheduleId = scheduleId;
		}
		public String getTimeResult() {
			return this.timeResult;
		}
		public void setTimeResult(String timeResult) {
			this.timeResult = timeResult;
		}
		public Date getUserCheckTime() {
			return this.userCheckTime;
		}
		public void setUserCheckTime(Date userCheckTime) {
			this.userCheckTime = userCheckTime;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public Date getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Date workDate) {
			this.workDate = workDate;
		}
	}
	


}
