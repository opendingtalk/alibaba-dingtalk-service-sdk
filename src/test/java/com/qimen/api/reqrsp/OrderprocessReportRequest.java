package com.qimen.api.reqrsp;

import java.util.Date;
import java.util.Map;

import com.qimen.api.QimenRequest;

public class OrderprocessReportRequest extends QimenRequest<OrderprocessReportResponse> {

	private Order order;
	
	private Process process;

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Process getProcess() {
		return this.process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	public String getApiMethodName() {
		return "taobao.qimen.orderprocess.report";
	}

	public Class<OrderprocessReportResponse> getResponseClass() {
		return OrderprocessReportResponse.class;
	}

	public static class Order {
		private String orderCode;
		private String orderId;
		private String orderType;
		private String warehouseCode;

		public String getOrderCode() {
			return this.orderCode;
		}

		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}
	}

	public static class Process {
		private String processStatus;
		private String operatorCode;
		private String operatorName;
		private Date operateTime;
		private String operateInfo;
		private String remark;
		private Map<String, String> extendProps;

		public String getProcessStatus() {
			return this.processStatus;
		}

		public void setProcessStatus(String processStatus) {
			this.processStatus = processStatus;
		}

		public String getOperatorCode() {
			return this.operatorCode;
		}

		public void setOperatorCode(String operatorCode) {
			this.operatorCode = operatorCode;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}

		public Date getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Date operateTime) {
			this.operateTime = operateTime;
		}

		public String getOperateInfo() {
			return this.operateInfo;
		}

		public void setOperateInfo(String operateInfo) {
			this.operateInfo = operateInfo;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Map<String, String> getExtendProps() {
			return this.extendProps;
		}

		public void setExtendProps(Map<String, String> extendProps) {
			this.extendProps = extendProps;
		}
	}

}
