package com.qimen.api;

import java.io.IOException;
import java.net.URL;
import java.util.Date;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.cluster.DnsConfig;
import com.taobao.api.internal.parser.xml.QimenXmlParser;
import com.taobao.api.internal.util.*;

/**
 * 奇门API请求客户端。
 * 
 * @author fengsheng
 * @since Jan 26, 2016
 */
public class DefaultQimenClient implements QimenClient {

	protected String serverUrl;
	protected String appKey;
	protected String appSecret;
	protected String format = Constants.FORMAT_XML;
	protected String signMethod = Constants.SIGN_METHOD_MD5;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
	private   boolean isHttpDnsEnabled = false; //是否启用了httpdns
    private   String  originalHttpHost = null;  //原始请求Host

	public DefaultQimenClient(String serverUrl, String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.serverUrl = serverUrl;
	}

	public <T extends QimenResponse> T execute(QimenRequest<T> request) throws ApiException {
		return execute(request, null);
	}

	public <T extends QimenResponse> T execute(QimenRequest<T> request, String session) throws ApiException {
		return _execute(request, session);
	}

	private <T extends QimenResponse> T _execute(QimenRequest<T> request, String session) throws ApiException {
		long start = System.currentTimeMillis();

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		requestHolder.setApplicationParams(request.getQueryParams());

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		protocalMustParams.put(Constants.VERSION, request.getVersion());
		protocalMustParams.put(Constants.APP_KEY, appKey);
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.SIGN_METHOD, signMethod);
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.PARTNER_ID, Constants.SDK_VERSION);
		protocalOptParams.put(Constants.QM_CUSTOMER_ID, request.getCustomerId());
		requestHolder.setProtocalOptParams(protocalOptParams);

		try {
			String apiBody = request.getBody();
			if (StringUtils.isEmpty(apiBody)) {
				XmlWriter writer = new XmlWriter(true, Constants.QM_ROOT_TAG, QimenRequest.class);
				apiBody = writer.write(request);
			}

			// 添加签名参数
			protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, appSecret, signMethod));

			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String realServerUrl = getServerUrl(this.serverUrl);
			String fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);

			TaobaoHashMap headerMap = new TaobaoHashMap();

			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				headerMap.put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			if(getTopHttpDnsHost() != null){
			    headerMap.put(Constants.TOP_HTTP_DNS_HOST, getTopHttpDnsHost());
            }

			// 是否需要上传文件
			HttpResponseData data = WebV2Utils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, apiBody.getBytes(Constants.CHARSET_UTF8), connectTimeout, readTimeout, headerMap, null);
			requestHolder.setResponseBody(data.getBody());
			requestHolder.setResponseHeaders(data.getHeaders());
		} catch (IOException e) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new QimenXmlParser<T>(request.getResponseClass());
			}
		}

		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody(), Constants.RESPONSE_TYPE_QIMEN);
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	/**
	 * 是否把响应字符串解释为对象。
	 */
	public void setNeedEnableParser(boolean needEnableParser) {
		this.needEnableParser = needEnableParser;
	}

	/**
	 * 是否记录API请求错误日志。
	 */
	public void setNeedEnableLogger(boolean needEnableLogger) {
		TaobaoLogger.setNeedEnableLogger(needEnableLogger);
	}

	/**
	 * 是否忽略HTTPS证书校验。
	 */
	public void setIgnoreSSLCheck(boolean ignore) {
		WebUtils.setIgnoreSSLCheck(ignore);
	}

	/**
	 * 是否启用响应GZIP压缩
	 */
	public void setUseGzipEncoding(boolean useGzipEncoding) {
		this.useGzipEncoding = useGzipEncoding;
	}

	/**
	 * 设置API请求的连接超时时间，默认为15秒。
	 */
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	/**
	 * 设置API请求的读超时时间，默认为30秒。
	 */
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}
	
	
	public String getServerUrl(String serverUrl) {
	    if(isHttpDnsEnabled){
	        DnsConfig dnsConfig = ClusterManager.GetDnsConfigFromCache();
	        if (dnsConfig == null) {
	            return serverUrl;
	        } else {
	            return dnsConfig.getVipUrl(serverUrl);
	        } 
        }
        return serverUrl;
    }
	
	 public String getTopHttpDnsHost(){
	    if(isHttpDnsEnabled){
	         return originalHttpHost;
	    }
	    return null;
	 }
	 
    /**
     * 启用http dns
     */
    public void enableHttpDns() {
        WebUtils.setIgnoreHostCheck(true);
        setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(appKey, appSecret);
        isHttpDnsEnabled = true;
    }

    /**
     * 沙箱环境启用http dns
     * 
     * @param onlineAppKey 正式key
     * @param onlineAppSecret 正式环境secret
     */
    public void enableHttpDns(String onlineAppKey, String onlineAppSecret) {
        WebUtils.setIgnoreHostCheck(true);
        setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(onlineAppKey, onlineAppSecret);
        isHttpDnsEnabled = true;
    }

    private void setHttpDnsHost(String serverUrl) {
        if (serverUrl == null) {
            return;
        }
        try {
            URL url = new URL(serverUrl);
            originalHttpHost = url.getHost();
        } catch (Exception e) {
            throw new RuntimeException("error serverUrl:" + serverUrl, e);
        }
    }

}
