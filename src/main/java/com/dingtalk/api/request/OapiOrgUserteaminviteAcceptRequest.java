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

import com.dingtalk.api.response.OapiOrgUserteaminviteAcceptResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.userteaminvite.accept request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.24
 */
public class OapiOrgUserteaminviteAcceptRequest extends BaseTaobaoRequest<OapiOrgUserteaminviteAcceptResponse> {
	
	

	/** 
	* 手机号
	 */
	private String mobile;

	/** 
	* 国家码
	 */
	private String stateCode;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.userteaminvite.accept";
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
		txtParams.put("mobile", this.mobile);
		txtParams.put("state_code", this.stateCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgUserteaminviteAcceptResponse> getResponseClass() {
		return OapiOrgUserteaminviteAcceptResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
		RequestCheckUtils.checkNotEmpty(stateCode, "stateCode");
	}
	

}