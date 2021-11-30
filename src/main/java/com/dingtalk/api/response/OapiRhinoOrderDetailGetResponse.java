package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7466285187932558548L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 处理结果
	 */
	@ApiField("model")
	private Model model;


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

	public void setModel(Model model) {
		this.model = model;
	}
	public Model getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 细码列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiProductOrderDetailDto extends TaobaoObject {
		private static final long serialVersionUID = 2538858882817828166L;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 生产订单id
		 */
		@ApiField("product_order_id")
		private Long productOrderId;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 尺码id
		 */
		@ApiField("size_id")
		private Long sizeId;
		/**
		 * 尺码名称
		 */
		@ApiField("size_name")
		private String sizeName;
		/**
		 * 供应链skuId
		 */
		@ApiField("sku_id")
		private String skuId;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getSkuId() {
			return this.skuId;
		}
		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	
	/**
	 * 处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 2642513368795698948L;
		/**
		 * 细码列表
		 */
		@ApiListField("detail_list")
		@ApiField("open_api_product_order_detail_dto")
		private List<OpenApiProductOrderDetailDto> detailList;
	
		public List<OpenApiProductOrderDetailDto> getDetailList() {
			return this.detailList;
		}
		public void setDetailList(List<OpenApiProductOrderDetailDto> detailList) {
			this.detailList = detailList;
		}
	}
	


}
