package com.dingtalk.api;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;

/**
 * 钉钉客户端接口。
 * @author chaohui.zch 2016年11月8日下午2:16:43
 */
public interface DingTalkClient extends TaobaoClient {

	/**
	 * 使用签名方式访问
	 * @param request
	 * @param accessKey
	 * @param accessSecret
	 * @param <T>
	 * @return
	 * @throws ApiException
	 */
	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret) throws ApiException;
	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret, String suiteTicket) throws ApiException;
	public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException;

}
