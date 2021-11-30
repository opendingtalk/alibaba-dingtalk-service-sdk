package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.productionteam.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresEmployeeProductionteamListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5121987688147316441L;

	/** 
	 * 员工信息
	 */
	@ApiListField("corp_employee_info")
	@ApiField("model")
	private List<Model> corpEmployeeInfo;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
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


	public void setCorpEmployeeInfo(List<Model> corpEmployeeInfo) {
		this.corpEmployeeInfo = corpEmployeeInfo;
	}
	public List<Model> getCorpEmployeeInfo( ) {
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
	 * 拥有的生产组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductionTeamList extends TaobaoObject {
		private static final long serialVersionUID = 4827667138714688672L;
		/**
		 * 生产组业务ID
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 产能类型
		 */
		@ApiField("capacity_type")
		private String capacityType;
		/**
		 * 是否删除
		 */
		@ApiField("deleted")
		private Boolean deleted;
		/**
		 * 员工数量
		 */
		@ApiField("emp_num")
		private Long empNum;
		/**
		 * 分组code
		 */
		@ApiField("group_code")
		private String groupCode;
		/**
		 * modifier
		 */
		@ApiField("modifier")
		private String modifier;
		/**
		 * 生产组code
		 */
		@ApiField("production_team_code")
		private String productionTeamCode;
		/**
		 * 生产组名称
		 */
		@ApiField("production_team_name")
		private String productionTeamName;
		/**
		 * 资产ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getCapacityType() {
			return this.capacityType;
		}
		public void setCapacityType(String capacityType) {
			this.capacityType = capacityType;
		}
		public Boolean getDeleted() {
			return this.deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
		public Long getEmpNum() {
			return this.empNum;
		}
		public void setEmpNum(Long empNum) {
			this.empNum = empNum;
		}
		public String getGroupCode() {
			return this.groupCode;
		}
		public void setGroupCode(String groupCode) {
			this.groupCode = groupCode;
		}
		public String getModifier() {
			return this.modifier;
		}
		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
		public String getProductionTeamCode() {
			return this.productionTeamCode;
		}
		public void setProductionTeamCode(String productionTeamCode) {
			this.productionTeamCode = productionTeamCode;
		}
		public String getProductionTeamName() {
			return this.productionTeamName;
		}
		public void setProductionTeamName(String productionTeamName) {
			this.productionTeamName = productionTeamName;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	
	/**
	 * 员工信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 4892622592752679532L;
		/**
		 * 部门邮箱
		 */
		@ApiField("bu_mail")
		private String buMail;
		/**
		 * bucId
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
		 * 全局钉钉员工ID
		 */
		@ApiField("dingtalk_no")
		private String dingtalkNo;
		/**
		 * 企业下钉钉员工ID
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
		 * 头像地址
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
		 * 拥有的生产组
		 */
		@ApiListField("production_team_list")
		@ApiField("production_team_list")
		private List<ProductionTeamList> productionTeamList;
		/**
		 * 状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 资产ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * uicId
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
		public List<ProductionTeamList> getProductionTeamList() {
			return this.productionTeamList;
		}
		public void setProductionTeamList(List<ProductionTeamList> productionTeamList) {
			this.productionTeamList = productionTeamList;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
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
