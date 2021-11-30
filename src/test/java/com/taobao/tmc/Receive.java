package com.taobao.tmc;

import java.util.concurrent.atomic.AtomicInteger;

import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.tmc.TmcClient;

@SuppressWarnings("unused")
public class Receive {

	private final AtomicInteger count = new AtomicInteger(0);
    
	public static void main(String[] args) throws Exception{
		new Receive().receiveMessage();
	}
	
	public void receiveMessage() throws Exception {
		String tmcUrl = "ws://127.0.0.1:8000/"; // 日常环境1R
//		String tmcUrl = "ws://30.5.108.16:8000/"; // 日常环境1
//		String tmcUrl = "ws://10.101.84.46:8000/"; // 日常环境1
//		String tmcUrl = "wss://eco.taobao.com/router/rest"; // 日常环境1
//	    String tmcUrl = "ws://mc.api.tbsandbox.com"; // 日常环境
//	    String tmcUrl = "ws://140.205.173.120/"; // 预发环境
//	    String tmcUrl_bet = "ws://140.205.173.120/"; // 预发环境	
	    String tmcUrl_pre = "ws://premc.api.taobao.com/"; // 预发环境
//	    String tmcUrl_pre = "ws://140.205.133.96/"; // 预发环境
//	    String appkey = "453528";
//	    String appSecret = "d17cec728b43b9f5e04df5e4b8b4fe68";
//	    String appkey = "453615";
//	    String appSecret = "aa157cc69f48496e14bf2d4d729d6d2a";
	    String appkey = "453509";
	    String appSecret = "5642f38e5840714d77beb0574447f204";
	    String appkey2 = "437037";
	    String appSecret2 = "a380d586c5d4f1fcf264c74d21ee0140";
	    String appkey3 = "1024619178";
	    String appSecret3 = "sandbox48a9fdc0b5839a21387b0748d";
	    String appkey4 = "437037";
	    String appSecret4 = "fc987ceac9c611ee6e31318da69bac43";
	    String appkey5 = "1023546963";
	    String appSecret5 = "sandbox600e6a35d9c38a35e623b0b71";
//	    String appkey = "437037";
//	    String appSecret = "fc987ceac9c611ee6e31318da69bac43";
//	    String appkey = "60027980";
//	    String appSecret = "c2ce84f4a817ccfc4296666e75d39041";
//	    String group = "default";
//	    String appkey_n = "23371958";
//	    String appSecret_n = "d144f9e90d20df47215ac9f5392244a9";
	    String tmcUrl_bet = "ws://140.205.173.120/"; // beta环境
	    String appkey_n = "23021137";
	    String appSecret_n = "2092fca6ee2d8613ad79dcf44b60630e";
	    String appkey_n2 = "24765205";
	    String appSecret_n2 = "67505cda766eb8f6a9f117451b5275ba";
//	    String appkey_n = "24662099";
//	    String appSecret_n = "0b2e765700c16bb1df49d1afc17689ed";
		String tmcUrl_daily = "ws://mc.api.daily.taobao.net/"; 
//		String tmcUrl_daily = "ws://mc.api.tbsandbox.com/"; 
//	    String tmcUrl = "ws://mc.api.taobao.com/";

	    final  TmcClient tmcClient=new TmcClient(tmcUrl_daily,appkey2,appSecret2,"default");
//	    final  TmcClient tmcClient=new TmcClient(tmcUrl_pre,appkey_n,appSecret_n,"default");
		tmcClient.setAuthApiUrl(null);
		
	    final AtomicInteger iCount = new AtomicInteger(0);
//	    tmcClient.setFetchPeriod(1);
	    tmcClient.setMessageHandler(new MessageHandler() {
	        public void onMessage(Message message, MessageStatus status) throws Exception {
	            try{
	            	System.out.println("id:"+message.getId()+" pubTime:"+message.getPubTime()+" "+message.getContent());
	            }catch(Exception e) {
	            	e.printStackTrace();
	                throw e; // 抛出异常消息会自动重发
	            } finally {
	            }
	        }
	    });
	    tmcClient.connect();
	    
	    Thread.sleep(100000000);
	}
}


