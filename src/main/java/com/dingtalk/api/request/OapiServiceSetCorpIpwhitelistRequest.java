package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceSetCorpIpwhitelistResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.set_corp_ipwhitelist request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceSetCorpIpwhitelistRequest extends BaseTaobaoRequest<OapiServiceSetCorpIpwhitelistResponse> {
	
	

	/** 
	* 授权方corpid
	 */
	private String authCorpid;

	/** 
	* 要为其设置的IP白名单,格式支持IP段,用星号表示,如【5.6.*.*】,代表从【5.6.0.*】到【5.6.255.*】的任意IP,在第三段设为星号时,将忽略第四段的值,注意:仅支持后两段设置为星号
	 */
	private List<String> ipWhitelist;

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setIpWhitelist(List<String> ipWhitelist) {
		this.ipWhitelist = ipWhitelist;
	}

	public List<String> getIpWhitelist() {
		return this.ipWhitelist;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.set_corp_ipwhitelist";
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
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("ip_whitelist", TaobaoUtils.objectToJson(this.ipWhitelist));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceSetCorpIpwhitelistResponse> getResponseClass() {
		return OapiServiceSetCorpIpwhitelistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}