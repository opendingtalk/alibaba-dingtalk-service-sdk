package com.taobao.api.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.SecretException;
import com.taobao.api.internal.util.WebUtils;
import org.junit.Test;

public class SecretTest {

     String url = "https://gw.api.tbsandbox.com/router/rest";
     String appkey = "576216";
     String appSecret = "d1e44cec2f6c8a2c73342595b711decc";
     String sessionkey =
     "6101d106f2626d478011170ccb364567341fa95849136162050695162";
     String randomNum = "S7/xdg4AD7WooWY7+g11qoBpaVsEkonULDJPEiMcXPE=";

    // String appkey = "576214";
    // String appSecret = "03645481cf0f5281c5e7035eaf0b545e";
    // String sessionkey =
    // "6100f11a2284e9f160c1db7b2790bc017dc4eb33c14ecb7179119504";
    // String randomNum = "ZzwkLdnbNDH5onAHbsOM0e1NR5ZgMX+rZAbdEDtWRvU=";


    /**
     * <pre>
     * 加、解密密粒度分每个用户单独秘钥和所有用户共用秘钥。
     * </pre>
     * 
     * <pre>
     * 共用秘钥：不需要传sessionkey；用户单独秘钥：需要传sessionkey
     * </pre>
     * 
     * 加密字段类型(nick\phone)
     * 
     */
    {
        WebUtils.setIgnoreSSLCheck(true);
    }
    // defaultTaobaoClient serverUrl必须是https协议
    SecurityClient secretClient = new SecurityClient(new DefaultTaobaoClient(url, appkey, appSecret), randomNum);

    @Test
    public void testAppSecret() throws ApiException, SecretException {
        String originalValue = secretClient.encrypt("enc_changchun.wzj2", "nick",
                "6100c0669b4ff6185372f0f6542e3ce41783b545cae480d2021891722");
        if (SecurityClient.isEncryptData(originalValue, "nick")) {
            System.out.println(secretClient.decrypt(originalValue, "nick",
                    "6100c0669b4ff6185372f0f6542e3ce41783b545cae480d2021891722"));
        }

        originalValue = secretClient.encrypt("enc_changchun.wzj2", "nick");
        originalValue = secretClient.encrypt("changchun.wzj", "nick");
        System.out.println(originalValue);
        if (SecurityClient.isEncryptData(originalValue, "nick")) {
            System.out.println(secretClient.decrypt(originalValue, "nick"));
        }
        
        secretClient.search("aasadfsadf", "nick");
    }

    @Test
    public void testTdP() throws ApiException, SecretException {
        // String originalValue =
        // secretClient.decrypt("~xGWT8fZCT1orbqXdwCHw7g==~1~", "nick",
        // sessionkey);

        String originalValue = secretClient.decrypt("数据[雁江镇皇龙路优品上城B3~2单元]", "nick", sessionkey);

        System.out.println(originalValue);
    }

    @Test
    public void testValueLength() throws ApiException, SecretException {

        long start = System.currentTimeMillis();
        String originalValue = secretClient.encrypt("123456789承仙大哥", "nick", sessionkey);

        System.out.println(System.currentTimeMillis() - start);

        originalValue = secretClient.encrypt("也明的房间爱卡水电费也明的房间爱卡水电费", "nick",
                "6100c0669b4ff6185372f0f6542e3ce41783b545cae480d2021891722");
        System.out.println(secretClient.decrypt(originalValue, "nick",
                "6100c0669b4ff6185372f0f6542e3ce41783b545cae480d2021891722"));
        originalValue = secretClient.encrypt("也明的房间爱卡水电费也明的房间爱卡水电费也明的房间爱卡水电费也明的房间爱卡水电费", "nick", sessionkey);
        System.out.println(originalValue);

        originalValue = secretClient.encrypt("1", "phone", sessionkey);
        System.out.println(originalValue);
        originalValue = secretClient.encrypt("12345678901", "phone", sessionkey);
        System.out.println(originalValue);
        originalValue = secretClient.encrypt("1234567890187245", "phone", sessionkey);
        System.out.println(originalValue);
        originalValue = secretClient.encrypt("8623123728749589862312372874958920490998759343782049099875934378", "phone",
                sessionkey);
        System.out.println(originalValue);
    }

