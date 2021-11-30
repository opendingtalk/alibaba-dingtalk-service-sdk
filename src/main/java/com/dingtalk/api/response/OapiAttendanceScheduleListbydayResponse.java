package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.listbyday response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceScheduleListbydayResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8259883439836199444L;

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
		private static final long serialVersionUID = 3293348412724541797L;
		/**
		 * 审批类型
		 */
		@ApiField("approve_biz_type")
		private Long approveBizType;
		/**
		 * 审批单id
		 */
		@ApiField("approve_id")
		private Long approveId;
		/**
		 * 审批单标签名
		 */
		@ApiField("approve_tag_name")
		private String approveTagName;
		/**
		 * 审批类型
		 */
		@ApiField("approve_type")
		private String approveType;
		/**
		 * 迟到早退线
		 */
		@ApiField("base_check_time")
		private Date baseCheckTime;
		/**
		 * 开始打卡时间
		 */
		@ApiField("check_begin_time")
		private Date checkBeginTime;
		/**
		 * 打卡时间
		 */
		@ApiField("check_date_time")
		private Date checkDateTime;
		/**
		 * 结束打卡时间
		 */
		@ApiField("check_end_time")
		private Date checkEndTime;
		/**
		 * 打卡状态
		 */
		@ApiField("check_status")
		private String checkStatus;
		/**
		 * 考勤类型，上班下班
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班次名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 班次version
		 */
		@ApiField("class_setting_id")
		private Long classSettingId;
		/**
		 * 公司id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 扩展字段
		 */
		@ApiField("features")
		private String features;
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
		 * 根据弹性、打卡结果等综合计算的卡点，与个人月历页保持一致
		 */
		@ApiField("real_plan_time")
		private Date realPlanTime;
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
		public String getApproveType() {
			return this.approveType;
		}
		public void setApproveType(String approveType) {
			this.approveType = approveType;
		}
		public Date getBaseCheckTime() {
			return this.baseCheckTime;
		}
		public void setBaseCheckTime(Date baseCheckTime) {
			this.baseCheckTime = baseCheckTime;
		}
		public Date getCheckBeginTime() {
			return this.checkBeginTime;
		}
		public void setCheckBeginTime(Date checkBeginTime) {
			this.checkBeginTime = checkBeginTime;
		}
		public Date getCheckDateTime() {
			return this.checkDateTime;
		}
		public void setCheckDateTime(Date checkDateTime) {
			this.checkDateTime = checkDateTime;
		}
		public Date getCheckEndTime() {
			return this.checkEndTime;
		}
		public void setCheckEndTime(Date checkEndTime) {
			this.checkEndTime = checkEndTime;
		}
		public String getCheckStatus() {
			return this.checkStatus;
		}
		public void setCheckStatus(String checkStatus) {
			this.checkStatus = checkStatus;
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
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public Long getClassSettingId() {
			return this.classSettingId;
		}
		public void setClassSettingId(Long classSettingId) {
			this.classSettingId = classSettingId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getFeatures() {
			return this.features;
		}
		public void setFeatures(String features) {
			this.features = features;
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
		public Date getRealPlanTime() {
			return this.realPlanTime;
		}
		public void setRealPlanTime(Date realPlanTime) {
			this.realPlanTime = realPlanTime;
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
