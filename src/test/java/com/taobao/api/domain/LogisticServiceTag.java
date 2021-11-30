package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流服务标签
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticServiceTag extends TaobaoObject {

	private static final long serialVersionUID = 2316688975993468172L;

	/**
	 * 物流服务下的标签属性,多个标签之间有";"分隔
	 */
	@ApiField("service_tag")
	private String serviceTag;

	/**
	 * 消费者选快递请直接判断service_tag是否包含companyCode。而不要判断service_type
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getServiceTag() {
		return this.serviceTag;
	}
	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
