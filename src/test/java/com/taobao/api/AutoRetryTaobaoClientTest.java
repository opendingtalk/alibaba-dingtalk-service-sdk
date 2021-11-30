package com.taobao.api;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.taobao.api.reqrsp.UserGetRequest;
import com.taobao.api.reqrsp.UserGetResponse;

public class AutoRetryTaobaoClientTest {

	@Test(expected = ApiException.class)
	public void testNetworkError() throws ApiException {
		AutoRetryTaobaoClient client = new AutoRetryTaobaoClient("http://gw.gfs.com/", "appkey", "appsecret");
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick");
		req.setNick("tbtest1064");
		UserGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}

	@Test
	public void testApiCustomError() throws ApiException {
		AutoRetryTaobaoClient client = new AutoRetryTaobaoClient("http://api.daily.taobao.net/router/rest", "4272", "0ebbcccfee18d7ad1aebc5b135ffa906");
		Set<String> codes = new HashSet<String>();
		codes.add("isv.user-not-exist:invalid-nick");
		client.setRetryErrorCodes(codes);
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick");
		req.setNick("gfs");
		UserGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}

	@Test(expected = ApiException.class)
	public void testThrowOnError() throws ApiException {
		AutoRetryTaobaoClient client = new AutoRetryTaobaoClient("http://api.daily.taobao.net/router/rest", "4272", "0ebbcccfee18d7ad1aebc5b135ffa906");
		client.setThrowIfOverMaxRetry(true);
		Set<String> codes = new HashSet<String>();
		codes.add("isv.user-not-exist:invalid-nick");
		client.setRetryErrorCodes(codes);
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick");
		req.setNick("gfs");
		UserGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}

	@Test
	public void testNormal() throws ApiException {
		AutoRetryTaobaoClient client = new AutoRetryTaobaoClient("http://api.daily.taobao.net/router/rest", "4272", "0ebbcccfee18d7ad1aebc5b135ffa906");
		client.setThrowIfOverMaxRetry(true);
		UserGetRequest req = new UserGetRequest();
		req.setFields("nick");
		req.setNick("gfs");
		UserGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
	}
}
