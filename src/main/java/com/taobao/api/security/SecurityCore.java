package com.taobao.api.security;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.internal.report.ApiReporter;
import com.taobao.api.internal.util.Base64;
import com.taobao.api.internal.util.LruHashMap;
import com.taobao.api.internal.util.NamedThreadFactory;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoUtils;

/**
 * 加、解密核心类
 * 
 * @author changchun
 * @since 2016年2月26日 下午5:15:17
 */
public class SecurityCore implements SecurityConstants {

    private static final Log log = LogFactory.getLog(SecurityCore.class);
    private String randomNum;// 伪随机码
    // 缓存用户单独分配秘钥
    private static final LruHashMap<String, SecretContext> appUserSecretCache = new LruHashMap<String, SecretContext>(16,
            65536 * 2);
    private static final Map<String, SecretContext> appSecretCache = new ConcurrentHashMap<String, SecretContext>();
    // 异步更新秘钥
    private static ExecutorService asynUpdateSecret;
    private DefaultTaobaoClient taobaoClient;
    private static final ConcurrentHashMap<String, Object> asynQueueKey = new ConcurrentHashMap<String, Object>();
    private static final Object emptyValue = new Object();
    private static AtomicBoolean initThreadPoolAtomic = new AtomicBoolean(false);
    private boolean streetest;
    private static final ConcurrentHashMap<String, Map<String, Object>> allAppConfig = new ConcurrentHashMap<String, Map<String, Object>>();

    public static void shutdown() {
        if (asynUpdateSecret != null) {
            asynUpdateSecret.shutdown();
            ApiReporter.shutdown();
            initThreadPoolAtomic = new AtomicBoolean(false);
        }
    }
    
    public static LruHashMap<String, SecretContext> getAppUserSecretCache() {
        return appUserSecretCache;
    }

    /**
     * 判断密文是否支持检索
     * 
     * @param key
     * @param version
     * @return
     */
    public boolean isIndexEncrypt(String key, Long version) {
        if (version != null && version < 0) {
            key = PREVIOUS + key;
        } else {
            key = CURRENT + key;
        }
        Map<String, Object> appConfig = getAppConfig();
        return appConfig != null && INDEX_ENCRYPT_TYPE.equals(appConfig.get(key));
    }

    /**
     * 获取压缩长度
     * 
     * @return
     */
    public int getCompressLen() {
        Map<String, Object> appConfig = getAppConfig();
        if (appConfig != null) {
            String compressLen = (String) appConfig.get(ENCRYPT_INDEX_COMPRESS_LEN);
            if (compressLen != null) {
                return Integer.parseInt(compressLen);
            }
        }
        return DEFAULT_INDEX_ENCRYPT_COMPRESS_LEN;
    }

    /**
     * 获取滑动窗口大小
     * 
     * @return
     */
    public int getSlideSize() {
        Map<String, Object> appConfig = getAppConfig();
        if (appConfig != null) {
            String encryptSlideSize = (String) appConfig.get(ENCRYPT_SLIDE_SIZE);
            if (encryptSlideSize != null) {
                return Integer.parseInt(encryptSlideSize);
            }
        }
        return DEFAULT_ENCRYPT_SLIDE_SIZE;
    }

    private Map<String, Object> getAppConfig() {
        Map<String, Object> appConfig = allAppConfig.get(taobaoClient.getAppKey());
        return appConfig;
    }

    public SecurityCore(DefaultTaobaoClient taobaoClient, String randomNum, int corePoolSize, int maxPoolSize, int maxQueue,
            boolean streetest) {
        this.streetest = streetest;
        this.taobaoClient = taobaoClient;
        this.randomNum = randomNum;
        init(corePoolSize, maxPoolSize, maxQueue);

        // 初始化报表
        ApiReporter apiReporter = new ApiReporter();
        apiReporter.initSecret(taobaoClient);
    }

