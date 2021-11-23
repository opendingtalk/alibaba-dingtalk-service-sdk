package com.aliyun.api.internal.parser.xml;

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
public class ObjectXmlParser<T extends AliyunResponse> implements AliyunParser<T> {

	private Class<T> clazz;

	public ObjectXmlParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T parse(String rsp) throws ApiException {
		Converter converter = new XmlConverter();
		return converter.toResponse(rsp, clazz);
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}
