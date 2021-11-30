package com.aliyun.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SimpleTimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aliyun.api.internal.parser.json.ObjectJsonParser;
import com.aliyun.api.internal.parser.xml.ObjectXmlParser;
import com.aliyun.api.internal.util.AliyunLogger;
import com.aliyun.api.internal.util.AliyunWebUtils;
import com.taobao.api.ApiException;
import com.taobao.api.ApiRuleException;
import com.taobao.api.Constants;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * aliyun sdk 请求入口默认实现。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public class DefaultAliyunClient implements AliyunClient {

	private String serverUrl;
	private String accessKeyId;
	private String accessKeySecret;
	private String format = AliyunConstants.FORMAT_JSON;
	private String signatureMethod =AliyunConstants.SIGNATURE_METHOD_HMAC_SHA1;
    private String signatureVersion=AliyunConstants.SIGNATURE_VERSION_1_0;
    private ExecutorService executorService;

	private int connectTimeout = 3000;//3秒
	private int readTimeout = 80000;//80秒
	private boolean needCheckRequest = true; // 是否在客户端校验请求
	private boolean needEnableParser = true; // 是否对响应结果进行解释
	private boolean useSimplifyJson = false; // 是否采用精简化的JSON返回
	
	private static final String PARTNER_ID = "partner_id";
	private static final String SIMPLIFY = "simplify";
	private static final int DEFAULT_THREAD_POOL_SIZE = 50;
	
	public DefaultAliyunClient(String serverUrl, String accessKeyId, String accessKeySecret) {
		this.serverUrl = serverUrl;
		this.accessKeyId = accessKeyId;
		this.accessKeySecret = accessKeySecret;
	}
	
	public DefaultAliyunClient(String serverUrl, String accessKeyId, String accessKeySecret, String format) {
		this(serverUrl, accessKeyId, accessKeySecret);
		this.format = format;
	}
	
	public DefaultAliyunClient(String serverUrl, String accessKeyId,
			String accessKeySecret, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, accessKeyId, accessKeySecret, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}
	
	public DefaultAliyunClient(String serverUrl, String accessKeyId,
			String accessKeySecret, String format, int connectTimeout, int readTimeout, ExecutorService executorService) {
		this(serverUrl, accessKeyId, accessKeySecret, format,connectTimeout,readTimeout);
		this.executorService = executorService;
	}
	
	public <T extends AliyunResponse> T execute(AliyunRequest<T> request) throws ApiException {
		AliyunParser<T> parser = null;
		if (this.needEnableParser) {
			if (AliyunConstants.FORMAT_XML.equals(this.format)) {
				parser = new ObjectXmlParser<T>(request.getResponseClass());
			} else {
				parser = new ObjectJsonParser<T>(request.getResponseClass(), this.useSimplifyJson);
			}
		}
		return _execute(request, parser);
	}
	
	public <T extends AliyunResponse> Future<T> executeAsync(
			final AliyunRequest<T> request,
			final AliyunAsyncHandler<T> asyncHandler) throws ApiException {
		
		if (executorService == null) {
			synchronized (this) {
				if (executorService == null) {
					executorService = Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE);
				}
			}
		}
		
		return executorService.submit(new Callable<T>() {
			public T call() throws ApiException {
				T response;
				try {
					response = execute(request);
				} catch (ApiException e) {
					asyncHandler.onError(e);
					throw e;
				}
				asyncHandler.onSuccess(request, response);
				return response;
			}
		});
	}

	public <T extends AliyunResponse> T _execute(AliyunRequest<T> request, AliyunParser<T> parser)	throws ApiException {
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
				localResponse.setMessage(e.getErrMsg());
				return localResponse;
			}
		}

		Map<String, Object> rt = doPost(request);
		if (rt == null)
			return null;

		T tRsp = null;
		if (this.needEnableParser) {
			try {
				tRsp = parser.parse((String) rt.get("rsp"));
				tRsp.setBody((String) rt.get("rsp"));
			} catch (RuntimeException e) {
				AliyunLogger.logBizError((String) rt.get("rsp"));
				throw e;
			}
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody((String) rt.get("rsp"));
			} catch (Exception e) {
			}
		}

		tRsp.setParams((TaobaoHashMap) rt.get("textParams"));
		if (!tRsp.isSuccess()) {
			AliyunLogger.logErrorScene(rt, tRsp, accessKeyId);
		}
		return tRsp;
	}
	
	public <T extends AliyunResponse> Map<String, Object> doPost(AliyunRequest<T> request) throws ApiException {
		Map<String, Object> result = new HashMap<String, Object>();
		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		try{
			addProtocalMustParams(request, protocalMustParams);
		}
		catch (Exception e) {
			throw new ApiException(e);
		}
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		addProtocalOptParams(protocalOptParams);
		requestHolder.setProtocalOptParams(protocalOptParams);
		
		String url = null;
		try {
			// 计算签名，并将签名结果加入请求参数中
			protocalMustParams.put(AliyunConstants.SIGNATURE,
					AliyunSignature.computeSignature(requestHolder.getAllParams(), accessKeySecret));
			
			 String query = paramsToQueryString(requestHolder.getAllParams());
			 url = (serverUrl.endsWith("/") ? serverUrl : (serverUrl + "/")) + "?" + query;
		} catch (Exception e) {
			throw  new ApiException(e);
		}
		
		String rsp = null;
		try {
			// 是否需要上传文件
			if (request instanceof AliyunUploadRequest) {
				AliyunUploadRequest<T> uRequest = (AliyunUploadRequest<T>) request;
				Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
				rsp =AliyunWebUtils.doPost(url, null, fileParams,Constants.CHARSET_UTF8, connectTimeout, readTimeout,request.getHeaderMap());
			} else {
				rsp = AliyunWebUtils.doPost(url, null,Constants.CHARSET_UTF8, connectTimeout, readTimeout,request.getHeaderMap());
			}
		} catch (IOException e) {
			throw new ApiException(e);
		}
		result.put("rsp", rsp);
		result.put("textParams", appParams);
		result.put("protocalMustParams", protocalMustParams);
		result.put("protocalOptParams", protocalOptParams);
		result.put("url", url);
		return result;
	}

	private <T extends AliyunResponse> void addProtocalMustParams(AliyunRequest<T> request,TaobaoHashMap protocalMustParams)
			throws Exception {

		String[] strArray = request.getApiMethodName().split("\\.");
		if(strArray.length < 5) {
			throw new ApiException("Wrong api name.");
		}
		String action =  strArray[3];
		protocalMustParams.put(AliyunConstants.ACTION, action );
		
		String version=strArray[4];
		protocalMustParams.put(AliyunConstants.VERSION, version);
		protocalMustParams.put(AliyunConstants.ACCESS_KEY_ID, accessKeyId);
		protocalMustParams.put(AliyunConstants.FORMAT, format);
		Long timestamp = request.getTimestamp();// 允许用户设置时间戳
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}
		protocalMustParams.put(AliyunConstants.TIME_STAMP, formatIso8601Date(new Date(timestamp)));
		
		protocalMustParams.put(AliyunConstants.SIGNATURE_METHOD, signatureMethod);
		protocalMustParams.put(AliyunConstants.SIGNATURE_VERSION ,signatureVersion);
		protocalMustParams.put(AliyunConstants.SIGNATURE_NONCE, UUID.randomUUID().toString()); // 可以使用UUID作为SignatureNonce
	}
	
	private <T extends AliyunResponse> void addProtocalOptParams(TaobaoHashMap protocalOptParams) {
		protocalOptParams.put(AliyunConstants.FORMAT, format);
		protocalOptParams.put(PARTNER_ID, Constants.SDK_VERSION);
		if (this.useSimplifyJson) {
			protocalOptParams.put(SIMPLIFY, Boolean.TRUE.toString());
		}
	}
	
    private String paramsToQueryString(Map<String, String> params) throws UnsupportedEncodingException  {
        if (params == null || params.size() == 0){
            return null;
        }

        StringBuilder paramString = new StringBuilder();
        boolean first = true;
        for(Entry<String, String> p : params.entrySet()){
            String key = p.getKey();
            String val = p.getValue();

            if (!first){
                paramString.append("&");
            }

            paramString.append(URLEncoder.encode(key, AliyunConstants.CHARSET_UTF8));

            if (val != null){
                paramString.append("=").append(
                        URLEncoder.encode(val, AliyunConstants.CHARSET_UTF8));
            }

            first = false;
        }
        return paramString.toString();
    }

	private String formatIso8601Date(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(AliyunConstants.DATE_FORMAT_ISO8601);
		// 注意使用GMT时间
		df.setTimeZone(new SimpleTimeZone(0, "GMT"));
		return df.format(date);
	}
	
	public void setNeedCheckRequest(boolean needCheckRequest) {
		this.needCheckRequest = needCheckRequest;
	}

	public void setNeedEnableParser(boolean needEnableParser) {
		this.needEnableParser = needEnableParser;
	}

	public void setNeedEnableLogger(boolean needEnableLogger) {
		AliyunLogger.setNeedEnableLogger(needEnableLogger);
	}
	
	public ExecutorService getExecutorService() {
		return executorService;
	}

	public void setExecutorService(ExecutorService executorService) {
		this.executorService = executorService;
	}

	public void shutdown() {
		if (executorService != null) {
			executorService.shutdownNow();
		}
	}
	
}
