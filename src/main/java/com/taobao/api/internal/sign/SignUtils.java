package com.taobao.api.internal.sign;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.taobao.api.internal.util.Base64;

public class SignUtils {

	/**
	 * 对API请求进行签名
	 * 
	 * @param body 需要签名的内容
	 * @param key 签名的密钥
	 * @param algorithm 官名算法
	 * @return 签名结果
	 */
	public static byte[] signApiRequest(byte[] body, byte[] key, String algorithm) {
		try {
			Mac mac = Mac.getInstance(algorithm);
			mac.init(new SecretKeySpec(key, algorithm));
			return mac.doFinal(body);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 对API请求进行签名并进行BASE 64编码。
	 * 
	 * @param body 需要签名的内容
	 * @param key 签名的密钥
	 * @param algorithm 官名算法
	 * @param charset 字节流编码方式
	 * @return 签名结果
	 */
	public static String signAndBase64Encode(byte[] body, String key, String algorithm, String charset) {
		try {
			byte[] sign = signApiRequest(body, key.getBytes(charset), algorithm);
			return new String(Base64.encodeToByte(sign,false), charset);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
