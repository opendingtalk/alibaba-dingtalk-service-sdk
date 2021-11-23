package com.aliyun.api;

import java.util.concurrent.Future;

import com.taobao.api.ApiException;


/**
 * aliyun sdk请求入口。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public interface AliyunClient {
	
	/**
	 * 执行阿里云API请求。
	 * @param <T>
	 * @param request 具体的请求
	 * @return
	 * @throws ApiException
	 */
	public <T extends AliyunResponse> T execute(AliyunRequest<T> request) throws ApiException ;
	
	/**
	 * 异步执行阿里云API请求。
	 * @param <T>
	 * @param request 具体的请求
	 * @return
	 * @throws ApiException
	 */
	public <T extends AliyunResponse> Future<T> executeAsync(AliyunRequest<T> request,AliyunAsyncHandler<T> asyncHandler) throws ApiException ;
}
