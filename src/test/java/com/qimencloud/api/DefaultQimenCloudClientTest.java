package com.qimencloud.api;

import java.util.ArrayList;
import java.util.List;

import com.qimencloud.api.request.*;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.util.TaobaoUtils;
import org.junit.Test;
import com.qimencloud.api.request.MyXiaoxuanttTestRequest.Item;
import com.qimencloud.api.response.MyXiaoxuanttTestResponse;
import com.taobao.api.ApiException;

/**
 * 奇门云SDK单元测试类
 * 
 * @author xiaoxuan.lp
 *
 */
public class DefaultQimenCloudClientTest {

	@Test
	public void test() throws ApiException {
		DefaultQimenCloudClient client = new DefaultQimenCloudClient(
				"http://qimen.api.taobao.com/router/qmtest", "24589063", "4b06a992fecf54da51d54e7fe602baaa"
		);

		TaobaoResponse res = client.execute(buildQimenRequest());
//		TestUtils.jsonPrintRes(res);
		System.out.println(res.getBody());
		System.out.println(res.isSuccess());
	}

	private static AlibabaWdkScmReturnOrderCreateRequest buildQimenRequest() {

		AlibabaWdkScmReturnOrderCreateRequest result = new AlibabaWdkScmReturnOrderCreateRequest();

		result.setTargetAppKey("24840229");

		AlibabaWdkScmReturnOrderCreateRequest.ScmRetrunOrderDo param = new AlibabaWdkScmReturnOrderCreateRequest.ScmRetrunOrderDo();
		param.setShopNo("123");
		param.setFactoryNo("123");

		param.setRetTime("123");
		param.setRetBillNo("123");
		param.setSupplyNo("123");

		List<AlibabaWdkScmReturnOrderCreateRequest.SkuList> paramSkuList = new ArrayList<AlibabaWdkScmReturnOrderCreateRequest.SkuList>();

		AlibabaWdkScmReturnOrderCreateRequest.SkuList paramSku = new AlibabaWdkScmReturnOrderCreateRequest.SkuList();
		paramSku.setRetNote("123");
		paramSku.setSkuCode("123");
		paramSku.setRetPrice("123");
		paramSku.setRetAmount("123");
		paramSku.setRetQuantity("123");

		paramSkuList.add(paramSku);

		param.setSkuList(paramSkuList);
		result.setParam(param);

		return result;
	}

	@Test
	public void testComYlpwUnionUserremarks() throws ApiException {
		DefaultQimenCloudClient qimenClient = new DefaultQimenCloudClient(
				"http://fc7u06fgo6.api.taobao.com/router/qm",
				"1111",
				"2222"
		);
		ComYlpwUnionUserremarksRequest.RemarkBody body = new ComYlpwUnionUserremarksRequest.RemarkBody();
		body.setUnionId(1212L);
		body.setUnionOrderId(String.valueOf(1212));
		body.setUserRemarks("");
		body.setIdentifyingCode("");
		ComYlpwUnionUserremarksRequest request = new ComYlpwUnionUserremarksRequest();
		request.setUserRemarksReq(body);
		request.setTargetAppKey(qimenClient.getAppKey());
		ComYlpwUnionUserremarksResponse resp = qimenClient.execute(request);
		System.out.println(resp.isSuccess());
		System.out.println(resp.getBody());
	}

	@Test
	public void testApiCallWithStructSDK2() throws ApiException {
		String url = "http://h8iez9ice7.daily.taobao.net/router/qm";
		String appkey = "60033374";
		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, appSecret);

		MyXiaoxuanttTestRequest request = new MyXiaoxuanttTestRequest();
		request.setId(123L);
		request.setName("xiaoxuan.lp");
		request.setTargetAppKey("60033374");
		request.setTopApiFormat("xml");

		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setId("111111");
		items.add(item);
		request.setItems(items);

		MyXiaoxuanttTestResponse response = client.execute(request);

