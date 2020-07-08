package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.CorpTelmoRestfulTestResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.telmo.restful.test request
 * 
 * @author top auto create
 * @since 1.0, 2017.10.12
 */
public class CorpTelmoRestfulTestRequest extends BaseTaobaoRequest<CorpTelmoRestfulTestResponse> {
	
	

	/** 
	* 1
	 */
	private String paramIsvCreateOrderParam;

	public void setParamIsvCreateOrderParam(String paramIsvCreateOrderParam) {
		this.paramIsvCreateOrderParam = paramIsvCreateOrderParam;
	}

	public void setParamIsvCreateOrderParam(IsvCreateOrderParam paramIsvCreateOrderParam) {
		this.paramIsvCreateOrderParam = new JSONWriter(false,true).write(paramIsvCreateOrderParam);
	}

	public String getParamIsvCreateOrderParam() {
		return this.paramIsvCreateOrderParam;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.telmo.restful.test";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("param_isv_create_order_param", this.paramIsvCreateOrderParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpTelmoRestfulTestResponse> getResponseClass() {
		return CorpTelmoRestfulTestResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrderOptionParam extends TaobaoObject {
		private static final long serialVersionUID = 8811693498675371919L;
		/**
		 * 1
		 */
		@ApiField("flow_flag")
		private String flowFlag;
	
		public String getFlowFlag() {
			return this.flowFlag;
		}
		public void setFlowFlag(String flowFlag) {
			this.flowFlag = flowFlag;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SmAddrModel extends TaobaoObject {
		private static final long serialVersionUID = 2251575546911696387L;
		/**
		 * 1
		 */
		@ApiField("address")
		private String address;
		/**
		 * 1
		 */
		@ApiField("area_code")
		private String areaCode;
		/**
		 * 1
		 */
		@ApiField("area_name")
		private String areaName;
		/**
		 * 1
		 */
		@ApiField("city_code")
		private String cityCode;
		/**
		 * 1
		 */
		@ApiField("city_name")
		private String cityName;
		/**
		 * 11
		 */
		@ApiField("full_name")
		private String fullName;
		/**
		 * 1
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 1
		 */
		@ApiField("phone")
		private String phone;
		/**
		 * 11
		 */
		@ApiField("post_code")
		private String postCode;
		/**
		 * 1
		 */
		@ApiField("privince_name")
		private String privinceName;
		/**
		 * 1
		 */
		@ApiField("province_code")
		private String provinceCode;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAreaCode() {
			return this.areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public String getAreaName() {
			return this.areaName;
		}
		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}
		public String getCityCode() {
			return this.cityCode;
		}
		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}
		public String getCityName() {
			return this.cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getFullName() {
			return this.fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPostCode() {
			return this.postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
		public String getPrivinceName() {
			return this.privinceName;
		}
		public void setPrivinceName(String privinceName) {
			this.privinceName = privinceName;
		}
		public String getProvinceCode() {
			return this.provinceCode;
		}
		public void setProvinceCode(String provinceCode) {
			this.provinceCode = provinceCode;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvSimpleSubOrderModel extends TaobaoObject {
		private static final long serialVersionUID = 1547859467331418474L;
		/**
		 * 1
		 */
		@ApiField("offer_id")
		private String offerId;
		/**
		 * 1
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 1
		 */
		@ApiField("sku_id")
		private String skuId;
	
		public String getOfferId() {
			return this.offerId;
		}
		public void setOfferId(String offerId) {
			this.offerId = offerId;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getSkuId() {
			return this.skuId;
		}
		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvCreateOrderParam extends TaobaoObject {
		private static final long serialVersionUID = 1685419265292146334L;
		/**
		 * 1
		 */
		@ApiField("appkey")
		private String appkey;
		/**
		 * 1
		 */
		@ApiField("buyer_id")
		private String buyerId;
		/**
		 * 1
		 */
		@ApiField("buyer_remarks")
		private String buyerRemarks;
		/**
		 * 1
		 */
		@ApiField("isv_order_option_param")
		private IsvOrderOptionParam isvOrderOptionParam;
		/**
		 * 1
		 */
		@ApiField("out_order_id")
		private String outOrderId;
		/**
		 * 1
		 */
		@ApiField("route_id")
		private String routeId;
		/**
		 * 1
		 */
		@ApiField("sm_addr_model")
		private SmAddrModel smAddrModel;
		/**
		 * 1
		 */
		@ApiListField("sub_order_info_list")
		@ApiField("isv_simple_sub_order_model")
		private List<IsvSimpleSubOrderModel> subOrderInfoList;
	
		public String getAppkey() {
			return this.appkey;
		}
		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}
		public String getBuyerId() {
			return this.buyerId;
		}
		public void setBuyerId(String buyerId) {
			this.buyerId = buyerId;
		}
		public String getBuyerRemarks() {
			return this.buyerRemarks;
		}
		public void setBuyerRemarks(String buyerRemarks) {
			this.buyerRemarks = buyerRemarks;
		}
		public IsvOrderOptionParam getIsvOrderOptionParam() {
			return this.isvOrderOptionParam;
		}
		public void setIsvOrderOptionParam(IsvOrderOptionParam isvOrderOptionParam) {
			this.isvOrderOptionParam = isvOrderOptionParam;
		}
		public String getOutOrderId() {
			return this.outOrderId;
		}
		public void setOutOrderId(String outOrderId) {
			this.outOrderId = outOrderId;
		}
		public String getRouteId() {
			return this.routeId;
		}
		public void setRouteId(String routeId) {
			this.routeId = routeId;
		}
		public SmAddrModel getSmAddrModel() {
			return this.smAddrModel;
		}
		public void setSmAddrModel(SmAddrModel smAddrModel) {
			this.smAddrModel = smAddrModel;
		}
		public List<IsvSimpleSubOrderModel> getSubOrderInfoList() {
			return this.subOrderInfoList;
		}
		public void setSubOrderInfoList(List<IsvSimpleSubOrderModel> subOrderInfoList) {
			this.subOrderInfoList = subOrderInfoList;
		}
	}
	

}