package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleavequotasbyuserid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetleavequotasbyuseridResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7445256149742347869L;

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
	 * leave_quotas
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveQuotaUserVO extends TaobaoObject {
		private static final long serialVersionUID = 7224297886185316286L;
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
		 * period_id
		 */
		@ApiField("period_id")
		private String periodId;
		/**
		 * quota_id
		 */
		@ApiField("quota_id")
		private String quotaId;
		/**
		 * quota_num_day
		 */
		@ApiField("quota_num_day")
		private Long quotaNumDay;
		/**
		 * quota_num_hour
		 */
		@ApiField("quota_num_hour")
		private Long quotaNumHour;
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
		public String getPeriodId() {
			return this.periodId;
		}
		public void setPeriodId(String periodId) {
			this.periodId = periodId;
		}
		public String getQuotaId() {
			return this.quotaId;
		}
		public void setQuotaId(String quotaId) {
			this.quotaId = quotaId;
		}
		public Long getQuotaNumDay() {
			return this.quotaNumDay;
		}
		public void setQuotaNumDay(Long quotaNumDay) {
			this.quotaNumDay = quotaNumDay;
		}
		public Long getQuotaNumHour() {
			return this.quotaNumHour;
		}
		public void setQuotaNumHour(Long quotaNumHour) {
			this.quotaNumHour = quotaNumHour;
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
	public static class LeaveQuotaUserListVO extends TaobaoObject {
		private static final long serialVersionUID = 5694435571438751392L;
		/**
		 * has_more
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * leave_quotas
		 */
		@ApiListField("leave_quotas")
		@ApiField("leave_quota_user_v_o")
		private List<LeaveQuotaUserVO> leaveQuotas;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<LeaveQuotaUserVO> getLeaveQuotas() {
			return this.leaveQuotas;
		}
		public void setLeaveQuotas(List<LeaveQuotaUserVO> leaveQuotas) {
			this.leaveQuotas = leaveQuotas;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3227251435641892173L;
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
		private LeaveQuotaUserListVO result;
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
		public LeaveQuotaUserListVO getResult() {
			return this.result;
		}
		public void setResult(LeaveQuotaUserListVO result) {
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
