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

import com.dingtalk.api.response.OapiEduUserAuthGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.auth.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.05
 */
public class OapiEduUserAuthGetRequest extends BaseTaobaoRequest<OapiEduUserAuthGetResponse> {
	
	

	/** 
	* 语言
	 */
	private String language;

	/** 
	* 用户id
	 */
	private String userid;

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.user.auth.get";
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
		txtParams.put("language", this.language);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduUserAuthGetResponse> getResponseClass() {
		return OapiEduUserAuthGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(language, 6, "language");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
		RequestCheckUtils.checkMaxLength(userid, 64, "userid");
	}
	

}