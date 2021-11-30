package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.apply.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripApplySearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4381663417134833737L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 审批单列表
	 */
	@ApiListField("module")
	@ApiField("open_apply_rs")
	private List<OpenApplyRs> module;

	/** 
	 * 成功标识
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

	public void setModule(List<OpenApplyRs> module) {
		this.module = module;
	}
	public List<OpenApplyRs> getModule( ) {
		return this.module;
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
	 * 行程列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenItineraryInfo extends TaobaoObject {
		private static final long serialVersionUID = 5477426536736555746L;
		/**
		 * 到达城市
		 */
		@ApiField("arr_city")
		private String arrCity;
		/**
		 * 到达日期
		 */
		@ApiField("arr_date")
		private Date arrDate;
		/**
		 * 成本中心
		 */
		@ApiField("cost_center_name")
		private String costCenterName;
		/**
		 * 出发城市
		 */
		@ApiField("dep_city")
		private String depCity;
		/**
		 * 出发日期
		 */
		@ApiField("dep_date")
		private Date depDate;
		/**
		 * 发票抬头
		 */
		@ApiField("invoice_name")
		private String invoiceName;
		/**
		 * 行程id
		 */
		@ApiField("itinerary_id")
		private String itineraryId;
		/**
		 * 项目代码
		 */
		@ApiField("project_code")
		private String projectCode;
		/**
		 * 项目名称
		 */
		@ApiField("project_title")
		private String projectTitle;
		/**
		 * 交通方式：0飞机 1火车 2汽车 3其他
		 */
		@ApiField("traffic_type")
		private Long trafficType;
		/**
		 * 行程方式：0单程 1往返
		 */
		@ApiField("trip_way")
		private Long tripWay;
	
		public String getArrCity() {
			return this.arrCity;
		}
		public void setArrCity(String arrCity) {
			this.arrCity = arrCity;
		}
		public Date getArrDate() {
			return this.arrDate;
		}
		public void setArrDate(Date arrDate) {
			this.arrDate = arrDate;
		}
		public String getCostCenterName() {
			return this.costCenterName;
		}
		public void setCostCenterName(String costCenterName) {
			this.costCenterName = costCenterName;
		}
		public String getDepCity() {
			return this.depCity;
		}
		public void setDepCity(String depCity) {
			this.depCity = depCity;
		}
		public Date getDepDate() {
			return this.depDate;
		}
		public void setDepDate(Date depDate) {
			this.depDate = depDate;
		}
		public String getInvoiceName() {
			return this.invoiceName;
		}
		public void setInvoiceName(String invoiceName) {
			this.invoiceName = invoiceName;
		}
		public String getItineraryId() {
			return this.itineraryId;
		}
		public void setItineraryId(String itineraryId) {
			this.itineraryId = itineraryId;
		}
		public String getProjectCode() {
			return this.projectCode;
		}
		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}
		public String getProjectTitle() {
			return this.projectTitle;
		}
		public void setProjectTitle(String projectTitle) {
			this.projectTitle = projectTitle;
		}
		public Long getTrafficType() {
			return this.trafficType;
		}
		public void setTrafficType(Long trafficType) {
			this.trafficType = trafficType;
		}
		public Long getTripWay() {
			return this.tripWay;
		}
		public void setTripWay(Long tripWay) {
			this.tripWay = tripWay;
		}
	}
	
	/**
	 * 出行人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserInfo extends TaobaoObject {
		private static final long serialVersionUID = 3558429474137526535L;
		/**
		 * 用户名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * approverList
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApproverInfo extends TaobaoObject {
		private static final long serialVersionUID = 8499646454328415477L;
		/**
		 * 审批意见
		 */
		@ApiField("note")
		private String note;
		/**
		 * 操作时间
		 */
		@ApiField("operate_time")
		private Date operateTime;
		/**
		 * 审批人顺序
		 */
		@ApiField("order")
		private Long order;
		/**
		 * 审批状态：0审批中 1已同意 2已拒绝 3已转交，4已取消 5已终止 6发起审批 7评论
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 审批状态描述
		 */
		@ApiField("status_desc")
		private String statusDesc;
		/**
		 * 审批人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 审批人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getNote() {
			return this.note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(Date operateTime) {
			this.operateTime = operateTime;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getStatusDesc() {
			return this.statusDesc;
		}
		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 审批单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApplyRs extends TaobaoObject {
		private static final long serialVersionUID = 5518331228798281497L;
		/**
		 * 商旅审批展示id
		 */
		@ApiField("apply_show_id")
		private String applyShowId;
		/**
		 * approverList
		 */
		@ApiListField("approver_list")
		@ApiField("open_approver_info")
		private List<OpenApproverInfo> approverList;
		/**
		 * 企业名称
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 部门id
		 */
		@ApiField("deptid")
		private String deptid;
		/**
		 * 外部出行人列表
		 */
		@ApiListField("external_traveler_list")
		@ApiField("open_user_info")
		private List<OpenUserInfo> externalTravelerList;
		/**
		 * 流程编码
		 */
		@ApiField("flow_code")
		private String flowCode;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 商旅审批单id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 行程列表
		 */
		@ApiListField("itinerary_list")
		@ApiField("open_itinerary_info")
		private List<OpenItineraryInfo> itineraryList;
		/**
		 * 申请单状态：0申请 1同意 2拒绝 3转交 4取消 5修改已同意 6撤销已同意 7修改审批中 8已同意(修改被拒绝) 9撤销审批中 10已同意(撤销被拒绝) 11已同意(修改被取消) 12已同意(撤销被取消)
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 审批单状态描述
		 */
		@ApiField("status_desc")
		private String statusDesc;
		/**
		 * 第三方审批单id,如果非第三方审批单则为空
		 */
		@ApiField("thirdpart_id")
		private String thirdpartId;
		/**
		 * 出行人列表
		 */
		@ApiListField("traveler_list")
		@ApiField("open_user_info")
		private List<OpenUserInfo> travelerList;
		/**
		 * 出差事由
		 */
		@ApiField("trip_cause")
		private String tripCause;
		/**
		 * 出差天数
		 */
		@ApiField("trip_day")
		private Long tripDay;
		/**
		 * 申请单标题
		 */
		@ApiField("trip_title")
		private String tripTitle;
		/**
		 * 申请单提交类型 1：代提交 2：本人提交 注意：当申请单为代提交时，申请单提交人自己无法为自己下单
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 第三方关联单号
		 */
		@ApiField("union_no")
		private String unionNo;
		/**
		 * 用户名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getApplyShowId() {
			return this.applyShowId;
		}
		public void setApplyShowId(String applyShowId) {
			this.applyShowId = applyShowId;
		}
		public List<OpenApproverInfo> getApproverList() {
			return this.approverList;
		}
		public void setApproverList(List<OpenApproverInfo> approverList) {
			this.approverList = approverList;
		}
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getDeptid() {
			return this.deptid;
		}
		public void setDeptid(String deptid) {
			this.deptid = deptid;
		}
		public List<OpenUserInfo> getExternalTravelerList() {
			return this.externalTravelerList;
		}
		public void setExternalTravelerList(List<OpenUserInfo> externalTravelerList) {
			this.externalTravelerList = externalTravelerList;
		}
		public String getFlowCode() {
			return this.flowCode;
		}
		public void setFlowCode(String flowCode) {
			this.flowCode = flowCode;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<OpenItineraryInfo> getItineraryList() {
			return this.itineraryList;
		}
		public void setItineraryList(List<OpenItineraryInfo> itineraryList) {
			this.itineraryList = itineraryList;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getStatusDesc() {
			return this.statusDesc;
		}
		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}
		public String getThirdpartId() {
			return this.thirdpartId;
		}
		public void setThirdpartId(String thirdpartId) {
			this.thirdpartId = thirdpartId;
		}
		public List<OpenUserInfo> getTravelerList() {
			return this.travelerList;
		}
		public void setTravelerList(List<OpenUserInfo> travelerList) {
			this.travelerList = travelerList;
		}
		public String getTripCause() {
			return this.tripCause;
		}
		public void setTripCause(String tripCause) {
			this.tripCause = tripCause;
		}
		public Long getTripDay() {
			return this.tripDay;
		}
		public void setTripDay(Long tripDay) {
			this.tripDay = tripDay;
		}
		public String getTripTitle() {
			return this.tripTitle;
		}
		public void setTripTitle(String tripTitle) {
			this.tripTitle = tripTitle;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getUnionNo() {
			return this.unionNo;
		}
		public void setUnionNo(String unionNo) {
			this.unionNo = unionNo;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
