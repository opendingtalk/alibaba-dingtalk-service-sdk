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
import com.dingtalk.api.response.OapiAttendanceUpdateleavequotasResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.updateleavequotas request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.28
 */
public class OapiAttendanceUpdateleavequotasRequest extends BaseTaobaoRequest<OapiAttendanceUpdateleavequotasResponse> {
	
	

	/** 
	* corpid
	 */
	private String corpid;

	/** 
	* leave_quotas
	 */
	private String leaveQuotas;

	/** 
	* op_userid
	 */
	private String opUserid;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setLeaveQuotas(String leaveQuotas) {
		this.leaveQuotas = leaveQuotas;
	}

	public void setLeaveQuotas(List<LeaveQuotaRequestVo> leaveQuotas) {
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
		return "dingtalk.oapi.attendance.updateleavequotas";
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
		txtParams.put("corpid", this.corpid);
		txtParams.put("leave_quotas", this.leaveQuotas);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceUpdateleavequotasResponse> getResponseClass() {
		return OapiAttendanceUpdateleavequotasResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(leaveQuotas, 20, "leaveQuotas");
	}
	
	/**
	 * leave_quotas
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaveQuotaRequestVo extends TaobaoObject {
		private static final long serialVersionUID = 7119487477192154885L;
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
	

}