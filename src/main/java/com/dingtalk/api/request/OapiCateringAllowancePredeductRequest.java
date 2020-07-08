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

import com.dingtalk.api.response.OapiCateringAllowancePredeductResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.allowance.prededuct request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.13
 */
public class OapiCateringAllowancePredeductRequest extends BaseTaobaoRequest<OapiCateringAllowancePredeductResponse> {
	
	

	/** 
	* 抵扣部分金额的超时时间（毫秒）
	 */
	private Long expiryTime;

	/** 
	* 用餐时间
	 */
	private Long mealTime;

	/** 
	* 应付金额
	 */
	private Long orderFullAmount;

	/** 
	* 订单id
	 */
	private String orderid;

	/** 
	* 点餐人userid
	 */
	private String userid;

	public void setExpiryTime(Long expiryTime) {
		this.expiryTime = expiryTime;
	}

	public Long getExpiryTime() {
		return this.expiryTime;
	}

	public void setMealTime(Long mealTime) {
		this.mealTime = mealTime;
	}

	public Long getMealTime() {
		return this.mealTime;
	}

	public void setOrderFullAmount(Long orderFullAmount) {
		this.orderFullAmount = orderFullAmount;
	}

	public Long getOrderFullAmount() {
		return this.orderFullAmount;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.allowance.prededuct";
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
		txtParams.put("expiry_time", this.expiryTime);
		txtParams.put("meal_time", this.mealTime);
		txtParams.put("order_full_amount", this.orderFullAmount);
		txtParams.put("orderid", this.orderid);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringAllowancePredeductResponse> getResponseClass() {
		return OapiCateringAllowancePredeductResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(expiryTime, "expiryTime");
		RequestCheckUtils.checkNotEmpty(mealTime, "mealTime");
		RequestCheckUtils.checkNotEmpty(orderFullAmount, "orderFullAmount");
		RequestCheckUtils.checkNotEmpty(orderid, "orderid");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}