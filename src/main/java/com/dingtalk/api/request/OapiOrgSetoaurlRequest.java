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

import com.dingtalk.api.response.OapiOrgSetoaurlResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.setoaurl request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiOrgSetoaurlRequest extends BaseTaobaoRequest<OapiOrgSetoaurlResponse> {
	
	

	/** 
	* 工作台名称，认证企业才能设置
	 */
	private String oaTitle;

	/** 
	* 工作台首页地址，必须是https开头
	 */
	private String oaUrl;

	public void setOaTitle(String oaTitle) {
		this.oaTitle = oaTitle;
	}

	public String getOaTitle() {
		return this.oaTitle;
	}

	public void setOaUrl(String oaUrl) {
		this.oaUrl = oaUrl;
	}

	public String getOaUrl() {
		return this.oaUrl;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.setoaurl";
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
		txtParams.put("oa_title", this.oaTitle);
		txtParams.put("oa_url", this.oaUrl);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgSetoaurlResponse> getResponseClass() {
		return OapiOrgSetoaurlResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(oaUrl, "oaUrl");
	}
	

}