package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiHrmEmployeeModjobinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hrm.employee.modjobinfo request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.16
 */
public class OapiHrmEmployeeModjobinfoRequest extends BaseTaobaoRequest<OapiHrmEmployeeModjobinfoResponse> {
	
	

	/** 
	* 员工信息对象，被操作人userid是必填，其他信息选填，填写则更新
	 */
	private String hrmApiJobModel;

	/** 
	* 操作人userid，必须是拥有被操作人操作权限的管理员userid
	 */
	private String opUserid;

	public void setHrmApiJobModel(String hrmApiJobModel) {
		this.hrmApiJobModel = hrmApiJobModel;
	}

	public void setHrmApiJobModel(HrmApiJobModel hrmApiJobModel) {
		this.hrmApiJobModel = new JSONWriter(false,false,true).write(hrmApiJobModel);
	}

	public String getHrmApiJobModel() {
		return this.hrmApiJobModel;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hrm.employee.modjobinfo";
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
		txtParams.put("hrm_api_job_model", this.hrmApiJobModel);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHrmEmployeeModjobinfoResponse> getResponseClass() {
		return OapiHrmEmployeeModjobinfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 员工信息对象，被操作人userid是必填，其他信息选填，填写则更新
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HrmApiJobModel extends TaobaoObject {
		private static final long serialVersionUID = 2425442254336492313L;
		/**
		 * 生日日期
		 */
		@ApiField("birth_time")
		private Date birthTime;
		/**
		 * 入职日期
		 */
		@ApiField("confirm_join_time")
		private Date confirmJoinTime;
		/**
		 * 员工状态（2:试用，3:正式）
		 */
		@ApiField("employee_status")
		private Long employeeStatus;
		/**
		 * 员工类型（1:全职，2:兼职，3:实习，4:劳务派遣，5:退休返聘，6:劳务外包）
		 */
		@ApiField("employee_type")
		private Long employeeType;
		/**
		 * 首次参加工作时间
		 */
		@ApiField("join_working_time")
		private Date joinWorkingTime;
		/**
		 * 试用期（1:无试用期，2:1个月，3:2个月，4:3个月，5:4个月，6:5个月，7:6个月，8:其他）
		 */
		@ApiField("probation_period_type")
		private Long probationPeriodType;
		/**
		 * 转正时间
		 */
		@ApiField("regular_time")
		private Date regularTime;
		/**
		 * 被操作人userid
		 */
		@ApiField("userid")
		private String userid;
	
		public Date getBirthTime() {
			return this.birthTime;
		}
		public void setBirthTime(Date birthTime) {
			this.birthTime = birthTime;
		}
		public Date getConfirmJoinTime() {
			return this.confirmJoinTime;
		}
		public void setConfirmJoinTime(Date confirmJoinTime) {
			this.confirmJoinTime = confirmJoinTime;
		}
		public Long getEmployeeStatus() {
			return this.employeeStatus;
		}
		public void setEmployeeStatus(Long employeeStatus) {
			this.employeeStatus = employeeStatus;
		}
		public Long getEmployeeType() {
			return this.employeeType;
		}
		public void setEmployeeType(Long employeeType) {
			this.employeeType = employeeType;
		}
		public Date getJoinWorkingTime() {
			return this.joinWorkingTime;
		}
		public void setJoinWorkingTime(Date joinWorkingTime) {
			this.joinWorkingTime = joinWorkingTime;
		}
		public Long getProbationPeriodType() {
			return this.probationPeriodType;
		}
		public void setProbationPeriodType(Long probationPeriodType) {
			this.probationPeriodType = probationPeriodType;
		}
		public Date getRegularTime() {
			return this.regularTime;
		}
		public void setRegularTime(Date regularTime) {
			this.regularTime = regularTime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}