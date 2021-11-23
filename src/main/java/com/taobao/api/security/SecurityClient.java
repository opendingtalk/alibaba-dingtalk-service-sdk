package com.taobao.api.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.SecretException;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * 加、解密客户端(单例使用，不要初始化多个)
 * 
 * @author changchun
 * @since 2016年2月26日 下午5:15:17
 */
public class SecurityClient implements SecurityConstants {

    // 秘钥管理核心类
    private SecurityCore secretCore;
    private SecurityCounter securityCounter;

    /**
     * 
     * @param defaultTaobaoClient
     *            serverUrl必须是https协议
     * @param randomNum
     *            伪随机码
     */
    public SecurityClient(DefaultTaobaoClient taobaoClient, String randomNum) {
        this(taobaoClient, randomNum, false);
    }
    
    /**
     * 
     * @param defaultTaobaoClient
     *            serverUrl必须是https协议
     * @param randomNum
     *            伪随机码
     * @param streetest
     *            是否全链路压测
     */
    public SecurityClient(DefaultTaobaoClient taobaoClient, String randomNum, boolean streetest) {
        this(taobaoClient, randomNum, 2, 8, Integer.MAX_VALUE, streetest);
    }

    /**
     * 
     * @param taobaoClient
     *            serverUrl必须是https协议
     * @param randomNum
     *            伪随机码
     * @param corePoolSize
     *            核心线程数
     * @param maxPoolSize
     *            最大线程数
     * @param maxQueue
     *            线程池最大队列
     * @param streetest
     *            是否全链路压测
     */
    public SecurityClient(DefaultTaobaoClient taobaoClient, String randomNum, int corePoolSize, int maxPoolSize, int maxQueue,
            boolean streetest) {
        securityCounter = new SecurityCounter(taobaoClient.getAppKey());
        secretCore = new SecurityCore(taobaoClient, randomNum, corePoolSize, maxPoolSize, maxQueue,streetest);
    }

    /**
     * 初始化秘钥（如果半小时内会调用加、解密方法，建议先初始化秘钥）。所有用户共用秘钥
     * 
     * @throws ApiException
     */
    public void initSecret() throws ApiException {
        secretCore.getSecret(null, null);
    }

    public void setRandomNum(String randomNum) {
        this.secretCore.setRandomNum(randomNum);
    }

    /**
     * 初始化秘钥（如果半小时内会调用加、解密方法，建议先初始化秘钥）。每个用户单独分配秘钥
     * 
     * @param session
     * @throws ApiException
     */
    public void initSecret(String session) throws ApiException {
        secretCore.getSecret(session, null);
    }

    /**
     * 批量解密（所有用户共用秘钥）
     * 
     * @see #decrypt(List, String, String)
     * @param dataList
     * @param type
     * @throws SecretException
     */
    public Map<String, String> decrypt(List<String> dataList, String type) throws SecretException {
        return decrypt(dataList, type, null);
    }

    /**
     * 批量解密（每个用户单独分配秘钥）
     * 
     * @see #decrypt(String, String, String)
     * @param dataList
     * @param type
     * @param session
     * @return key=密文数据，value=明文数据
     * @throws SecretException
     */
    public Map<String, String> decrypt(List<String> dataList, String type, String session) throws SecretException {
        if (dataList == null || dataList.isEmpty()) {
            throw new SecretException("dataList can`t be empty");
        }
        Map<String, String> resultMap = new HashMap<String, String>();
        for (String data : dataList) {
            if (!resultMap.containsKey(data)) {
                String decryptValue = decrypt(data, type, session);
                resultMap.put(data, decryptValue);
            }
        }
        return resultMap;
    }

    /**
     * 解密（所有用户共用秘钥）
     * 
     * @see #decrypt(String, String, String)
     * 
     * @param data
     * @param type
     * @return
     * @throws SecretException
     */
    public String decrypt(String data, String type) throws SecretException {
        return decrypt(data, type, null);
    }