    @Test
    public void testPrivateDeSecret() throws ApiException, SecretException {
        String type = "phone";

        // 解密手机号码
        String originalValue = secretClient.decrypt("$183$4L71fmwwizDPWgrNlDkLSw==$1$", type, sessionkey);
        System.out.println("手机号码密文：" + "  ->明文：" + originalValue);

    }

    @Test
    public void testPrivateSecret() throws ApiException, SecretException {
        String type = "phone";
        String value = "13834566786";

        // 加密手机号码
        String encryptValue = secretClient.encrypt(value, type, sessionkey);
        System.out.println("手机号码明文：" + value + "  ->密文：" + encryptValue);

        // 判断是否为加密手机号码数据
        if (SecurityClient.isEncryptData(encryptValue, type)) {
            // 解密手机号码
            String originalValue = secretClient.decrypt(encryptValue, type, sessionkey);
            System.out.println("手机号码密文：" + encryptValue + "  ->明文：" + originalValue);

            System.out.println("search明文：" + "6786" + "  ->" + secretClient.search("6786", type, sessionkey));
        }

        System.out.println();
        System.out.println();
        String[] typeArr = { "normal", "nick", "receiver_name", "simple", "search" };
        // value = "taobaoTEST";
        value = "淘宝test";
        for (String typeValue : typeArr) {
            System.out.println("==============================TOP================================");
            // 加密nick
            encryptValue = secretClient.encrypt(value, typeValue, sessionkey);
            System.out.println(typeValue + "明文：" + value + "  ->密文：" + encryptValue);

            // 判断是否为加密nick数据
            if (SecurityClient.isEncryptData(encryptValue, typeValue)) {
                // 解密nick
                String originalValue = secretClient.decrypt(encryptValue, typeValue, sessionkey);
                System.out.println(typeValue + "密文：" + encryptValue + "  ->明文：" + originalValue);
                System.out.println(typeValue + "search明文：" + originalValue + "  ->"
                        + secretClient.search(originalValue, typeValue, sessionkey));
            }
        }

    }

    @Test
    public void testPrivatePreviousSecret() throws ApiException, SecretException {
        String type = "phone";
        String value = "13834566786";
        // 加密手机号码
        String encryptValue = secretClient.encryptPrevious(value, type, sessionkey);
        System.out.println("手机号码明文：" + value + "  ->密文：" + encryptValue);

        // 判断是否为加密手机号码数据
        if (SecurityClient.isEncryptData(encryptValue, type)) {
            // 解密手机号码
            String originalValue = secretClient.decrypt(encryptValue, type, sessionkey);
            System.out.println("手机号码密文：" + encryptValue + "  ->明文：" + originalValue);

            System.out.println("search明文：" + "6786" + "  ->" + secretClient.search("6786", type, sessionkey));
        }
        System.out.println("==============================TOP================================");

        String[] typeArr = { "normal", "nick", "receiver_name" };
        value = "taobaoTEST";
        for (String typeValue : typeArr) {
            System.out.println("==============================TOP================================");
            // 加密nick
            encryptValue = secretClient.encryptPrevious(value, typeValue, sessionkey);
            System.out.println(typeValue + "明文：" + value + "  ->密文：" + encryptValue);

            // 判断是否为加密nick数据
            if (SecurityClient.isEncryptData(encryptValue, typeValue)) {
                // 解密nick
                String originalValue = secretClient.decrypt(encryptValue, typeValue, sessionkey);
                System.out.println(typeValue + "密文：" + encryptValue + "  ->明文：" + originalValue);
                System.out.println(typeValue + "search明文：" + originalValue + "  ->"
                        + secretClient.search(originalValue, typeValue, sessionkey));
            }
        }

    }

