package com.taobao.api.security;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.internal.util.LruHashMap;

/**
 * 计数器
 * 
 * @author changchun
 * @since 2016年8月16日 下午7:45:54
 */
public class SecurityCounter implements SecurityConstants {

    private static final Map<String, LruHashMap<String, Counter>> APP_USER_COUNTER_MAP = new HashMap<String, LruHashMap<String, Counter>>();// 私有秘钥计数器
    private static final Map<String, Counter> APP_COUNTER_MAP = new HashMap<String, Counter>();// 公共秘钥计数器
    private String appkey;
    private static final Object LOCK = new Object();

    public SecurityCounter(String appkey) {
        this.appkey = appkey;
        synchronized (LOCK) {
            Counter appCounter = getAppCounter(appkey);
            if (appCounter == null) {
                appCounter = new Counter();
                APP_COUNTER_MAP.put(appkey, appCounter);
            }
            LruHashMap<String, Counter> userCounter = getUserCounterMap(appkey);
            if (userCounter == null) {
                userCounter = new LruHashMap<String, Counter>(16, 65536);
                APP_USER_COUNTER_MAP.put(appkey, userCounter);
            }
        }
    }

    public static LruHashMap<String, Counter> getUserCounterMap(String appkey) {
        return APP_USER_COUNTER_MAP.get(appkey);
    }

    public static Counter getAppCounter(String appkey) {
        return APP_COUNTER_MAP.get(appkey);
    }

    private static void addEncryptCount(String type, Counter counter) {
        if (counter == null) {
            return;
        }
        
        if (PHONE.equals(type)) {
            counter.getEncryptPhoneNum().incrementAndGet();
        } else if (NICK.equals(type)) {
            counter.getEncryptNickNum().incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            counter.getEncryptReceiverNameNum().incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            counter.getEncryptSimpleNum().incrementAndGet();
        } else if (SEARCH.equals(type)) {
            counter.getEncryptSearchNum().incrementAndGet();
        }
    }

    private static void addDecryptCount(String type, Counter counter) {
        if (counter == null) {
            return;
        }
        
        if (PHONE.equals(type)) {
            counter.getDecryptPhoneNum().incrementAndGet();
        } else if (NICK.equals(type)) {
            counter.getDecryptNickNum().incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            counter.getDecryptReceiverNameNum().incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            counter.getDecryptSimpleNum().incrementAndGet();
        } else if (SEARCH.equals(type)) {
            counter.getDecryptSearchNum().incrementAndGet();
        }
    }

    public static void addSearchCount(String type, Counter counter) {
        if (counter == null) {
            return;
        }
        
        if (PHONE.equals(type)) {
            counter.getSearchPhoneNum().incrementAndGet();
        } else if (NICK.equals(type)) {
            counter.getSearchNickNum().incrementAndGet();
        } else if (RECEIVER_NAME.equals(type)) {
            counter.getSearchReceiverNameNum().incrementAndGet();
        } else if (SIMPLE.equals(type)) {
            counter.getSearchSimpleNum().incrementAndGet();
        } else if (SEARCH.equals(type)) {
            counter.getSearchSearchNum().incrementAndGet();
        }
    }

    public void addEncryptCount(String type, String session) {
        addEncryptCount(type, getCounter(session));
    }

    public void addDecryptCount(String type, String session) {
        addDecryptCount(type, getCounter(session));
    }

    public void addSearchCount(String type, String session) {
        addSearchCount(type, getCounter(session));
    }

    private Counter getCounter(String session) {
        Counter counter = null;
        if (session == null) {
            counter = getAppCounter(appkey);
        } else {
            LruHashMap<String, Counter> userCounter = getUserCounterMap(appkey);
            if (userCounter == null) {
                return null;
            }
            counter = userCounter.get(session);
            if (counter == null) {
                counter = new Counter();
                userCounter.put(session, counter);
            }
        }
        return counter;
    }
    
    public static void cleanUserCounter(String appkey) {
        LruHashMap<String, Counter> userCounter = getUserCounterMap(appkey);
        if (userCounter != null) {
            userCounter.clear();
        }
    }
}