    /**
     * 解密（每个用户单独分配秘钥）
     * 
     * @param data
     *            密文数据 手机号码格式：$手机号码前3位明文$base64(encrypt(phone后8位))$111$
     *            simple格式：~base64(encrypt(nick))~111~
     * @param type
     *            解密字段类型(例如：simple\phone)
     * @param session
     *            用户身份,用户级加密必填
     * @return
     */
    public String decrypt(String data, String type, String session) throws SecretException {
        if (StringUtils.isEmpty(data) || data.length() < 4) {
            return data;
        }

        // 获取分隔符
        Character charValue = SecurityBiz.getSeparatorCharMap().get(type);
        if (charValue == null) {
            throw new SecretException("type error");
        }

        // 校验
        char separator = charValue.charValue();
        if (!(data.charAt(0) == separator && data.charAt(data.length() - 1) == separator)) {
            return data;
        }
        SecretData secretDataDO = null;
        if (data.charAt(data.length() - 2) == separator) {
            secretDataDO = SecurityBiz.getIndexSecretData(data, separator);
        } else {
            secretDataDO = SecurityBiz.getSecretData(data, separator);
        }

        // 非法密文
        if (secretDataDO == null) {
            return data;
        }
        try {
            // 如果密文数据的版本号小于0代表公共秘钥
            if (secretDataDO.getSecretVersion() < 0) {
                secretDataDO.setSecretVersion(Math.abs(secretDataDO.getSecretVersion()));
                session = null;
            }
            securityCounter.addDecryptCount(type, session);// 计数器

            SecretContext secretContextDO = secretCore.getSecret(session, secretDataDO.getSecretVersion());
            String decryptValue = TaobaoUtils.aesDecrypt(secretDataDO.getOriginalBase64Value(), secretContextDO.getSecret());
            if (PHONE.equals(type) && !secretDataDO.isSearch()) {
                // 加上手机号前3位，手机号只加密了后8位
                return secretDataDO.getOriginalValue() + decryptValue;
            }
            return decryptValue;
        } catch (ApiException e) {
            throw new SecretException("get secret error", e);
        }
    }

    /**
     * 判断list元素是否全部为密文数据
     * 
     * @see #isEncryptData(String, String)
     * 
     * @param dataList
     * 
     * @param type
     *            加密字段类型(例如：simple\phone)
     * @return
     * @throws SecretException
     */
    public static boolean isEncryptData(List<String> dataList, String type) throws SecretException {
        if (dataList == null || dataList.isEmpty()) {
            return false;
        }
        boolean result = false;
        for (String data : dataList) {
            result = isEncryptData(data, type);
            if (!result) {
                return false;
            }
        }
        return result;
    }
    
    /**
     * 判断list元素是否存在密文数据。只要有一个是密文，则返回true
     * 
     * @param dataList
     * 
     * @param type
     *            加密字段类型(例如：simple\phone)
     * @return
     * @throws SecretException
     */
    public static boolean isPartEncryptData(List<String> dataList, String type) throws SecretException {
        if (dataList == null || dataList.isEmpty()) {
            return false;
        }
        boolean result = false;
        for (String data : dataList) {
            result = isEncryptData(data, type);
            if (result) {
                return true;
            }
        }
        return result;
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
        return SecurityBiz.isEncryptData(data, type);
    }
    
    /**
     * 加密（所有用户共用秘钥）
     * 
     * @see #encrypt(String, String, String, Long)
     * 
     * @param data
     * @param type
     * @return
     * @throws SecretException
     */
    public String encrypt(String data, String type) throws SecretException {
        return encrypt(data, type, null, null);
    }

    /**
     * 用老秘钥加密，只在秘钥升级时使用（所有用户共用秘钥）
     * 
     * @see #encrypt(String, String, String, Long)
     * 
     * @param data
     * @param type
     * @return
     * @throws SecretException
     */
    public String encryptPrevious(String data, String type) throws SecretException {
        return encrypt(data, type, null, -1L);
    }

    /**
     * 加密（每个用户单独分配秘钥）
     * 
     * @see #encrypt(String, String, String, Long)
     * @return
     */
    public String encrypt(String data, String type, String session) throws SecretException {
        return encrypt(data, type, session, null);
    }

    /**
     * 用老秘钥加密，只在秘钥升级时使用（每个用户单独分配秘钥）
     * 
     * @see #encrypt(String, String, String, Long)
     * @return
     */
    public String encryptPrevious(String data, String type, String session) throws SecretException {
        return encrypt(data, type, session, -1L);
    }

    /**
     * 密文检索（所有用户共用秘钥）
     * 
     * @see #search(String, String, String, Long)
     * @return
     */
    public String search(String data, String type) throws SecretException {
        return search(data, type, null, null);
    }

    /**
     * 密文检索,在秘钥升级场景下兼容查询（所有用户共用秘钥）
     * 
     * @see #search(String, String, String, Long)
     * @return
     */
    public String searchPrevious(String data, String type) throws SecretException {
        return search(data, type, null, -1L);
    }

    /**
     * 密文检索（每个用户单独分配秘钥）
     * 
     * @see #search(String, String, String, Long)
     * @return
     */
    public String search(String data, String type, String session) throws SecretException {
        return search(data, type, session, null);
    }

    /**
     * 密文检索,在秘钥升级场景下兼容查询（每个用户单独分配秘钥）
     * 
     * @see #search(String, String, String, Long)
     * @return
     */
    public String searchPrevious(String data, String type, String session) throws SecretException {
        return search(data, type, session, -1L);
    }

