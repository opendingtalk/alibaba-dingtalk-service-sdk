package com.taobao.api;

import com.taobao.api.reqrsp.TimeGetRequest;
import com.taobao.api.reqrsp.TimeGetResponse;

public class TimeGetTest {

//	  final static String url = "https://42.156.218.201/router/rest";
	  final static String url = "https://eco.taobao.com/router/rest";
	  final static String appkey = "12497914";
	  final static String appSecret = "4b0f28396e072d67fae169684613bcd1";

	public static void main(String[] args) {
		DefaultTaobaoClient client = new DefaultTaobaoClient(url,appkey,appSecret);
		client.setNeedEnableParser(false);
        TimeGetRequest timeGetRequest1 = new TimeGetRequest();
        try {
        	long start = System.currentTimeMillis();
			TimeGetResponse response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
			
			start = System.currentTimeMillis();
			response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
			
			start = System.currentTimeMillis();
			response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
			
			start = System.currentTimeMillis();
			response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
			
			start = System.currentTimeMillis();
			response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
			start = System.currentTimeMillis();
			response = client.execute(timeGetRequest1);
			System.out.println(System.currentTimeMillis() - start);
			System.out.println(response.getBody());
		} catch (ApiException e) {
		}
	}

}
