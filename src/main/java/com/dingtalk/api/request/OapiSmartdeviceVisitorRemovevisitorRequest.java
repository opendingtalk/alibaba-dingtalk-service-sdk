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

import com.dingtalk.api.response.OapiSmartdeviceVisitorRemovevisitorResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.visitor.removevisitor request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSmartdeviceVisitorRemovevisitorRequest extends BaseTaobaoRequest<OapiSmartdeviceVisitorRemovevisitorResponse> {
	
	

	/** 
	* 预约编号
	 */
	private String reservationId;

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.visitor.removevisitor";
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
		txtParams.put("reservation_id", this.reservationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceVisitorRemovevisitorResponse> getResponseClass() {
		return OapiSmartdeviceVisitorRemovevisitorResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reservationId, "reservationId");
	}
	

}