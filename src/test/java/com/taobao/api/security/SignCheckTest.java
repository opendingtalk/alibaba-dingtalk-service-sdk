package com.taobao.api.security;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.internal.sign.SignUtils;
import com.taobao.api.internal.sign.SignatureCheckClient;

public class SignCheckTest {

	  final static String url = "http://gw.api.taobao.com/router/rest";
	  final static String appkey = "12497914";
	  final static String appSecret = "4b0f28396e072d67fae169684613bcd1";	

	public static void main(String[] args) throws Exception {
		DefaultTaobaoClient client = new DefaultTaobaoClient(url,appkey,appSecret);
		SignatureCheckClient signClient = new SignatureCheckClient(client);
		
		byte[] body = "https://140.205.57.248/router/rest".getBytes("utf-8");
		
		String signature = SignUtils.signAndBase64Encode(body, "2092fca6ee2d8613ad79dcf44b60630e", "HmacMD5", "utf-8");
		
		System.out.println(signClient.checkApiRequestSignWithCache("23021137", body, signature, "HmacMD5","utf-8"));

		System.out.println(signClient.checkApiRequestSignWithCache("23021137", body, signature, "HmacMD5","utf-8"));

		System.out.println(signClient.getAliyunUserId(2153472040L));
	}

}	
