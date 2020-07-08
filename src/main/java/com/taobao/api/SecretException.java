package com.taobao.api;

/**
 * 秘钥异常
 * 
 * @author changchun
 * @since 2016年3月3日 下午3:20:18
 */
public class SecretException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String errCode;
    private String errMsg;
    private String subErrCode;
    private String subErrMsg;

    public SecretException() {
        super();
    }

    public SecretException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecretException(String message) {
        super(message);
    }

    public SecretException(Throwable cause) {
        super(cause);
    }

    public SecretException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public SecretException(String errCode, String errMsg, String subErrCode, String subErrMsg) {
        super(errCode + ":" + errMsg + ":" + subErrCode + ":" + subErrMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.subErrCode = subErrCode;
        this.subErrMsg = subErrMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getSubErrCode() {
        return subErrCode;
    }

    public void setSubErrCode(String subErrCode) {
        this.subErrCode = subErrCode;
    }

    public String getSubErrMsg() {
        return subErrMsg;
    }

    public void setSubErrMsg(String subErrMsg) {
        this.subErrMsg = subErrMsg;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}