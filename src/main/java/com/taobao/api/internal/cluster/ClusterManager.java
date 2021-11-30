package com.taobao.api.internal.cluster;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class ClusterManager {

	private static final Log log = LogFactory.getLog(ClusterManager.class);

	private static final Random random = new Random();
	private static final Object initLock = new Object();
	private static volatile DnsConfig dnsConfig = null;
	private static volatile Thread refreshThread = null;
	
	private static String defaultServerUrl = "http://gw.api.taobao.com/top/router/rest";
    
	private static Set<String> terminationCodeSet = new HashSet<String>();
	
	static{
	    terminationCodeSet.add("21");
	    terminationCodeSet.add("22");
	    terminationCodeSet.add("25");
	    terminationCodeSet.add("28");
	    terminationCodeSet.add("29");
	}
	
	
	public static <T extends Weightable> T getElementByWeight(List<T> list) {
		T selected = null;
		double totalWeight = 0d;
		for (T element : list) {
			double r = random.nextDouble() * (element.getWeight() + totalWeight);
			if (r >= totalWeight) {
				selected = element;
			}
			totalWeight += element.getWeight();
		}
		return selected;
	}

	public static DnsConfig GetDnsConfigFromCache() {
		return dnsConfig;
	}
	
	public static void initRefreshThread(String appkey, String appSecret){
	    initRefreshThread(new DefaultTaobaoClient(defaultServerUrl, appkey, appSecret));
	}

	public static void initRefreshThread(final DefaultTaobaoClient client){
		if (refreshThread == null) {
			synchronized (initLock) {
				if (refreshThread == null) {
					try {
						dnsConfig = getDnsConfigFromTop(client);
					} catch (ApiException apiException) {
						if (apiException.getErrCode() != null && terminationCodeSet.contains(apiException.getErrCode())) {
						    log.error("http dns server termination,errCode:" + apiException.getErrCode() + "," + apiException.getErrMsg());
						    return; // 如果HTTP DNS服务不存在，则退出守护线程
						} 
						log.error("get http dns config from top fail," + apiException.getErrCode() + "," + apiException.getErrMsg());
					}catch(Exception e){
					    log.error("get http dns config from top fail", e);
					}

					refreshThread = new Thread(new Runnable() {
						public void run() {
							while (true) {
								try {
								    int refreshInterval =  dnsConfig == null ? 1 : dnsConfig.getRefreshInterval();
									sleep(refreshInterval * 60 * 1000L);
									
									DnsConfig rempteConfig = getDnsConfigFromTop(client);
									if(rempteConfig != null && rempteConfig.getVersion() > dnsConfig.getVersion()){
										dnsConfig = rempteConfig;
									}
									//如果配置请求成功，那么恢复到请求上海
									client.resetServerUrl(defaultServerUrl);
								} catch (ApiException apiException) {
			                        if (apiException.getErrCode() != null && terminationCodeSet.contains(apiException.getErrCode())) {
			                            log.error("http dns server termination,errCode:" + apiException.getErrCode() + "," + apiException.getErrMsg());
			                            return; // 如果HTTP DNS服务不存在，则退出守护线程
			                        }
			                        if(dnsConfig != null){
			                        	if(client.getRequestUrl().equals(defaultServerUrl)){
			                        		String szServerUrl = dnsConfig.getEnvVip("sz",defaultServerUrl);
			                        		client.resetServerUrl(szServerUrl);//下次请求使用sz的域名
			                        	}else{
			                        		//到这里是发现上海调用失败后，深圳调用也是失败，需要重新切回上海
			                        		client.resetServerUrl(defaultServerUrl);//下次请求使用sh的域名
			                        	}
									}
			                        log.error("get http dns config from top fail," + apiException.getErrCode() + "," + apiException.getErrMsg() + " next url : " + client.getRequestUrl());
			                    }catch (Exception e) {
									log.error("refresh http dns config from top fail," + e.getMessage(), e);
									sleep(3 * 1000L); // 出错则过3秒重试
								}
							}
						}
					});
					refreshThread.setDaemon(true);
					refreshThread.setName("HTTP_DNS_REFRESH_THREAD");
					refreshThread.start();
				}
			}
		}
	}

	private static DnsConfig getDnsConfigFromTop(TaobaoClient client) throws ApiException {
		HttpdnsGetRequest req = new HttpdnsGetRequest();
		HttpdnsGetResponse rsp = client.execute(req);
		if (rsp.isSuccess()) {
			return DnsConfig.parse(rsp.getResult());
		} else {
			throw new ApiException(rsp.getErrorCode(), rsp.getMsg());
		}
	}

	private static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
