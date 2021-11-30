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

import com.dingtalk.api.response.CorpCallSessionQuerylistResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.call.session.querylist request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.16
 */
public class CorpCallSessionQuerylistRequest extends BaseTaobaoRequest<CorpCallSessionQuerylistResponse> {
	
	

	/** 
	* 通话会话id
	 */
	private String sessionIds;

	public void setSessionIds(String sessionIds) {
		this.sessionIds = sessionIds;
	}

	public String getSessionIds() {
		return this.sessionIds;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.call.session.querylist";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("session_ids", this.sessionIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpCallSessionQuerylistResponse> getResponseClass() {
		return CorpCallSessionQuerylistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sessionIds, "sessionIds");
		RequestCheckUtils.checkMaxListSize(sessionIds, 20, "sessionIds");
	}
	

}