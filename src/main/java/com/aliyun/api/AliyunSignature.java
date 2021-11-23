package com.aliyun.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.taobao.api.internal.util.Base64;
/**
 * aliyun sdk 签名方法
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public class AliyunSignature {

	private static final String ENCODING = "UTF-8";
	private static String httpMethod = "POST";

	public static String computeSignature(Map<String, String> parameters,
			String accessKeySecret) throws Exception {
		// 将参数Key按字典顺序排序
		String[] sortedKeys = parameters.keySet().toArray(new String[] {});
		Arrays.sort(sortedKeys);

		final String SEPARATOR = "&";

		// 生成规范化请求字符串
		StringBuilder canonicalizedQueryString = new StringBuilder();
		for (String key : sortedKeys) {
			canonicalizedQueryString.append("&").append(percentEncode(key))
					.append("=").append(percentEncode(parameters.get(key)));
		}

		// 生成用于计算签名的字符串 stringToSign
		StringBuilder stringToSign = new StringBuilder();
		stringToSign.append(httpMethod).append(SEPARATOR);
		stringToSign.append(percentEncode("/")).append(SEPARATOR);
		stringToSign.append(percentEncode(canonicalizedQueryString.toString()
				.substring(1)));

		// 注意accessKeySecret后面要加入一个字符"&"
		String signature = calculateSignature(accessKeySecret + "&",
				stringToSign.toString());
		return signature;
	}

	private static String calculateSignature(String key, String stringToSign)
			throws Exception {
		// 使用HmacSHA1算法计算HMAC值
		final String ALGORITHM = "HmacSHA1";
		Mac mac = Mac.getInstance(ALGORITHM);
		mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
		byte[] signData = mac.doFinal(stringToSign.getBytes(ENCODING));

		return Base64.encodeToString(signData, false);
	}

	private static String percentEncode(String value)
			throws UnsupportedEncodingException {
		// 使用URLEncoder.encode编码后，将"+","*","%7E"做替换即满足 API规定的编码规范
		return value != null ? URLEncoder.encode(value, ENCODING)
				.replace("+", "%20").replace("*", "%2A").replace("%7E", "~")
				: null;
	}

}
