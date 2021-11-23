package com.taobao.api.internal.report;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.internal.util.LruHashMap;
import com.taobao.api.security.Counter;
import com.taobao.api.security.SecurityCore;
import com.taobao.api.security.SecurityCounter;

/**
 * API报表
 * 
 * @author changchun
 */
public class ApiReporter {

    private static final long SLEEP_TIME = 1000L * 60 * 1;
    private static final Log LOG = LogFactory.getLog(ApiReporter.class);
    private static final long FLUSH_INTERVAL = 1000L * 60 * 5;// 5分钟
    private static final long MIN_FLUSH_INTERVAL = 1000L * 60 * 1;// 1分钟
    private static final String APP_SECRET_TYPE = "2";
    private static final String APP_USER_SECRET_TYPE = "3";
    private DefaultTaobaoClient defaultTaobaoClient;
    private static final Object LOCK = new Object();
    private static final Set<String> APP_SET = new HashSet<String>();
    private static boolean stopApiReporter;
    private static Thread currentThread;

    public static void shutdown() {
        stopApiReporter = true;
        currentThread.interrupt();
    }
    
    public void initSecret(DefaultTaobaoClient defaultTaobaoClient) {
        String appkey = defaultTaobaoClient.getAppKey();
        if (APP_SET.contains(appkey)) {
            return;
        }
        this.defaultTaobaoClient = defaultTaobaoClient;
        synchronized (LOCK) {
            if (APP_SET.contains(appkey)) {
                return;
            }
            
            initSecretThread();
            APP_SET.add(appkey);
        }
    }

    /**
     * 初始化一次
     */
    @Deprecated
    private void initSecretThread() {
        currentThread = new Thread("flushSecretApiReporter-thread") {
            public void run() {
                doUploadBiz();
            }
        };
        currentThread.start();
    }

    private void doUploadBiz() {
        long uploadTime = System.currentTimeMillis() + FLUSH_INTERVAL;
        while (true) {
            if (stopApiReporter) {
                break;
            }
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                LOG.warn("interrupted flushSecretApiReporter ", e);
                if (stopApiReporter) {
                    break;
                }
            }
            try {
                LruHashMap<String, Counter> appUserCounterMap = SecurityCounter.getUserCounterMap(defaultTaobaoClient.getAppKey());
                if (System.currentTimeMillis() >= uploadTime
                        || (appUserCounterMap.size() * 4 > appUserCounterMap.getMaxCapacity())) {
                    StringBuilder counterBuilder = new StringBuilder();
                    
                    Map<String, Counter> cloneAppUserCounter = appUserCounterMap.cloneEntry();
                    SecurityCounter.cleanUserCounter(defaultTaobaoClient.getAppKey());
                    
                    int count = 0;
                    Iterator<Entry<String, Counter>> iterator = cloneAppUserCounter.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Entry<String, Counter> entry = iterator.next();
                        Counter counter = entry.getValue();
                        if (counterBuilder.length() > 0) {
                            counterBuilder.append(";");
                        }
                        counterBuilder.append(entry.getKey());
                        generateCounter(counterBuilder, counter);

                        if ((++count) % 100 == 0) {
                            doUpload(counterBuilder.toString(), APP_USER_SECRET_TYPE);
                            counterBuilder = new StringBuilder();
                        }
                    }
                    if (counterBuilder.length() > 0) {
                        doUpload(counterBuilder.toString(), APP_USER_SECRET_TYPE);
                        counterBuilder = new StringBuilder();
                    }

                    Counter counter = SecurityCounter.getAppCounter(defaultTaobaoClient.getAppKey());
                    counterBuilder.append(SecurityCore.getAppUserSecretCache().size());
                    generateCounter(counterBuilder, counter);
                    counter.reset();

                    long uploadInterval = doUpload(counterBuilder.toString(), APP_SECRET_TYPE);
                    uploadTime = System.currentTimeMillis() + uploadInterval;
                }
            } catch (Throwable e) {
                LOG.error("flushSecretApiReporter error", e);
            }
        }
    }

    private long doUpload(String contentJson, String type) throws ApiException {
        long uploadInterval = FLUSH_INTERVAL;
        TopSdkFeedbackUploadRequest request = new TopSdkFeedbackUploadRequest();
        request.setType(type);
        request.setContent(contentJson);

        TopSdkFeedbackUploadResponse response = defaultTaobaoClient.execute(request, null);
        if (response.isSuccess()) {
            uploadInterval = response.getUploadInterval();
            if (uploadInterval < MIN_FLUSH_INTERVAL) {
                uploadInterval = FLUSH_INTERVAL;
            }
        }
        return uploadInterval;
    }

    private void generateCounter(StringBuilder counterBuilder, Counter counter) {

        // encrypt
        if (counterBuilder.length() > 0) {
            counterBuilder.append(",");
        }
        if (SecurityCounter.getAppCounter(defaultTaobaoClient.getAppKey()).getEncryptPhoneNum().get() != 0) {
            counterBuilder.append(counter.getEncryptPhoneNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getEncryptNickNum().get() != 0) {
            counterBuilder.append(counter.getEncryptNickNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getEncryptReceiverNameNum().get() != 0) {
            counterBuilder.append(counter.getEncryptReceiverNameNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getEncryptSimpleNum().get() != 0) {
            counterBuilder.append(counter.getEncryptSimpleNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getEncryptSearchNum().get() != 0) {
            counterBuilder.append(counter.getEncryptSearchNum());
        } else {
            appendZero(counterBuilder);
        }

        // decrypt
        counterBuilder.append(",");
        if (counter.getDecryptPhoneNum().get() != 0) {
            counterBuilder.append(counter.getDecryptPhoneNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getDecryptNickNum().get() != 0) {
            counterBuilder.append(counter.getDecryptNickNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getDecryptReceiverNameNum().get() != 0) {
            counterBuilder.append(counter.getDecryptReceiverNameNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getDecryptSimpleNum().get() != 0) {
            counterBuilder.append(counter.getDecryptSimpleNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getDecryptSearchNum().get() != 0) {
            counterBuilder.append(counter.getDecryptSearchNum());
        } else {
            appendZero(counterBuilder);
        }

        // search
        counterBuilder.append(",");
        if (counter.getSearchPhoneNum().get() != 0) {
            counterBuilder.append(counter.getSearchPhoneNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getSearchNickNum().get() != 0) {
            counterBuilder.append(counter.getSearchNickNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getSearchReceiverNameNum().get() != 0) {
            counterBuilder.append(counter.getSearchReceiverNameNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getSearchSimpleNum().get() != 0) {
            counterBuilder.append(counter.getSearchSimpleNum());
        } else {
            appendZero(counterBuilder);
        }
        counterBuilder.append(",");
        if (counter.getSearchSearchNum().get() != 0) {
            counterBuilder.append(counter.getSearchSearchNum());
        } else {
            appendZero(counterBuilder);
        }
    }

    private void appendZero(StringBuilder counterBuilder) {
        counterBuilder.append("0");
    }
}
