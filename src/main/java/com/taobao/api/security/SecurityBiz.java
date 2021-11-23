package com.taobao.api.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.api.SecretException;
import com.taobao.api.internal.util.Base64;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * 
 * @author changchun
 * @since 2016年2月26日 下午5:15:17
 */
public class SecurityBiz implements SecurityConstants {

    private static final Map<String, Character> SEPARATOR_CHAR_MAP = new HashMap<String, Character>();
    private static final Map<String, String> SEPARATOR_MAP = new HashMap<String, String>();

    static {
        SEPARATOR_CHAR_MAP.put(NICK, SIMPLE_CHAR);
        SEPARATOR_CHAR_MAP.put(RECEIVER_NAME, SIMPLE_CHAR);
        SEPARATOR_CHAR_MAP.put(NORMAL, NORMAL_SEPARATOR_CHAR);
        SEPARATOR_CHAR_MAP.put(PHONE, PHONE_SEPARATOR_CHAR);
        SEPARATOR_CHAR_MAP.put(SIMPLE, SIMPLE_CHAR);
        SEPARATOR_CHAR_MAP.put(SEARCH, SIMPLE_CHAR);
    }

    static {
        SEPARATOR_MAP.put(NICK, SIMPLE_SEPARATOR);
        SEPARATOR_MAP.put(RECEIVER_NAME, SIMPLE_SEPARATOR);
        SEPARATOR_MAP.put(NORMAL, NORMAL_SEPARATOR);
        SEPARATOR_MAP.put(PHONE, PHONE_SEPARATOR);
        SEPARATOR_MAP.put(SIMPLE, SIMPLE_SEPARATOR);
        SEPARATOR_MAP.put(SEARCH, SIMPLE_SEPARATOR);
    }

    public static Map<String, Character> getSeparatorCharMap() {
        return SEPARATOR_CHAR_MAP;
    }

    public static Map<String, String> getSeparatorMap() {
        return SEPARATOR_MAP;
    }

    /**
     * 判断是否密文数据
     * 
     * @param data
     * 
     * @param type
     *            加密字段类型(例如：simple\phone)
     * @return
     * @throws SecretException
     */
    public static boolean isEncryptData(String data, String type) throws SecretException {
        if (StringUtils.isEmpty(data) || data.length() < 4) {
            return false;
        }

        Character charValue = SEPARATOR_CHAR_MAP.get(type);
        if (charValue == null) {
            throw new SecretException("type error");
        }
        char separatorChar = charValue.charValue();
        if (!(data.charAt(0) == separatorChar && data.charAt(data.length() - 1) == separatorChar)) {
            return false;
        }

        if (separatorChar == PHONE_SEPARATOR_CHAR) {
            // 拆分元素
            String[] dataArray = StringUtils.split(data, charValue);
            if (dataArray.length != 3) {
                return false;
            }
            if (data.charAt(data.length() - 2) == separatorChar) {
                return checkEncryptData(dataArray);
            } else {
                String version = dataArray[dataArray.length - 1];
                if (StringUtils.isNumeric(version)) {
                    boolean isBase64Value = Base64.isBase64Value(dataArray[dataArray.length - 2]);
                    if (isBase64Value) {
                        return true;
                    }
                    return false;
                }
            }
        } else {
            // 拆分元素
            String[] dataArray = StringUtils.split(data, charValue);
            if (data.charAt(data.length() - 2) == separatorChar) {
                if (dataArray.length != 3) {
                    return false;
                }
                return checkEncryptData(dataArray);
            } else {
                if (dataArray.length != 2) {
                    return false;
                }
                return checkEncryptData(dataArray);
            }
        }

        return false;
    }

