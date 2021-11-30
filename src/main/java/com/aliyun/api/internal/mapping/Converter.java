package com.aliyun.api.internal.mapping;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.ApiException;

/**
 * 动态格式转换器。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public interface Converter {

	/**
	 * 把字符串转换为响应对象。
	 * 
	 * @param <T> 领域泛型
	 * @param rsp 响应字符串
	 * @param clazz 领域类型
	 * @return 响应对象
	 */
	public <T  extends AliyunResponse> T toResponse(String rsp, Class<T> clazz) throws ApiException;

}
