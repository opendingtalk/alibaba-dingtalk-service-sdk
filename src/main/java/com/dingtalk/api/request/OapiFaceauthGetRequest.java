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

import com.dingtalk.api.response.OapiFaceauthGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.faceauth.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiFaceauthGetRequest extends BaseTaobaoRequest<OapiFaceauthGetResponse> {
	
	

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
		return "dingtalk.oapi.faceauth.get";
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
		txtParams.put("app_biz_id", this.appBizId);
		txtParams.put("tmp_auth_code", this.tmpAuthCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFaceauthGetResponse> getResponseClass() {
		return OapiFaceauthGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appBizId, "appBizId");
		RequestCheckUtils.checkNotEmpty(tmpAuthCode, "tmpAuthCode");
	}
	

}