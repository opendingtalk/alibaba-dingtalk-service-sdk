package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getLeaveRecordsByUserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetLeaveRecordsByUseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5212365555185812595L;

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
	 * leave_records
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveRecordVO extends TaobaoObject {
		private static final long serialVersionUID = 3253239979361294688L;
		/**
		 * cal_type
		 */
		@ApiField("cal_type")
		private String calType;
		/**
		 * end_time
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * leave_code
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * leave_reason
		 */
		@ApiField("leave_reason")
		private String leaveReason;
		/**
		 * leave_record_type
		 */
		@ApiField("leave_record_type")
		private String leaveRecordType;
		/**
		 * leave_status
		 */
		@ApiField("leave_status")
		private String leaveStatus;
		/**
		 * leave_view_unit
		 */
		@ApiField("leave_view_unit")
		private String leaveViewUnit;
		/**
		 * parent_record_id
		 */
		@ApiField("parent_record_id")
		private String parentRecordId;
		/**
		 * quota_id
		 */
		@ApiField("quota_id")
		private String quotaId;
		/**
		 * record_id
		 */
		@ApiField("record_id")
		private String recordId;
		/**
		 * record_num_per_day
		 */
		@ApiField("record_num_per_day")
		private Long recordNumPerDay;
		/**
		 * record_num_per_hour
		 */
		@ApiField("record_num_per_hour")
		private Long recordNumPerHour;
		/**
		 * start_time
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCalType() {
			return this.calType;
		}
		public void setCalType(String calType) {
			this.calType = calType;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getLeaveCode() {
			return this.leaveCode;
		}
		public void setLeaveCode(String leaveCode) {
			this.leaveCode = leaveCode;
		}
		public String getLeaveReason() {
			return this.leaveReason;
		}
		public void setLeaveReason(String leaveReason) {
			this.leaveReason = leaveReason;
		}
		public String getLeaveRecordType() {
			return this.leaveRecordType;
		}
		public void setLeaveRecordType(String leaveRecordType) {
			this.leaveRecordType = leaveRecordType;
		}
		public String getLeaveStatus() {
			return this.leaveStatus;
		}
		public void setLeaveStatus(String leaveStatus) {
			this.leaveStatus = leaveStatus;
		}
		public String getLeaveViewUnit() {
			return this.leaveViewUnit;
		}
		public void setLeaveViewUnit(String leaveViewUnit) {
			this.leaveViewUnit = leaveViewUnit;
		}
		public String getParentRecordId() {
			return this.parentRecordId;
		}
		public void setParentRecordId(String parentRecordId) {
			this.parentRecordId = parentRecordId;
		}
		public String getQuotaId() {
			return this.quotaId;
		}
		public void setQuotaId(String quotaId) {
			this.quotaId = quotaId;
		}
		public String getRecordId() {
			return this.recordId;
		}
		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}
		public Long getRecordNumPerDay() {
			return this.recordNumPerDay;
		}
		public void setRecordNumPerDay(Long recordNumPerDay) {
			this.recordNumPerDay = recordNumPerDay;
		}
		public Long getRecordNumPerHour() {
			return this.recordNumPerHour;
		}
		public void setRecordNumPerHour(Long recordNumPerHour) {
			this.recordNumPerHour = recordNumPerHour;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
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
	public static class LeaveRecordListVO extends TaobaoObject {
		private static final long serialVersionUID = 8796628999128936362L;
		/**
		 * has_more
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * leave_records
		 */
		@ApiListField("leave_records")
		@ApiField("leave_record_v_o")
		private List<LeaveRecordVO> leaveRecords;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<LeaveRecordVO> getLeaveRecords() {
			return this.leaveRecords;
		}
		public void setLeaveRecords(List<LeaveRecordVO> leaveRecords) {
			this.leaveRecords = leaveRecords;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 6139367494496787763L;
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
		private LeaveRecordListVO result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public LeaveRecordListVO getResult() {
			return this.result;
		}
		public void setResult(LeaveRecordListVO result) {
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