    /**
     * 密文检索。 手机号码格式：$base64(H-MAC(phone后4位))$ simple格式：base64(H-MAC(滑窗))
     * 
     * @param data
     *            明文数据
     * @param type
     *            加密字段类型(例如：simple\phone)
     * @param session
     *            用户身份,用户级加密必填
     * @param version
     *            秘钥历史版本
     * @return
     */
    private String search(String data, String type, String session, Long version) throws SecretException {
        if (StringUtils.isEmpty(data)) {
            return data;
        }
        try {
            SecretContext secretContext = secretCore.getSecret(session, version);
            if (secretContext == null) {
                throw new SecretException("secretKey is null");
            }
            if (secretContext.getSecret() == null) {
                return data;
            }
            String separator = SecurityBiz.getSeparatorMap().get(type);
            if (separator == null) {
                throw new SecretException("type error");
            }
            
            // 公共秘钥版本号用负数区分
            if (session == null) {
                SecretContext publicSecretContext = new SecretContext();
                publicSecretContext.setSecret(secretContext.getSecret());
                publicSecretContext.setSecretVersion(-secretContext.getSecretVersion());
                secretContext = publicSecretContext;
            }
            
            securityCounter.addSearchCount(type, session);// 计数器
            if (PHONE.equals(type)) {
                return SecurityBiz.searchPhoneIndex(data, separator, secretContext);
            } else {
                int compressLen = secretCore.getCompressLen();
                int slideSize = secretCore.getSlideSize();
                return SecurityBiz.searchNormalIndex(data, compressLen, slideSize, secretContext);
            }
        } catch (ApiException e) {
            throw new SecretException(e.getErrCode(), e.getErrMsg(), e.getSubErrCode(), e.getSubErrMsg());
        }
    }

    /**
     * 加密之后格式。 手机号码格式：$手机号码前3位明文$base64(encrypt(phone后8位))$111$
     * simple格式：~base64(encrypt(nick))~111~
     * 
     * @param data
     *            明文数据
     * @param type
     *            加密字段类型(例如：simple\phone)
     * @param session
     *            用户身份,用户级加密必填
     * @param version
     *            秘钥历史版本
     * @return
     */
    private String encrypt(String data, String type, String session, Long version) throws SecretException {
        if (StringUtils.isEmpty(data)) {
            return data;
        }
        try {
            SecretContext secretContext = secretCore.getSecret(session, version);
            if (secretContext == null) {
                throw new SecretException("secretKey is null");
            }
            if (secretContext.getSecret() == null) {
                return data;
            }

            String separator = SecurityBiz.getSeparatorMap().get(type);
            if (separator == null) {
                throw new SecretException("type error");
            }
            
            // 公共秘钥版本号用负数区分
            if (session == null) {
                SecretContext publicSecretContext = new SecretContext();
                publicSecretContext.setSecret(secretContext.getSecret());
                publicSecretContext.setSecretVersion(-secretContext.getSecretVersion());
                secretContext = publicSecretContext;
            }

            securityCounter.addEncryptCount(type, session);// 计数器
            boolean isEncryptIndex = secretCore.isIndexEncrypt(type, version);
            
            // 密文检索
            if (isEncryptIndex || SEARCH.equals(type)) {
                if (PHONE.equals(type)) {
                    return SecurityBiz.encryptPhoneIndex(data, separator, secretContext);
                } else {
                    int compressLen = secretCore.getCompressLen();
                    int slideSize = secretCore.getSlideSize();
                    return SecurityBiz.encryptNormalIndex(data, compressLen, slideSize, separator, secretContext);
                }
            } else {
                if (PHONE.equals(type)) {
                    return SecurityBiz.encryptPhone(data, separator, secretContext);
                } else {
                    return SecurityBiz.encryptNormal(data, separator, secretContext);
                }
            }
        } catch (ApiException e) {
            throw new SecretException(e.getErrCode(), e.getErrMsg(), e.getSubErrCode(), e.getSubErrMsg());
        }
    }

    /**
     * 批量加密（所有用户共用秘钥）
     * 
     * @see #encrypt(List, String, String)
     * @param dataList
     * @param type
     * @return
     * @throws SecretException
     */
    public Map<String, String> encrypt(List<String> dataList, String type) throws SecretException {
        return encrypt(dataList, type, null);
    }

    /**
     * 批量加密（每个用户单独分配秘钥）
     * 
     * @see #encrypt(String, String, String, Long)
     * @param dataList
     * @param type
     * @param session
     * @return key=明文数据，value=密文数据
     * @throws SecretException
     */
    public Map<String, String> encrypt(List<String> dataList, String type, String session) throws SecretException {
        if (dataList == null || dataList.isEmpty()) {
            throw new SecretException("dataList can`t be empty");
        }
        Map<String, String> resultMap = new HashMap<String, String>();
        for (String data : dataList) {
            if (!resultMap.containsKey(data)) {
                String encryptValue = encrypt(data, type, session, null);
                resultMap.put(data, encryptValue);
            }
        }
        return resultMap;
    }
    
    /**
     * 生成自定义session，提供给自主账号使用
     * 
     * @param userId
     * @return
     */
    public static String generateCustomerSession(long userId) {
        return UNDERLINE + userId;
    }
    
    @Deprecated
    public static void shutdown() {
        SecurityCore.shutdown();
    }
}
