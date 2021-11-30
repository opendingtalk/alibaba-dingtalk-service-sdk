package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.sales.order.custom.info.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoSalesOrderCustomInfoQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1856872969988273953L;

	/** 
	 * 响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 调用信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回内容
	 */
	@ApiField("model")
	private OpenApiSalesOrderQueryCustomInfoResult model;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setModel(OpenApiSalesOrderQueryCustomInfoResult model) {
		this.model = model;
	}
	public OpenApiSalesOrderQueryCustomInfoResult getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 2C订单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiSalesOrderCustomInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 1165971615718722152L;
		/**
		 * 局定需求id
		 */
		@ApiField("biz_id_customer_order")
		private String bizIdCustomerOrder;
		/**
		 * 2C订单下单时间
		 */
		@ApiField("gmt_order_create")
		private Date gmtOrderCreate;
		/**
		 * 2C订单计划交期时间
		 */
		@ApiField("gmt_planned_delivery")
		private Date gmtPlannedDelivery;
		/**
		 * 2C订单制造域计划完成时间
		 */
		@ApiField("gmt_planned_production_finished")
		private Date gmtPlannedProductionFinished;
		/**
		 * 图片链接
		 */
		@ApiField("img_url")
		private String imgUrl;
		/**
		 * 对应生产订单id
		 */
		@ApiField("product_order_id")
		private Long productOrderId;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 尺码ID
		 */
		@ApiField("size_id")
		private Long sizeId;
		/**
		 * 尺码名称
		 */
		@ApiField("size_name")
		private String sizeName;
		/**
		 * 是否跳过定制（印空花）
		 */
		@ApiField("skip_customized")
		private Boolean skipCustomized;
	
		public String getBizIdCustomerOrder() {
			return this.bizIdCustomerOrder;
		}
		public void setBizIdCustomerOrder(String bizIdCustomerOrder) {
			this.bizIdCustomerOrder = bizIdCustomerOrder;
		}
		public Date getGmtOrderCreate() {
			return this.gmtOrderCreate;
		}
		public void setGmtOrderCreate(Date gmtOrderCreate) {
			this.gmtOrderCreate = gmtOrderCreate;
		}
		public Date getGmtPlannedDelivery() {
			return this.gmtPlannedDelivery;
		}
		public void setGmtPlannedDelivery(Date gmtPlannedDelivery) {
			this.gmtPlannedDelivery = gmtPlannedDelivery;
		}
		public Date getGmtPlannedProductionFinished() {
			return this.gmtPlannedProductionFinished;
		}
		public void setGmtPlannedProductionFinished(Date gmtPlannedProductionFinished) {
			this.gmtPlannedProductionFinished = gmtPlannedProductionFinished;
		}
		public String getImgUrl() {
			return this.imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		public Long getProductOrderId() {
			return this.productOrderId;
		}
		public void setProductOrderId(Long productOrderId) {
			this.productOrderId = productOrderId;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getSizeId() {
			return this.sizeId;
		}
		public void setSizeId(Long sizeId) {
			this.sizeId = sizeId;
		}
		public String getSizeName() {
			return this.sizeName;
		}
		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}
		public Boolean getSkipCustomized() {
			return this.skipCustomized;
		}
		public void setSkipCustomized(Boolean skipCustomized) {
			this.skipCustomized = skipCustomized;
		}
	}
	
	/**
	 * 返回内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiSalesOrderQueryCustomInfoResult extends TaobaoObject {
		private static final long serialVersionUID = 7284925127669648523L;
		/**
		 * 2C订单列表
		 */
		@ApiListField("list")
		@ApiField("open_api_sales_order_custom_info_dto")
		private List<OpenApiSalesOrderCustomInfoDto> list;
		/**
		 * 当前页数
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 分页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
	
		public List<OpenApiSalesOrderCustomInfoDto> getList() {
			return this.list;
		}
		public void setList(List<OpenApiSalesOrderCustomInfoDto> list) {
			this.list = list;
		}
		public Long getPage() {
			return this.page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	


}
