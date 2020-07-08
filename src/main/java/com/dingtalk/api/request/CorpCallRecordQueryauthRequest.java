package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpCallRecordQueryauthResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.call.record.queryauth request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.01
 */
public class CorpCallRecordQueryauthRequest extends BaseTaobaoRequest<CorpCallRecordQueryauthResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.corp.call.record.queryauth";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpCallRecordQueryauthResponse> getResponseClass() {
		return CorpCallRecordQueryauthResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}