package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.batch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderBatchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3293539636652239377L;

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
	private OpenApiBatchGetProductOrderResult model;


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

	public void setModel(OpenApiBatchGetProductOrderResult model) {
		this.model = model;
	}
	public OpenApiBatchGetProductOrderResult getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiProductOrderDto extends TaobaoObject {
		private static final long serialVersionUID = 5422513595775215267L;
		/**
		 * 实际完成时间
		 */
		@ApiField("actual_finish_time")
		private Date actualFinishTime;
		/**
		 * 实际开始时间
		 */
		@ApiField("actual_start_time")
		private Date actualStartTime;
		/**
		 * 数字工艺品类id
		 */
		@ApiField("biz_id_dtech_category")
		private String bizIdDtechCategory;
		/**
		 * 数字工艺品类名称
		 */
		@ApiField("biz_id_dtech_category_name")
		private String bizIdDtechCategoryName;
		/**
		 * 数字工艺包id
		 */
		@ApiField("biz_id_dtech_pkg")
		private String bizIdDtechPkg;
		/**
		 * 颜色id
		 */
		@ApiField("color_id")
		private String colorId;
		/**
		 * 颜色名称
		 */
		@ApiField("color_name")
		private String colorName;
		/**
		 * 商家货号
		 */
		@ApiField("goods_no")
		private String goodsNo;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 订单BP号
		 */
		@ApiField("number")
		private String number;
		/**
		 * 订单创建时间
		 */
		@ApiField("order_create_time")
		private Date orderCreateTime;
		/**
		 * 计划完成时间
		 */
		@ApiField("plan_finish_time")
		private Date planFinishTime;
		/**
		 * 计划开始时间
		 */
		@ApiField("plan_start_time")
		private Date planStartTime;
		/**
		 * 采购订单id
		 */
		@ApiField("purchase_order_id")
		private String purchaseOrderId;
		/**
		 * TRADEDCCTRAIN - 订单来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 款号
		 */
		@ApiField("style_code")
		private String styleCode;
		/**
		 * 款式id
		 */
		@ApiField("style_id")
		private Long styleId;
		/**
		 * 款式图片
		 */
		@ApiField("style_img")
		private String styleImg;
		/**
		 * 款式名称
		 */
		@ApiField("style_name")
		private String styleName;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 总数量
		 */
		@ApiField("total_quantity")
		private Long totalQuantity;
	
		public Date getActualFinishTime() {
			return this.actualFinishTime;
		}
		public void setActualFinishTime(Date actualFinishTime) {
			this.actualFinishTime = actualFinishTime;
		}
		public Date getActualStartTime() {
			return this.actualStartTime;
		}
		public void setActualStartTime(Date actualStartTime) {
			this.actualStartTime = actualStartTime;
		}
		public String getBizIdDtechCategory() {
			return this.bizIdDtechCategory;
		}
		public void setBizIdDtechCategory(String bizIdDtechCategory) {
			this.bizIdDtechCategory = bizIdDtechCategory;
		}
		public String getBizIdDtechCategoryName() {
			return this.bizIdDtechCategoryName;
		}
		public void setBizIdDtechCategoryName(String bizIdDtechCategoryName) {
			this.bizIdDtechCategoryName = bizIdDtechCategoryName;
		}
		public String getBizIdDtechPkg() {
			return this.bizIdDtechPkg;
		}
		public void setBizIdDtechPkg(String bizIdDtechPkg) {
			this.bizIdDtechPkg = bizIdDtechPkg;
		}
		public String getColorId() {
			return this.colorId;
		}
		public void setColorId(String colorId) {
			this.colorId = colorId;
		}
		public String getColorName() {
			return this.colorName;
		}
		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
		public String getGoodsNo() {
			return this.goodsNo;
		}
		public void setGoodsNo(String goodsNo) {
			this.goodsNo = goodsNo;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public Date getOrderCreateTime() {
			return this.orderCreateTime;
		}
		public void setOrderCreateTime(Date orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
		}
		public Date getPlanFinishTime() {
			return this.planFinishTime;
		}
		public void setPlanFinishTime(Date planFinishTime) {
			this.planFinishTime = planFinishTime;
		}
		public Date getPlanStartTime() {
			return this.planStartTime;
		}
		public void setPlanStartTime(Date planStartTime) {
			this.planStartTime = planStartTime;
		}
		public String getPurchaseOrderId() {
			return this.purchaseOrderId;
		}
		public void setPurchaseOrderId(String purchaseOrderId) {
			this.purchaseOrderId = purchaseOrderId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStyleCode() {
			return this.styleCode;
		}
		public void setStyleCode(String styleCode) {
			this.styleCode = styleCode;
		}
		public Long getStyleId() {
			return this.styleId;
		}
		public void setStyleId(Long styleId) {
			this.styleId = styleId;
		}
		public String getStyleImg() {
			return this.styleImg;
		}
		public void setStyleImg(String styleImg) {
			this.styleImg = styleImg;
		}
		public String getStyleName() {
			return this.styleName;
		}
		public void setStyleName(String styleName) {
			this.styleName = styleName;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public Long getTotalQuantity() {
			return this.totalQuantity;
		}
		public void setTotalQuantity(Long totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
	}
	
	/**
	 * 返回内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiBatchGetProductOrderResult extends TaobaoObject {
		private static final long serialVersionUID = 1319988278145314245L;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("open_api_product_order_dto")
		private List<OpenApiProductOrderDto> list;
	
		public List<OpenApiProductOrderDto> getList() {
			return this.list;
		}
		public void setList(List<OpenApiProductOrderDto> list) {
			this.list = list;
		}
	}
	


}
