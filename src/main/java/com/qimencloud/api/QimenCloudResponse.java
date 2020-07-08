package com.qimencloud.api;

import java.io.Serializable;
import java.util.Map;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.QimenErrorField;
import com.taobao.api.internal.mapping.TopErrorField;

public class QimenCloudResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 770433235965977871L;

    @TopErrorField("code")
    @QimenErrorField("code")
    private String errorCode;

    @TopErrorField("msg")
    @QimenErrorField("message")
    private String msg;

    @TopErrorField("sub_code")
    @QimenErrorField("sub_code")
    private String subCode;

    @TopErrorField("sub_msg")
    @QimenErrorField("sub_message")
    private String subMsg;

    @QimenErrorField("flag")
    private String flag;

    @TopErrorField("request_id")
    @QimenErrorField("request_id")
    private String requestId;

    @QimenErrorField("type")
    private String qimenType;

    /**
     * API响应结果
     */
    private String body;

    private Map<String, String> headers;

    /**
     * API请求URL(不包含body)
     */
    private String requestUrl;

    /**
     * 判断响应是否成功
     */
    public boolean isSuccess() {
        return (this.errorCode == null || this.errorCode.equals("")|| this.errorCode.equals("0"))
                && (this.subCode == null || this.subCode.equals(""))
                && (this.flag == null || this.flag.equals(""));
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getQimenType() {
        return qimenType;
    }

    public void setQimenType(String qimenType) {
        this.qimenType = qimenType;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}