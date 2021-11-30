package com.taobao.api.domain;

import org.junit.Test;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.reqrsp.UserGetRequest;
import com.taobao.api.reqrsp.UserGetResponse;

public class UserApiTest {

	@Test
	public void getUser() throws Exception {
		DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "12497914", "4b0f28396e072d67fae169684613bcd1");
		client.setUseGzipEncoding(true);
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick,user_id,type,buyer_credit");
		req.setNick("helloworld");
		UserGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}

}
