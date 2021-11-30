package com.taobao.tmc;

import org.junit.Test;

import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.tmc.TmcClient;

public class TmcReceiveTest {

	private static final String APP_KEY = "12497914";
	private static final String APP_SECRET = "4b0f28396e072d67fae169684613bcd1";

	public static final String TMC_DAILY_URL = "ws://mc.api.daily.taobao.net/";
	public static final String TMC_ONLINE_URL = "ws://mc.api.taobao.com/";
	public static final String TMC_PREPUB_URL = "ws://42.120.80.245:80/";
	public static final String TMC_SANDBOX_URL = "ws://mc.api.tbsandbox.com/";

	@Test
	public void onMessage() throws Exception {
		TmcClient client = new TmcClient(APP_KEY, APP_SECRET, "default");
		client.setFetchPeriod(5);
		client.setThreadCount(100);
		client.setMessageHandler(new MessageHandler() {
			public void onMessage(Message message, MessageStatus status) {
				System.out.println(message.getUserNick() + "=" + message.getContent());
			}
		});
		client.connect("ws://mc.api.taobao.com", true);
		Thread.sleep(500000L);
	}

}
