package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.vehicle.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripVehicleOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2363242643851428658L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 分页信息
	 */
	@ApiField("page_info")
	private PageInfoRs pageInfo;

	/** 
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 订单列表
	 */
	@ApiListField("vehicle_order_list")
	@ApiField("open_vehicle_order_rs")
	private List<OpenVehicleOrderRs> vehicleOrderList;


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

	public void setPageInfo(PageInfoRs pageInfo) {
		this.pageInfo = pageInfo;
	}
	public PageInfoRs getPageInfo( ) {
		return this.pageInfo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setVehicleOrderList(List<OpenVehicleOrderRs> vehicleOrderList) {
		this.vehicleOrderList = vehicleOrderList;
	}
	public List<OpenVehicleOrderRs> getVehicleOrderList( ) {
		return this.vehicleOrderList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 价目详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPriceInfo extends TaobaoObject {
		private static final long serialVersionUID = 6526936461668228786L;
		/**
		 * 交易类型：用车支付, 服务费, 用车取消后收费, 用车退款, 用车赔付
		 */
		@ApiField("category")
		private String category;
		/**
		 * 流水创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 出行人，多个用‘,’分割
		 */
		@ApiField("passenger_name")
		private String passengerName;
		/**
		 * 结算方式:1：个人现付，2:企业现付,4:企业月结，8、企业预存
		 */
		@ApiField("pay_type")
		private Long payType;
		/**
		 * 价格
		 */
		@ApiField("price")
		private String price;
		/**
		 * 交易流水ID
		 */
		@ApiField("tradeId")
		private String tradeId;
		/**
		 * 资金流向:1:支出，2:收入
		 */
		@ApiField("type")
		private Long type;
	
		public String getCategory() {
			return this.category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getPassengerName() {
			return this.passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public Long getPayType() {
			return this.payType;
		}
		public void setPayType(Long payType) {
			this.payType = payType;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getTradeId() {
			return this.tradeId;
		}
		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 出行人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserAffiliateDo extends TaobaoObject {
		private static final long serialVersionUID = 5341833225578821589L;
		/**
		 * 出行人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 出行人ID
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
	 * 订单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenVehicleOrderRs extends TaobaoObject {
		private static final long serialVersionUID = 6662435578392742681L;
		/**
		 * 商旅系统审批单id
		 */
		@ApiField("apply_id")
		private Long applyId;
		/**
		 * 商旅审批单展示id(非审批api对接企业)
		 */
		@ApiField("apply_show_id")
		private String applyShowId;
		/**
		 * 申请单名称
		 */
		@ApiField("btrip_title")
		private String btripTitle;
		/**
		 * 用车原因：TRAVEL: 差旅, TRAFFIC: 市内交通, WORK: 加班, OTHER: 其它
		 */
		@ApiField("business_category")
		private String businessCategory;
		/**
		 * 取消时间
		 */
		@ApiField("cancel_time")
		private Date cancelTime;
		/**
		 * 车辆类型
		 */
		@ApiField("car_info")
		private String carInfo;
		/**
		 * 类型级别：1经济型、2舒适型、3豪华型
		 */
		@ApiField("car_level")
		private String carLevel;
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
		 * 商旅成本中心id
		 */
		@ApiField("cost_center_id")
		private Long costCenterId;
		/**
		 * 成本中心名称
		 */
		@ApiField("cost_center_name")
		private String costCenterName;
		/**
		 * 成本中心编号
		 */
		@ApiField("cost_center_number")
		private String costCenterNumber;
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
		 * 司机到达目的地时间
		 */
		@ApiField("driver_confirm_time")
		private Date driverConfirmTime;
		/**
		 * 订单预估价格
		 */
		@ApiField("estimate_price")
		private String estimatePrice;
		/**
		 * 出发地
		 */
		@ApiField("from_address")
		private String fromAddress;
		/**
		 * 出发城市
		 */
		@ApiField("from_city_name")
		private String fromCityName;
		/**
		 * 订单创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 订单更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 订单id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 商旅发票id
		 */
		@ApiField("invoice_id")
		private Long invoiceId;
		/**
		 * 发票抬头
		 */
		@ApiField("invoice_title")
		private String invoiceTitle;
		/**
		 * 是否特殊订单
		 */
		@ApiField("is_special")
		private Boolean isSpecial;
		/**
		 * 打车事由
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 订单状态:0：待派单（初始化）  1：订单已结束 (终态，第三方关单)  2：派单成功（行程有效状态）  3：订单已结束 (终态，派单失败)  4：已退款（终态，退款成功）  5：已支付（行程有效状态，除非有客诉，会流转到已退款）  6：取消成功（终态，用户取消）  8：订单已结束（终态，无人接单）
		 */
		@ApiField("order_status")
		private Long orderStatus;
		/**
		 * 乘客名称
		 */
		@ApiField("passenger_name")
		private String passengerName;
		/**
		 * 支付时间
		 */
		@ApiField("pay_time")
		private Date payTime;
		/**
		 * 价目详情列表
		 */
		@ApiListField("price_info_list")
		@ApiField("open_price_info")
		private List<OpenPriceInfo> priceInfoList;
		/**
		 * 项目编号
		 */
		@ApiField("project_code")
		private String projectCode;
		/**
		 * 项目id
		 */
		@ApiField("project_id")
		private Long projectId;
		/**
		 * 项目名称
		 */
		@ApiField("project_title")
		private String projectTitle;
		/**
		 * 服务商：2滴滴；3:曹操；4:首汽；5:阳光。可能会有其他服务商的增加。
		 */
		@ApiField("provider")
		private Long provider;
		/**
		 * 乘客发布用车时间
		 */
		@ApiField("publish_time")
		private Date publishTime;
		/**
		 * 真实出发地
		 */
		@ApiField("real_from_address")
		private String realFromAddress;
		/**
		 * 实际出发城市
		 */
		@ApiField("real_from_city_name")
		private String realFromCityName;
		/**
		 * 真实到达地
		 */
		@ApiField("real_to_address")
		private String realToAddress;
		/**
		 * 实际到达城市
		 */
		@ApiField("real_to_city_name")
		private String realToCityName;
		/**
		 * 打车服务类型 1:出租车, 2:专车, 3:快车
		 */
		@ApiField("service_type")
		private Long serviceType;
		/**
		 * 特殊订单类型；v_sp_t_1:用车里程，v_sp_t_2:实际下车点，v_sp_t_3:用车金额，v_sp_t_4:用车次数，v_sp_t_5:跨城订单
		 */
		@ApiListField("special_types")
		@ApiField("string")
		private List<String> specialTypes;
		/**
		 * 乘客上车时间
		 */
		@ApiField("taken_time")
		private Date takenTime;
		/**
		 * 第三方项目id
		 */
		@ApiField("third_part_project_id")
		private String thirdPartProjectId;
		/**
		 * 第三方申请单ID
		 */
		@ApiField("thirdpart_apply_id")
		private String thirdpartApplyId;
		/**
		 * 第三方行程id
		 */
		@ApiField("thirdpart_itinerary_id")
		private String thirdpartItineraryId;
		/**
		 * 目的地
		 */
		@ApiField("to_address")
		private String toAddress;
		/**
		 * 目的城市
		 */
		@ApiField("to_city_name")
		private String toCityName;
		/**
		 * 行驶公里数
		 */
		@ApiField("travel_distance")
		private String travelDistance;
		/**
		 * 出行人列表
		 */
		@ApiListField("user_affiliate_list")
		@ApiField("open_user_affiliate_do")
		private List<OpenUserAffiliateDo> userAffiliateList;
		/**
		 * 用户确认状态：0未确认；1已确认；2有异议；3系统检查不合理
		 */
		@ApiField("user_confirm")
		private Long userConfirm;
		/**
		 * 预定人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 预定人id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getApplyId() {
			return this.applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
		public String getApplyShowId() {
			return this.applyShowId;
		}
		public void setApplyShowId(String applyShowId) {
			this.applyShowId = applyShowId;
		}
		public String getBtripTitle() {
			return this.btripTitle;
		}
		public void setBtripTitle(String btripTitle) {
			this.btripTitle = btripTitle;
		}
		public String getBusinessCategory() {
			return this.businessCategory;
		}
		public void setBusinessCategory(String businessCategory) {
			this.businessCategory = businessCategory;
		}
		public Date getCancelTime() {
			return this.cancelTime;
		}
		public void setCancelTime(Date cancelTime) {
			this.cancelTime = cancelTime;
		}
		public String getCarInfo() {
			return this.carInfo;
		}
		public void setCarInfo(String carInfo) {
			this.carInfo = carInfo;
		}
		public String getCarLevel() {
			return this.carLevel;
		}
		public void setCarLevel(String carLevel) {
			this.carLevel = carLevel;
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
		public Long getCostCenterId() {
			return this.costCenterId;
		}
		public void setCostCenterId(Long costCenterId) {
			this.costCenterId = costCenterId;
		}
		public String getCostCenterName() {
			return this.costCenterName;
		}
		public void setCostCenterName(String costCenterName) {
			this.costCenterName = costCenterName;
		}
		public String getCostCenterNumber() {
			return this.costCenterNumber;
		}
		public void setCostCenterNumber(String costCenterNumber) {
			this.costCenterNumber = costCenterNumber;
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
		public Date getDriverConfirmTime() {
			return this.driverConfirmTime;
		}
		public void setDriverConfirmTime(Date driverConfirmTime) {
			this.driverConfirmTime = driverConfirmTime;
		}
		public String getEstimatePrice() {
			return this.estimatePrice;
		}
		public void setEstimatePrice(String estimatePrice) {
			this.estimatePrice = estimatePrice;
		}
		public String getFromAddress() {
			return this.fromAddress;
		}
		public void setFromAddress(String fromAddress) {
			this.fromAddress = fromAddress;
		}
		public String getFromCityName() {
			return this.fromCityName;
		}
		public void setFromCityName(String fromCityName) {
			this.fromCityName = fromCityName;
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
		public Long getInvoiceId() {
			return this.invoiceId;
		}
		public void setInvoiceId(Long invoiceId) {
			this.invoiceId = invoiceId;
		}
		public String getInvoiceTitle() {
			return this.invoiceTitle;
		}
		public void setInvoiceTitle(String invoiceTitle) {
			this.invoiceTitle = invoiceTitle;
		}
		public Boolean getIsSpecial() {
			return this.isSpecial;
		}
		public void setIsSpecial(Boolean isSpecial) {
			this.isSpecial = isSpecial;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public Long getOrderStatus() {
			return this.orderStatus;
		}
		public void setOrderStatus(Long orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getPassengerName() {
			return this.passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public Date getPayTime() {
			return this.payTime;
		}
		public void setPayTime(Date payTime) {
			this.payTime = payTime;
		}
		public List<OpenPriceInfo> getPriceInfoList() {
			return this.priceInfoList;
		}
		public void setPriceInfoList(List<OpenPriceInfo> priceInfoList) {
			this.priceInfoList = priceInfoList;
		}
		public String getProjectCode() {
			return this.projectCode;
		}
		public void setProjectCode(String projectCode) {
			this.projectCode = projectCode;
		}
		public Long getProjectId() {
			return this.projectId;
		}
		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}
		public String getProjectTitle() {
			return this.projectTitle;
		}
		public void setProjectTitle(String projectTitle) {
			this.projectTitle = projectTitle;
		}
		public Long getProvider() {
			return this.provider;
		}
		public void setProvider(Long provider) {
			this.provider = provider;
		}
		public Date getPublishTime() {
			return this.publishTime;
		}
		public void setPublishTime(Date publishTime) {
			this.publishTime = publishTime;
		}
		public String getRealFromAddress() {
			return this.realFromAddress;
		}
		public void setRealFromAddress(String realFromAddress) {
			this.realFromAddress = realFromAddress;
		}
		public String getRealFromCityName() {
			return this.realFromCityName;
		}
		public void setRealFromCityName(String realFromCityName) {
			this.realFromCityName = realFromCityName;
		}
		public String getRealToAddress() {
			return this.realToAddress;
		}
		public void setRealToAddress(String realToAddress) {
			this.realToAddress = realToAddress;
		}
		public String getRealToCityName() {
			return this.realToCityName;
		}
		public void setRealToCityName(String realToCityName) {
			this.realToCityName = realToCityName;
		}
		public Long getServiceType() {
			return this.serviceType;
		}
		public void setServiceType(Long serviceType) {
			this.serviceType = serviceType;
		}
		public List<String> getSpecialTypes() {
			return this.specialTypes;
		}
		public void setSpecialTypes(List<String> specialTypes) {
			this.specialTypes = specialTypes;
		}
		public Date getTakenTime() {
			return this.takenTime;
		}
		public void setTakenTime(Date takenTime) {
			this.takenTime = takenTime;
		}
		public String getThirdPartProjectId() {
			return this.thirdPartProjectId;
		}
		public void setThirdPartProjectId(String thirdPartProjectId) {
			this.thirdPartProjectId = thirdPartProjectId;
		}
		public String getThirdpartApplyId() {
			return this.thirdpartApplyId;
		}
		public void setThirdpartApplyId(String thirdpartApplyId) {
			this.thirdpartApplyId = thirdpartApplyId;
		}
		public String getThirdpartItineraryId() {
			return this.thirdpartItineraryId;
		}
		public void setThirdpartItineraryId(String thirdpartItineraryId) {
			this.thirdpartItineraryId = thirdpartItineraryId;
		}
		public String getToAddress() {
			return this.toAddress;
		}
		public void setToAddress(String toAddress) {
			this.toAddress = toAddress;
		}
		public String getToCityName() {
			return this.toCityName;
		}
		public void setToCityName(String toCityName) {
			this.toCityName = toCityName;
		}
		public String getTravelDistance() {
			return this.travelDistance;
		}
		public void setTravelDistance(String travelDistance) {
			this.travelDistance = travelDistance;
		}
		public List<OpenUserAffiliateDo> getUserAffiliateList() {
			return this.userAffiliateList;
		}
		public void setUserAffiliateList(List<OpenUserAffiliateDo> userAffiliateList) {
			this.userAffiliateList = userAffiliateList;
		}
		public Long getUserConfirm() {
			return this.userConfirm;
		}
		public void setUserConfirm(Long userConfirm) {
			this.userConfirm = userConfirm;
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
	 * 分页信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageInfoRs extends TaobaoObject {
		private static final long serialVersionUID = 3764384444547314317L;
		/**
		 * 当前页
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 总记录数
		 */
		@ApiField("total_number")
		private Long totalNumber;
	
		public Long getPage() {
			return this.page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotalNumber() {
			return this.totalNumber;
		}
		public void setTotalNumber(Long totalNumber) {
			this.totalNumber = totalNumber;
		}
	}
	


}
