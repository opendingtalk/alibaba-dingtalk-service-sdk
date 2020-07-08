package com.taobao.api.internal.dto;

import com.taobao.api.TaobaoRequest;

import java.io.Serializable;
import java.util.Map;

/**
 * «Î«Û¥´ ‰¿‡
 */
public class RequestDTO implements Serializable {

    private String apiMethodName;

    private String contentType;

    private String apiCallType;

    private String format;

    private String apiVersion;

    private Map<String, String> textParams;

    private Map<String, String> headerMap;

    private Long timestamp;

    private String targetAppKey;

    private String body;

    private Object requestBase;

    public String getApiMethodName() {
        return apiMethodName;
    }

    public void setApiMethodName(String apiMethodName) {
        this.apiMethodName = apiMethodName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Map<String, String> getTextParams() {
        return textParams;
    }

    public void setTextParams(Map<String, String> textParams) {
        this.textParams = textParams;
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTargetAppKey() {
        return targetAppKey;
    }

    public void setTargetAppKey(String targetAppKey) {
        this.targetAppKey = targetAppKey;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Object getRequestBase() {
        return requestBase;
    }

    public void setRequestBase(Object requestBase) {
        this.requestBase = requestBase;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getApiCallType() {
        return apiCallType;
    }

    public void setApiCallType(String apiCallType) {
        this.apiCallType = apiCallType;
    }
}
