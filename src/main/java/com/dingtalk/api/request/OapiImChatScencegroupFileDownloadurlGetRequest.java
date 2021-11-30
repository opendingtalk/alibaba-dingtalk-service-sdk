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

import com.dingtalk.api.response.OapiImChatScencegroupFileDownloadurlGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.file.downloadurl.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.01
 */
public class OapiImChatScencegroupFileDownloadurlGetRequest extends BaseTaobaoRequest<OapiImChatScencegroupFileDownloadurlGetResponse> {
	
	

	/** 
	* downloadCode 会包含在如聊天消息推送等链路中提供给业务方
	 */
	private String downloadCode;

	public void setDownloadCode(String downloadCode) {
		this.downloadCode = downloadCode;
	}

	public String getDownloadCode() {
		return this.downloadCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scencegroup.file.downloadurl.get";
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
		txtParams.put("download_code", this.downloadCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScencegroupFileDownloadurlGetResponse> getResponseClass() {
		return OapiImChatScencegroupFileDownloadurlGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(downloadCode, "downloadCode");
	}
	

}