package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserConfirmFaceAuthResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.confirm_face_auth request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.24
 */
public class OapiUserConfirmFaceAuthRequest extends BaseTaobaoRequest<OapiUserConfirmFaceAuthResponse> {
	
	

	/** 
	* 业务方定义的id
	 */
	private String appBizId;

	/** 
	* 人脸扫描的授权码
	 */
	private String tmpAuthCode;

	public void setAppBizId(String appBizId) {
		this.appBizId = appBizId;
	}

	public String getAppBizId() {
		return this.appBizId;
	}

	public void setTmpAuthCode(String tmpAuthCode) {
		this.tmpAuthCode = tmpAuthCode;
	}

	public String getTmpAuthCode() {
		return this.tmpAuthCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.confirm_face_auth";
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
		txtParams.put("appBizId", this.appBizId);
		txtParams.put("tmpAuthCode", this.tmpAuthCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserConfirmFaceAuthResponse> getResponseClass() {
		return OapiUserConfirmFaceAuthResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}