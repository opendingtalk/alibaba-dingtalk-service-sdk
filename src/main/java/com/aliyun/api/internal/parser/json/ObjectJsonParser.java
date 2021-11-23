package com.aliyun.api.internal.parser.json;

import com.aliyun.api.AliyunParser;
import com.aliyun.api.AliyunResponse;
import com.aliyun.api.internal.mapping.Converter;
import com.taobao.api.ApiException;

/**
 * 单个JSON对象解释器。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public class ObjectJsonParser<T extends AliyunResponse> implements AliyunParser<T> {

	private Class<T> clazz;
	private boolean simplify;

	public ObjectJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public ObjectJsonParser(Class<T> clazz, boolean simplify) {
		this.clazz = clazz;
		this.simplify = simplify;
	}

	public T parse(String rsp) throws ApiException {
		Converter converter;
		if (this.simplify) {
			converter = new SimplifyJsonConverter();
		} else {
			converter = new JsonConverter();
		}
		return converter.toResponse(rsp, clazz);
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}
