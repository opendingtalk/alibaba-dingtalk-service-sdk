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

import com.dingtalk.api.response.OapiFinanceIdCardOcrResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.IdCard.ocr request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.26
 */
public class OapiFinanceIdCardOcrRequest extends BaseTaobaoRequest<OapiFinanceIdCardOcrResponse> {
	
	

	/** 
	* 身份证反面照片地址
	 */
	private String backPictureUrl;

	/** 
	* 身份证正面照片地址
	 */
	private String frontPictureUrl;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 请求标识（保证唯一）
	 */
	private String requestId;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setBackPictureUrl(String backPictureUrl) {
		this.backPictureUrl = backPictureUrl;
	}

	public String getBackPictureUrl() {
		return this.backPictureUrl;
	}

	public void setFrontPictureUrl(String frontPictureUrl) {
		this.frontPictureUrl = frontPictureUrl;
	}

	public String getFrontPictureUrl() {
		return this.frontPictureUrl;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.IdCard.ocr";
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
		txtParams.put("back_picture_url", this.backPictureUrl);
		txtParams.put("front_picture_url", this.frontPictureUrl);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("request_id", this.requestId);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceIdCardOcrResponse> getResponseClass() {
		return OapiFinanceIdCardOcrResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(backPictureUrl, "backPictureUrl");
		RequestCheckUtils.checkNotEmpty(frontPictureUrl, "frontPictureUrl");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(requestId, "requestId");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}