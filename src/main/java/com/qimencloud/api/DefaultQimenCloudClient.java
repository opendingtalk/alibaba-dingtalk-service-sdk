package com.qimencloud.api;

import com.taobao.api.*;
import com.taobao.api.internal.dto.RequestDTO;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoLogger;

public class DefaultQimenCloudClient extends DefaultTaobaoClient implements QimenCloudClient {

    public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret) {
        super(serverUrl, appKey, appSecret);
    }

    public DefaultQimenCloudClient(String serverUrl, String format) {
        super(serverUrl, null, null, format);
    }

    public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format) {
        super(serverUrl, appKey, appSecret, format);
    }

    public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
        super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
    }

    public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
        super(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout, signMethod);
    }

    public QimenCloudResponse execute(QimenCloudRequest request) throws ApiException {
        return execute(request, null);
    }

    public QimenCloudResponse execute(QimenCloudRequest request, String session) throws ApiException {
        long start = System.currentTimeMillis();

        TaobaoParser<QimenCloudResponse> parser = buildParser(request);

        RequestDTO requestDTO = buildRequestDTO(request);
        RequestParametersHolder requestHolder = invokeApi(requestDTO, session, start);

        QimenCloudResponse tRsp = parseBody(parser, request, requestHolder);
        if (!tRsp.isSuccess()) {
            TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
        }
        return tRsp;
    }

    private TaobaoParser<QimenCloudResponse> buildParser(QimenCloudRequest request) {
        TaobaoParser<QimenCloudResponse> parser = null;
        if (this.needEnableParser) {
            String realFormat = request.getTopApiFormat() != null ? request.getTopApiFormat() : format;
            String realResponseType = this.getRealResponseType(request.getTopApiFormat() != null ? request.getTopApiFormat() : format,
                    request.getResponseType());
            if (Constants.FORMAT_XML.equals(realFormat)
                    || Constants.FORMAT_XML2.equals(realFormat)) {
                parser = new ObjectXmlParser<QimenCloudResponse>(request.getResponseClass());
            } else {
                if(realResponseType != null && (realResponseType.equals(Constants.RESPONSE_TYPE_QIMEN)
                        || realResponseType.equals(Constants.RESPONSE_TYPE_QIMEN2))) {
                    // ∆Ê√≈‘∆Õ¯πÿπÃ∂®simplify=true
                    parser = new ObjectJsonParser<QimenCloudResponse>(request.getResponseClass(), true);
                } else {
                    parser = new ObjectJsonParser<QimenCloudResponse>(request.getResponseClass(), this.useSimplifyJson);
                }
            }
        }
        return parser;
    }

    private QimenCloudResponse parseBody(TaobaoParser<QimenCloudResponse> parser, QimenCloudRequest request, RequestParametersHolder requestHolder) throws ApiException {
        QimenCloudResponse tRsp;
        if (this.needEnableParser) {
            tRsp = parser.parse(requestHolder.getResponseBody(), getRealResponseType(this.format, request.getResponseType()));
            tRsp.setBody(requestHolder.getResponseBody());
            tRsp.setRequestUrl(requestHolder.getRequestUrl());
            tRsp.setHeaders(requestHolder.getResponseHeaders());
        } else {
            try {
                tRsp = request.getResponseClass().newInstance();
                tRsp.setBody(requestHolder.getResponseBody());
                tRsp.setRequestUrl(requestHolder.getRequestUrl());
                tRsp.setHeaders(requestHolder.getResponseHeaders());
            } catch (Exception e) {
                throw new ApiException(e);
            }
        }
        return tRsp;
    }

    private RequestDTO buildRequestDTO(QimenCloudRequest request) {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setApiMethodName(request.getApiMethodName());
        requestDTO.setContentType(request.getContentType());
        requestDTO.setTextParams(request.getQueryParams());
        requestDTO.setBody(request.getBody());
        requestDTO.setHeaderMap(request.getHeaderMap());
        requestDTO.setTimestamp(request.getTimestamp());
        requestDTO.setTargetAppKey(request.getTargetAppKey());
        requestDTO.setFormat(request.getTopApiFormat());
        requestDTO.setApiVersion(request.getApiVersion());
        return requestDTO;
    }
}
