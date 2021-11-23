package com.taobao.api.security;

/**
 * 加、解密核心类
 * 
 * @author changchun
 * @since 2016年2月26日 下午5:15:17
 */
public interface SecurityConstants {
    public static final long DEFAULT_INTERVAL = 300;// 5分钟
    public static final long DEFAULT_MAX_INTERVAL = 600;// 10分钟

    public static final String PUBLISH_STATUS = "publish_status";// 发布状态
    public static final String BETA_STATUS = "0";// BETA发布
    
    public static final String CURRENT = "current_";
    public static final String PREVIOUS = "previous_";
    public static final String CURRENT_PHONE_ENCRYPT_TYPE = "current_phone";// 当前手机加密类型（1：普通加密，2：检索加密）
    public static final String PREVIOUS_PHONE_ENCRYPT_TYPE = "previous_phone";// 上个版本手机加密类型（1：普通加密，2：检索加密）
    public static final String CURRENT_NICK_ENCRYPT_TYPE = "current_nick";// 当前nick加密类型（1：普通加密，2：检索加密）
    public static final String PREVIOUS_NICK_ENCRYPT_TYPE = "previous_nick";// 上个版本nick加密类型（1：普通加密，2：检索加密）
    public static final String CURRENT_RECEIVER_NAME_ENCRYPT_TYPE = "current_receiver_name";// 当前收货人加密类型（1：普通加密，2：检索加密）
    public static final String PREVIOUS_RECEIVER_NAME_ENCRYPT_TYPE = "previous_receiver_name";// 上个版本收货人加密类型（1：普通加密，2：检索加密）

    public static final String NORMAL_ENCRYPT_TYPE = "1";
    public static final String INDEX_ENCRYPT_TYPE = "2";
    public static final String ENCRYPT_INDEX_COMPRESS_LEN = "encrypt_index_compress_len";// 密文滑窗压缩长度
    public static final String ENCRYPT_SLIDE_SIZE = "encrypt_slide_size";// 滑动窗口大小
    public static final int DEFAULT_ENCRYPT_SLIDE_SIZE = 4;
    public static final int DEFAULT_INDEX_ENCRYPT_COMPRESS_LEN = 3;

    public static final String RECEIVER_NAME = "receiver_name";// 收货人
    public static final String NICK = "nick";// 买家nick
    public static final String PHONE = "phone";// 手机号码
    public static final String NORMAL = "normal";
    public static final String SIMPLE = "simple";// 普通模式，不带检索功能
    public static final String SEARCH = "search";// 带检索功能
    public static final char SIMPLE_CHAR = '~';
    public static final char NICK_SEPARATOR_CHAR = SIMPLE_CHAR;
    public static final String NICK_SEPARATOR = String.valueOf(SIMPLE_CHAR);
    public static final char PHONE_SEPARATOR_CHAR = '$';
    public static final String PHONE_SEPARATOR = String.valueOf(PHONE_SEPARATOR_CHAR);
    public static final char NORMAL_SEPARATOR_CHAR = (char) 0x01;
    public static final String NORMAL_SEPARATOR = String.valueOf(NORMAL_SEPARATOR_CHAR);
    public static final String SIMPLE_SEPARATOR = String.valueOf(SIMPLE_CHAR);
    
    public static final String UNDERLINE = "_";

}
