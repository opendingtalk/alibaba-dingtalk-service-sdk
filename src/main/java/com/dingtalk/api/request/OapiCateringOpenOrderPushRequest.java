package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCateringOpenOrderPushResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.open.order.push request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.17
 */
public class OapiCateringOpenOrderPushRequest extends BaseTaobaoRequest<OapiCateringOpenOrderPushResponse> {
	
	

	/** 
	* 实际支付金额
	 */
	private Long actualAmount;

	/** 
	* 补贴金额
	 */
	private Long allowanceAmount;

	/** 
	* 补充信息
	 */
	private String ext;

	/** 
	* 餐补规则编码
	 */
	private String mealPlanNo;

	/** 
	* 用餐时间
	 */
	private Long mealTime;

	/** 
	* 菜品信息
	 */
	private String orderDetails;

	/** 
	* 应付金额
	 */
	private Long orderFullAmount;

	/** 
	* 订单id
	 */
	private String orderId;

	/** 
	* 点餐时间
	 */
	private Long orderTime;

	/** 
	* 点餐商户编号
	 */
	private String shopId;

	/** 
	* 点餐商家名称
	 */
	private String shopName;

	/** 
	* 点餐人姓名
	 */
	private String userName;

	/** 
	* 点餐人的编码，通过开放平台获取的 userId
	 */
	private String userid;

	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}

	public void setAllowanceAmount(Long allowanceAmount) {
		this.allowanceAmount = allowanceAmount;
	}

	public Long getAllowanceAmount() {
		return this.allowanceAmount;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setMealPlanNo(String mealPlanNo) {
		this.mealPlanNo = mealPlanNo;
	}

	public String getMealPlanNo() {
		return this.mealPlanNo;
	}

	public void setMealTime(Long mealTime) {
		this.mealTime = mealTime;
	}

	public Long getMealTime() {
		return this.mealTime;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderFullAmount(Long orderFullAmount) {
		this.orderFullAmount = orderFullAmount;
	}

	public Long getOrderFullAmount() {
		return this.orderFullAmount;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderTime(Long orderTime) {
		this.orderTime = orderTime;
	}

	public Long getOrderTime() {
		return this.orderTime;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.open.order.push";
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
		txtParams.put("actual_amount", this.actualAmount);
		txtParams.put("allowance_amount", this.allowanceAmount);
		txtParams.put("ext", this.ext);
		txtParams.put("meal_plan_no", this.mealPlanNo);
		txtParams.put("meal_time", this.mealTime);
		txtParams.put("order_details", this.orderDetails);
		txtParams.put("order_full_amount", this.orderFullAmount);
		txtParams.put("order_id", this.orderId);
		txtParams.put("order_time", this.orderTime);
		txtParams.put("shop_id", this.shopId);
		txtParams.put("shop_name", this.shopName);
		txtParams.put("user_name", this.userName);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringOpenOrderPushResponse> getResponseClass() {
		return OapiCateringOpenOrderPushResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actualAmount, "actualAmount");
		RequestCheckUtils.checkNotEmpty(allowanceAmount, "allowanceAmount");
		RequestCheckUtils.checkNotEmpty(mealPlanNo, "mealPlanNo");
		RequestCheckUtils.checkNotEmpty(orderDetails, "orderDetails");
		RequestCheckUtils.checkNotEmpty(orderFullAmount, "orderFullAmount");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(shopId, "shopId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}