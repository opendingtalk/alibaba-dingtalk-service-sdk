package com.taobao.api.internal.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API请求参数容器。
 * 
 * @author fengsheng
 * @since Sep 19, 2014
 */
public class RequestParametersHolder {

	private String requestUrl;
	private String responseBody;
	private byte[] responseBytes;
	private Map<String, String> responseHeaders = new HashMap<String, String>();

	private TaobaoHashMap protocalMustParams;
	private TaobaoHashMap protocalOptParams;
	private TaobaoHashMap applicationParams;

	public String getRequestUrl() {
		return this.requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getResponseBody() {
		return this.responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public TaobaoHashMap getProtocalMustParams() {
		return this.protocalMustParams;
	}

	public void setProtocalMustParams(TaobaoHashMap protocalMustParams) {
		this.protocalMustParams = protocalMustParams;
	}

	public TaobaoHashMap getProtocalOptParams() {
		return this.protocalOptParams;
	}

	public void setProtocalOptParams(TaobaoHashMap protocalOptParams) {
		this.protocalOptParams = protocalOptParams;
	}

	public TaobaoHashMap getApplicationParams() {
		return this.applicationParams;
	}

	public void setApplicationParams(TaobaoHashMap applicationParams) {
		this.applicationParams = applicationParams;
	}

	public Map<String, String> getAllParams() {
		Map<String, String> params = new HashMap<String, String>();
		if (protocalMustParams != null && !protocalMustParams.isEmpty()) {
			params.putAll(protocalMustParams);
		}
		if (protocalOptParams != null && !protocalOptParams.isEmpty()) {
			params.putAll(protocalOptParams);
		}
		if (applicationParams != null && !applicationParams.isEmpty()) {
			params.putAll(applicationParams);
		}
		return params;
	}

	public byte[] getResponseBytes() {
		return responseBytes;
	}

	public void setResponseBytes(byte[] responseBytes) {
		this.responseBytes = responseBytes;
	}

	public Map<String, String> getResponseHeaders() {
		return responseHeaders;
	}

	public void setResponseHeaders(Map<String, List<String>> headers) {
		for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
			String key = entry.getKey();
			for (String value : entry.getValue()) {
				responseHeaders.put(key == null ? "" : key, value);
			}
		}
	}
}
