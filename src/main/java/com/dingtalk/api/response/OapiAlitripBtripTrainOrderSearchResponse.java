package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.train.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripTrainOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2142182479189984124L;

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
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * module
	 */
	@ApiListField("train_order_list")
	@ApiField("open_train_order_rs")
	private List<OpenTrainOrderRs> trainOrderList;


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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTrainOrderList(List<OpenTrainOrderRs> trainOrderList) {
		this.trainOrderList = trainOrderList;
	}
	public List<OpenTrainOrderRs> getTrainOrderList( ) {
		return this.trainOrderList;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 发票对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceDo extends TaobaoObject {
		private static final long serialVersionUID = 1887382278965943886L;
		/**
		 * 商旅发票id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 成本中心对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterDo extends TaobaoObject {
		private static final long serialVersionUID = 8529596631865798213L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 商旅成本中心id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 成本中心名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 成本中心编号
		 */
		@ApiField("number")
		private String number;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
	}
	
	/**
	 * 价目信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPriceInfo extends TaobaoObject {
		private static final long serialVersionUID = 6813539536485188975L;
		/**
		 * 消费类型
		 */
		@ApiField("category")
		private String category;
		/**
		 * 流水创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 乘车人名称，多个用‘,’分割
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
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 乘车人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserAffiliateDo extends TaobaoObject {
		private static final long serialVersionUID = 4235335932853163613L;
		/**
		 * 乘车人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 乘车人ID
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
	 * module
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenTrainOrderRs extends TaobaoObject {
		private static final long serialVersionUID = 4197352796344977116L;
		/**
		 * 商旅审批单id
		 */
		@ApiField("apply_id")
		private Long applyId;
		/**
		 * 到达城市
		 */
		@ApiField("arr_city")
		private String arrCity;
		/**
		 * 到达站
		 */
		@ApiField("arr_station")
		private String arrStation;
		/**
		 * 到达时间
		 */
		@ApiField("arr_time")
		private Date arrTime;
		/**
		 * 联系人名称
		 */
		@ApiField("contact_name")
		private String contactName;
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
		 * 成本中心对象
		 */
		@ApiField("cost_center")
		private OpenCostCenterDo costCenter;
		/**
		 * 出发城市
		 */
		@ApiField("dep_city")
		private String depCity;
		/**
		 * 出发站
		 */
		@ApiField("dep_station")
		private String depStation;
		/**
		 * 出发时间
		 */
		@ApiField("dep_time")
		private Date depTime;
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
		 * 订单id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 发票对象
		 */
		@ApiField("invoice")
		private OpenInvoiceDo invoice;
		/**
		 * 价目信息
		 */
		@ApiListField("price_info_list")
		@ApiField("open_price_info")
		private List<OpenPriceInfo> priceInfoList;
		/**
		 * 乘客姓名
		 */
		@ApiField("rider_name")
		private String riderName;
		/**
		 * 运行时长
		 */
		@ApiField("run_time")
		private String runTime;
		/**
		 * 座位类型
		 */
		@ApiField("seat_type")
		private String seatType;
		/**
		 * 订单状态：0待支付,1出票中,2已关闭,3,改签成功,4退票成功,5出票完成,6退票申请中,7改签申请中,8已出票,已发货,9出票失败,10改签失败,11退票失败
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 第三方行程id
		 */
		@ApiField("thirdpart_itinerary_id")
		private String thirdpartItineraryId;
		/**
		 * 票的数量
		 */
		@ApiField("ticket_count")
		private Long ticketCount;
		/**
		 * 12306票号
		 */
		@ApiField("ticket_no_12306")
		private String ticketNo12306;
		/**
		 * 车次
		 */
		@ApiField("train_number")
		private String trainNumber;
		/**
		 * 车次类型
		 */
		@ApiField("train_type")
		private String trainType;
		/**
		 * 乘车人列表
		 */
		@ApiListField("user_affiliate_list")
		@ApiField("open_user_affiliate_do")
		private List<OpenUserAffiliateDo> userAffiliateList;
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
	
		public Long getApplyId() {
			return this.applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
		public String getArrCity() {
			return this.arrCity;
		}
		public void setArrCity(String arrCity) {
			this.arrCity = arrCity;
		}
		public String getArrStation() {
			return this.arrStation;
		}
		public void setArrStation(String arrStation) {
			this.arrStation = arrStation;
		}
		public Date getArrTime() {
			return this.arrTime;
		}
		public void setArrTime(Date arrTime) {
			this.arrTime = arrTime;
		}
		public String getContactName() {
			return this.contactName;
		}
		public void setContactName(String contactName) {
			this.contactName = contactName;
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
		public OpenCostCenterDo getCostCenter() {
			return this.costCenter;
		}
		public void setCostCenter(OpenCostCenterDo costCenter) {
			this.costCenter = costCenter;
		}
		public String getDepCity() {
			return this.depCity;
		}
		public void setDepCity(String depCity) {
			this.depCity = depCity;
		}
		public String getDepStation() {
			return this.depStation;
		}
		public void setDepStation(String depStation) {
			this.depStation = depStation;
		}
		public Date getDepTime() {
			return this.depTime;
		}
		public void setDepTime(Date depTime) {
			this.depTime = depTime;
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
		public OpenInvoiceDo getInvoice() {
			return this.invoice;
		}
		public void setInvoice(OpenInvoiceDo invoice) {
			this.invoice = invoice;
		}
		public List<OpenPriceInfo> getPriceInfoList() {
			return this.priceInfoList;
		}
		public void setPriceInfoList(List<OpenPriceInfo> priceInfoList) {
			this.priceInfoList = priceInfoList;
		}
		public String getRiderName() {
			return this.riderName;
		}
		public void setRiderName(String riderName) {
			this.riderName = riderName;
		}
		public String getRunTime() {
			return this.runTime;
		}
		public void setRunTime(String runTime) {
			this.runTime = runTime;
		}
		public String getSeatType() {
			return this.seatType;
		}
		public void setSeatType(String seatType) {
			this.seatType = seatType;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getThirdpartItineraryId() {
			return this.thirdpartItineraryId;
		}
		public void setThirdpartItineraryId(String thirdpartItineraryId) {
			this.thirdpartItineraryId = thirdpartItineraryId;
		}
		public Long getTicketCount() {
			return this.ticketCount;
		}
		public void setTicketCount(Long ticketCount) {
			this.ticketCount = ticketCount;
		}
		public String getTicketNo12306() {
			return this.ticketNo12306;
		}
		public void setTicketNo12306(String ticketNo12306) {
			this.ticketNo12306 = ticketNo12306;
		}
		public String getTrainNumber() {
			return this.trainNumber;
		}
		public void setTrainNumber(String trainNumber) {
			this.trainNumber = trainNumber;
		}
		public String getTrainType() {
			return this.trainType;
		}
		public void setTrainType(String trainType) {
			this.trainType = trainType;
		}
		public List<OpenUserAffiliateDo> getUserAffiliateList() {
			return this.userAffiliateList;
		}
		public void setUserAffiliateList(List<OpenUserAffiliateDo> userAffiliateList) {
			this.userAffiliateList = userAffiliateList;
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
