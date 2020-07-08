package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.listProductOrder response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderListProductOrderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1415215335859732558L;

	/** 
	 * 返回体
	 */
	@ApiField("result")
	private HsfResult result;


	public void setResult(HsfResult result) {
		this.result = result;
	}
	public HsfResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 销售订单vo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SaleOrderVo extends TaobaoObject {
		private static final long serialVersionUID = 7647645966689318792L;
		/**
		 * 实际发货实际
		 */
		@ApiField("actualSendTime")
		private Date actualSendTime;
		/**
		 * 计划交期
		 */
		@ApiField("gmtDeliveryPlanned")
		private Date gmtDeliveryPlanned;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 销售订单编号
		 */
		@ApiField("number")
		private String number;
		/**
		 * 计划发货时间
		 */
		@ApiField("planSendTime")
		private Date planSendTime;
		/**
		 * 来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 来源id
		 */
		@ApiField("sourceId")
		private String sourceId;
	
		public Date getActualSendTime() {
			return this.actualSendTime;
		}
		public void setActualSendTime(Date actualSendTime) {
			this.actualSendTime = actualSendTime;
		}
		public Date getGmtDeliveryPlanned() {
			return this.gmtDeliveryPlanned;
		}
		public void setGmtDeliveryPlanned(Date gmtDeliveryPlanned) {
			this.gmtDeliveryPlanned = gmtDeliveryPlanned;
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
		public Date getPlanSendTime() {
			return this.planSendTime;
		}
		public void setPlanSendTime(Date planSendTime) {
			this.planSendTime = planSendTime;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
	}
	
	/**
	 * 列表内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductOrderDto extends TaobaoObject {
		private static final long serialVersionUID = 8139667226178494318L;
		/**
		 * 实际完成时间
		 */
		@ApiField("actualFinishTime")
		private Date actualFinishTime;
		/**
		 * 实际开始时间
		 */
		@ApiField("actualStartTime")
		private Date actualStartTime;
		/**
		 * 数字工艺单bizid
		 */
		@ApiField("bizIdCraftForm")
		private String bizIdCraftForm;
		/**
		 * 数字工艺分类bizId
		 */
		@ApiField("bizIdDtechCategory")
		private String bizIdDtechCategory;
		/**
		 * 数字工艺分类名称
		 */
		@ApiField("bizIdDtechCategoryName")
		private String bizIdDtechCategoryName;
		/**
		 * 数字工艺包id
		 */
		@ApiField("bizIdDtechPkg")
		private String bizIdDtechPkg;
		/**
		 * 颜色id
		 */
		@ApiField("colorId")
		private String colorId;
		/**
		 * 颜色名称
		 */
		@ApiField("colorName")
		private String colorName;
		/**
		 * 数字工艺分类名称
		 */
		@ApiField("craftCategoryName")
		private String craftCategoryName;
		/**
		 * 创建者
		 */
		@ApiField("creator")
		private String creator;
		/**
		 * 数字工艺包id
		 */
		@ApiField("dataTechId")
		private Long dataTechId;
		/**
		 * 工厂id
		 */
		@ApiField("dccId")
		private String dccId;
		/**
		 * 创建时间
		 */
		@ApiField("gmtCreate")
		private Date gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmtModified")
		private Date gmtModified;
		/**
		 * 货号
		 */
		@ApiField("goodsNo")
		private String goodsNo;
		/**
		 * 主键id
		 */
		@ApiField("id")
		private Long id;
		
		/**
		 * -
		 */
		@ApiField("linkId")
		private String linkId;
		/**
		 * 修改者
		 */
		@ApiField("modifier")
		private String modifier;
		/**
		 * 订单编号
		 */
		@ApiField("number")
		private String number;
		
		/**
		 * 计划完成时间
		 */
		@ApiField("planFinishTime")
		private Date planFinishTime;
		/**
		 * 计划开始时间
		 */
		@ApiField("planStartTime")
		private Date planStartTime;
		
		/**
		 * 采购订单id
		 */
		@ApiField("purchaseOrderId")
		private String purchaseOrderId;
		/**
		 * 销售订单vo
		 */
		@ApiField("saleOrderVo")
		private SaleOrderVo saleOrderVo;
		/**
		 * 采购订单id
		 */
		@ApiField("salesOrderId")
		private Long salesOrderId;
		
		/**
		 * 款号分类id
		 */
		@ApiField("styleCategoryId")
		private Long styleCategoryId;
		/**
		 * 款号code
		 */
		@ApiField("styleCode")
		private String styleCode;
		/**
		 * 款号id
		 */
		@ApiField("styleId")
		private Long styleId;
		/**
		 * 款号图片
		 */
		@ApiField("styleImg")
		private String styleImg;
		/**
		 * 款号名称
		 */
		@ApiField("styleName")
		private String styleName;
		/**
		 * 标签
		 */
		@ApiField("tag")
		private String tag;
		/**
		 * 租户id
		 */
		@ApiField("tenantId")
		private String tenantId;
		/**
		 * 总数量
		 */
		@ApiField("totalQuantity")
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
		public String getBizIdCraftForm() {
			return this.bizIdCraftForm;
		}
		public void setBizIdCraftForm(String bizIdCraftForm) {
			this.bizIdCraftForm = bizIdCraftForm;
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
		public String getCraftCategoryName() {
			return this.craftCategoryName;
		}
		public void setCraftCategoryName(String craftCategoryName) {
			this.craftCategoryName = craftCategoryName;
		}
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public Long getDataTechId() {
			return this.dataTechId;
		}
		public void setDataTechId(Long dataTechId) {
			this.dataTechId = dataTechId;
		}
		public String getDccId() {
			return this.dccId;
		}
		public void setDccId(String dccId) {
			this.dccId = dccId;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
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
		
		public String getLinkId() {
			return this.linkId;
		}
		public void setLinkId(String linkId) {
			this.linkId = linkId;
		}
		public String getModifier() {
			return this.modifier;
		}
		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
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
		public SaleOrderVo getSaleOrderVo() {
			return this.saleOrderVo;
		}
		public void setSaleOrderVo(SaleOrderVo saleOrderVo) {
			this.saleOrderVo = saleOrderVo;
		}
		public Long getSalesOrderId() {
			return this.salesOrderId;
		}
		public void setSalesOrderId(Long salesOrderId) {
			this.salesOrderId = salesOrderId;
		}
		
		public Long getStyleCategoryId() {
			return this.styleCategoryId;
		}
		public void setStyleCategoryId(Long styleCategoryId) {
			this.styleCategoryId = styleCategoryId;
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
		public String getTag() {
			return this.tag;
		}
		public void setTag(String tag) {
			this.tag = tag;
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
	 * 处理结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageInfo extends TaobaoObject {
		private static final long serialVersionUID = 3667594493771699148L;
		/**
		 * 分页参数-结束行编号
		 */
		@ApiField("endRow")
		private Long endRow;
		/**
		 * 分页参数-第一页编号
		 */
		@ApiField("firstPage")
		private Long firstPage;
		/**
		 * 分页参数-是否有下一页
		 */
		@ApiField("hasNextPage")
		private Boolean hasNextPage;
		/**
		 * 分页参数-是否有前一页
		 */
		@ApiField("hasPreviousPage")
		private Boolean hasPreviousPage;
		/**
		 * 分页参数-是否为第一页
		 */
		@ApiField("isFirstPage")
		private Boolean isFirstPage;
		/**
		 * 分页参数-是否为最后一页
		 */
		@ApiField("isLastPage")
		private Boolean isLastPage;
		/**
		 * 分页参数-最后一页页码
		 */
		@ApiField("lastPage")
		private Long lastPage;
		/**
		 * 列表内容
		 */
		@ApiListField("list")
		@ApiField("product_order_dto")
		private List<ProductOrderDto> list;
		/**
		 * 分页参数
		 */
		@ApiField("navigateFirstPage")
		private Long navigateFirstPage;
		/**
		 * 分页参数
		 */
		@ApiField("navigateLastPage")
		private Long navigateLastPage;
		/**
		 * 分页参数
		 */
		@ApiField("navigatePages")
		private Long navigatePages;
		/**
		 * 分页参数
		 */
		@ApiListField("navigatepageNums")
		@ApiField("number")
		private List<Long> navigatepageNums;
		/**
		 * 分页参数 - 下一页页码
		 */
		@ApiField("nextPage")
		private Long nextPage;
		/**
		 * 分页参数 - 总页数
		 */
		@ApiField("pageNum")
		private Long pageNum;
		/**
		 * 分页参数 - 分页大小
		 */
		@ApiField("pageSize")
		private Long pageSize;
		/**
		 * 分页参数
		 */
		@ApiField("pages")
		private Long pages;
		/**
		 * 分页参数
		 */
		@ApiField("prePage")
		private Long prePage;
		/**
		 * 分页参数
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 分页参数
		 */
		@ApiField("startRow")
		private Long startRow;
		/**
		 * 分页参数 - 总行数
		 */
		@ApiField("total")
		private Long total;
	
		public Long getEndRow() {
			return this.endRow;
		}
		public void setEndRow(Long endRow) {
			this.endRow = endRow;
		}
		public Long getFirstPage() {
			return this.firstPage;
		}
		public void setFirstPage(Long firstPage) {
			this.firstPage = firstPage;
		}
		public Boolean getHasNextPage() {
			return this.hasNextPage;
		}
		public void setHasNextPage(Boolean hasNextPage) {
			this.hasNextPage = hasNextPage;
		}
		public Boolean getHasPreviousPage() {
			return this.hasPreviousPage;
		}
		public void setHasPreviousPage(Boolean hasPreviousPage) {
			this.hasPreviousPage = hasPreviousPage;
		}
		public Boolean getIsFirstPage() {
			return this.isFirstPage;
		}
		public void setIsFirstPage(Boolean isFirstPage) {
			this.isFirstPage = isFirstPage;
		}
		public Boolean getIsLastPage() {
			return this.isLastPage;
		}
		public void setIsLastPage(Boolean isLastPage) {
			this.isLastPage = isLastPage;
		}
		public Long getLastPage() {
			return this.lastPage;
		}
		public void setLastPage(Long lastPage) {
			this.lastPage = lastPage;
		}
		public List<ProductOrderDto> getList() {
			return this.list;
		}
		public void setList(List<ProductOrderDto> list) {
			this.list = list;
		}
		public Long getNavigateFirstPage() {
			return this.navigateFirstPage;
		}
		public void setNavigateFirstPage(Long navigateFirstPage) {
			this.navigateFirstPage = navigateFirstPage;
		}
		public Long getNavigateLastPage() {
			return this.navigateLastPage;
		}
		public void setNavigateLastPage(Long navigateLastPage) {
			this.navigateLastPage = navigateLastPage;
		}
		public Long getNavigatePages() {
			return this.navigatePages;
		}
		public void setNavigatePages(Long navigatePages) {
			this.navigatePages = navigatePages;
		}
		public List<Long> getNavigatepageNums() {
			return this.navigatepageNums;
		}
		public void setNavigatepageNums(List<Long> navigatepageNums) {
			this.navigatepageNums = navigatepageNums;
		}
		public Long getNextPage() {
			return this.nextPage;
		}
		public void setNextPage(Long nextPage) {
			this.nextPage = nextPage;
		}
		public Long getPageNum() {
			return this.pageNum;
		}
		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getPages() {
			return this.pages;
		}
		public void setPages(Long pages) {
			this.pages = pages;
		}
		public Long getPrePage() {
			return this.prePage;
		}
		public void setPrePage(Long prePage) {
			this.prePage = prePage;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public Long getStartRow() {
			return this.startRow;
		}
		public void setStartRow(Long startRow) {
			this.startRow = startRow;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	
	/**
	 * 返回体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HsfResult extends TaobaoObject {
		private static final long serialVersionUID = 2373149659912521937L;
		/**
		 * 响应码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 响应信息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 额外的错误信息
		 */
		@ApiField("externalMsgInfo")
		private String externalMsgInfo;
		/**
		 * 处理结果
		 */
		@ApiField("model")
		private PageInfo model;
		/**
		 * 是否调用成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public String getExternalMsgInfo() {
			return this.externalMsgInfo;
		}
		public void setExternalMsgInfo(String externalMsgInfo) {
			this.externalMsgInfo = externalMsgInfo;
		}
		public PageInfo getModel() {
			return this.model;
		}
		public void setModel(PageInfo model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
