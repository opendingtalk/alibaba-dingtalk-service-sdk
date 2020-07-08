package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.updateleavequotas response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceUpdateleavequotasResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4464795366348891379L;

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
	 * quota
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveQuotaRequestVO extends TaobaoObject {
		private static final long serialVersionUID = 4439568539959427779L;
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
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
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
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3866319716658459786L;
		/**
		 * quota
		 */
		@ApiField("quota")
		private LeaveQuotaRequestVO quota;
		/**
		 * reason
		 */
		@ApiField("reason")
		private String reason;
	
		public LeaveQuotaRequestVO getQuota() {
			return this.quota;
		}
		public void setQuota(LeaveQuotaRequestVO quota) {
			this.quota = quota;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4191671516458529726L;
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
		@ApiListField("result")
		@ApiField("result")
		private List<Result> result;
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
		public List<Result> getResult() {
			return this.result;
		}
		public void setResult(List<Result> result) {
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
