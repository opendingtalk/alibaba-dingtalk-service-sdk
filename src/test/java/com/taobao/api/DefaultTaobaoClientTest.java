package com.taobao.api;

import com.taobao.api.reqrsp.*;
import org.junit.Test;

public class DefaultTaobaoClientTest {

	@Test
	public void testUploadTradeVoucher() throws Exception {
		DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "12497914", "4b0f28396e072d67fae169684613bcd1");
		TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
		req.setTid(133093920957171L);
		req.setFields("buyer_message, has_yfx, tid, created, buyer_nick, shipping_type, post_fee, buyer_alipay_no, payment, trade_from, orders.divide_order_fee, orders.part_mjz_discount, orders.oid, orders.discount_fee, orders.num_iid, orders.num, orders.price, orders.cid, orders.payment, receiver_name, receiver_phone, receiver_mobile, receiver_state, receiver_city, receiver_district, receiver_town, receiver_address, receiver_zip");
		for(int i = 0; i < 1; i++){
			TradeFullinfoGetResponse rsp = client.execute(req,"6100e04a21f713929b3e7ed9b8b177baac62f0ae993684779793180");
			System.out.println(rsp.getBody());
			if(rsp.getBody() == null){
				System.out.println("Hello");
			}
		}
	}

	@Test
	public void test() throws ApiException {
		DefaultTaobaoClient client = new DefaultTaobaoClient(
				"http://gw.api.taobao.com/router/rest",
				"1111",
				"2222"
		);
		TmallProductAddSchemaGetRequest req = new TmallProductAddSchemaGetRequest();
		req.setCategoryId(13131L);
		// req.setBrandId(brandid);
		TmallProductAddSchemaGetResponse rsp = client.execute(req, "");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
	}

	@Test
	public void test_RpRefundsAgree() throws ApiException {
		DefaultTaobaoClient client = new DefaultTaobaoClient(
				"http://gw.api.taobao.com/router/rest",
				"1111",
				"2222"
		);
		RpRefundsAgreeRequest request = new RpRefundsAgreeRequest();
		request.setCode("123");
		request.setRefundInfos("xxx");

		RpRefundsAgreeResponse rsp = client.execute(request, "xxxx");
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getMessage());
	}

}
