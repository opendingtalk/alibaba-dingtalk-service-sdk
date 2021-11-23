package com.taobao.api.security;

import com.taobao.api.SecretException;

/**
 * 
 * @author changchun
 * @since 2016年10月18日 下午4:42:53
 */
public class ErrorUtil {

    private static final String[] invalidSessionCodes = { "26", "27", "53" };
    private static final String[] invalidSubUserCodes = { "12" };
    private static final String invalidSessionkey = "invalid-sessionkey";

    public static boolean isInvalidSession(SecretException secretException) {
        for (String code : invalidSessionCodes) {
            if (code.equals(secretException.getErrCode()) && invalidSessionkey.equals(secretException.getSubErrCode())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInvalidSubCode(SecretException secretException) {
        for (String code : invalidSubUserCodes) {
            if (code.equals(secretException.getErrCode())) {
                return true;
            }
        }
        return false;
    }

}
