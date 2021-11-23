package com.aliyun.api;

import com.taobao.api.ApiException;


/**
 * aliyun sdk 解释器接口。响应格式可以是JSON, XML等等。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public interface AliyunParser<T extends AliyunResponse> {

	/**
	 * 把响应字符串解释成相应的领域对象。
	 * 
	 * @param rsp 响应字符串
	 * @return 领域对象
	 */
	public T parse(String rsp) throws ApiException;

	/**
	 * 获取响应类类型。
	 */
	public Class<T> getResponseClass() throws ApiException;

}
