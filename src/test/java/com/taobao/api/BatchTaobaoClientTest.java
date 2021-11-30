package com.taobao.api;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import com.taobao.api.reqrsp.TimeGetRequest;
import com.taobao.api.reqrsp.TimeGetResponse;
import com.taobao.api.reqrsp.TradeFullinfoGetRequest;
import com.taobao.api.reqrsp.TradeFullinfoGetResponse;

public class BatchTaobaoClientTest {

    private static BatchTaobaoClient client = new BatchTaobaoClient("http://api.daily.taobao.net/router/batch", "4272", "0ebbcccfee18d7ad1aebc5b135ffa906");

	static {
		client.setIgnoreSSLCheck(true);
		client.setBatchApiSeparator("%!");
	}

    public static void main(String[] args) throws ApiException, URISyntaxException, MalformedURLException {
        TaobaoBatchRequest batchRequest = new TaobaoBatchRequest();

        TimeGetRequest timeGetRequest1 = new TimeGetRequest();
        TimeGetRequest timeGetRequest2 = new TimeGetRequest();
        TimeGetRequest timeGetRequest3 = new TimeGetRequest();
        TimeGetRequest timeGetRequest4 = new TimeGetRequest();
        TradeFullinfoGetRequest  fullinfoRequest1 = new TradeFullinfoGetRequest();
        fullinfoRequest1.setBatchApiSession("6102b110f51625dcd2d1921ba80c6d2b43a2a5a37e7c7c73627811065");
        fullinfoRequest1.setTid(193923500416510l);
        fullinfoRequest1.setFields("tid,type,status,payment,orders,receiver_address,receiver_mobile,receiver_name");
        TradeFullinfoGetRequest  fullinfoRequest2 = new TradeFullinfoGetRequest();
        fullinfoRequest2.setBatchApiSession("6102b110f51625dcd2d1921ba80c6d2b143a2a5a37e7c7c73627811065");
        fullinfoRequest2.setTid(123l);
        TradeFullinfoGetRequest  fullinfoRequest3 = new TradeFullinfoGetRequest();
        fullinfoRequest3.setTid(193923500416510l);
        TradeFullinfoGetRequest  fullinfoRequest4 = new TradeFullinfoGetRequest();
        fullinfoRequest4.setTid(193923500416510l);
        TradeFullinfoGetRequest  fullinfoRequest5 = new TradeFullinfoGetRequest();
        fullinfoRequest5.setTid(193923500416510l);
        TradeFullinfoGetRequest  fullinfoRequest6 = new TradeFullinfoGetRequest();
        fullinfoRequest6.setTid(193923500416510l);
        
        batchRequest.addRequest(timeGetRequest1)
                    .addRequest(timeGetRequest2)
                    .addRequest(timeGetRequest3)
                    .addRequest(timeGetRequest4)
                    .addRequest(fullinfoRequest1)
                    .addRequest(fullinfoRequest2)
                    .addRequest(fullinfoRequest3)
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(new TimeGetRequest())
                    .addRequest(fullinfoRequest4)
                    .addRequest(fullinfoRequest5)
                    .addRequest(fullinfoRequest6)
                    .addRequest(new TimeGetRequest());
        
        //设置公共参数
        batchRequest.addPublicParam("fields", "tid,type,status,payment,orders,receiver_address,receiver_mobile,receiver_name");
        
        TaobaoBatchResponse response = client.execute(batchRequest, "6102b110f51625dcd2d1921ba80c6d2b43a2a5a37e7c7c73627811065");
        
        
        System.out.println("===============SIMPLE TEST START===================");
        if (response.isSuccess()) {
            for (int i = 0; i < response.getResponseList().size(); i++) {
                System.out.println("request body " + (i + 1) + " : " + response.getResponseList().get(i).getBody());
            }
            TimeGetResponse timeGetResponse3 =  (TimeGetResponse)response.getResponseList().get(2);
            System.out.println("====invoke timeGetResponse3.getTime() : " + timeGetResponse3.getTime());
            TradeFullinfoGetResponse fullinfoResponse1 =  (TradeFullinfoGetResponse)response.getResponseList().get(4);
            if(fullinfoResponse1.isSuccess()){
               System.out.println("====invoke fullinfoResponse1.getTrade().getReceiverName() : " + fullinfoResponse1.getTrade().getReceiverName());
            }
            //第二种取值方式
            TimeGetResponse timeGetResponse1  =  response.getResponse(timeGetRequest1);
            if(timeGetResponse1.isSuccess()){
                System.out.println("取值方式2:" + timeGetResponse1.getTime());
            }
            
            TradeFullinfoGetResponse fullinfoResponse3  =  response.getResponse(fullinfoRequest3);
            System.out.println(fullinfoResponse3.getBody());
           
           
        }else{
            System.out.println("error Body:" + response.getBody());
            System.out.println("error ErrorCode:" + response.getErrorCode());
            System.out.println("error SubCode:" + response.getSubCode());
            System.out.println("error msg:" + response.getMsg());
            System.out.println("error SubMsg:" + response.getSubMsg());
        }
        System.out.println("===============SIMPLE TEST END======================");

    }
}
