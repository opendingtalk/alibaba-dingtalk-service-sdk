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

import com.dingtalk.api.response.OapiV2UserGetbymobileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.getbymobile request
 * 
 * @author top auto create
 * @since 1.0, 2021.07.27
 */
public class OapiV2UserGetbymobileRequest extends BaseTaobaoRequest<OapiV2UserGetbymobileResponse> {
	
	

	/** 
	* 手机号
	 */
	private String mobile;

	/** 
	* 支持通过手机号搜索专属帐号
	 */
	private Boolean supportExclusiveAccountSearch;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setSupportExclusiveAccountSearch(Boolean supportExclusiveAccountSearch) {
		this.supportExclusiveAccountSearch = supportExclusiveAccountSearch;
	}

	public Boolean getSupportExclusiveAccountSearch() {
		return this.supportExclusiveAccountSearch;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.user.getbymobile";
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
		txtParams.put("support_exclusive_account_search", this.supportExclusiveAccountSearch);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2UserGetbymobileResponse> getResponseClass() {
		return OapiV2UserGetbymobileResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
		RequestCheckUtils.checkMaxLength(mobile, 15, "mobile");
	}
	

}