    /**
     * 判断是否密文数据
     * 
     * @param dataArray
     * @return
     */
    private static boolean checkEncryptData(String[] dataArray) {
        String version = dataArray[dataArray.length - 1];
        if (StringUtils.isNumeric(version)) {
            boolean isBase64Value = Base64.isBase64Value(dataArray[0]);
            if (isBase64Value) {
                if (dataArray.length == 3) {
                    isBase64Value = Base64.isBase64Value(dataArray[1]);
                    if (isBase64Value) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 加密手机尾号后8位
     * 
     * @param data
     * @param separator
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String encryptPhone(String data, String separator, SecretContext secretContext) throws SecretException {
        if (data.length() < 11) {
            return data;
        }
        String prefixNumber = data.substring(0, data.length() - 8);
        // 取后8位置
        String last8Number = data.substring(data.length() - 8);

        return separator + prefixNumber + separator + TaobaoUtils.aesEncrypt(last8Number, secretContext.getSecret()) + separator
                + secretContext.getSecretVersion() + separator;
    }

    /**
     * 加密手机后4位转H-MAC
     * 
     * @param data
     * @param separator
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String encryptPhoneIndex(String data, String separator, SecretContext secretContext) throws SecretException {
        if (data.length() < 11) {
            return data;
        }
        // 取后4位
        String last4Number = data.substring(data.length() - 4);
        return separator + TaobaoUtils.hmacMD5EncryptToBase64(last4Number, secretContext.getSecret()) + separator
                + TaobaoUtils.aesEncrypt(data, secretContext.getSecret()) + separator + secretContext.getSecretVersion()
                + separator + separator;
    }

    /**
     * 手机号后4位H-MAC值
     * 
     * @param data
     * @param separator
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String searchPhoneIndex(String data, String separator, SecretContext secretContext) throws SecretException {
        if (data.length() != 4) {
            throw new SecretException("phoneNumber error");
        }
        return separator + TaobaoUtils.hmacMD5EncryptToBase64(data, secretContext.getSecret()) + separator;
    }

    /**
     * 生成密文数据
     * 
     * @param data
     * @param separator
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String encryptNormal(String data, String separator, SecretContext secretContext) throws SecretException {
        return separator + TaobaoUtils.aesEncrypt(data, secretContext.getSecret()) + separator + secretContext.getSecretVersion()
                + separator;
    }

    /**
     * 滑窗加密
     * 
     * @param data
     * @param compressLen
     * @param slideSize
     * @param separator
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String encryptNormalIndex(String data, int compressLen, int slideSize, String separator,
            SecretContext secretContext) throws SecretException {
        List<String> slideList = TaobaoUtils.getSlideWindows(data, slideSize);
        StringBuilder builder = new StringBuilder();
        for (String slide : slideList) {
            builder.append(TaobaoUtils.hmacMD5EncryptToBase64(slide, secretContext.getSecret(), compressLen));
        }

        return separator + TaobaoUtils.aesEncrypt(data, secretContext.getSecret()) + separator + builder.toString() + separator
                + secretContext.getSecretVersion() + separator + separator;
    }

    /**
     * 密文检索
     * 
     * @param data
     * @param compressLen
     * @param slideSize
     * @param secretContext
     * @return
     * @throws SecretException
     */
    public static String searchNormalIndex(String data, int compressLen, int slideSize, SecretContext secretContext)
            throws SecretException {
        List<String> slideList = TaobaoUtils.getSlideWindows(data, slideSize);
        StringBuilder builder = new StringBuilder();
        for (String slide : slideList) {
            builder.append(TaobaoUtils.hmacMD5EncryptToBase64(slide, secretContext.getSecret(), compressLen));
        }

        return builder.toString();
    }

    /**
     * 获取秘钥版本、加密原始数据
     * 
     * @param data
     * @param separatorChar
     * 
     * @return
     */
    public static SecretData getSecretData(String data, char separatorChar) {
        SecretData secretData = null;
        if (PHONE_SEPARATOR_CHAR == separatorChar) {
            String[] dataArray = StringUtils.split(data, separatorChar);
            if (dataArray.length != 3) {
                return null;
            }

            String version = dataArray[2];
            if (StringUtils.isNumeric(version)) {
                secretData = new SecretData();
                secretData.setOriginalValue(dataArray[0]);// 手机号码前缀
                secretData.setOriginalBase64Value(dataArray[1]);
                secretData.setSecretVersion(Long.valueOf(version));
            }
        } else {
            String[] dataArray = StringUtils.split(data, separatorChar);
            if (dataArray.length != 2) {
                return null;
            }

            String version = dataArray[1];
            if (StringUtils.isNumeric(version)) {
                secretData = new SecretData();
                secretData.setOriginalBase64Value(dataArray[0]);
                secretData.setSecretVersion(Long.valueOf(version));
            }
        }
        return secretData;
    }

    /**
     * 获取秘钥版本、加密原始数据（支持密文检索）
     * 
     * @param data
     * @param separatorChar
     * 
     * @return
     */
    public static SecretData getIndexSecretData(String data, char separatorChar) {
        SecretData secretData = null;
        if (PHONE_SEPARATOR_CHAR == separatorChar) {
            String[] dataArray = StringUtils.split(data, separatorChar);
            if (dataArray.length != 3) {
                return null;
            }

            String version = dataArray[2];
            if (StringUtils.isNumeric(version)) {
                secretData = new SecretData();
                secretData.setOriginalValue(dataArray[0]);// H-MAC(手机号码后4位)
                secretData.setOriginalBase64Value(dataArray[1]);
                secretData.setSecretVersion(Long.valueOf(version));
            }
        } else {
            String[] dataArray = StringUtils.split(data, separatorChar);
            if (dataArray.length != 3) {
                return null;
            }

            String version = dataArray[2];
            if (StringUtils.isNumeric(version)) {
                secretData = new SecretData();
                secretData.setOriginalBase64Value(dataArray[0]);
                secretData.setOriginalValue(dataArray[1]);// H-MAC value
                secretData.setSecretVersion(Long.valueOf(version));
            }
        }
        if (secretData == null) {
            return secretData;
        }

        secretData.setSearch(true);
        return secretData;
    }
}
