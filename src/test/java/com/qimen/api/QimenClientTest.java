package com.qimen.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qimencloud.api.QimenCloudRequest;
import com.qimencloud.api.QimenCloudResponse;
import com.taobao.api.Constants;
import com.qimencloud.api.DefaultQimenCloudClient;
import com.qimen.api.reqrsp.StoreprocessConfirmResponse;
import com.qimen.api.reqrsp.StoreprocessConfirmRequest.ProductItem;
import com.qimen.api.reqrsp.StoreprocessConfirmRequest.MaterialItem;
import com.qimen.api.reqrsp.StoreprocessConfirmRequest;
import org.junit.Test;
import com.qimen.api.reqrsp.OrderprocessReportRequest;
import com.qimen.api.reqrsp.OrderprocessReportResponse;
import com.qimen.api.reqrsp.OrderprocessReportRequest.Order;
import com.qimen.api.reqrsp.OrderprocessReportRequest.Process;
import com.taobao.api.ApiException;

public class QimenClientTest {

	@Test
	public void testApiCall() throws ApiException {
		QimenClient client = new DefaultQimenClient("http://qimenapi.tbsandbox.com/router/qimen/service", "testerp_appkey", "sandboxe014f2b9a8031cdf928955f2f");
		OrderprocessReportRequest req = new OrderprocessReportRequest();
		req.setCustomerId("stub-cust-code");
		req.setVersion("2.0");
		Order order = new Order();
		order.setOrderId("123456789");
		order.setOrderCode("987654321");
		order.setOrderType("JYCK");
		order.setWarehouseCode("W001");
		req.setOrder(order);
		Process process = new Process();
		process.setProcessStatus("ACCEPT");
		process.setOperatorCode("26712");
		process.setOperatorName("GFS");
		process.setOperateTime(new Date());
		process.setOperateInfo("Hello World");
		process.setRemark("How are you doing?>");
		req.setProcess(process);
		OrderprocessReportResponse rsp = client.execute(req);
		System.out.println(rsp.isSuccess());
		System.out.println(rsp.getBody());
		System.out.println(rsp.getMessage());
	}

	@Test
	public void testApiCall2() throws ApiException {
		QimenClient client = new DefaultQimenClient("http://qimenapi.tbsandbox.com/router/qimen/service", "qimen", "6445A1FD00002A9F0000008929C0D077");

		StoreprocessConfirmRequest request = new StoreprocessConfirmRequest();
		request.setVersion("2.0");
		request.setCustomerId("__test_27623409543");

		// 1、结构化入参
		request.setProcessOrderCode("加工单编码, string (50) , 必填");
		request.setProcessOrderId("仓储系统加工单ID, string (50) , 条件必填");
		request.setOutBizCode("外部业务编码, 一个合作伙伴中要求唯一多次确认时, 每次传入要求唯一");
		request.setOrderType("CNJG");
		request.setOrderCompleteTime("2015-12-12 12:12:12");
		request.setActualQty(123L);
		Map<String, String> extendProps = new HashMap<String, String>();
		extendProps.put("key1", "value1");
		extendProps.put("key2", "value2");
		request.setExtendProps(extendProps);
		request.setRemark("备注, string (500)");

		List<MaterialItem> materialitems = new ArrayList<StoreprocessConfirmRequest.MaterialItem>();
		MaterialItem item = new MaterialItem();
		item.setItemCode("QYC-BL20018020BLG");
		item.setItemId("cainiao-QYC-BL20018020BLG");
		item.setInventoryType("ZP");
		item.setQuantity(123L);
		item.setProductDate("2015-05-06");
		item.setExpireDate("2015-12-12");
		item.setProduceCode("20150506111111");
		item.setBatchCode("QYC-BL20018020BLG");
		item.setRemark("备注, string (500)");
		materialitems.add(item);
		request.setMaterialitems(materialitems);

		List<ProductItem> productitems = new ArrayList<StoreprocessConfirmRequest.ProductItem>();
		ProductItem productItem = new ProductItem();
		productItem.setItemCode("QYC-BL20018020BLG");
		productItem.setItemId("cainiao-QYC-BL20018020BLG");
		productItem.setInventoryType("ZP");
		productItem.setQuantity(12L);
		productItem.setProductDate("2015-05-06");
		productItem.setExpireDate("2015-12-12");
		productItem.setProduceCode("20150506111111");
		productItem.setBatchCode("QYC-BL20018020BLG");
		productItem.setRemark("备注, string (500)");
		productitems.add(productItem);
		request.setProductitems(productitems);

		// 2、直接填充报文
//		request.setBody("<request><actualQty>123</actualQty><extendProps><key1>value1</key1><key2>value2</key2></extendProps><materialitems><item><batchCode>QYC-BL20018020BLG</batchCode><expireDate>2015-12-12</expireDate><inventoryType>ZP</inventoryType><itemCode>QYC-BL20018020BLG</itemCode><itemId>cainiao-QYC-BL20018020BLG</itemId><produceCode>20150506111111</produceCode><productDate>2015-05-06</productDate><quantity>123</quantity><remark>备注, string (500)</remark></item></materialitems><orderCompleteTime>2015-12-12 12:12:12</orderCompleteTime><orderType>CNJG</orderType><outBizCode>外部业务编码, 一个合作伙伴中要求唯一多次确认时, 每次传入要求唯一</outBizCode><processOrderCode>加工单编码, string (50) , 必填</processOrderCode><processOrderId>仓储系统加工单ID, string (50) , 条件必填</processOrderId><productitems><item><batchCode>QYC-BL20018020BLG</batchCode><expireDate>2015-12-12</expireDate><inventoryType>ZP</inventoryType><itemCode>QYC-BL20018020BLG</itemCode><itemId>cainiao-QYC-BL20018020BLG</itemId><produceCode>20150506111111</produceCode><productDate>2015-05-06</productDate><quantity>12</quantity><remark>备注, string (500)</remark></item></productitems><remark>备注, string (500)</remark></request>");

		StoreprocessConfirmResponse response = client.execute(request);
		System.out.println(response.isSuccess());
		System.out.println(response.getBody());
		System.out.println(response.getMessage());
	}

