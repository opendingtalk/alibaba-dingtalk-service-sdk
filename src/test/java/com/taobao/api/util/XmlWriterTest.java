package com.taobao.api.util;

import java.util.Date;

import org.junit.Test;

import com.qimen.api.QimenRequest;
import com.taobao.api.domain.SampleQimenRequest;
import com.taobao.api.domain.SampleQimenRequest.Order;
import com.taobao.api.domain.SampleQimenRequest.Trade;
import com.taobao.api.domain.User;
import com.taobao.api.internal.util.XmlWriter;

public class XmlWriterTest {

	@Test
	public void testWriteNormalObject() {
		User user = new User();
		user.setNick("helloworld");
		user.setType("bseller");
		user.setUserId(293842934L);
		XmlWriter writer = new XmlWriter();
		System.out.println(writer.write(user));
	}

	@Test
	public void testWriteQimenRequest() {
		SampleQimenRequest request = new SampleQimenRequest();
		Trade trade = new Trade();
		trade.setId("123456789");
		trade.setBuyerNick("buyer");
		trade.setSellerNick("seller");
		trade.setIsTimeout(false);
		trade.setGmtCreate(new Date());
		trade.addExtProp("prop1", "value1");
		trade.addExtProp("prop2", "value2");
		Order order = new Order();
		order.setItemId("1234");
		order.setItemTitle("<span>测试商品</span>");
		order.setPayment("99.00");
		order.setItemCount(2L);
		trade.addOrder(order);
		request.setTrade(trade);

		XmlWriter writer = new XmlWriter(true, "request", QimenRequest.class);
		System.out.println(writer.write(request));
	}

}