    @Test
    public void testBatchPrivateSecret() throws ApiException, SecretException {
        List<String> phoneList = new ArrayList<String>();
        phoneList.add("13834566786");
        phoneList.add("15923847823");

        List<String> dataList = new ArrayList<String>();
        String type = "phone";
        // 批量加密手机号码
        Map<String, String> encryptMap = secretClient.encrypt(phoneList, type, sessionkey);
        for (Entry<String, String> entry : encryptMap.entrySet()) {
            System.out.println("手机号码明文：" + entry.getKey() + "  ->密文：" + entry.getValue());
            dataList.add(entry.getValue());
        }

        // 判断是否为加密数据
        if (SecurityClient.isEncryptData(dataList, type)) {
            // 解密手机号码
            Map<String, String> decryptMap = secretClient.decrypt(dataList, type, sessionkey);
            for (Entry<String, String> entry : decryptMap.entrySet()) {
                System.out.println("手机号码密文：" + entry.getKey() + "  ->明文：" + entry.getValue());
            }
        }
        System.out.println("==============================TOP================================");

        List<String> nickList = new ArrayList<String>();
        nickList.add("taobaoTEST1");
        nickList.add("taobaoTEST2");
        dataList = new ArrayList<String>();
        type = "nick";
        // 批量加密手机号码
        encryptMap = secretClient.encrypt(nickList, type, sessionkey);
        for (Entry<String, String> entry : encryptMap.entrySet()) {
            System.out.println("nick明文：" + entry.getKey() + "  ->密文：" + entry.getValue());
            dataList.add(entry.getValue());
        }
        // 判断是否为加密数据
        if (SecurityClient.isEncryptData(dataList, type)) {
            // 解密手机号码
            Map<String, String> decryptMap = secretClient.decrypt(dataList, type, sessionkey);
            for (Entry<String, String> entry : decryptMap.entrySet()) {
                System.out.println("nick密文：" + entry.getKey() + "  ->明文：" + entry.getValue());
            }
        }
    }

    @Test
    public void testPrivateSecretUpgrade() throws ApiException, SecretException {
        for (int i = 0; i < 1; i++) {
            String type = "phone";

            // 加密手机号码
            String encryptValue = "$132$1cxiPwwwlFit352UEUy6Jg==$99$";
            System.out.println("手机号码密文：" + encryptValue);

            // 判断是否为加密手机号码数据
            if (SecurityClient.isEncryptData(encryptValue, type)) {

                // 解密手机号码
                String oraOriginalValue = secretClient.decrypt(encryptValue, type, sessionkey);
                System.out.println("手机号码密文转明文：" + oraOriginalValue);
            }
            type = "nick";

            // 加密nick
            encryptValue = "~5BvT\\/hSN3BXc2\\/JHQxDenw==~99~";
            System.out.println("nick密文：" + encryptValue);

            // 判断是否为加密nick数据
            if (SecurityClient.isEncryptData(encryptValue, type)) {

                // 解密nick
                String oraOriginalValue = secretClient.decrypt(encryptValue, type, sessionkey);
                System.out.println("nick密文转明文：" + oraOriginalValue);
            }
        }
    }

    @Test
    public void testVirtualSecret() throws ApiException, SecretException {
        List<String> phoneList = new ArrayList<String>();
        phoneList.add("13834566786");

        List<String> dataList = new ArrayList<String>();
        String type = "phone";
        // 批量加密手机号码
        Map<String, String> encryptMap = secretClient.encrypt(phoneList, type, sessionkey);
        for (Entry<String, String> entry : encryptMap.entrySet()) {
            System.out.println("手机号码明文：" + entry.getKey() + "  ->密文：" + entry.getValue());
            // dataList.add(entry.getValue());
        }

        dataList.add("$159$fT8pNX6K6eQuNka4EQsXew==$18$");
        // 判断是否为加密数据
        if (SecurityClient.isEncryptData(dataList, type)) {
            // 解密手机号码
            Map<String, String> decryptMap = secretClient.decrypt(dataList, type, sessionkey);
            for (Entry<String, String> entry : decryptMap.entrySet()) {
                System.out.println("手机号码密文：" + entry.getKey() + "  ->明文：" + entry.getValue());
            }
        }
        System.out.println("==============================TOP================================");

    }

}
