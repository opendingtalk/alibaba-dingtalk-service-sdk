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

import com.dingtalk.api.response.OapiFinanceFaceVerificationInitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.faceVerification.init request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.26
 */
public class OapiFinanceFaceVerificationInitRequest extends BaseTaobaoRequest<OapiFinanceFaceVerificationInitResponse> {
	
	

	/** 
	* 生物信息（通过jsapi获取）
	 */
	private String bioInfo;

	/** 
	* 证件姓名
	 */
	private String certName;

	/** 
	* 身份证号
	 */
	private String idCardNo;

	/** 
	* 业务场景
	 */
	private String scene;

	/** 
	* 手机号
	 */
	private String userMobile;

	public void setBioInfo(String bioInfo) {
		this.bioInfo = bioInfo;
	}

	public String getBioInfo() {
		return this.bioInfo;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertName() {
		return this.certName;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getScene() {
		return this.scene;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.faceVerification.init";
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
		txtParams.put("bio_info", this.bioInfo);
		txtParams.put("cert_name", this.certName);
		txtParams.put("id_card_no", this.idCardNo);
		txtParams.put("scene", this.scene);
		txtParams.put("user_mobile", this.userMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceFaceVerificationInitResponse> getResponseClass() {
		return OapiFinanceFaceVerificationInitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bioInfo, "bioInfo");
		RequestCheckUtils.checkNotEmpty(certName, "certName");
		RequestCheckUtils.checkNotEmpty(idCardNo, "idCardNo");
		RequestCheckUtils.checkNotEmpty(scene, "scene");
		RequestCheckUtils.checkNotEmpty(userMobile, "userMobile");
	}
	

}