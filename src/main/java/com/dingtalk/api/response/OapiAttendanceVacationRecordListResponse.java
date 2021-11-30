package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.record.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationRecordListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3726392543498815884L;

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
	 * 结果值
	 */
	@ApiField("result")
	private OapiLeaveRecordListVo result;

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

	public void setResult(OapiLeaveRecordListVo result) {
		this.result = result;
	}
	public OapiLeaveRecordListVo getResult( ) {
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
	 * 假期消费记录列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiLeaveRecordVo extends TaobaoObject {
		private static final long serialVersionUID = 8637362456357592786L;
		/**
		 * 计算类型(add delete update 如果是请假则为null)
		 */
		@ApiField("cal_type")
		private String calType;
		/**
		 * 额度有效期结束时间(毫秒级时间戳)
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 假期类型唯一标识
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * 原因
		 */
		@ApiField("leave_reason")
		private String leaveReason;
		/**
		 * 假期记录类型(leave update其中一种 请假还是更新配额)
		 */
		@ApiField("leave_record_type")
		private String leaveRecordType;
		/**
		 * 请假状态(请假申请 init 请假通过 success 请假被拒 refuse 请假撤销 abort 撤销已同意的请假单并通过 revoke其中一种)
		 */
		@ApiField("leave_status")
		private String leaveStatus;
		/**
		 * 显示单位(day hour 其中一种按天、小时计算)
		 */
		@ApiField("leave_view_unit")
		private String leaveViewUnit;
		/**
		 * 假期记录标识(扣减多条假期配额 该值不为空)
		 */
		@ApiField("parent_record_id")
		private String parentRecordId;
		/**
		 * 假期额度唯一标识
		 */
		@ApiField("quota_id")
		private String quotaId;
		/**
		 * 假期消费记录唯一标识
		 */
		@ApiField("record_id")
		private String recordId;
		/**
		 * 单位以天计算的消费额度(假期类型按天计算该值不为空且按百分之一天折算 例如 100=1天)
		 */
		@ApiField("record_num_per_day")
		private Long recordNumPerDay;
		/**
		 * 单位以小时计算的消费额度(假期类型按小时计算该值不为空且按百分之一小时折算 例如 100=1小时)
		 */
		@ApiField("record_num_per_hour")
		private Long recordNumPerHour;
		/**
		 * 额度有效期开始时间(毫秒级时间戳)
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 员工ID
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
	 * 结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiLeaveRecordListVo extends TaobaoObject {
		private static final long serialVersionUID = 3338966693977213378L;
		/**
		 * 是否存在更多记录
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 假期消费记录列表
		 */
		@ApiListField("leave_records")
		@ApiField("oapi_leave_record_vo")
		private List<OapiLeaveRecordVo> leaveRecords;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<OapiLeaveRecordVo> getLeaveRecords() {
			return this.leaveRecords;
		}
		public void setLeaveRecords(List<OapiLeaveRecordVo> leaveRecords) {
			this.leaveRecords = leaveRecords;
		}
	}
	


}
