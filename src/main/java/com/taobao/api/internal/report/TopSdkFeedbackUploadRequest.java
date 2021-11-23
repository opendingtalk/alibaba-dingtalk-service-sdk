package com.taobao.api.internal.report;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * SDK反馈回传请求封装。
 * 
 * @author changchun
 */
public class TopSdkFeedbackUploadRequest extends BaseTaobaoRequest<TopSdkFeedbackUploadResponse> {

	private String type;// 类型
	private String content;// 具体内容

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getApiMethodName() {
		return "taobao.top.sdk.feedback.upload";
	}

	public String getContentType() {
		return null;
	}

	public String getResponseType() {
		return null;
	}

	public String getApiVersion() {
		return null;
	}

	public String getApiCallType() {
		return null;
	}

	public String getHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap params = new TaobaoHashMap();
		params.put("type", this.type);
		if (this.content != null) {
			params.put("content", this.content);
		}
		return params;
	}

	public Class<TopSdkFeedbackUploadResponse> getResponseClass() {
		return TopSdkFeedbackUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(type, "type");
	}

}
