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

import com.dingtalk.api.response.OapiFinanceLoanQualificationGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.qualification.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.04
 */
public class OapiFinanceLoanQualificationGetRequest extends BaseTaobaoRequest<OapiFinanceLoanQualificationGetResponse> {
	
	

	/** 
	* 用户免登录授权码
	 */
	private String code;

	/** 
	* 布点渠道类型
	 */
	private String openChannelType;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setOpenChannelType(String openChannelType) {
		this.openChannelType = openChannelType;
	}

	public String getOpenChannelType() {
		return this.openChannelType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.finance.loan.qualification.get";
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
		txtParams.put("code", this.code);
		txtParams.put("open_channel_type", this.openChannelType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFinanceLoanQualificationGetResponse> getResponseClass() {
		return OapiFinanceLoanQualificationGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(code, "code");
		RequestCheckUtils.checkNotEmpty(openChannelType, "openChannelType");
	}
	

}