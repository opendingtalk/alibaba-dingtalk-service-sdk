package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.emp.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoEmpQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4813566379857135565L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 8798318695153585182L;
		/**
		 * 1
		 */
		@ApiField("buMail")
		private String buMail;
		/**
		 * 1
		 */
		@ApiField("bucId")
		private Long bucId;
		/**
		 * 1
		 */
		@ApiField("corpId")
		private String corpId;
		/**
		 * 1
		 */
		@ApiField("dccId")
		private String dccId;
		/**
		 * 1
		 */
		@ApiField("departments")
		private String departments;
		/**
		 * 1
		 */
		@ApiField("departureDate")
		private Date departureDate;
		/**
		 * 1
		 */
		@ApiField("detailSkills")
		private String detailSkills;
		/**
		 * 1
		 */
		@ApiField("dingtalkNo")
		private String dingtalkNo;
		/**
		 * 1
		 */
		@ApiField("dingtalkUserId")
		private String dingtalkUserId;
		/**
		 * 1
		 */
		@ApiField("hireDate")
		private Date hireDate;
		/**
		 * 1
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 1
		 */
		@ApiField("imgUrl")
		private String imgUrl;
		/**
		 * 1
		 */
		@ApiField("job")
		private String job;
		/**
		 * 1
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 1
		 */
		@ApiField("name")
		private String name;
		/**
		 * 1
		 */
		@ApiField("productionTeamList")
		private String productionTeamList;
		/**
		 * 1
		 */
		@ApiField("roles")
		private String roles;
		/**
		 * 1
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 1
		 */
		@ApiField("tenantCode")
		private String tenantCode;
		/**
		 * 1
		 */
		@ApiField("tenantId")
		private String tenantId;
		/**
		 * 1
		 */
		@ApiField("tenantList")
		private String tenantList;
		/**
		 * 1
		 */
		@ApiField("uicId")
		private Long uicId;
		/**
		 * 1
		 */
		@ApiField("workNo")
		private String workNo;
		/**
		 * 1
		 */
		@ApiField("workStatus")
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
		public String getDccId() {
			return this.dccId;
		}
		public void setDccId(String dccId) {
			this.dccId = dccId;
		}
		public String getDepartments() {
			return this.departments;
		}
		public void setDepartments(String departments) {
			this.departments = departments;
		}
		public Date getDepartureDate() {
			return this.departureDate;
		}
		public void setDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
		}
		public String getDetailSkills() {
			return this.detailSkills;
		}
		public void setDetailSkills(String detailSkills) {
			this.detailSkills = detailSkills;
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
		public String getProductionTeamList() {
			return this.productionTeamList;
		}
		public void setProductionTeamList(String productionTeamList) {
			this.productionTeamList = productionTeamList;
		}
		public String getRoles() {
			return this.roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTenantCode() {
			return this.tenantCode;
		}
		public void setTenantCode(String tenantCode) {
			this.tenantCode = tenantCode;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getTenantList() {
			return this.tenantList;
		}
		public void setTenantList(String tenantList) {
			this.tenantList = tenantList;
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
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 5643633729732598753L;
		/**
		 * code
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * message
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 1
		 */
		@ApiField("errorCode")
		private Long errorCode;
		/**
		 * 1
		 */
		@ApiField("externalMsgInfo")
		private String externalMsgInfo;
		/**
		 * model
		 */
		@ApiField("model")
		private Model model;
		/**
		 * 是否成功
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
		public Long getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(Long errorCode) {
			this.errorCode = errorCode;
		}
		public String getExternalMsgInfo() {
			return this.externalMsgInfo;
		}
		public void setExternalMsgInfo(String externalMsgInfo) {
			this.externalMsgInfo = externalMsgInfo;
		}
		public Model getModel() {
			return this.model;
		}
		public void setModel(Model model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
