package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getAttendUpdateData response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetAttendUpdateDataResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8295691373715443612L;

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
	@ApiField("result")
	private AtCheckInfoForOpenVo result;

	/** 
	 * success
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

	public void setResult(AtCheckInfoForOpenVo result) {
		this.result = result;
	}
	public AtCheckInfoForOpenVo getResult( ) {
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
	 * 打卡结果list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtAttendanceResultForOpenVo extends TaobaoObject {
		private static final long serialVersionUID = 4429338114488111287L;
		/**
		 * 打卡类型 上班还是下班
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 定位方法
		 */
		@ApiField("location_method")
		private String locationMethod;
		/**
		 * 定位结果
		 */
		@ApiField("location_result")
		private String locationResult;
		/**
		 * 外勤备注
		 */
		@ApiField("outside_remark")
		private String outsideRemark;
		/**
		 * 标准打卡时间
		 */
		@ApiField("plan_check_time")
		private Date planCheckTime;
		/**
		 * 排班id
		 */
		@ApiField("plan_id")
		private Long planId;
		/**
		 * 审批单id
		 */
		@ApiField("procInst_id")
		private String procInstId;
		/**
		 * 打卡流水id
		 */
		@ApiField("record_id")
		private Long recordId;
		/**
		 * 打卡来源
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 打卡的时间结果
		 */
		@ApiField("time_result")
		private String timeResult;
		/**
		 * 用户打卡地址
		 */
		@ApiField("user_address")
		private String userAddress;
		/**
		 * 用户打卡时间
		 */
		@ApiField("user_check_time")
		private Date userCheckTime;
	
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
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public String getLocationMethod() {
			return this.locationMethod;
		}
		public void setLocationMethod(String locationMethod) {
			this.locationMethod = locationMethod;
		}
		public String getLocationResult() {
			return this.locationResult;
		}
		public void setLocationResult(String locationResult) {
			this.locationResult = locationResult;
		}
		public String getOutsideRemark() {
			return this.outsideRemark;
		}
		public void setOutsideRemark(String outsideRemark) {
			this.outsideRemark = outsideRemark;
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
		public String getProcInstId() {
			return this.procInstId;
		}
		public void setProcInstId(String procInstId) {
			this.procInstId = procInstId;
		}
		public Long getRecordId() {
			return this.recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getTimeResult() {
			return this.timeResult;
		}
		public void setTimeResult(String timeResult) {
			this.timeResult = timeResult;
		}
		public String getUserAddress() {
			return this.userAddress;
		}
		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}
		public Date getUserCheckTime() {
			return this.userCheckTime;
		}
		public void setUserCheckTime(Date userCheckTime) {
			this.userCheckTime = userCheckTime;
		}
	}
	
	/**
	 * 审批单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtApproveForOpenVo extends TaobaoObject {
		private static final long serialVersionUID = 8347174191115518814L;
		/**
		 * 审批单开始时间
		 */
		@ApiField("begin_time")
		private Date beginTime;
		/**
		 * 业务类型
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 时长
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * 审批单的单位
		 */
		@ApiField("duration_unit")
		private String durationUnit;
		/**
		 * 审批单结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 审批单审批完成时间
		 */
		@ApiField("gmt_finished")
		private Date gmtFinished;
		/**
		 * 审批单id
		 */
		@ApiField("procInst_id")
		private String procInstId;
		/**
		 * 子类型
		 */
		@ApiField("sub_type")
		private String subType;
		/**
		 * 审批单的tag
		 */
		@ApiField("tag_name")
		private String tagName;
	
		public Date getBeginTime() {
			return this.beginTime;
		}
		public void setBeginTime(Date beginTime) {
			this.beginTime = beginTime;
		}
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getDurationUnit() {
			return this.durationUnit;
		}
		public void setDurationUnit(String durationUnit) {
			this.durationUnit = durationUnit;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Date getGmtFinished() {
			return this.gmtFinished;
		}
		public void setGmtFinished(Date gmtFinished) {
			this.gmtFinished = gmtFinished;
		}
		public String getProcInstId() {
			return this.procInstId;
		}
		public void setProcInstId(String procInstId) {
			this.procInstId = procInstId;
		}
		public String getSubType() {
			return this.subType;
		}
		public void setSubType(String subType) {
			this.subType = subType;
		}
		public String getTagName() {
			return this.tagName;
		}
		public void setTagName(String tagName) {
			this.tagName = tagName;
		}
	}
	
	/**
	 * 打卡流水list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtAttendanceRecordForOpenVo extends TaobaoObject {
		private static final long serialVersionUID = 8834589415221244496L;
		/**
		 * 基本定位精度
		 */
		@ApiField("base_accuracy")
		private String baseAccuracy;
		/**
		 * 打卡基础地质
		 */
		@ApiField("base_address")
		private String baseAddress;
		/**
		 * 流水id
		 */
		@ApiField("record_id")
		private Long recordId;
		/**
		 * 打卡来源
		 */
		@ApiField("source_type")
		private String sourceType;
		/**
		 * 用户定位精度
		 */
		@ApiField("user_accuracy")
		private String userAccuracy;
		/**
		 * 用户打卡时间
		 */
		@ApiField("user_check_time")
		private Date userCheckTime;
		/**
		 * 打卡纬度
		 */
		@ApiField("user_latitude")
		private String userLatitude;
		/**
		 * 打卡维度
		 */
		@ApiField("user_longitude")
		private String userLongitude;
		/**
		 * mac地址
		 */
		@ApiField("user_mac_addr")
		private String userMacAddr;
		/**
		 * wifi名称
		 */
		@ApiField("user_ssid")
		private String userSsid;
		/**
		 * 是否匹配
		 */
		@ApiField("valid_matched")
		private Boolean validMatched;
	
		public String getBaseAccuracy() {
			return this.baseAccuracy;
		}
		public void setBaseAccuracy(String baseAccuracy) {
			this.baseAccuracy = baseAccuracy;
		}
		public String getBaseAddress() {
			return this.baseAddress;
		}
		public void setBaseAddress(String baseAddress) {
			this.baseAddress = baseAddress;
		}
		public Long getRecordId() {
			return this.recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getUserAccuracy() {
			return this.userAccuracy;
		}
		public void setUserAccuracy(String userAccuracy) {
			this.userAccuracy = userAccuracy;
		}
		public Date getUserCheckTime() {
			return this.userCheckTime;
		}
		public void setUserCheckTime(Date userCheckTime) {
			this.userCheckTime = userCheckTime;
		}
		public String getUserLatitude() {
			return this.userLatitude;
		}
		public void setUserLatitude(String userLatitude) {
			this.userLatitude = userLatitude;
		}
		public String getUserLongitude() {
			return this.userLongitude;
		}
		public void setUserLongitude(String userLongitude) {
			this.userLongitude = userLongitude;
		}
		public String getUserMacAddr() {
			return this.userMacAddr;
		}
		public void setUserMacAddr(String userMacAddr) {
			this.userMacAddr = userMacAddr;
		}
		public String getUserSsid() {
			return this.userSsid;
		}
		public void setUserSsid(String userSsid) {
			this.userSsid = userSsid;
		}
		public Boolean getValidMatched() {
			return this.validMatched;
		}
		public void setValidMatched(Boolean validMatched) {
			this.validMatched = validMatched;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtCheckInfoForOpenVo extends TaobaoObject {
		private static final long serialVersionUID = 8814773893423715381L;
		/**
		 * 审批单列表
		 */
		@ApiField("approve_list")
		private AtApproveForOpenVo approveList;
		/**
		 * 打卡结果list
		 */
		@ApiField("attendance_result_list")
		private AtAttendanceResultForOpenVo attendanceResultList;
		/**
		 * 打卡流水list
		 */
		@ApiField("check_record_list")
		private AtAttendanceRecordForOpenVo checkRecordList;
		/**
		 * 公司id
		 */
		@ApiField("corpId")
		private String corpId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 查询日期
		 */
		@ApiField("work_date")
		private Date workDate;
	
		public AtApproveForOpenVo getApproveList() {
			return this.approveList;
		}
		public void setApproveList(AtApproveForOpenVo approveList) {
			this.approveList = approveList;
		}
		public AtAttendanceResultForOpenVo getAttendanceResultList() {
			return this.attendanceResultList;
		}
		public void setAttendanceResultList(AtAttendanceResultForOpenVo attendanceResultList) {
			this.attendanceResultList = attendanceResultList;
		}
		public AtAttendanceRecordForOpenVo getCheckRecordList() {
			return this.checkRecordList;
		}
		public void setCheckRecordList(AtAttendanceRecordForOpenVo checkRecordList) {
			this.checkRecordList = checkRecordList;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
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
