package com.taobao.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qimen.api.QimenRequest;
import com.qimen.api.QimenResponse;

public class SampleQimenRequest extends QimenRequest<QimenResponse> {

	private Trade trade;

	public Trade getTrade() {
		return this.trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	public String getApiMethodName() {
		return "taobao.qimen.item.sync";
	}

	public Class<QimenResponse> getResponseClass() {
		return QimenResponse.class;
	}

	public static class Trade {

		private String id;
		private String buyerNick;
		private String sellerNick;
		private Boolean isTimeout;
		private Date gmtCreate;
		private List<Order> orderList;
		private Map<String, String> extProps;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBuyerNick() {
			return this.buyerNick;
		}

		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}

		public String getSellerNick() {
			return this.sellerNick;
		}

		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}

		public Boolean getIsTimeout() {
			return this.isTimeout;
		}

		public void setIsTimeout(Boolean isTimeout) {
			this.isTimeout = isTimeout;
		}

		public Date getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public List<Order> getOrderList() {
			return this.orderList;
		}

		public void setOrderList(List<Order> orderList) {
			this.orderList = orderList;
		}

		public void addOrder(Order order) {
			if (this.orderList == null) {
				this.orderList = new ArrayList<Order>();
			}
			this.orderList.add(order);
		}

		public Map<String, String> getExtProps() {
			return this.extProps;
		}

		public void setExtProps(Map<String, String> extProps) {
			this.extProps = extProps;
		}

		public void addExtProp(String key, String value) {
			if (this.extProps == null) {
				this.extProps = new HashMap<String, String>();
			}
			this.extProps.put(key, value);
		}
	}

	public static class Order {

		private String payment;
		private String itemId;
		private String itemTitle;
		private Long itemCount;

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Long getItemCount() {
			return this.itemCount;
		}

		public void setItemCount(Long itemCount) {
			this.itemCount = itemCount;
		}
	}

}
