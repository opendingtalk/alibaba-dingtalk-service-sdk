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

import com.dingtalk.api.response.OapiOcrStructuredRecognizeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ocr.structured.recognize request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.07
 */
public class OapiOcrStructuredRecognizeRequest extends BaseTaobaoRequest<OapiOcrStructuredRecognizeResponse> {
	
	

	/** 
	* 识别图片地址
	 */
	private String imageUrl;

	/** 
	* 识别图片类型, 身份证idcard，营业执照增值税发票invoice，营业执照blicense，银行卡bank_card，车牌car_no，机动车发票car_invoice，驾驶证driving_license，行驶证vehicle_license，火车票train_ticket，定额发票quota_invoice，出租车发票taxi_ticket，机票行程单air_itinerary
	 */
	private String type;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ocr.structured.recognize";
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
		txtParams.put("image_url", this.imageUrl);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOcrStructuredRecognizeResponse> getResponseClass() {
		return OapiOcrStructuredRecognizeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(imageUrl, "imageUrl");
		RequestCheckUtils.checkMaxLength(imageUrl, 1000, "imageUrl");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}