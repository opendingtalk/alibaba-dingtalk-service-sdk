package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.price.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripPriceQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6347351892217855557L;

	/** 
	 * 接口返回
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
	 * 酒店差标
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HotelFeeDetail extends TaobaoObject {
		private static final long serialVersionUID = 2717743598465264761L;
		/**
		 * 城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 费用
		 */
		@ApiField("criterion")
		private Long criterion;
	
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Long getCriterion() {
			return this.criterion;
		}
		public void setCriterion(Long criterion) {
			this.criterion = criterion;
		}
	}
	
	/**
	 * 最高价
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MostExpensive extends TaobaoObject {
		private static final long serialVersionUID = 6479184535559551588L;
		/**
		 * 到达时间
		 */
		@ApiField("arr_time")
		private String arrTime;
		/**
		 * 出发时间
		 */
		@ApiField("dep_time")
		private String depTime;
		/**
		 * 费用
		 */
		@ApiField("fee")
		private Long fee;
		/**
		 * 坐席级别
		 */
		@ApiField("seat_grade")
		private String seatGrade;
		/**
		 * 班次
		 */
		@ApiField("vehicle_no")
		private String vehicleNo;
	
		public String getArrTime() {
			return this.arrTime;
		}
		public void setArrTime(String arrTime) {
			this.arrTime = arrTime;
		}
		public String getDepTime() {
			return this.depTime;
		}
		public void setDepTime(String depTime) {
			this.depTime = depTime;
		}
		public Long getFee() {
			return this.fee;
		}
		public void setFee(Long fee) {
			this.fee = fee;
		}
		public String getSeatGrade() {
			return this.seatGrade;
		}
		public void setSeatGrade(String seatGrade) {
			this.seatGrade = seatGrade;
		}
		public String getVehicleNo() {
			return this.vehicleNo;
		}
		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}
	}
	
	/**
	 * 最低价
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Cheapest extends TaobaoObject {
		private static final long serialVersionUID = 3259797256321436325L;
		/**
		 * 到达时间
		 */
		@ApiField("arr_time")
		private String arrTime;
		/**
		 * 出发时间
		 */
		@ApiField("dep_time")
		private String depTime;
		/**
		 * 费用
		 */
		@ApiField("fee")
		private Long fee;
		/**
		 * 坐席级别
		 */
		@ApiField("seat_grade")
		private String seatGrade;
		/**
		 * 班次
		 */
		@ApiField("vehicle_no")
		private String vehicleNo;
	
		public String getArrTime() {
			return this.arrTime;
		}
		public void setArrTime(String arrTime) {
			this.arrTime = arrTime;
		}
		public String getDepTime() {
			return this.depTime;
		}
		public void setDepTime(String depTime) {
			this.depTime = depTime;
		}
		public Long getFee() {
			return this.fee;
		}
		public void setFee(Long fee) {
			this.fee = fee;
		}
		public String getSeatGrade() {
			return this.seatGrade;
		}
		public void setSeatGrade(String seatGrade) {
			this.seatGrade = seatGrade;
		}
		public String getVehicleNo() {
			return this.vehicleNo;
		}
		public void setVehicleNo(String vehicleNo) {
			this.vehicleNo = vehicleNo;
		}
	}
	
	/**
	 * 行程费用
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtripRoutes extends TaobaoObject {
		private static final long serialVersionUID = 7417728271548726169L;
		/**
		 * 最低价
		 */
		@ApiField("cheapest")
		private Cheapest cheapest;
		/**
		 * 出发时间
		 */
		@ApiField("dep_date")
		private Date depDate;
		/**
		 * 目的地
		 */
		@ApiField("dest_city")
		private String destCity;
		/**
		 * 错误信息
		 */
		@ApiField("err_msg")
		private String errMsg;
		/**
		 * 最高价
		 */
		@ApiField("most_expensive")
		private MostExpensive mostExpensive;
		/**
		 * 出发地
		 */
		@ApiField("org_city")
		private String orgCity;
		/**
		 * 查询是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Cheapest getCheapest() {
			return this.cheapest;
		}
		public void setCheapest(Cheapest cheapest) {
			this.cheapest = cheapest;
		}
		public Date getDepDate() {
			return this.depDate;
		}
		public void setDepDate(Date depDate) {
			this.depDate = depDate;
		}
		public String getDestCity() {
			return this.destCity;
		}
		public void setDestCity(String destCity) {
			this.destCity = destCity;
		}
		public String getErrMsg() {
			return this.errMsg;
		}
		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
		public MostExpensive getMostExpensive() {
			return this.mostExpensive;
		}
		public void setMostExpensive(MostExpensive mostExpensive) {
			this.mostExpensive = mostExpensive;
		}
		public String getOrgCity() {
			return this.orgCity;
		}
		public void setOrgCity(String orgCity) {
			this.orgCity = orgCity;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	
	/**
	 * 费用
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrafficFee extends TaobaoObject {
		private static final long serialVersionUID = 3459194674493178541L;
		/**
		 * 行程费用
		 */
		@ApiListField("btrip_routes")
		@ApiField("btrip_routes")
		private List<BtripRoutes> btripRoutes;
		/**
		 * 错误信息
		 */
		@ApiField("err_msg")
		private String errMsg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public List<BtripRoutes> getBtripRoutes() {
			return this.btripRoutes;
		}
		public void setBtripRoutes(List<BtripRoutes> btripRoutes) {
			this.btripRoutes = btripRoutes;
		}
		public String getErrMsg() {
			return this.errMsg;
		}
		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Module extends TaobaoObject {
		private static final long serialVersionUID = 1475784231619561832L;
		/**
		 * 酒店差标
		 */
		@ApiListField("hotel_fee_detail")
		@ApiField("hotel_fee_detail")
		private List<HotelFeeDetail> hotelFeeDetail;
		/**
		 * 异步查询key。需要client再次尝试请求
		 */
		@ApiField("query_key")
		private String queryKey;
		/**
		 * 费用
		 */
		@ApiField("traffic_fee")
		private TrafficFee trafficFee;
	
		public List<HotelFeeDetail> getHotelFeeDetail() {
			return this.hotelFeeDetail;
		}
		public void setHotelFeeDetail(List<HotelFeeDetail> hotelFeeDetail) {
			this.hotelFeeDetail = hotelFeeDetail;
		}
		public String getQueryKey() {
			return this.queryKey;
		}
		public void setQueryKey(String queryKey) {
			this.queryKey = queryKey;
		}
		public TrafficFee getTrafficFee() {
			return this.trafficFee;
		}
		public void setTrafficFee(TrafficFee trafficFee) {
			this.trafficFee = trafficFee;
		}
	}
	
	/**
	 * 接口返回
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4136344291758949676L;
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
		 * 接口返回model
		 */
		@ApiField("module")
		private Module module;
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
		public Module getModule() {
			return this.module;
		}
		public void setModule(Module module) {
			this.module = module;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
