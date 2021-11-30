package com.taobao.api;

import com.taobao.api.reqrsp.TaspChengxianTestRequest;
import com.taobao.api.reqrsp.TaspChengxianTestResponse;
import com.taobao.api.reqrsp.UserGetRequest;
import com.taobao.api.reqrsp.UserGetResponse;
import org.junit.Test;

public class ClusterTaobaoClientTest {

	@Test
	public void testClient() throws Exception {
		TaobaoClient client = new ClusterTaobaoClient("http://gw.api.taobao.com/router/rest", "12497914", "4b0f28396e072d67fae169684613bcd1", "json");
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,sex,location");
		req.setNick("许腾大哥");
		for (int i = 0; i < 10; i++) {
			UserGetResponse rsp = client.execute(req);
			System.out.println(rsp.getBody());
		}
	}

	@Test
	public void testClient2() throws Exception {
		TaobaoClient client = new ClusterTaobaoClient("http://gw.api.taobao.com/router/rest", "12497914", "4b0f28396e072d67fae169684613bcd1", "json");
		TaspChengxianTestRequest req = new TaspChengxianTestRequest();
		req.setItemId(1L);
		req.setOptions("{ \"include_skus\": true,  \"include_quantity\": true,  \"include_description\": false}");
		for (int i = 0; i < 10; i++) {
			TaspChengxianTestResponse rsp = client.execute(req);
			System.out.println(rsp.getBody());
		}
		Thread.sleep(10000000);
	}

}
