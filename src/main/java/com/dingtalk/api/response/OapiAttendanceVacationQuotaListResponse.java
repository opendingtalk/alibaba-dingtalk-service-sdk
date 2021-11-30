package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.quota.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationQuotaListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5571888125743864983L;

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
	private OapiLeaveQuotaUserListVo result;

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

	public void setResult(OapiLeaveQuotaUserListVo result) {
		this.result = result;
	}
	public OapiLeaveQuotaUserListVo getResult( ) {
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
	 * 假期余额列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Leavequotas extends TaobaoObject {
		private static final long serialVersionUID = 3311756452795881113L;
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
		 * 额度所对应的周期
		 */
		@ApiField("quota_cycle")
		private String quotaCycle;
		/**
		 * 配额唯一标记
		 */
		@ApiField("quota_id")
		private String quotaId;
		/**
		 * 单位以小时计算的额度总数(假期类型按小时计算该值不为空且按百分之一小时折算 例如 1000=10小时)
		 */
		@ApiField("quota_num_per_day")
		private Long quotaNumPerDay;
		/**
		 * 单位以天计算的额度总数(假期类型按天计算该值不为空且按百分之一天折算 例如 1000=10天)
		 */
		@ApiField("quota_num_per_hour")
		private Long quotaNumPerHour;
		/**
		 * 额度有效期开始时间(毫秒级时间戳)
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 单位以天计算的使用额度(假期类型按天计算该值不为空且按百分之一天折算 例如 100=1天)
		 */
		@ApiField("used_num_per_day")
		private Long usedNumPerDay;
		/**
		 * 单位以小时计算的使用额度(假期类型按小时计算该值不为空且按百分之一小时折算 例如 100=1小时)
		 */
		@ApiField("used_num_per_hour")
		private Long usedNumPerHour;
		/**
		 * 员工ID
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
		public String getQuotaCycle() {
			return this.quotaCycle;
		}
		public void setQuotaCycle(String quotaCycle) {
			this.quotaCycle = quotaCycle;
		}
		public String getQuotaId() {
			return this.quotaId;
		}
		public void setQuotaId(String quotaId) {
			this.quotaId = quotaId;
		}
		public Long getQuotaNumPerDay() {
			return this.quotaNumPerDay;
		}
		public void setQuotaNumPerDay(Long quotaNumPerDay) {
			this.quotaNumPerDay = quotaNumPerDay;
		}
		public Long getQuotaNumPerHour() {
			return this.quotaNumPerHour;
		}
		public void setQuotaNumPerHour(Long quotaNumPerHour) {
			this.quotaNumPerHour = quotaNumPerHour;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public Long getUsedNumPerDay() {
			return this.usedNumPerDay;
		}
		public void setUsedNumPerDay(Long usedNumPerDay) {
			this.usedNumPerDay = usedNumPerDay;
		}
		public Long getUsedNumPerHour() {
			return this.usedNumPerHour;
		}
		public void setUsedNumPerHour(Long usedNumPerHour) {
			this.usedNumPerHour = usedNumPerHour;
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
	public static class OapiLeaveQuotaUserListVo extends TaobaoObject {
		private static final long serialVersionUID = 4682241816132694556L;
		/**
		 * 是否存在更多记录
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 假期余额列表
		 */
		@ApiListField("leave_quotas")
		@ApiField("leavequotas")
		private List<Leavequotas> leaveQuotas;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<Leavequotas> getLeaveQuotas() {
			return this.leaveQuotas;
		}
		public void setLeaveQuotas(List<Leavequotas> leaveQuotas) {
			this.leaveQuotas = leaveQuotas;
		}
	}
	


}
