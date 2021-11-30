package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAttendanceVacationQuotaInitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.quota.init request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceVacationQuotaInitRequest extends BaseTaobaoRequest<OapiAttendanceVacationQuotaInitResponse> {
	
	

	/** 
	* 待初始化的假期余额记录
	 */
	private String leaveQuotas;

	/** 
	* 操作者ID
	 */
	private String opUserid;

	public void setLeaveQuotas(String leaveQuotas) {
		this.leaveQuotas = leaveQuotas;
	}

	public void setLeaveQuotas(List<LeaveQuotas> leaveQuotas) {
		this.leaveQuotas = new JSONWriter(false,false,true).write(leaveQuotas);
	}

	public String getLeaveQuotas() {
		return this.leaveQuotas;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.quota.init";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("leave_quotas", this.leaveQuotas);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationQuotaInitResponse> getResponseClass() {
		return OapiAttendanceVacationQuotaInitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(leaveQuotas, 100, "leaveQuotas");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 待初始化的假期余额记录
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveQuotas extends TaobaoObject {
		private static final long serialVersionUID = 6552517989738552553L;
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
		 * 额度所对应的周期(除了假期类型为调休的时候可以为空之外 其他情况均不能为空 且格式必须满足"yyyy")
		 */
		@ApiField("quota_cycle")
		private String quotaCycle;
		/**
		 * 单位以天计算的额度总数(假期类型按天计算该值不为空且按百分之一天折算 例如 100=1天)
		 */
		@ApiField("quota_num_per_day")
		private Long quotaNumPerDay;
		/**
		 * 单位以小时计算的额度总数(假期类型按小时计算该值不为空且按百分之一小时折算 例如 100=1小时)
		 */
		@ApiField("quota_num_per_hour")
		private Long quotaNumPerHour;
		/**
		 * 操作原因
		 */
		@ApiField("reason")
		private String reason;
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
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
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
	

}