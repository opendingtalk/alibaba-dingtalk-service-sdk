package com.taobao.api.util;

import java.io.IOException;

import com.taobao.api.internal.util.HttpResponseData;
import com.taobao.api.internal.util.WebV2Utils;
import org.junit.Test;

import com.taobao.api.internal.util.WebUtils;

public class WebUtilsTest {

	@Test
	public void testDoPostWithTaobaoSite() throws IOException {
		WebUtils.doPost("https://eco.taobao.com/router/rest", null, 3000, 3000);
	}

	@Test
	public void testDoGetWithTaobaoSite() throws IOException {
		WebUtils.doGet("https://eco.taobao.com/router/rest", null);
	}

	@Test(expected = IOException.class)
	public void testDoGetWithAliyunSite() throws IOException {
		WebUtils.doGet("https://rds.aliyuncs.com/", null);
	}

	@Test
	public void testBuildRequestUrl() {
		String url1 = "http://api.taobao.com/router/rest";
		System.out.println(WebUtils.buildRequestUrl(url1, "a=b", "c=d"));

		String url2 = "http://api.taobao.com/router/rest?";
		System.out.println(WebUtils.buildRequestUrl(url2, "a=b", "c=d"));

		String url3 = "http://api.taobao.com/router/rest?name=value&";
		System.out.println(WebUtils.buildRequestUrl(url3, "a=b", "c=d"));
	}

	@Test
	public void testDoGetWith400Return() throws IOException {
		HttpResponseData data = WebV2Utils.doGet("https://oauth.taobao.com/token", null, 15000, 30000);
		System.out.println(data.getBody());
	}

}