	@Test
	public void testApiCall3() throws ApiException {
		DefaultQimenCloudClient client = new DefaultQimenCloudClient("http://qimenapi.tbsandbox.com/router/qimen/service",
				"qimen", "6445A1FD00002A9F0000008929C0D077", "xml");

		// 1、结构化入参
//		com.qimencloud.api.request.StoreprocessConfirmRequest request = new com.qimencloud.api.request.StoreprocessConfirmRequest();
//		request.putOtherTextParam("customerId", "__test_27623409543");
//
//		request.setProcessOrderCode("加工单编码, string (50) , 必填");
//		request.setProcessOrderId("仓储系统加工单ID, string (50) , 条件必填");
//		request.setOutBizCode("外部业务编码, 一个合作伙伴中要求唯一多次确认时, 每次传入要求唯一");
//		request.setOrderType("CNJG");
//		request.setOrderCompleteTime("2015-12-12 12:12:12");
//		request.setActualQty(123L);
//		Map<String, String> extendProps = new HashMap<String, String>();
//		extendProps.put("key1", "value1");
//		extendProps.put("key2", "value2");
//		request.setExtendProps(extendProps);
//		request.setRemark("备注, string (500)");
//
//		List<com.qimencloud.api.request.StoreprocessConfirmRequest.MaterialItem> materialitems = new ArrayList<com.qimencloud.api.request.StoreprocessConfirmRequest.MaterialItem>();
//		com.qimencloud.api.request.StoreprocessConfirmRequest.MaterialItem item = new com.qimencloud.api.request.StoreprocessConfirmRequest.MaterialItem();
//		item.setItemCode("QYC-BL20018020BLG");
//		item.setItemId("cainiao-QYC-BL20018020BLG");
//		item.setInventoryType("ZP");
//		item.setQuantity(123L);
//		item.setProductDate("2015-05-06");
//		item.setExpireDate("2015-12-12");
//		item.setProduceCode("20150506111111");
//		item.setBatchCode("QYC-BL20018020BLG");
//		item.setRemark("备注, string (500)");
//		materialitems.add(item);
//		request.setMaterialitems(materialitems);
//
//		List<com.qimencloud.api.request.StoreprocessConfirmRequest.ProductItem> productitems = new ArrayList<com.qimencloud.api.request.StoreprocessConfirmRequest.ProductItem>();
//		com.qimencloud.api.request.StoreprocessConfirmRequest.ProductItem productItem = new com.qimencloud.api.request.StoreprocessConfirmRequest.ProductItem();
//		productItem.setItemCode("QYC-BL20018020BLG");
//		productItem.setItemId("cainiao-QYC-BL20018020BLG");
//		productItem.setInventoryType("ZP");
//		productItem.setQuantity(12L);
//		productItem.setProductDate("2015-05-06");
//		productItem.setExpireDate("2015-12-12");
//		productItem.setProduceCode("20150506111111");
//		productItem.setBatchCode("QYC-BL20018020BLG");
//		productItem.setRemark("备注, string (500)");
//		productitems.add(productItem);
//		request.setProductitems(productitems);

		// 2、直接填充报文
		QimenCloudRequest request = new QimenCloudRequest();
		request.setApiMethodName("taobao.qimen.storeprocess.confirm");
		request.addQueryParam("customerId", "__test_27623409543");
		request.setBody("<request><actualQty>123</actualQty><extendProps><key1>value1</key1><key2>value2</key2></extendProps><materialitems><item><batchCode>QYC-BL20018020BLG</batchCode><expireDate>2015-12-12</expireDate><inventoryType>ZP</inventoryType><itemCode>QYC-BL20018020BLG</itemCode><itemId>cainiao-QYC-BL20018020BLG</itemId><produceCode>20150506111111</produceCode><productDate>2015-05-06</productDate><quantity>123</quantity><remark>备注, string (500)</remark></item></materialitems><orderCompleteTime>2015-12-12 12:12:12</orderCompleteTime><orderType>CNJG</orderType><outBizCode>外部业务编码, 一个合作伙伴中要求唯一多次确认时, 每次传入要求唯一</outBizCode><processOrderCode>加工单编码, string (50) , 必填</processOrderCode><processOrderId>仓储系统加工单ID, string (50) , 条件必填</processOrderId><productitems><item><batchCode>QYC-BL20018020BLG</batchCode><expireDate>2015-12-12</expireDate><inventoryType>ZP</inventoryType><itemCode>QYC-BL20018020BLG</itemCode><itemId>cainiao-QYC-BL20018020BLG</itemId><produceCode>20150506111111</produceCode><productDate>2015-05-06</productDate><quantity>12</quantity><remark>备注, string (500)</remark></item></productitems><remark>备注, string (500)</remark></request>");

		QimenCloudResponse response = client.execute(request);
		System.out.println(response.isSuccess());
		System.out.println(response.getBody());
		System.out.println(response.getMsg());
	}
}
