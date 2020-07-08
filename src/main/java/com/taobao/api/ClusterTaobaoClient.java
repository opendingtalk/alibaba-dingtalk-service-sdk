package com.taobao.api;

import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.cluster.DnsConfig;
import com.taobao.api.internal.feature.ClusterFeature;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.WebUtils;

/**
 * 异地多活自动分配集群客户端。
 * 
 * @author fengsheng
 * @since Sep 7, 2015
 */
public class ClusterTaobaoClient extends DefaultTaobaoClient {

	//赋予异地多活行为
	private ClusterFeature feature;

	private void initFeature() {
		feature = new ClusterFeature() {};
		feature.init(this);
	}

	public ClusterTaobaoClient(String serverUrl, String appKey, String appSecret) throws ApiException {
		super(serverUrl, appKey, appSecret);
		initFeature();
	}

	public ClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format) throws ApiException {
		super(serverUrl, appKey, appSecret, format);
		initFeature();
	}

	public ClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) throws ApiException {
		super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
		initFeature();
	}

	public ClusterTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) throws ApiException {
		super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout, signMethod);
		initFeature();
	}

	public String getServerUrl(String serverUrl, String apiName, String session,TaobaoHashMap appParams) {
		DnsConfig dnsConfig = ClusterManager.GetDnsConfigFromCache();
		if (dnsConfig == null) {
			return serverUrl;
		} else {
			return dnsConfig.getBestVipUrl(serverUrl, apiName, session,appParams);
		}
	}

	public String getSdkVersion() {
		return Constants.SDK_VERSION_CLUSTER;
	}
}
