package com.taobao.api;

/**
 * 公用常量类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class Constants {

	/** TOP协议入参共享参数 **/
	public static final String APP_KEY = "app_key";
	public static final String FORMAT = "format";
	public static final String METHOD = "method";
	public static final String TIMESTAMP = "timestamp";
	public static final String VERSION = "v";
	public static final String SIGN = "sign";
	public static final String SIGN_METHOD = "sign_method";
	public static final String PARTNER_ID = "partner_id";
	public static final String SESSION = "session";
	public static final String SIMPLIFY = "simplify";
	public static final String TARGET_APP_KEY = "target_app_key";

	/** TOP协议出参共享参数 */
	public static final String ERROR_RESPONSE = "error_response";
	public static final String ERROR_CODE = "code";
	public static final String ERROR_MSG = "msg";
	public static final String ERROR_SUB_CODE = "sub_code";
	public static final String ERROR_SUB_MSG = "sub_msg";

	/** 奇门协议共享参数 */
	public static final String QIMEN_CLOUD_ERROR_RESPONSE = "response";
	public static final String QM_ROOT_TAG = "request";
	public static final String QM_CUSTOMER_ID = "customerId";
	public static final String QM_CONTENT_TYPE = "text/xml;charset=utf-8";
	public static final String QM_CONTENT_TYPE_JSON = "application/json;charset=utf-8";

	/** TOP默认时间格式 **/
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/** TOP Date默认时区 **/
	public static final String DATE_TIMEZONE = "GMT+8";

	/** UTF-8字符集 **/
	public static final String CHARSET_UTF8 = "UTF-8";

	/** HTTP请求相关 **/
	public static final String METHOD_POST = "POST";
	public static final String METHOD_GET = "GET";
	public static final String CTYPE_FORM_DATA = "application/x-www-form-urlencoded";
	public static final String CTYPE_FILE_UPLOAD = "multipart/form-data";
	public static final String CTYPE_TEXT_XML = "text/xml";
	public static final String CTYPE_APPLICATION_XML = "application/xml";
	public static final String CTYPE_TEXT_PLAIN = "text/plain";
	public static final String CTYPE_APP_JSON = "application/json";

	/** GBK字符集 **/
	public static final String CHARSET_GBK = "GBK";

	/** TOP JSON 应格式 */
	public static final String FORMAT_JSON = "json";
	/** TOP XML 应格式 */
	public static final String FORMAT_XML = "xml";

	/** TOP JSON 新格式 */
	public static final String FORMAT_JSON2 = "json2";
	/** TOP XML 新格式 */
	public static final String FORMAT_XML2 = "xml2";

	/** MD5签名方式 */
	public static final String SIGN_METHOD_MD5 = "md5";
	/** HMAC签名方式 */
	public static final String SIGN_METHOD_HMAC = "hmac";
	/** HMAC-SHA256签名方式 */
	public static final String SIGN_METHOD_HMAC_SHA256 = "hmac-sha256";

	/** SDK版本号 */
	public static final String SDK_VERSION = "top-sdk-java-20200706";

	/** 异步多活SDK版本号 */
	public static final String SDK_VERSION_CLUSTER = "top-sdk-java-cluster-20200706";
	
	/** httpdns SDK版本号 */
    public static final String SDK_VERSION_HTTPDNS = "top-sdk-java-httpdns-20200706";
    
    /** httpdns SDK版本号 */
    public static final String QIMEN_SDK_VERSION_HTTPDNS = "top-qimen-sdk-java-httpdns";

	/** 响应编码 */
	public static final String ACCEPT_ENCODING = "Accept-Encoding";
	public static final String CONTENT_ENCODING = "Content-Encoding";
	public static final String CONTENT_ENCODING_GZIP = "gzip";

	/** 默认媒体类型 **/
	public static final String MIME_TYPE_DEFAULT = "application/octet-stream";

	/** 默认流式读取缓冲区大小 **/
	public static final int READ_BUFFER_SIZE = 1024 * 4;
	
	
	public static final String  TOP_HTTP_DNS_HOST  = "TOP_HTTP_DNS_HOST";

	/** API网关请求content type **/
	public static final String CONTENT_TYPE_XML = "xml";
	public static final String CONTENT_TYPE_JSON = "json";
	public static final String CONTENT_TYPE_FORM = "form";

	public static final String RESPONSE_TYPE_TOP = "top";
	public static final String RESPONSE_TYPE_QIMEN = "qimen1";
	public static final String RESPONSE_TYPE_QIMEN2 = "qimen2";
	public static final String RESPONSE_TYPE_DINGTALK_OAPI = "dingtalk";

	/** 钉钉调用方式 TOP标准格式，form-data */
	public static final String CALL_TYPE_TOP = "top";

	/** 钉钉调用方式 OAPI兼容格式，application/json */
	public static final String CALL_TYPE_OAPI = "oapi";
}