		System.out.println("requestUrl:" + response.getRequestUrl());
		System.out.println("success:" + response.isSuccess());
		System.out.println("body:" + response.getBody());
		System.out.println("response json:" + TaobaoUtils.objectToJson(response));
	}

	@Test
	public void testApiCallWithStructSDK() throws ApiException {
		String url = "http://a80z6n2lov.daily.taobao.net/router/qm";
		String appkey = "60033374";
		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);

		MyXiaoxuanttTestRequest request = new MyXiaoxuanttTestRequest();
		request.setId(123L);
		request.setName("xiaoxuan.lp");
		request.setTargetAppKey("60033374");

		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setId("111111");
		items.add(item);
		request.setItems(items);

		MyXiaoxuanttTestResponse response = client.execute(request);

		System.out.println("requestUrl:" + response.getRequestUrl());
		System.out.println("body:" + response.getBody());
		System.out.println("result:" + (response.getResult() != null ? response.getResult().getData() : null));
	}

	@Test
	public void testApiCallWithSingleSDK() throws ApiException {
		String url = "http://h8iez9ice7.daily.taobao.net/router/qm";
		String appkey = "60033374";
		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);

		QimenCloudRequest request = new QimenCloudRequest();
		request.addQueryParam("id", "123");
		request.addQueryParam("user_name", "<aaaa>dddd</aaaa>");
		request.addQueryParam("items", "[{\"id\":\"<aaaa>abbb</aaaa>\"}]");
//		request.addQueryParam("mock_backend_sign", "1111");
		request.setApiMethodName("my.xiaoxuantt.test");
		request.setTargetAppKey("60033374");
		request.setBody("");
		request.setTopApiFormat("json");
		request.setContentType("xml|json|form"); //请求方式
		request.setResponseType("top|qimen|qimen2"); //响应格式，见https://lark.alipay.com/top/lk9uge/bwc86a

		QimenCloudResponse response = client.execute(request);
		System.out.println("requestUrl:" + response.getRequestUrl());
		System.out.println("body:" + response.getBody() + ",sub_code:" + response.getSubCode());
	}

