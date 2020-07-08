package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.call.session.querylist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpCallSessionQuerylistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5532229276417741239L;

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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CallSessionVo extends TaobaoObject {
		private static final long serialVersionUID = 4473458277557739986L;
		/**
		 * 通话时长
		 */
		@ApiField("bill_sec")
		private Long billSec;
		/**
		 * 通话类型（1:VoIP，2:国际电话，3:普通电话，4:电话会议，5:视频通话，6:视频会议，7:办公电话）
		 */
		@ApiField("call_type")
		private Long callType;
		/**
		 * 被叫手机号（脱敏）
		 */
		@ApiField("callee_mobile")
		private String calleeMobile;
		/**
		 * 被叫id
		 */
		@ApiField("callee_userid")
		private String calleeUserid;
		/**
		 * 主叫id
		 */
		@ApiField("caller_userid")
		private String callerUserid;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 会话id
		 */
		@ApiField("session_id")
		private String sessionId;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
	
		public Long getBillSec() {
			return this.billSec;
		}
		public void setBillSec(Long billSec) {
			this.billSec = billSec;
		}
		public Long getCallType() {
			return this.callType;
		}
		public void setCallType(Long callType) {
			this.callType = callType;
		}
		public String getCalleeMobile() {
			return this.calleeMobile;
		}
		public void setCalleeMobile(String calleeMobile) {
			this.calleeMobile = calleeMobile;
		}
		public String getCalleeUserid() {
			return this.calleeUserid;
		}
		public void setCalleeUserid(String calleeUserid) {
			this.calleeUserid = calleeUserid;
		}
		public String getCallerUserid() {
			return this.callerUserid;
		}
		public void setCallerUserid(String callerUserid) {
			this.callerUserid = callerUserid;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getSessionId() {
			return this.sessionId;
		}
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 6885836127256595616L;
		/**
		 * result
		 */
		@ApiListField("call_sessions")
		@ApiField("call_session_vo")
		private List<CallSessionVo> callSessions;
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
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public List<CallSessionVo> getCallSessions() {
			return this.callSessions;
		}
		public void setCallSessions(List<CallSessionVo> callSessions) {
			this.callSessions = callSessions;
		}
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
