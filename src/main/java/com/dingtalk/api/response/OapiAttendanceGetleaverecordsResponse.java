package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleaverecords response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetleaverecordsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8265599514341391446L;

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
	private OAPILeaveRecordListVO result;

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

	public void setResult(OAPILeaveRecordListVO result) {
		this.result = result;
	}
	public OAPILeaveRecordListVO getResult( ) {
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
	 * leaveRecords
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OAPILeaveRecordVO extends TaobaoObject {
		private static final long serialVersionUID = 8649975881969837117L;
		/**
		 * endTime
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * leaveCode
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * quotaId
		 */
		@ApiField("quota_id")
		private String quotaId;
		/**
		 * recordId
		 */
		@ApiField("record_id")
		private String recordId;
		/**
		 * record_num_day
		 */
		@ApiField("record_num_day")
		private String recordNumDay;
		/**
		 * record_num_hour
		 */
		@ApiField("record_num_hour")
		private String recordNumHour;
		/**
		 * startTime
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * userId
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
		public String getRecordNumDay() {
			return this.recordNumDay;
		}
		public void setRecordNumDay(String recordNumDay) {
			this.recordNumDay = recordNumDay;
		}
		public String getRecordNumHour() {
			return this.recordNumHour;
		}
		public void setRecordNumHour(String recordNumHour) {
			this.recordNumHour = recordNumHour;
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
	public static class OAPILeaveRecordListVO extends TaobaoObject {
		private static final long serialVersionUID = 3146287161592671216L;
		/**
		 * hasMore
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * leaveRecords
		 */
		@ApiListField("leave_records")
		@ApiField("o_a_p_i_leave_record_v_o")
		private List<OAPILeaveRecordVO> leaveRecords;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<OAPILeaveRecordVO> getLeaveRecords() {
			return this.leaveRecords;
		}
		public void setLeaveRecords(List<OAPILeaveRecordVO> leaveRecords) {
			this.leaveRecords = leaveRecords;
		}
	}
	


}
