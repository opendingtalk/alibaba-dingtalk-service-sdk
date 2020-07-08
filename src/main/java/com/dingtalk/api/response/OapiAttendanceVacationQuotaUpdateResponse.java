package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.quota.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationQuotaUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8824326369646167358L;

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
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * 失败记录
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Quota extends TaobaoObject {
		private static final long serialVersionUID = 7893634848356643143L;
		/**
		 * 假期类型唯一标识
		 */
		@ApiField("leave_code")
		private String leaveCode;
		/**
		 * 额度所对应的周期(除了假期类型为调休的时候可以为空之外 其他情况均不能为空 且格式必须满足"yyyy")
		 */
		@ApiField("quota_cycle")
		private String quotaCycle;
		/**
		 * 员工ID
		 */
		@ApiField("userid")
		private String userid;
	
		public String getLeaveCode() {
			return this.leaveCode;
		}
		public void setLeaveCode(String leaveCode) {
			this.leaveCode = leaveCode;
		}
		public String getQuotaCycle() {
			return this.quotaCycle;
		}
		public void setQuotaCycle(String quotaCycle) {
			this.quotaCycle = quotaCycle;
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
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3268254592293919276L;
		/**
		 * 失败记录
		 */
		@ApiField("quota")
		private Quota quota;
		/**
		 * 失败原因
		 */
		@ApiField("reason")
		private String reason;
	
		public Quota getQuota() {
			return this.quota;
		}
		public void setQuota(Quota quota) {
			this.quota = quota;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
	}
	


}
