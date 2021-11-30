package com.taobao.api;

import java.util.Set;

import com.taobao.api.internal.feature.AutoRetryFeature;

/**
 * 调用出错自动重试客户端。
 * 
 * @author fengsheng
 * @since 1.0, Sep 4, 2012
 */
public class AutoRetryTaobaoClient extends DefaultTaobaoClient {

	private AutoRetryFeature feature = new AutoRetryFeature() {
		@Override
		public <T extends TaobaoResponse> T clientExecute(TaobaoRequest<T> request, String session) throws ApiException {
			return AutoRetryTaobaoClient.super.execute(request, session);
		}
	};

	public AutoRetryTaobaoClient(String serverUrl, String appKey, String appSecret) {
		super(serverUrl, appKey, appSecret);
	}

	public AutoRetryTaobaoClient(String serverUrl, String appKey, String appSecret, String format) {
		super(serverUrl, appKey, appSecret, format);
	}

	public AutoRetryTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
		super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
	}

	public AutoRetryTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
		super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout, signMethod);
	}

	public void setMaxRetryCount(int maxRetryCount) {
		feature.setMaxRetryCount(maxRetryCount);
	}

	public void setRetryWaitTime(long retryWaitTime) {
		feature.setRetryWaitTime(retryWaitTime);
	}

	public void setThrowIfOverMaxRetry(boolean throwIfOverMaxRetry) {
		feature.setThrowIfOverMaxRetry(throwIfOverMaxRetry);
	}

	public void setRetryErrorCodes(Set<String> retryErrorCodes) {
		feature.setRetryErrorCodes(retryErrorCodes);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws ApiException {
		return this.execute(request, null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
		return feature.execute(request, session);
	}

}
