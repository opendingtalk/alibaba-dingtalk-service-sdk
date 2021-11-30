package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiAlitripBtripApprovalNewResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.approval.new request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.03
 */
public class OapiAlitripBtripApprovalNewRequest extends BaseTaobaoRequest<OapiAlitripBtripApprovalNewResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenApiNewApplyRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.approval.new";
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
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripApprovalNewResponse> getResponseClass() {
		return OapiAlitripBtripApprovalNewResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 行程列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenItineraryInfo extends TaobaoObject {
		private static final long serialVersionUID = 2575566597595143173L;
		/**
		 * 到达城市
		 */
		@ApiField("arr_city")
		private String arrCity;
		/**
		 * 到达城市编码
		 */
		@ApiField("arr_city_code")
		private String arrCityCode;
		/**
		 * 到达日期
		 */
		@ApiField("arr_date")
		private Date arrDate;
		/**
		 * 商旅成本中心id，若不填则第三方成本中心id必填
		 */
		@ApiField("cost_center_id")
		private Long costCenterId;
		/**
		 * 出发城市
		 */
		@ApiField("dep_city")
		private String depCity;
		/**
		 * 出发城市编码
		 */
		@ApiField("dep_city_code")
		private String depCityCode;
		/**
		 * 出发日期
		 */
		@ApiField("dep_date")
		private Date depDate;
		/**
		 * 商旅发票id，和第三方发票id选填一个即可
		 */
		@ApiField("invoice_id")
		private Long invoiceId;
		/**
		 * 行程id
		 */
		@ApiField("itinerary_id")
		private String itineraryId;
		/**
		 * 行程是否需要预定酒店，不传默认需要
		 */
		@ApiField("need_hotel")
		private Boolean needHotel;
		/**
		 * 行程是否需要预定交通工具，不传默认需要
		 */
		@ApiField("need_traffic")
		private Boolean needTraffic;
		/**
		 * 项目编号
		 */
		@ApiField("project_code")
		private String projectCode;
		/**
		 * 项目名称
		 */
		@ApiField("project_title")
		private String projectTitle;
		/**
		 * 第三方发票id，和商旅发票id选填一个即可
		 */
		@ApiField("third_part_invoice_id")
		private String thirdPartInvoiceId;
		/**
		 * 第三方成本中心id，若不填则商旅成本中心id必填
		 */
		@ApiField("thirdpart_cost_center_id")
		private String thirdpartCostCenterId;
		/**
		 * 交通方式：0飞机, 1,火车, 2汽车, 3其他
		 */
		@ApiField("traffic_type")
		private Long trafficType;
		/**
		 * 行程类型：0单程，1往返
		 */
		@ApiField("trip_way")
		private Long tripWay;
	
		public String getArrCity() {
			return this.arrCity;
		}
		public void setArrCity(String arrCity) {
			this.arrCity = arrCity;
		}
		public String getArrCityCode() {
			return this.arrCityCode;
		}
		public void setArrCityCode(String arrCityCode) {
			this.arrCityCode = arrCityCode;
		}
		public Date getArrDate() {
			return this.arrDate;
		}
		public void setArrDate(Date arrDate) {
			this.arrDate = arrDate;
		}
		public Long getCostCenterId() {
			return this.costCenterId;
		}
		public void setCostCenterId(Long costCenterId) {
			this.costCenterId = costCenterId;
		}
		public String getDepCity() {
			return this.depCity;
		}
		public void setDepCity(String depCity) {
			this.depCity = depCity;
		}
		public String getDepCityCode() {
			return this.depCityCode;
		}
		public void setDepCityCode(String depCityCode) {
			this.depCityCode = depCityCode;
		}
		public Date getDepDate() {
			return this.depDate;
		}
		public void setDepDate(Date depDate) {
			this.depDate = depDate;
		}
		public Long getInvoiceId() {
			return this.invoiceId;
		}
		public void setInvoiceId(Long invoiceId) {
			this.invoiceId = invoiceId;
		}
		public String getItineraryId() {
			return this.itineraryId;
		}
		public void setItineraryId(String itineraryId) {
			this.itineraryId = itineraryId;
		}
		public Boolean getNeedHotel() {
			return this.needHotel;
		}
		public void setNeedHotel(Boolean needHotel) {
			this.needHotel = needHotel;
		}
		public Boolean getNeedTraffic() {
			return this.needTraffic;
		}
		public void setNeedTraffic(Boolean needTraffic) {
			this.needTraffic = needTraffic;
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
		public String getThirdPartInvoiceId() {
			return this.thirdPartInvoiceId;
		}
		public void setThirdPartInvoiceId(String thirdPartInvoiceId) {
			this.thirdPartInvoiceId = thirdPartInvoiceId;
		}
		public String getThirdpartCostCenterId() {
			return this.thirdpartCostCenterId;
		}
		public void setThirdpartCostCenterId(String thirdpartCostCenterId) {
			this.thirdpartCostCenterId = thirdpartCostCenterId;
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
		private static final long serialVersionUID = 4636296375931922856L;
		/**
		 * 出行人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 出行人id
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
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiNewApplyRq extends TaobaoObject {
		private static final long serialVersionUID = 7769542566228941983L;
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
		 * 部门id，如果不传，会根据user相关信息去获取对应的部门信息，如果传的是错误的部门信息，后面无法做部门的费用归属；部门ID只能是数字
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
		 * 审批单酒店预算，单位分
		 */
		@ApiField("hotel_budget")
		private Long hotelBudget;
		/**
		 * 行程列表
		 */
		@ApiListField("itinerary_list")
		@ApiField("open_itinerary_info")
		private List<OpenItineraryInfo> itineraryList;
		/**
		 * 审批单状态，不传入默认为0：0审批中，1同意，2拒绝
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 外部申请单id
		 */
		@ApiField("thirdpart_apply_id")
		private String thirdpartApplyId;
		/**
		 * 用户展示的外部审批单id信息
		 */
		@ApiField("thirdpart_business_id")
		private String thirdpartBusinessId;
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
		 * 1：代提交 2：本人提交 注意：当申请单为代提交时，申请单提交人自己无法为自己下单
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 关联单号
		 */
		@ApiField("union_no")
		private String unionNo;
		/**
		 * 用户名称，如果要传必须传真实姓名，如果不传则会以系统当前维护userId对应的名称进行预订
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
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
		public Long getHotelBudget() {
			return this.hotelBudget;
		}
		public void setHotelBudget(Long hotelBudget) {
			this.hotelBudget = hotelBudget;
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
		public String getThirdpartApplyId() {
			return this.thirdpartApplyId;
		}
		public void setThirdpartApplyId(String thirdpartApplyId) {
			this.thirdpartApplyId = thirdpartApplyId;
		}
		public String getThirdpartBusinessId() {
			return this.thirdpartBusinessId;
		}
		public void setThirdpartBusinessId(String thirdpartBusinessId) {
			this.thirdpartBusinessId = thirdpartBusinessId;
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