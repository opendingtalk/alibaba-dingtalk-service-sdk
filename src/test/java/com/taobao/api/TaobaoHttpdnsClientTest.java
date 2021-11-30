package com.taobao.api;

import java.util.Date;

import org.junit.Test;

import com.qimen.api.DefaultQimenClient;
import com.qimen.api.reqrsp.OrderprocessReportRequest;
import com.qimen.api.reqrsp.OrderprocessReportResponse;
import com.qimen.api.reqrsp.OrderprocessReportRequest.Order;
import com.qimen.api.reqrsp.OrderprocessReportRequest.Process;
import com.taobao.api.reqrsp.TradeFullinfoGetRequest;
import com.taobao.api.reqrsp.TradeFullinfoGetResponse;

public class TaobaoHttpdnsClientTest {
    
    public static final String APP_KEY = "test";
    public static final String APP_SECRET = "test";
    public static final String SESSION_KEY = "test";
    public static final Long   TID = 0l;
    
    @Test
    public void testHttpdnsClient(){
        HttpdnsClient.init(APP_KEY, APP_SECRET);
        for(int i=0; i< 10; i++){
            System.out.println("======gwapi========:" + HttpdnsClient.getUrl("http://gw.api.taobao.com/top/router/rest?a=a&b=b&c=c"));
            System.out.println("======ecoapi=======:" + HttpdnsClient.getUrl("https://eco.taobao.com/top/router/rest?a=a&b=b&c=c&s=你好啊&sb=%67687s%gshdggg"));
            System.out.println("======qimenapi=====:" + HttpdnsClient.getUrl("http://qimen.api.taobao.com/router/qimen?a=a&b=b&c=c"));
            System.out.println("======qimenhttps===:" + HttpdnsClient.getUrl("https://qimen.api.taobao.com/router/qimen?a=a&b=b&c=c"));
            System.out.println("==============================================");
        }
        long timestart = System.currentTimeMillis();
        for(int i=0; i< 100000; i++){
            HttpdnsClient.getUrl("http://gw.api.taobao.com/top/router/rest?a=a&b=b&c=c");
            HttpdnsClient.getUrl("https://eco.taobao.com/top/router/rest?a=a&b=b&c=c");
            HttpdnsClient.getUrl("http://qimen.api.taobao.com/router/qimen?a=a&b=b&c=c");
            HttpdnsClient.getUrl("https://qimen.api.taobao.com/router/qimen?a=a&b=b&c=c");
        }
        System.out.println("==============================================time:" + (System.currentTimeMillis() - timestart));
        
    }
    
    
    @Test
    public void testTaobaoClient() throws ApiException{
        DefaultTaobaoClient  client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", APP_KEY, APP_SECRET);
        TradeFullinfoGetRequest  fullinfoRequest1 = new TradeFullinfoGetRequest();
        fullinfoRequest1.setFields("tid,type,status,payment,orders");
        fullinfoRequest1.setTid(TID);
        TradeFullinfoGetResponse response = client.execute(fullinfoRequest1, SESSION_KEY);
        System.out.println("http invoke:" + response.getBody());
        
    }
    
    @Test
    public void testTaobaoClientHttpDns() throws ApiException{
        DefaultTaobaoClient  client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", APP_KEY, APP_SECRET);
        client.enableHttpDns();
        TradeFullinfoGetRequest  fullinfoRequest1 = new TradeFullinfoGetRequest();
        fullinfoRequest1.setFields("tid,type,status,payment,orders");
        fullinfoRequest1.setTid(TID);
        TradeFullinfoGetResponse response = client.execute(fullinfoRequest1, SESSION_KEY);
        System.out.println("http invoke:" + response.getBody());
        
    }
    
    
    @Test
    public void testTaobaoClient2() throws ApiException{
        DefaultTaobaoClient  client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", APP_KEY, APP_SECRET,"xml");
        TradeFullinfoGetRequest  fullinfoRequest1 = new TradeFullinfoGetRequest();
        fullinfoRequest1.setFields("tid,type,status,payment,orders");
        fullinfoRequest1.setTid(TID);
        TradeFullinfoGetResponse response = client.execute(fullinfoRequest1, SESSION_KEY);
        System.out.println("http invoke:" + response.getBody());
        
    }
    
    @Test
    public void testTaobaoClientHttpDns2() throws ApiException{
        DefaultTaobaoClient  client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", APP_KEY, APP_SECRET,"xml");
        client.enableHttpDns();
        TradeFullinfoGetRequest  fullinfoRequest1 = new TradeFullinfoGetRequest();
        fullinfoRequest1.setFields("tid,type,status,payment,orders");
        fullinfoRequest1.setTid(TID);
        TradeFullinfoGetResponse response = client.execute(fullinfoRequest1, SESSION_KEY);
        System.out.println("http invoke:" + response.getBody());
        
    }
    
    
    @Test
    public void testQimenClient() throws ApiException {
        DefaultQimenClient client = new DefaultQimenClient("http://qimenapi.tbsandbox.com/router/qimen/service", "testerp_appkey", "sandboxe014f2b9a8031cdf928955f2f");
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
    public void testQimenClientHttpDns() throws ApiException {
        DefaultQimenClient client = new DefaultQimenClient("http://qimenapi.tbsandbox.com/router/qimen/service", "testerp_appkey", "sandboxe014f2b9a8031cdf928955f2f");
        client.enableHttpDns(APP_KEY, APP_SECRET);
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
    public void testQimenClient2() throws ApiException {
        DefaultQimenClient client = new DefaultQimenClient("https://qimen.api.taobao.com/router/qimen/service", "testerp_appkey", "sandboxe014f2b9a8031cdf928955f2f");
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
    public void testQimenClientHttpDns2() throws ApiException {
        DefaultQimenClient client = new DefaultQimenClient("https://qimen.api.taobao.com/router/qimen/service", "testerp_appkey", "sandboxe014f2b9a8031cdf928955f2f");
        client.enableHttpDns(APP_KEY, APP_SECRET);
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

    
    
}
