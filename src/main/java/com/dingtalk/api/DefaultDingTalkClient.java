package com.dingtalk.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.api.*;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.util.*;

/**
 * 钉钉客户端。
 * @author chaohui.zch 2016年11月8日下午2:38:45
 */
public class DefaultDingTalkClient extends DefaultTaobaoClient implements DingTalkClient {

	public DefaultDingTalkClient(String serverUrl) {
		super(serverUrl, null, null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret) throws ApiException {
		return execute(request, accessKey, accessSecret, null,null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret, String suiteTicket) throws ApiException {
		return execute(request, accessKey, accessSecret, suiteTicket,null);
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String session) throws ApiException {
		if(request.getTopApiCallType() == null || request.getTopApiCallType().equals(DingTalkConstants.CALL_TYPE_TOP)) {
			return super.execute(request, session);
		} else {
			return executeOApi(request, session);
		}
	}

	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException {
		if(request.getTopApiCallType() == null || request.getTopApiCallType().equals(DingTalkConstants.CALL_TYPE_TOP)) {
			return super.execute(request,null);
		} else {
			return executeOApi(request,null, accessKey, accessSecret,suiteTicket, corpId);
		}
	}

	private <T extends TaobaoResponse> T executeOApi(TaobaoRequest<T> request, String session) throws ApiException {
		return executeOApi(request, session, null, null, null, null);
	}

	private <T extends TaobaoResponse> T executeOApi(TaobaoRequest<T> request, String session, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			parser = new ObjectJsonParser<T>(request.getResponseClass(), true);
		}

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

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(DingTalkConstants.ACCESS_TOKEN, session);
		requestHolder.setProtocalMustParams(protocalMustParams);

		try {
			String fullUrl;
			// 签名优先
			if(accessKey != null) {
				Long timestamp = System.currentTimeMillis();
				// 验证签名有效性
				String canonicalString = DingTalkSignatureUtil.getCanonicalStringForIsv(timestamp, suiteTicket);
				String signature = DingTalkSignatureUtil.computeSignature(accessSecret, canonicalString);
				Map<String, String > ps = new HashMap<String, String>();
				ps.put("accessKey", accessKey);
				ps.put("signature", signature);
				ps.put("timestamp", timestamp+"");
				if(suiteTicket != null) {
					ps.put("suiteTicket", suiteTicket);
				}
				if(corpId != null){
					ps.put("corpId", corpId);
				}

				String queryStr =DingTalkSignatureUtil.paramToQueryString(ps, "utf-8");
				if (this.serverUrl.indexOf("?") > 0) {
					fullUrl = this.serverUrl + "&"+queryStr;
				} else {
					fullUrl = this.serverUrl + "?"+queryStr;
				}
			}else{
				if (this.serverUrl.indexOf("?") > 0) {
					fullUrl = this.serverUrl + (session != null && session.length() > 0 ? ("&access_token=" + session) : "");
				} else {
					fullUrl = this.serverUrl + (session != null && session.length() > 0 ? ("?access_token=" + session) : "");
				}
			}

			HttpResponseData data = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}

			if("GET".equals(request.getTopHttpMethod())) {
				data = WebV2Utils.doGet(fullUrl, appParams, connectTimeout, readTimeout);
			} else {
				// 是否需要上传文件
				if (request instanceof TaobaoUploadRequest) {
					TaobaoUploadRequest<T> uRequest = (TaobaoUploadRequest<T>) request;
					Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
					data = WebV2Utils.doPost(fullUrl, appParams, fileParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap());
				} else {

					Map<String, Object> jsonParams = new HashMap<String, Object>();
					for (Map.Entry<String, String> paramEntry : appParams.entrySet()) {
						String key = paramEntry.getKey();
						String value = paramEntry.getValue();
						if(value.startsWith("[") && value.endsWith("]")) {
							List<Map<String, Object>> childMap = (List<Map<String, Object>>)TaobaoUtils.jsonToObject(value);
							jsonParams.put(key, childMap);
						} else if(value.startsWith("{") && value.endsWith("}")) {
							Map<String, Object> childMap = (Map<String, Object>)TaobaoUtils.jsonToObject(value);
							jsonParams.put(key, childMap);
						} else {
							jsonParams.put(key, value);
						}
					}

					data = WebV2Utils.doPostWithJson(fullUrl, jsonParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout);
				}
			}
			requestHolder.setResponseBody(data.getBody());
			requestHolder.setResponseHeaders(data.getHeaders());
		} catch (IOException e) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody(), Constants.RESPONSE_TYPE_DINGTALK_OAPI);
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		tRsp.setParams(appParams);
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}
}
