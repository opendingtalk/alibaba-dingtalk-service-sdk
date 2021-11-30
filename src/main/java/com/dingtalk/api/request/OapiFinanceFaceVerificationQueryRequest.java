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

import com.dingtalk.api.response.OapiFinanceFaceVerificationQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.faceVerification.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.26
 */
public class OapiFinanceFaceVerificationQueryRequest extends BaseTaobaoRequest<OapiFinanceFaceVerificationQueryResponse> {
	
	

	/** 
	* 人脸识别业务编码
	 */
	private String businessId;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 人脸识别请求编码
	 */
	private String requestCode;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessId() {
		return this.businessId;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public String getRequestCode() {
		return this.requestCode;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.faceVerification.query";
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
		txtParams.put("business_id", this.businessId);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("request_code", this.requestCode);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceFaceVerificationQueryResponse> getResponseClass() {
		return OapiFinanceFaceVerificationQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(businessId, "businessId");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(requestCode, "requestCode");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}