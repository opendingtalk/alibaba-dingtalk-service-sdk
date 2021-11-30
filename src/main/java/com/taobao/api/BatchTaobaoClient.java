package com.taobao.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.taobao.api.internal.feature.BatchFeature;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.WebUtils;

/**
 * 批量API请求客户端。
 * 
 * @author fengsheng
 * @since Jan 8, 2016
 */
public class BatchTaobaoClient extends DefaultTaobaoClient {

    private BatchFeature feature;

    private void initFeature(String serverUrl, final DefaultTaobaoClient client) {
    	feature = new BatchFeature() {
			@Override
			public <T extends TaobaoResponse> T clientExecute(TaobaoRequest<T> request, String session) throws ApiException {
				return BatchTaobaoClient.super.execute(request, session);
			}
		};
    	feature.init(serverUrl, client);
	}

	public BatchTaobaoClient(String serverUrl, String appKey, String appSecret) {
		super(buildApiServerUrl(serverUrl), appKey, appSecret);
		initFeature(serverUrl, this);
	}

	public BatchTaobaoClient(String serverUrl, String appKey, String appSecret, String format) {
		super(buildApiServerUrl(serverUrl), appKey, appSecret, format);
		initFeature(serverUrl, this);
	}

	public BatchTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
		super(buildApiServerUrl(serverUrl), appKey, appSecret, format, connectTimeout, readTimeout);
		initFeature(serverUrl, this);
	}

	public BatchTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
		super(buildApiServerUrl(serverUrl), appKey, appSecret, format, connectTimeout, readTimeout, signMethod);
		initFeature(serverUrl, this);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
		return feature.execute(request, session);
	}

	public void setBatchApiSeparator(String batchApiSeparator) {
    	feature.setBatchApiSeparator(batchApiSeparator);
	}

	private static String buildApiServerUrl(String batchServerUrl) {
		if (batchServerUrl.contains("/router/batch")) {
			return batchServerUrl.replace("/router/batch", "/router/rest");
		}
		return batchServerUrl;
	}

}
