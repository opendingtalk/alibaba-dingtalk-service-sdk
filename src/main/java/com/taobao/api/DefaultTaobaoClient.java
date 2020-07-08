package com.taobao.api;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.aliyun.api.internal.mapping.RequestBodyConverter;
import com.qimen.api.QimenRequest;
import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.cluster.DnsConfig;
import com.taobao.api.internal.dto.RequestDTO;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.*;

/**
 * 基于REST的TOP客户端。
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class DefaultTaobaoClient implements TaobaoClient {

	protected String serverUrl;
	protected String appKey;
	protected String appSecret;
	protected String format = Constants.FORMAT_JSON;
	protected String signMethod = Constants.SIGN_METHOD_HMAC_SHA256;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needCheckRequest = true; // 是否在客户端校验请求
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useSimplifyJson = false; // 是否采用精简化的JSON返回
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
	private   boolean isHttpDnsEnabled = false; //是否启用了httpdns
    private   String  originalHttpHost = null;  //原始请求Host
	private String version = "2.0";

	private Proxy proxy; //代理类
    
    public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
		this.serverUrl = serverUrl;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format) {
		this(serverUrl, appKey, appSecret);
		this.format = format;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, appKey, appSecret, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public DefaultTaobaoClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
		this(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
		this.signMethod = signMethod;
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws ApiException {
		return execute(request, null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
		return _execute(request, session);
	}

	private <T extends TaobaoResponse> T _execute(TaobaoRequest<T> request, String session) throws ApiException {
		long start = System.currentTimeMillis();

		// 构建响应解释器
		TaobaoParser<T> parser = buildParser(request);

		// 本地校验请求参数
		if (this.needCheckRequest) {
			try {
				request.check();
			} catch (ApiRuleException e) {
				T localResponse = null;
				try {
					localResponse = request.getResponseClass().newInstance();
				} catch (Exception xe) {
					throw new ApiException(xe);
				}
				localResponse.setErrorCode(e.getErrCode());
				localResponse.setMsg(e.getErrMsg());
				return localResponse;
			}
		}

		RequestParametersHolder requestHolder = invokeApi(request, session, start);

		T tRsp = parseBody(parser, request, requestHolder);

		tRsp.setParams(requestHolder.getApplicationParams());
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	public String getServerUrl(String serverUrl, String apiName, String session,TaobaoHashMap appParams) {
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

	public String getSdkVersion() {
	    if(isHttpDnsEnabled){
	        return Constants.SDK_VERSION_HTTPDNS;   
	    }
		return Constants.SDK_VERSION;
	}

	/**
	 * 是否在客户端校验请求参数。
	 */
	public void setNeedCheckRequest(boolean needCheckRequest) {
		this.needCheckRequest = needCheckRequest;
	}

	/**
	 * 是否把响应字符串解释为对象。
	 */
	public void setNeedEnableParser(boolean needEnableParser) {
		this.needEnableParser = needEnableParser;
	}

	/**
	 * 是否采用标准化的JSON格式返回。
	 */
	public void setUseSimplifyJson(boolean useSimplifyJson) {
		this.useSimplifyJson = useSimplifyJson;
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
	
	public String getTopHttpDnsHost(){
	    if(isHttpDnsEnabled){
	        return originalHttpHost;
	    }
	    return null;
	}
	
	/**
	 * 启用http dns
	 */
	public void enableHttpDns(){
	    WebUtils.setIgnoreHostCheck(true);
	    setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(appKey, appSecret);
        isHttpDnsEnabled = true;
	}

	/**
	 * 沙箱环境启用http dns
	 * @param onlineAppKey 正式key
	 * @param onlineAppSecret 正式环境secret
	 */
    public void enableHttpDns(String onlineAppKey, String onlineAppSecret){
        WebUtils.setIgnoreHostCheck(true);
        setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(onlineAppKey, onlineAppSecret);
        isHttpDnsEnabled = true;
    }
    
    public void resetServerUrl(String serverUrl){
    	this.serverUrl = serverUrl;
    }
    
    public String getRequestUrl(){
    	return this.serverUrl;
    }
    
    public String getAppKey() {
        return appKey;
    }

	private void setHttpDnsHost(String serverUrl){
		if(serverUrl == null){
			return;
		}
		try {
			URL url = new URL(serverUrl);
			originalHttpHost = url.getHost();
		} catch (Exception e) {
			throw new RuntimeException("error serverUrl:" + serverUrl, e);
		}
	}

    private <T extends TaobaoResponse> TaobaoParser<T> buildParser(TaobaoRequest<T> request) {
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			String realFormat = request.getTopApiFormat() != null ? request.getTopApiFormat() : format;
			String realResponseType = this.getRealResponseType(request.getTopApiFormat() != null ? request.getTopApiFormat() : format,
					request.getTopResponseType());
			if (Constants.FORMAT_XML.equals(realFormat)
					|| Constants.FORMAT_XML2.equals(realFormat)) {
				parser = new ObjectXmlParser<T>(request.getResponseClass());
			} else {
				if(realResponseType != null && (realResponseType.equals(Constants.RESPONSE_TYPE_QIMEN)
						|| realResponseType.equals(Constants.RESPONSE_TYPE_QIMEN2))) {
					// 奇门云网关固定simplify=true
					parser = new ObjectJsonParser<T>(request.getResponseClass(), true);
				} else {
					parser = new ObjectJsonParser<T>(request.getResponseClass(), this.useSimplifyJson);
				}
			}
		}
		return parser;
	}

	private <T extends TaobaoResponse> T parseBody(TaobaoParser<T> parser, TaobaoRequest<T> request, RequestParametersHolder requestHolder) throws ApiException {
    	String body = requestHolder.getResponseBody();
		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(body, getRealResponseType(request.getTopApiFormat() != null ? request.getTopApiFormat() : format,
					request.getTopResponseType()));
			if(tRsp == null){
				try {
					tRsp = request.getResponseClass().newInstance();
				}catch (Exception e){
					throw new ApiException(e);
				}
			}
			tRsp.setBody(body);
			tRsp.setRequestUrl(requestHolder.getRequestUrl());
            tRsp.setHeaderContent(requestHolder.getResponseHeaders());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(body);
				tRsp.setRequestUrl(requestHolder.getRequestUrl());
				tRsp.setHeaderContent(requestHolder.getResponseHeaders());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}
		return tRsp;
	}

	private <T extends TaobaoResponse> RequestParametersHolder invokeApi(TaobaoRequest<T> request, String session, long start) throws ApiException {
		RequestDTO requestDTO = new RequestDTO();
		requestDTO.setRequestBase(request);
		requestDTO.setTargetAppKey(request.getTargetAppKey());
		requestDTO.setTimestamp(request.getTimestamp());
		requestDTO.setHeaderMap(request.getHeaderMap());
		requestDTO.setTextParams(request.getTextParams());
		requestDTO.setContentType(request.getTopContentType());
		requestDTO.setApiMethodName(request.getApiMethodName());
		requestDTO.setApiVersion(request.getTopApiVersion());
		requestDTO.setFormat(request.getTopApiFormat());
		requestDTO.setApiCallType(request.getTopApiCallType());
		if(StringUtils.isEmpty(requestDTO.getBody())){
			requestDTO.setBody(RequestBodyConverter.getRequestBody(request, request.getTopContentType()));
		}
		return invokeApi(requestDTO, session, start);
	}

	protected RequestParametersHolder invokeApi(RequestDTO request, String session, long start) throws ApiException {
		RequestParametersHolder requestHolder = new RequestParametersHolder();
		if(request.getTextParams() == null){
			request.setTextParams(new HashMap<String, String>());
		}
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		protocalMustParams.put(Constants.VERSION, request.getApiVersion() != null ? request.getApiVersion() : version);
		if(appKey != null) {
			protocalMustParams.put(Constants.APP_KEY, appKey);
		}
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, request.getFormat() != null ? request.getFormat() : format);
		protocalOptParams.put(Constants.SIGN_METHOD, signMethod);
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.PARTNER_ID, getSdkVersion());
		protocalOptParams.put(Constants.TARGET_APP_KEY, request.getTargetAppKey());

		if (this.useSimplifyJson) {
			protocalOptParams.put(Constants.SIMPLIFY, Boolean.TRUE.toString());
		}
		requestHolder.setProtocalOptParams(protocalOptParams);

		//目前不支持xml格式的传参，需要使用form形式的
		Boolean isXml = Constants.CONTENT_TYPE_XML.equals(request.getContentType());
		Boolean isJson = Constants.CONTENT_TYPE_JSON.equals(request.getContentType());
		String apiBody = request.getBody();
		if(isXml) {
			if (StringUtils.isEmpty(apiBody)) {
				XmlWriter writer = new XmlWriter(true, Constants.QM_ROOT_TAG, QimenRequest.class);
				apiBody = writer.write(request);
			}
		}


		String fullUrl;
		String traceRequestUrl;
		try {
			if(request.getApiCallType() == null) {
				// 添加签名参数
				if (isJson || isXml) {
					protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, appSecret, signMethod));
				} else {
					protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequest(requestHolder, appSecret, signMethod));
				}
			}

			String realServerUrl = getServerUrl(this.serverUrl, request.getApiMethodName(), session,appParams);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String appParamsQuery = WebUtils.buildQuery(appParams, Constants.CHARSET_UTF8);
			if(isJson || isXml) {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
			} else {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
			}
			requestHolder.setRequestUrl(traceRequestUrl);

			HttpResponseData data = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			if(getTopHttpDnsHost() != null){
				request.getHeaderMap().put(Constants.TOP_HTTP_DNS_HOST, getTopHttpDnsHost());
			}
			// 是否需要上传文件
			if (request.getRequestBase() != null && request.getRequestBase() instanceof TaobaoUploadRequest) {
				TaobaoUploadRequest<?> uRequest = (TaobaoUploadRequest<?>) request.getRequestBase();
				Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
                data = WebV2Utils.doPost(fullUrl, appParams, fileParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap());
			} else {
				byte[] bodyByte = apiBody == null ? new byte[0] : apiBody.getBytes(Constants.CHARSET_UTF8);
				if(isJson){
					data = WebV2Utils.doPost(fullUrl, Constants.QM_CONTENT_TYPE_JSON, bodyByte, connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
				} else if(isXml) {
					data = WebV2Utils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, bodyByte, connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
				} else {
                    data = WebV2Utils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
				}
			}
			requestHolder.setResponseBody(data.getBody());
            requestHolder.setResponseHeaders(data.getHeaders());
		} catch (IOException e) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		return requestHolder;
	}

	protected void setRealFormat(String responseType) {
    	if(responseType == null) {
    		return;
		}
		if(Constants.RESPONSE_TYPE_QIMEN2.equals(responseType)) {

		}
	}

	protected String getRealResponseType(String format, String responseType) {
		return Constants.FORMAT_JSON2.equals(this.format)
				|| Constants.FORMAT_XML2.equals(this.format) ? Constants.RESPONSE_TYPE_QIMEN2 : responseType;
	}

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public String getFormat() {
		return format;
	}

	public String getSignMethod() {
		return signMethod;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public boolean isNeedCheckRequest() {
		return needCheckRequest;
	}

	public boolean isUseSimplifyJson() {
		return useSimplifyJson;
	}

	public boolean isUseGzipEncoding() {
		return useGzipEncoding;
	}

	public boolean isNeedEnableParser() {
		return needEnableParser;
	}
}
