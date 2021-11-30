package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 物流的服务标签
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsTag extends TaobaoObject {

	private static final long serialVersionUID = 3527677614452829248L;

	/**
	 * 服务标签
	 */
	@ApiListField("logistic_service_tag_list")
	@ApiField("logistic_service_tag")
	private List<LogisticServiceTag> logisticServiceTagList;

	/**
	 * 主订单或子订单的订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public List<LogisticServiceTag> getLogisticServiceTagList() {
		return this.logisticServiceTagList;
	}
	public void setLogisticServiceTagList(List<LogisticServiceTag> logisticServiceTagList) {
		this.logisticServiceTagList = logisticServiceTagList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
