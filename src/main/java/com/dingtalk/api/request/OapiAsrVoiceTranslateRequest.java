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

import com.dingtalk.api.response.OapiAsrVoiceTranslateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.asr.voice.translate request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.11
 */
public class OapiAsrVoiceTranslateRequest extends BaseTaobaoRequest<OapiAsrVoiceTranslateResponse> {
	
	

	/** 
	* media_id，获取方式见https:ding-doc.dingtalk.comdoc#serverapi2bcmg0i
	 */
	private String mediaId;

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.asr.voice.translate";
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
		txtParams.put("media_id", this.mediaId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAsrVoiceTranslateResponse> getResponseClass() {
		return OapiAsrVoiceTranslateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
	}
	

}