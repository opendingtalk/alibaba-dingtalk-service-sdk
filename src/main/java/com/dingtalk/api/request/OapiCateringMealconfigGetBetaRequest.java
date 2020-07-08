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

import com.dingtalk.api.response.OapiCateringMealconfigGetBetaResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.mealconfig.get.beta request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.21
 */
public class OapiCateringMealconfigGetBetaRequest extends BaseTaobaoRequest<OapiCateringMealconfigGetBetaResponse> {
	
	

	/** 
	* 获取未来n天的可点餐时间（包括今天）如： 1， 则返回今天和明天的可点餐日期，最大值为13
	 */
	private Long mealDayOffset;

	public void setMealDayOffset(Long mealDayOffset) {
		this.mealDayOffset = mealDayOffset;
	}

	public Long getMealDayOffset() {
		return this.mealDayOffset;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.mealconfig.get.beta";
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
		txtParams.put("meal_day_offset", this.mealDayOffset);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringMealconfigGetBetaResponse> getResponseClass() {
		return OapiCateringMealconfigGetBetaResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mealDayOffset, "mealDayOffset");
	}
	

}