//	/**
//	 * 结构化SDK调用
//	 *
//	 * @throws ApiException
//	 */
//	@Test
//	public void testApiCallWithStructSDK() throws ApiException {
//		String url = "http://a80z6n2lov.daily.taobao.net/router/qm";
//		String appkey = "60033374";
//		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		MyXiaoxuanttTestRequest request = new MyXiaoxuanttTestRequest();
//		request.setId(123L);
//		request.setName("xiaoxuan.lp");
//		request.setTargetAppKey("60033374");
//
//		List<Item> items = new ArrayList<Item>();
//		Item item = new Item();
//		item.setId("111111");
//		items.add(item);
//		request.setItems(items);
//
//		MyXiaoxuanttTestResponse response = client.execute(request);
//
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody());
//		System.out.println("result:" + (response.getResult() != null ? response.getResult().getData() : null));
//	}
//
//	@Test
//	public void testApiCallWithSingleSDK() throws ApiException {
//		String url = "http://a80z6n2lov.daily.taobao.net/router/qm";
//		String appkey = "60033374";
//		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("id", "123");
//		request.addQueryParam("user_name", "<aaaa>dddd</aaaa>");
//		request.addQueryParam("items", "[{\"id\":\"<aaaa>abbb</aaaa>\"}]");
////		request.addQueryParam("mock_backend_sign", "1111");
//		request.setApiMethodName("my.xiaoxuantt.test");
//		request.setTargetAppKey("60033374");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithSingleSDK2() throws ApiException {
//		String url = "http://h8iez9ice7.daily.taobao.net/router/qm";
//		String appkey = "60033739";
//		String appSecret = "5b461210d116444fe0234f0cb806b9f5";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("useType", "1");
//		request.addQueryParam("isCorpOrder", "false");
//		request.addQueryParam("fromPlaceInfo", "{\"fromAddress\":\"杭州\",\"fromDetailAddress\":\"杭州萧山国际机场\",\"fromLatitude\":\"30.2359486\",\"fromLongitude\":\"120.4388907\"}");
////		request.addQueryParam("mock_backend_sign", "1111");
////		request.addQueryParam(key, value);
//		request.setApiMethodName("fliggy.tripcar.search.transferqueryprice");
//		request.setTargetAppKey("60033739");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre() throws ApiException {
//		String url = "http://j6778fdz70.api.taobao.com/router/qmtest";
//		String appkey = "23558957";
//		String appSecret = "******";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("id", "1");
//		request.addQueryParam("user_name", "xiaoxuan.lp");
//		request.setApiMethodName("xiaoxuan.demo.test");
//		request.setTargetAppKey("23558957");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre2() throws ApiException {
//		String url = "http://850w9vkp34.api.taobao.com/router/qmtest";
//		String appkey = "23131925";
//		String appSecret = "033eecec4f556f838d404e1652f85d48";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//		client.signMethod = Constants.SIGN_METHOD_MD5;
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("order_id", "123");
////		request.addQueryParam("mock_backend_sign", UUID.randomUUID().toString());
//		request.setApiMethodName("biyi.ecsorder.sync");
//		request.setTargetAppKey("23131925");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre3() throws ApiException {
//		String url = "http://kmfh1v1835.api.taobao.com/router/qmtest";
//		String appkey = "23309962";
//		String appSecret = "0af49ebe9e6c8df959faeba0fe86001e";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("channelId", "3710660735");
//		request.addQueryParam("traceId", "1");
////		request.addQueryParam("mock_backend_sign", UUID.randomUUID().toString());
//		request.setApiMethodName("fliggy.bus.product.querycity");
//		request.setTargetAppKey("23309962");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre4() throws ApiException {
//		String url = "http://kmfh1v1835.api.taobao.com/router/qmtest";
//		String appkey = "23309962";
//		String appSecret = "0af49ebe9e6c8df959faeba0fe86001e";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		FliggyBusProductQuerycityRequest request = new FliggyBusProductQuerycityRequest();
//		request.setChannelId("3710660735");
//		request.setTraceId("1");
//		request.setTargetAppKey("23309962");
//
//		FliggyBusProductQuerycityResponse response = client.execute(request);
//
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody());
//	}
//
//	@Test
//	public void testApiCallWithPre5() throws ApiException {
//		String url = "http://kmfh1v1835.api.taobao.com/router/qmtest";
//		String appkey = "23309962";
//		String appSecret = "0af49ebe9e6c8df959faeba0fe86001e";
//		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		JinshiyuanQimenDeliveryorderBatchcreateRequest request = new JinshiyuanQimenDeliveryorderBatchcreateRequest();
//		request.setTargetAppKey("23309962");
//		SalesOrder zifCreateSalesorder = new SalesOrder();
//		List<OrderItem> tOrderItem = new ArrayList<JinshiyuanQimenDeliveryorderBatchcreateRequest.OrderItem>();
//		OrderItem orderItem = new OrderItem();
//		JinshiyuanQimenDeliveryorderBatchcreateRequest.Item item = new JinshiyuanQimenDeliveryorderBatchcreateRequest.Item();
//		item.setAuart("123");
//		orderItem.setItem(item);
//		tOrderItem.add(orderItem);
//		zifCreateSalesorder.settOrderItem(tOrderItem);
//		request.setZifCreateSalesorder(zifCreateSalesorder);
//
//		JinshiyuanQimenDeliveryorderBatchcreateResponse response = client.execute(request);
//
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody());
//	}
//
//	@Test
//	public void testApiCallWithPre6() throws ApiException {
//		String url = "http://j6778fdz70.api.taobao.com/router/qmtest";
//		String appkey = "23558957";
//		String appSecret = "7ef27326ccf1a243c6ec4b2e53314683";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("id", "1");
//		request.addQueryParam("serviceResponse", "true");
//		request.setApiMethodName("my.xiaoxuantt.test");
//		request.setTargetAppKey("23558957");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre7() throws ApiException {
//		String url = "http://20753d6r56.api.taobao.com/router/qmtest";
//		String appkey = "23329056";
//		String appSecret = "1c350144173cc11b25dd6f20d8551979";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("id", "0");
//		request.addQueryParam("data", "<?xml version=\"1.0\" encoding=\"utf-8\"?>  <soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">   <soap:Body>       <ZIF_CREATE_SALESORDER_TM xmlns=\"urn:sap-com:document:sap:rfc:functions\">       <T_ORDERHEAD xmlns=\"\">         <item>           <KUNNR>10000139</KUNNR>           <KUNNR_TO>10000139</KUNNR_TO>           <BSTKD>SO201702200020091250</BSTKD>           <AUART>ZOE</AUART>           <KBETR_ALL>159.00</KBETR_ALL>           <NAME>沈波</NAME>           <TONAME />         </item>       </T_ORDERHEAD>       <T_ORDERITEM xmlns=\"\">         <item>           <BSTKD>SO201702200020091250</BSTKD>           <AUART>ZOE</AUART>           <POSNR>1</POSNR>           <MATNR>101215</MATNR>           <ARKTX>259.00</ARKTX>           <CHARG>1.00</CHARG>           <KBETR>5101</KBETR>           <WMENG>0</WMENG>           <LGORT>5101</LGORT>           <WERKS>3500</WERKS>           <GIVEAWAY />         </item>       </T_ORDERITEM>     </ZIF_CREATE_SALESORDER_TM>   </soap:Body> </soap:Envelope>");
//		request.setApiMethodName("jinshiyuan.qimen.deliveryorder.batchcreate");
//		request.setTargetAppKey("23329056");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//
////		Map<String, Object> responseMap =  JSON.parseObject(response.getBody(), new TypeReference<Map<String, Object>>(){});
////		@SuppressWarnings("unchecked")
////		Map<String, Object> childMap = (Map<String, Object>)responseMap.get("response");
////		String xml = (String)childMap.get("returnData");
////
////		System.out.println("xml:" + xml);
//	}
//
//	@Test
//	public void testApiCallWithPre8() throws ApiException {
//		String url = "http://a1q40taq0j.api.taobao.com/router/qmtest";
//		String appkey = "23060081";
//		String appSecret = "a15c4fef062d95808251dca2ba517490";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret, Constants.FORMAT_JSON, 15000, 30000, Constants.SIGN_METHOD_MD5);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("partnerid", "1");
//		request.addQueryParam("token", "121212");
//		request.addQueryParam("ts", "121212");
//		request.addQueryParam("jstsign", "12333");
//		request.addQueryParam("shop_id", "1");
//		request.addQueryParam("page_index", "0");
//		request.addQueryParam("page_size", "10");
//		request.setApiMethodName("jst.orders.query");
//		request.setTargetAppKey("23060081");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre9() throws ApiException {
//		String url = "http://a80z6n2lov.daily.taobao.net/router/qm";
//		String appkey = "60033374";
//		String appSecret = "6b75dc8d45106d204b2ce58b37624d80";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("mobileNum", "13488888888");
//		request.addQueryParam("serviceResponse", "true");
//		request.setApiMethodName("taobao.feizhu.test");
//		request.setTargetAppKey("60033374");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
//
//	@Test
//	public void testApiCallWithPre10() throws Exception {
//		String url = "http://j6778fdz70.api.taobao.com/router/qmtest";
//		String appkey = "23558957";
//		String appSecret = "7ef27326ccf1a243c6ec4b2e53314683";
//		DefaultQimenCloudClient client = new DefaultQimenCloudClient(url, appkey, appSecret);
//
//		//设置代理
//		InetSocketAddress address = new InetSocketAddress(InetAddress.getByName("140.205.57.248"), 80);
//		Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
//		client.setProxy(proxy);
//
//		QimenCloudRequest request = new QimenCloudRequest();
//		request.addQueryParam("user_name", "111");
//		request.addQueryParam("id", "1");
//		request.addQueryParam("items", "{\"id\":\"123\",\"price\":\"1.00\"}");
//		request.addQueryParam("serviceResponse", "true");
//		request.setApiMethodName("my.xiaoxuantt.test");
//		request.setTargetAppKey("23558957");
//
//		QimenCloudResponse response = client.execute(request);
//		System.out.println("requestUrl:" + response.getRequestUrl());
//		System.out.println("body:" + response.getBody() + ",flag:" + response.getFlag() + ",sub_code:" + response.getSubCode());
//	}
}
