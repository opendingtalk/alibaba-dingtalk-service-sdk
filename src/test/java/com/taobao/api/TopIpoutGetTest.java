package com.taobao.api;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.api.reqrsp.TopIpoutGetRequest;
import com.taobao.api.reqrsp.TopIpoutGetResponse;

public class TopIpoutGetTest {
	
	@Test
	public void getTopIpout() throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient("http://api.daily.taobao.net/router/rest", "4272", "0ebbcccfee18d7ad1aebc5b135ffa906");
		TopIpoutGetRequest req = new TopIpoutGetRequest();
		TopIpoutGetResponse rsp = client.execute(req);
		System.out.println(rsp.getBody());
		Assert.assertTrue(rsp.getIpList().size() > 0);
	}

}
