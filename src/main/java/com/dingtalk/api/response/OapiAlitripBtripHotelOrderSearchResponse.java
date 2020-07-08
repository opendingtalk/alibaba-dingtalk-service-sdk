package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.hotel.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripHotelOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6677797199318165383L;

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
	 * 酒店订单列表
	 */
	@ApiListField("module")
	@ApiField("open_hotel_order_rs")
	private List<OpenHotelOrderRs> module;

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

	public void setModule(List<OpenHotelOrderRs> module) {
		this.module = module;
	}
	public List<OpenHotelOrderRs> getModule( ) {
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
	 * 成本中心对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterDo extends TaobaoObject {
		private static final long serialVersionUID = 6196545855871852865L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 商旅成本中心id
		 */
		@ApiField("id")
		private Long id;
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
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
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
	 * 发票对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceDo extends TaobaoObject {
		private static final long serialVersionUID = 8178113126929971389L;
		/**
		 * 商旅发票id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
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
	 * 价目详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPriceInfo extends TaobaoObject {
		private static final long serialVersionUID = 3631274718786929869L;
		/**
		 * 交易类型
		 */
		@ApiField("category")
		private String category;
		/**
		 * 流水创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 入住人信息，多个用‘,’分割
		 */
		@ApiField("passenger_name")
		private String passengerName;
		/**
		 * 结算方式:1个人现付，2:企业现付,4:企业月结，8企业预存
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
	 * 入住人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserAffiliateDo extends TaobaoObject {
		private static final long serialVersionUID = 3297973981632271351L;
		/**
		 * 入住人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 入住人ID
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
	 * 酒店订单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenHotelOrderRs extends TaobaoObject {
		private static final long serialVersionUID = 3572327484233797934L;
		/**
		 * 商旅申请单id
		 */
		@ApiField("apply_id")
		private Long applyId;
		/**
		 * 入住时间
		 */
		@ApiField("check_in")
		private Date checkIn;
		/**
		 * 离店时间
		 */
		@ApiField("check_out")
		private Date checkOut;
		/**
		 * 酒店所在城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 联系人姓名
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
		 * 入住顾客，多个用','分割
		 */
		@ApiField("guest")
		private String guest;
		/**
		 * 酒店名称
		 */
		@ApiField("hotel_name")
		private String hotelName;
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
		 * 总共住几晚
		 */
		@ApiField("night")
		private Long night;
		/**
		 * 订单状态
		 */
		@ApiField("order_status")
		private Long orderStatus;
		/**
		 * 订单状态描述
		 */
		@ApiField("order_status_desc")
		private String orderStatusDesc;
		/**
		 * 订单类型
		 */
		@ApiField("order_type")
		private Long orderType;
		/**
		 * 订单类型描述
		 */
		@ApiField("order_type_desc")
		private String orderTypeDesc;
		/**
		 * 价目详情列表
		 */
		@ApiListField("price_info_list")
		@ApiField("open_price_info")
		private List<OpenPriceInfo> priceInfoList;
		/**
		 * 房间数
		 */
		@ApiField("room_num")
		private Long roomNum;
		/**
		 * 房型
		 */
		@ApiField("room_type")
		private String roomType;
		/**
		 * 第三方行程id
		 */
		@ApiField("thirdpart_itinerary_id")
		private String thirdpartItineraryId;
		/**
		 * 入住人列表
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
		public Date getCheckIn() {
			return this.checkIn;
		}
		public void setCheckIn(Date checkIn) {
			this.checkIn = checkIn;
		}
		public Date getCheckOut() {
			return this.checkOut;
		}
		public void setCheckOut(Date checkOut) {
			this.checkOut = checkOut;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
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
		public String getGuest() {
			return this.guest;
		}
		public void setGuest(String guest) {
			this.guest = guest;
		}
		public String getHotelName() {
			return this.hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
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
		public Long getNight() {
			return this.night;
		}
		public void setNight(Long night) {
			this.night = night;
		}
		public Long getOrderStatus() {
			return this.orderStatus;
		}
		public void setOrderStatus(Long orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getOrderStatusDesc() {
			return this.orderStatusDesc;
		}
		public void setOrderStatusDesc(String orderStatusDesc) {
			this.orderStatusDesc = orderStatusDesc;
		}
		public Long getOrderType() {
			return this.orderType;
		}
		public void setOrderType(Long orderType) {
			this.orderType = orderType;
		}
		public String getOrderTypeDesc() {
			return this.orderTypeDesc;
		}
		public void setOrderTypeDesc(String orderTypeDesc) {
			this.orderTypeDesc = orderTypeDesc;
		}
		public List<OpenPriceInfo> getPriceInfoList() {
			return this.priceInfoList;
		}
		public void setPriceInfoList(List<OpenPriceInfo> priceInfoList) {
			this.priceInfoList = priceInfoList;
		}
		public Long getRoomNum() {
			return this.roomNum;
		}
		public void setRoomNum(Long roomNum) {
			this.roomNum = roomNum;
		}
		public String getRoomType() {
			return this.roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
		public String getThirdpartItineraryId() {
			return this.thirdpartItineraryId;
		}
		public void setThirdpartItineraryId(String thirdpartItineraryId) {
			this.thirdpartItineraryId = thirdpartItineraryId;
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
