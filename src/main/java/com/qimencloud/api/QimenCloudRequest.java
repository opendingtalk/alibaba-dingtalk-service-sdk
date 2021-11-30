package com.qimencloud.api;

import java.io.Serializable;
import java.util.Map;

import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;

public class QimenCloudRequest implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3854127602152305985L;

    /**
     * //api方法名称
     */
    private String apiMethodName;

    /**
     *  自定义URL参数
     */
    private TaobaoHashMap queryParams;

    /**
     * HTTP请求头参数
     */
    protected Map<String, String> headerMap;

    /**
     * 目标appKey
     */
    private String targetAppKey;

    /**
     * 请求时间戳（为空则用系统当前时间）
     */
    private Long timestamp;

    /**
     * 报文请求
     */
    private String body;

    /**
     * 请求格式
     */
    private String contentType = Constants.CONTENT_TYPE_FORM;

    /**
     * 响应格式
     */
    private String responseType = Constants.RESPONSE_TYPE_QIMEN;

    /**
     * 同响应格式，format如果为FORMAT_JSON2，responseType必然是RESPONSE_TYPE_QIMEN2
     * 默认是qimen1，新的需要设置qimen2
     */
    private String topApiFormat = Constants.FORMAT_JSON;

    public String getTopApiFormat() {
        return topApiFormat;
    }

    public void setTopApiFormat(String topApiFormat) {
        this.topApiFormat = topApiFormat;
    }

    /**
     * API版本号
     */
    private String apiVersion;

    public TaobaoHashMap getQueryParams() {
        return this.queryParams;
    }

    public void addQueryParam(String key, String value) {
        if (this.queryParams == null) {
            this.queryParams = new TaobaoHashMap();
        }
        this.queryParams.put(key, value);
    }

    public String getApiMethodName() {
        return apiMethodName;
    }

    public void setApiMethodName(String apiMethodName) {
        this.apiMethodName = apiMethodName;
    }

    public String getTargetAppKey() {
        return targetAppKey;
    }

    public void setTargetAppKey(String targetAppKey) {
        this.targetAppKey = targetAppKey;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, String> getHeaderMap() {
        if (this.headerMap == null) {
            this.headerMap = new TaobaoHashMap();
        }
        return this.headerMap;
    }

    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    protected Class<QimenCloudResponse> getResponseClass() {
        return QimenCloudResponse.class;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}
