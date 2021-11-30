package com.qimen.api.reqrsp;

import java.util.List;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;

import java.util.Map;

import com.taobao.api.internal.mapping.ApiListType;

import com.taobao.api.ApiRuleException;
import com.qimen.api.QimenRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: taobao.qimen.storeprocess.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2017.05.16
 */
public class StoreprocessConfirmRequest extends QimenRequest<StoreprocessConfirmResponse> {
	
	

	/** 
	* 实际作业总数量
	 */
	private Long actualQty;

	/** 
	* 扩展属性
	 */
	private java.util.Map extendProps;

	/** 
	* 加工商品列表
	 */
	private List<MaterialItem> materialitems;

	/** 
	* 加工单完成时间(YYYY-MM-DD HH:MM:SS)
	 */
	private String orderCompleteTime;

	/** 
	* 单据类型(CNJG=仓内加工作业单)
	 */
	private String orderType;

	/** 
	* 外部业务编码(一个合作伙伴中要求唯一多次确认时;每次传入要求唯一(一般传入WMS损益单据编码))
	 */
	private String outBizCode;

	/** 
	* 货主编码
	 */
	private String ownerCode;

	/** 
	* 加工单编码
	 */
	private String processOrderCode;

	/** 
	* 仓储系统加工单ID
	 */
	private String processOrderId;

	/** 
	* 加工商品列表
	 */
	private List<ProductItem> productitems;

	/** 
	* 备注
	 */
	private String remark;

	public void setActualQty(Long actualQty) {
		this.actualQty = actualQty;
	}

	public Long getActualQty() {
		return this.actualQty;
	}

	public void setExtendProps(java.util.Map extendProps) {
		this.extendProps = extendProps;
	}

	public java.util.Map getExtendProps() {
		return this.extendProps;
	}

	public void setMaterialitems(List<MaterialItem> materialitems) {
		this.materialitems = materialitems;
	}

	public List<MaterialItem> getMaterialitems() {
		return this.materialitems;
	}

	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}

	public String getOrderCompleteTime() {
		return this.orderCompleteTime;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return this.ownerCode;
	}

	public void setProcessOrderCode(String processOrderCode) {
		this.processOrderCode = processOrderCode;
	}

	public String getProcessOrderCode() {
		return this.processOrderCode;
	}

	public void setProcessOrderId(String processOrderId) {
		this.processOrderId = processOrderId;
	}

	public String getProcessOrderId() {
		return this.processOrderId;
	}

	public void setProductitems(List<ProductItem> productitems) {
		this.productitems = productitems;
	}

	public List<ProductItem> getProductitems() {
		return this.productitems;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public String getApiMethodName() {
		return "taobao.qimen.storeprocess.confirm";
	}

	public Class<StoreprocessConfirmResponse> getResponseClass() {
		return StoreprocessConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCompleteTime, "orderCompleteTime");
		RequestCheckUtils.checkMaxLength(orderCompleteTime, 19, "orderCompleteTime");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkMaxLength(orderType, 50, "orderType");
		RequestCheckUtils.checkNotEmpty(outBizCode, "outBizCode");
		RequestCheckUtils.checkMaxLength(outBizCode, 50, "outBizCode");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkNotEmpty(processOrderCode, "processOrderCode");
		RequestCheckUtils.checkMaxLength(processOrderCode, 50, "processOrderCode");
		RequestCheckUtils.checkMaxLength(processOrderId, 50, "processOrderId");
		RequestCheckUtils.checkMaxLength(remark, 500, "remark");
	}
	
	/**
 * 加工商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
@ApiListType("item")
public static class MaterialItem {

	/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * erp系统商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品ID
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * ownerCode
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * ratioQty
		 */
		@ApiField("ratioQty")
		private String ratioQty;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

	public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getRatioQty() {
			return this.ratioQty;
		}
		public void setRatioQty(String ratioQty) {
			this.ratioQty = ratioQty;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}

	/**
 * 加工商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
@ApiListType("item")
public static class ProductItem {

	/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * erp系统商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品ID
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * ownerCode
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * ratioQty
		 */
		@ApiField("ratioQty")
		private String ratioQty;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

	public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getRatioQty() {
			return this.ratioQty;
		}
		public void setRatioQty(String ratioQty) {
			this.ratioQty = ratioQty;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}


}