package com.taobao.api.util;

import junit.framework.Assert;

import org.junit.Test;

import com.qimen.api.QimenResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.util.StringUtils;

public class StringUtilsTest {

	@Test
	public void testIsNumeric() throws ApiRuleException {
		Assert.assertFalse(StringUtils.isNumeric(" "));
		Assert.assertFalse(StringUtils.isNumeric("dsfasdf"));
		Assert.assertFalse(StringUtils.isNumeric("--1"));
		Assert.assertFalse(StringUtils.isNumeric(""));
		Assert.assertTrue(StringUtils.isNumeric("1"));
		Assert.assertTrue(StringUtils.isNumeric("-1"));
		Assert.assertTrue(StringUtils.isNumeric("-3243241"));
		Assert.assertTrue(StringUtils.isNumeric("1234324"));
	}

	@Test
	public void testGetClassProperties() {
		System.out.println(StringUtils.getClassProperties(TaobaoResponse.class, true));
		System.out.println(StringUtils.getClassProperties(QimenResponse.class, true));
	}

	@Test
	public void testIsIpInRange() {
		System.out.println(StringUtils.isIpInRange("140.205.13.2", "140.205.12.0/23"));
		System.out.println(StringUtils.isIpInRange("140.205.14.2", "140.205.12.0/23"));
	}
}