    /**
     * 初始化线程池
     * 
     * @param corePoolSize
     * @param maxPoolSize
     * @param maxQueue
     */
    private void init(int corePoolSize, int maxPoolSize, int maxQueue) {
        if (corePoolSize <= 0 || maxPoolSize <= 0 || maxQueue <= 0 || corePoolSize > maxPoolSize) {
            throw new IllegalArgumentException("param error");
        }
        if (initThreadPoolAtomic.compareAndSet(false, true)) {
            asynUpdateSecret = new ThreadPoolExecutor(corePoolSize, maxPoolSize, 0L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>(maxQueue), new NamedThreadFactory("taobao sdk asyn update secret", true),
                    new AbortPolicy());
        }
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    /**
     * 
     * @param session
     * @param secretVersion
     * @return
     * @throws ApiException
     */
    public SecretContext getSecret(String session, Long secretVersion) throws ApiException {
        SecretContext secretContext = getSecret(session, generateSecretKey(session, secretVersion));
        if (secretContext != null) {
            if (secretContext.isValid()) {
                return secretContext;
            }

            if (secretContext.isMaxValid()) {
                // 异步更新秘钥
                asynUpdateSecret(session, secretVersion);
                return secretContext;
            }
            String cacheKey = generateSecretKey(session, secretVersion);
            if (session != null) {
                appUserSecretCache.remove(cacheKey);
            } else {
                appSecretCache.remove(cacheKey);
            }
            // 同步调用获取秘钥
            return callSecretApi(session, secretVersion);
        } else {
            // 同步调用获取秘钥
            return callSecretApi(session, secretVersion);
        }
    }

    /**
     * @param session
     * @param secretVersion
     * @return
     */
    private String generateSecretKey(String session, Long secretVersion) {
        if (session == null) {
            return this.taobaoClient.getAppKey();
        }
        if (secretVersion == null) {
            return session;
        }

        return session + "_" + secretVersion;
    }

    /**
     * 从本地获取秘钥信息
     * 
     * @param session
     * @param cacheKey
     * @return
     */
    private SecretContext getSecret(String session, String cacheKey) {
        SecretContext secretContext;
        if (session != null) {
            secretContext = appUserSecretCache.get(cacheKey);
        } else {
            secretContext = appSecretCache.get(cacheKey);
        }
        return secretContext;
    }

    /**
     * 调用获取秘钥api
     * 
     * @param session
     * @param secretVersion
     */
    @SuppressWarnings("unchecked")
    private SecretContext callSecretApi(String session, Long secretVersion) throws ApiException {
        // 获取伪随机码
        if (StringUtils.isEmpty(randomNum)) {
            throw new IllegalArgumentException("randomNum can`t be empty");
        }

        TopSecretGetRequest request = new TopSecretGetRequest();
        request.setRandomNum(randomNum);
        request.setSecretVersion(secretVersion);
        if (streetest) {
            request.putOtherTextParam("tb_eagleeyex_t", "1");
        }

        TopSecretGetResponse response;
        if (session != null && session.startsWith(UNDERLINE)) {
            String customerUserId = session.substring(1);
            if (!StringUtils.isDigits(customerUserId)) {
                throw new IllegalArgumentException("session invalid");
            }
            request.setCustomerUserId(Long.valueOf(customerUserId));
            response = taobaoClient.execute(request, null);
        } else {
            response = taobaoClient.execute(request, session);
        }
        if (response.isSuccess()) {
            Map<String, Object> appConfig = null;
            if (!StringUtils.isEmpty(response.getAppConfig())) {
                appConfig = (Map<String, Object>) TaobaoUtils.jsonToObject(response.getAppConfig());
                allAppConfig.put(taobaoClient.getAppKey(), appConfig);
            }
            SecretContext secretContext = new SecretContext();
            if (response.getSecret() != null) {
                long currentTime = System.currentTimeMillis();
                secretContext.setInvalidTime(currentTime + (response.getInterval() * 1000));
                secretContext.setMaxInvalidTime(currentTime + (response.getMaxInterval() * 1000));
                secretContext.setSecret(Base64.decode(response.getSecret()));
                secretContext.setSecretVersion(response.getSecretVersion());
            } else {
                if (appConfig != null && BETA_STATUS.equals(appConfig.get(PUBLISH_STATUS))) {
                    // 设置空缓存
                    setNullCache(secretContext);
                }
            }
            String cacheKey = generateSecretKey(session, secretVersion);
            if (session != null) {
                appUserSecretCache.put(cacheKey, secretContext);
            } else {
                appSecretCache.put(cacheKey, secretContext);
            }
            return secretContext;
        } else {
            // 查找不到历史秘钥
            if ("20005".equals(response.getSubCode())) {
                SecretContext secretContext = new SecretContext();
                // 设置空缓存
                setNullCache(secretContext);
                String cacheKey = generateSecretKey(session, secretVersion);
                if (session != null) {
                    appUserSecretCache.put(cacheKey, secretContext);
                } else {
                    appSecretCache.put(cacheKey, secretContext);
                }
                return secretContext;
            }
            throw new ApiException(response.getErrorCode(), response.getMsg(), response.getSubCode(), response.getSubMsg());
        }
    }

    /**
     * 设置空缓存
     * 
     * @param secretContext
     */
    private void setNullCache(SecretContext secretContext) {
        long currentTime = System.currentTimeMillis();
        secretContext.setInvalidTime(currentTime + (DEFAULT_INTERVAL * 1000));
        secretContext.setMaxInvalidTime(currentTime + (DEFAULT_MAX_INTERVAL * 1000));
    }

    /**
     * 异步更新秘钥
     * 
     * @param session
     * @param secretVersion
     */
    private void asynUpdateSecret(final String session, final Long secretVersion) {
        final String cacheKey = generateSecretKey(session, secretVersion);

        try {
            synchronized (SecurityCore.class) {
                // 不需要重复提交秘钥请求
                if (asynQueueKey.containsKey(cacheKey)) {
                    return;
                }

                SecretContext secretContext = getSecret(session, generateSecretKey(session, secretVersion));
                if (secretContext != null && secretContext.isValid()) {
                    return;
                }
                asynQueueKey.put(cacheKey, emptyValue);
            }

            asynUpdateSecret.submit(new Runnable() {
                public void run() {
                    try {
                        callSecretApi(session, secretVersion);
                    } catch (Exception e) {
                        if (log.isErrorEnabled()) {
                            log.error("asyn update secret error", e);
                        }
                    } finally {
                        asynQueueKey.remove(cacheKey);
                    }
                }
            });

        } catch (RuntimeException e) {
            // 可能会抛出RejectedExecutionException 、NullPointerException等异常
            asynQueueKey.remove(cacheKey);
            throw e;
        }
    }

}
