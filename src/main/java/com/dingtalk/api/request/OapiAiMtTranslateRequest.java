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

import com.dingtalk.api.response.OapiAiMtTranslateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ai.mt.translate request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.05
 */
public class OapiAiMtTranslateRequest extends BaseTaobaoRequest<OapiAiMtTranslateResponse> {
	
	

	/** 
	* 翻译源文字符串
	 */
	private String query;

	/** 
	* 翻译源语言类型
	 */
	private String sourceLanguage;

	/** 
	* 翻译目标语言类型
	 */
	private String targetLanguage;

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}

	public String getSourceLanguage() {
		return this.sourceLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}

	public String getTargetLanguage() {
		return this.targetLanguage;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ai.mt.translate";
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
		txtParams.put("query", this.query);
		txtParams.put("source_language", this.sourceLanguage);
		txtParams.put("target_language", this.targetLanguage);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAiMtTranslateResponse> getResponseClass() {
		return OapiAiMtTranslateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(query, "query");
		RequestCheckUtils.checkNotEmpty(sourceLanguage, "sourceLanguage");
		RequestCheckUtils.checkNotEmpty(targetLanguage, "targetLanguage");
	}
	

}