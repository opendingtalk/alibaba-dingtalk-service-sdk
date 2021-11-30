package com.taobao.api.util;

import java.net.URL;

import junit.framework.Assert;

import org.junit.Test;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.RequestCheckUtils;

public class RequestCheckUtilsTest {
	@Test
	public void testCheckNotNull() throws ApiRuleException{
		RequestCheckUtils.checkNotEmpty("aa", "name");
		try {
			RequestCheckUtils.checkNotEmpty(null, "name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		try {
			RequestCheckUtils.checkNotEmpty(" ", "name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.assertTrue(false);
	}
	@Test
	public void testCheckMaxLength() throws ApiRuleException{
		RequestCheckUtils.checkMaxLength("aaa",3,"name");
		try {
			RequestCheckUtils.checkMaxLength("aaa",2,"name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.assertTrue(false);
	}
	@Test
	public void testCheckMaxLength2() throws ApiRuleException{
		URL path=this.getClass().getClassLoader().getResource(".");
		//System.out.println(path.getFile());
		FileItem fileItem=new FileItem(path.getFile()+"test-fileitem.txt");
		RequestCheckUtils.checkMaxLength(fileItem,5,"name");
		try {
			RequestCheckUtils.checkMaxLength(fileItem,4,"name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.assertTrue(false);
	}
	@Test
	public void testCheckMaxListSize() throws ApiRuleException{
		RequestCheckUtils.checkMaxListSize("aa,aa,aa",3,"name");
		try {
			RequestCheckUtils.checkMaxListSize("aa,aa,aa",2,"name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.assertTrue(false);
	}
	@Test
	public void testCheckMaxValue() throws ApiRuleException{
		try {
			RequestCheckUtils.checkMaxValue(4L,3L,"name");
			RequestCheckUtils.checkMaxValue(3L,2L,"name");
			Assert.fail("should not come here");
		} catch (Exception e) {
			Assert.assertTrue(e instanceof ApiRuleException);
		}
	}
	@Test
	public void testCheckMinValue() throws ApiRuleException{
		RequestCheckUtils.checkMinValue(4L,3L,"name");
		RequestCheckUtils.checkMinValue(3L,3L,"name");
		try {
			RequestCheckUtils.checkMinValue(1L,2L,"name");
		} catch (ApiRuleException e) {
			Assert.assertTrue(true);
			return;
		}
		Assert.assertTrue(false);
	}
}
