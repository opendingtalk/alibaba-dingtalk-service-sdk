package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.productionteam.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoHumanresProductionteamQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2127846326283618615L;

	/** 
	 * errcode
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
	 * model
	 */
	@ApiListField("model")
	@ApiField("model")
	private List<Model> model;

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

	public void setModel(List<Model> model) {
		this.model = model;
	}
	public List<Model> getModel( ) {
		return this.model;
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
	 * 员工列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpList extends TaobaoObject {
		private static final long serialVersionUID = 6415867666623841594L;
		/**
		 * 部门邮箱
		 */
		@ApiField("bu_mail")
		private String buMail;
		/**
		 * BUC员工ID
		 */
		@ApiField("buc_id")
		private Long bucId;
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
		 * 企业下员工id
		 */
		@ApiField("dingtalk_user_id")
		private String dingtalkUserId;
		/**
		 * 入职日期
		 */
		@ApiField("hire_date")
		private Date hireDate;
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
		 * 在岗状态
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
	
	/**
	 * 工作日配置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WeekdayConfigList extends TaobaoObject {
		private static final long serialVersionUID = 2839742555481316194L;
		/**
		 * 星期
		 */
		@ApiField("day")
		private Long day;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 生产组code
		 */
		@ApiField("production_team_code")
		private String productionTeamCode;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 类型
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 工作日
		 */
		@ApiField("week_day")
		private String weekDay;
	
		public Long getDay() {
			return this.day;
		}
		public void setDay(Long day) {
			this.day = day;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getProductionTeamCode() {
			return this.productionTeamCode;
		}
		public void setProductionTeamCode(String productionTeamCode) {
			this.productionTeamCode = productionTeamCode;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getWeekDay() {
			return this.weekDay;
		}
		public void setWeekDay(String weekDay) {
			this.weekDay = weekDay;
		}
	}
	
	/**
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 2644524944425853495L;
		/**
		 * 业务ID
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 产能类型
		 */
		@ApiField("capacity_type")
		private String capacityType;
		/**
		 * 员工列表
		 */
		@ApiListField("empList")
		@ApiField("emp_list")
		private List<EmpList> empList;
		/**
		 * 拥有的员工数量
		 */
		@ApiField("emp_num")
		private Long empNum;
		/**
		 * 分组code
		 */
		@ApiField("group_code")
		private String groupCode;
		/**
		 * 系统自动生成
		 */
		@ApiField("id")
		private Long id;
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
		/**
		 * 工作日配置
		 */
		@ApiListField("weekday_config_list")
		@ApiField("weekday_config_list")
		private List<WeekdayConfigList> weekdayConfigList;
		/**
		 * 工段列表
		 */
		@ApiListField("workshop_section_code_list")
		@ApiField("string")
		private List<String> workshopSectionCodeList;
	
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
		public List<EmpList> getEmpList() {
			return this.empList;
		}
		public void setEmpList(List<EmpList> empList) {
			this.empList = empList;
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
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public List<WeekdayConfigList> getWeekdayConfigList() {
			return this.weekdayConfigList;
		}
		public void setWeekdayConfigList(List<WeekdayConfigList> weekdayConfigList) {
			this.weekdayConfigList = weekdayConfigList;
		}
		public List<String> getWorkshopSectionCodeList() {
			return this.workshopSectionCodeList;
		}
		public void setWorkshopSectionCodeList(List<String> workshopSectionCodeList) {
			this.workshopSectionCodeList = workshopSectionCodeList;
		}
	}
	


}
