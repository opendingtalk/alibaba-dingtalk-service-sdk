package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.corpemployee.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresCorpemployeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7544144432663439459L;

	/** 
	 * 员工详情
	 */
	@ApiField("corp_employee_info")
	private Model corpEmployeeInfo;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * message
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 扩展信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * status_code
	 */
	@ApiField("status_code")
	private Long statusCode;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setCorpEmployeeInfo(Model corpEmployeeInfo) {
		this.corpEmployeeInfo = corpEmployeeInfo;
	}
	public Model getCorpEmployeeInfo( ) {
		return this.corpEmployeeInfo;
	}

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public Long getStatusCode( ) {
		return this.statusCode;
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
	 * 员工详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 2837959189696247796L;
		/**
		 * 部门邮箱
		 */
		@ApiField("bu_mail")
		private String buMail;
		/**
		 * buc ID
		 */
		@ApiField("buc_id")
		private Long bucId;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 离职日期
		 */
		@ApiField("departure_date")
		private Date departureDate;
		/**
		 * 钉钉全局员工ID
		 */
		@ApiField("dingtalk_no")
		private String dingtalkNo;
		/**
		 * 钉钉企业下员工ID
		 */
		@ApiField("dingtalk_user_id")
		private String dingtalkUserId;
		/**
		 * 入职日期
		 */
		@ApiField("hire_date")
		private Date hireDate;
		/**
		 * 主键ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 头像
		 */
		@ApiField("img_url")
		private String imgUrl;
		/**
		 * 职位
		 */
		@ApiField("job")
		private String job;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * uic ID
		 */
		@ApiField("uic_id")
		private Long uicId;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
		/**
		 * 工作状态
		 */
		@ApiField("work_status")
		private Long workStatus;
	
		public String getBuMail() {
			return this.buMail;
		}
		public void setBuMail(String buMail) {
			this.buMail = buMail;
		}
		public Long getBucId() {
			return this.bucId;
		}
		public void setBucId(Long bucId) {
			this.bucId = bucId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getDepartureDate() {
			return this.departureDate;
		}
		public void setDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
		}
		public String getDingtalkNo() {
			return this.dingtalkNo;
		}
		public void setDingtalkNo(String dingtalkNo) {
			this.dingtalkNo = dingtalkNo;
		}
		public String getDingtalkUserId() {
			return this.dingtalkUserId;
		}
		public void setDingtalkUserId(String dingtalkUserId) {
			this.dingtalkUserId = dingtalkUserId;
		}
		public Date getHireDate() {
			return this.hireDate;
		}
		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getImgUrl() {
			return this.imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		public String getJob() {
			return this.job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getUicId() {
			return this.uicId;
		}
		public void setUicId(Long uicId) {
			this.uicId = uicId;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
		public Long getWorkStatus() {
			return this.workStatus;
		}
		public void setWorkStatus(Long workStatus) {
			this.workStatus = workStatus;
		}
	}
	


}
