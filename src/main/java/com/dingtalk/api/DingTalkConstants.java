package com.dingtalk.api;

/**
 *
 */
public abstract class DingTalkConstants {

    /** 调用方式 TOP标准格式，form-data */
    public static final String CALL_TYPE_TOP = "top";

    /** 调用方式 OAPI兼容格式，application/json */
    public static final String CALL_TYPE_OAPI = "oapi";

    /** token key */
    public static final String ACCESS_TOKEN = "access_token";

    /** http方法，GET方式 */
    public static final String HTTP_METHOD_GET = "GET";

    /** http方法，POST方式 */
    public static final String HTTP_METHOD_POST = "POST";
}
