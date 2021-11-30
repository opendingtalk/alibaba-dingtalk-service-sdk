package com.taobao.api.internal.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DESUtil {
	private final static String DES = "DES";

	/**
	 * 
	 * 加密
	 * 
	 * @param src
	 *            数据源
	 * 
	 * @param key
	 *            密钥，长度必须是8的倍数
	 * 
	 * @return 返回加密后的数据
	 * 
	 * @throws Exception
	 * 
	 */
	public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);

		Cipher cipher = Cipher.getInstance(DES);
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
		return cipher.doFinal(src);
	}

	/**
	 * 
	 * 解密
	 * 
	 * @param src
	 *            数据源
	 * 
	 * @param key
	 *            密钥，长度必须是8的倍数
	 * 
	 * @return 返回解密后的原始数据
	 * 
	 * @throws Exception
	 * 
	 */
	public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);

		Cipher cipher = Cipher.getInstance(DES);
		cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
		return cipher.doFinal(src);
	}

	/**
	 * 
	 * 密码解密
	 * 
	 * @param data
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 */
	public final static String decrypt(String data, String cryptKey) {
		try {
			return new String(decrypt(Base64.decode(data), cryptKey.getBytes("UTF-8")), "UTF-8");

		} catch (Exception e) {
			throw new RuntimeException("decrypt error! please check cryptkey and data");
		}
	}

	/**
	 * 
	 * 密码加密
	 * 
	 * @param password
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 */
	public final static String encrypt(String password, String cryptKey) {
		try {
			return base64Encode(encrypt(password.getBytes("UTF-8"), cryptKey.getBytes("UTF-8")));
		} catch (Exception e) {
			throw new RuntimeException("encrypt error!");
		}
	}

	/**
	 * BASE64 编码(byte[]).
	 * 
	 * @param src
	 *            byte[] inputed string
	 * @return String returned string
	 */
	public static String base64Encode(byte[] src) {
		byte[] res = Base64.encodeToByte(src,false);
		return (src != null ? new String(res) : null); //用缺省Charset
	}

}
