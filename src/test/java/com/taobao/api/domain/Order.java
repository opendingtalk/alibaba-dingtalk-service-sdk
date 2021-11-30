package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Order extends TaobaoObject {

	private static final long serialVersionUID = 6694719714288897374L;

	/**
	 * 手工调整金额.格式为:1.01;单位:元;精确到小数点后两位.
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 捆绑的子订单号，表示该子订单要和捆绑的子订单一起发货，用于卖家子订单捆绑发货
	 */
	@ApiField("bind_oid")
	private Long bindOid;

	/**
	 * bind_oid字段的升级，支持返回绑定的多个子订单，多个子订单以半角逗号分隔
	 */
	@ApiField("bind_oids")
	private String bindOids;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家是否已评价。可选值：true(已评价)，false(未评价)
	 */
	@ApiField("buyer_rate")
	private Boolean buyerRate;

	/**
	 * 交易商品对应的类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 子订单发货时间，当卖家对订单进行了多次发货，子订单的发货时间和主订单的发货时间可能不一样了，那么就需要以子订单的时间为准。（没有进行多次发货的订单，主订单的发货时间和子订单的发货时间都一样）
	 */
	@ApiField("consign_time")
	private String consignTime;

	/**
	 * 子订单级订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 分摊之后的实付金额
	 */
	@ApiField("divide_order_fee")
	private String divideOrderFee;

	/**
	 * 子订单的交易结束时间说明：子订单有单独的结束时间，与主订单的结束时间可能有所不同，在有退款发起的时候或者是主订单分阶段付款的时候，子订单的结束时间会早于主订单的结束时间，所以开放这个字段便于订单结束状态的判断
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 子订单预计发货时间
	 */
	@ApiField("estimate_con_time")
	private String estimateConTime;

	/**
	 * 车牌号码
	 */
	@ApiField("et_plate_number")
	private String etPlateNumber;

	/**
	 * 天猫汽车服务预约时间
	 */
	@ApiField("et_ser_time")
	private String etSerTime;

	/**
	 * 电子凭证预约门店地址
	 */
	@ApiField("et_shop_name")
	private String etShopName;

	/**
	 * 电子凭证核销门店地址
	 */
	@ApiField("et_verified_shop_name")
	private String etVerifiedShopName;

	/**
	 * 商品的字符串编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 子订单所在包裹的运单号
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 表示订单交易是否含有对应的代销采购单。如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
	 */
	@ApiField("is_daixiao")
	private Boolean isDaixiao;

	/**
	 * 是否超卖
	 */
	@ApiField("is_oversold")
	private Boolean isOversold;

	/**
	 * 是否是服务订单，是返回true，否返回false。
	 */
	@ApiField("is_service_order")
	private Boolean isServiceOrder;

	/**
	 * 子订单是否是www订单
	 */
	@ApiField("is_www")
	private Boolean isWww;

	/**
	 * 套餐ID
	 */
	@ApiField("item_meal_id")
	private Long itemMealId;

	/**
	 * 套餐的值。如：M8原装电池:便携支架:M8专用座充:莫凡保护袋
	 */
	@ApiField("item_meal_name")
	private String itemMealName;

	/**
	 * 商品备注
	 */
	@ApiField("item_memo")
	private String itemMemo;

	/**
	 * 子订单发货的快递公司名称
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 订单修改时间，目前只有taobao.trade.ordersku.update会返回此字段。
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 购买数量。取值范围:大于零的整数
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子订单编号
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 子订单来源,如jhs(聚划算)、taobao(淘宝)、wap(无线)
	 */
	@ApiField("order_from")
	private String orderFrom;

	/**
	 * 商家外部编码(可与商家外部系统对接)。外部商家自己定义的商品Item的id，可以通过taobao.items.custom.get获取商品的Item的信息
	 */
	@ApiField("outer_iid")
	private String outerIid;

	/**
	 * 外部网店自己定义的Sku编号
	 */
	@ApiField("outer_sku_id")
	private String outerSkuId;

	/**
	 * 优惠分摊
	 */
	@ApiField("part_mjz_discount")
	private String partMjzDiscount;

	/**
	 * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。对于多子订单的交易，计算公式如下：payment = price * num + adjust_fee - discount_fee ；单子订单交易，payment与主订单的payment一致，对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 商品图片的绝对路径
	 */
	@ApiField("pic_path")
	private String picPath;

	/**
	 * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 最近退款ID
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 卖家是否已评价。可选值：true(已评价)，false(未评价)
	 */
	@ApiField("seller_rate")
	private Boolean sellerRate;

	/**
	 * 卖家类型，可选值为：B（商城商家），C（普通卖家）
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * 子订单的运送方式（卖家对订单进行多次发货之后，一个主订单下的子订单的运送方式可能不同，用order.shipping_type来区分子订单的运送方式）
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
	 */
	@ApiField("sku_properties_name")
	private String skuPropertiesName;

	/**
	 * 订单快照详细信息
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 订单快照URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * 订单状态（请关注此状态，如果为TRADE_CLOSED_BY_TAOBAO状态，则不要对此订单进行发货，切记啊！）。可选值: <ul><li>TRADE_NO_CREATE_PAY(没有创建支付宝交易) <li>WAIT_BUYER_PAY(等待买家付款) <li>WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款) <li>WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货) <li>TRADE_BUYER_SIGNED(买家已签收,货到付款专用) <li>TRADE_FINISHED(交易成功) <li>TRADE_CLOSED(付款以后用户退款成功，交易自动关闭) <li>TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)<li>PAY_PENDING(国际信用卡支付付款确认中)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 发货的仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 天猫国际官网直供子订单关税税费
	 */
	@ApiField("sub_order_tax_fee")
	private String subOrderTaxFee;

	/**
	 * 天猫国际官网直供子订单关税税率
	 */
	@ApiField("sub_order_tax_rate")
	private String subOrderTaxRate;

	/**
	 * 门票有效期的key
	 */
	@ApiField("ticket_expdate_key")
	private String ticketExpdateKey;

	/**
	 * 对应门票有效期的外部id
	 */
	@ApiField("ticket_outer_id")
	private String ticketOuterId;

	/**
	 * 订单超时到期时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("timeout_action_time")
	private Date timeoutActionTime;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 支持家装类物流的类型
	 */
	@ApiField("tmser_spu_code")
	private String tmserSpuCode;

	/**
	 * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 交易类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 征集预售订单征集状态：1（征集中），2（征集成功），3（征集失败）
	 */
	@ApiField("zhengji_status")
	private String zhengjiStatus;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getBindOid() {
		return this.bindOid;
	}
	public void setBindOid(Long bindOid) {
		this.bindOid = bindOid;
	}

	public String getBindOids() {
		return this.bindOids;
	}
	public void setBindOids(String bindOids) {
		this.bindOids = bindOids;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Boolean getBuyerRate() {
		return this.buyerRate;
	}
	public void setBuyerRate(Boolean buyerRate) {
		this.buyerRate = buyerRate;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(String consignTime) {
		this.consignTime = consignTime;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getDivideOrderFee() {
		return this.divideOrderFee;
	}
	public void setDivideOrderFee(String divideOrderFee) {
		this.divideOrderFee = divideOrderFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEstimateConTime() {
		return this.estimateConTime;
	}
	public void setEstimateConTime(String estimateConTime) {
		this.estimateConTime = estimateConTime;
	}

	public String getEtPlateNumber() {
		return this.etPlateNumber;
	}
	public void setEtPlateNumber(String etPlateNumber) {
		this.etPlateNumber = etPlateNumber;
	}

	public String getEtSerTime() {
		return this.etSerTime;
	}
	public void setEtSerTime(String etSerTime) {
		this.etSerTime = etSerTime;
	}

	public String getEtShopName() {
		return this.etShopName;
	}
	public void setEtShopName(String etShopName) {
		this.etShopName = etShopName;
	}

	public String getEtVerifiedShopName() {
		return this.etVerifiedShopName;
	}
	public void setEtVerifiedShopName(String etVerifiedShopName) {
		this.etVerifiedShopName = etVerifiedShopName;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Boolean getIsDaixiao() {
		return this.isDaixiao;
	}
	public void setIsDaixiao(Boolean isDaixiao) {
		this.isDaixiao = isDaixiao;
	}

	public Boolean getIsOversold() {
		return this.isOversold;
	}
	public void setIsOversold(Boolean isOversold) {
		this.isOversold = isOversold;
	}

	public Boolean getIsServiceOrder() {
		return this.isServiceOrder;
	}
	public void setIsServiceOrder(Boolean isServiceOrder) {
		this.isServiceOrder = isServiceOrder;
	}

	public Boolean getIsWww() {
		return this.isWww;
	}
	public void setIsWww(Boolean isWww) {
		this.isWww = isWww;
	}

	public Long getItemMealId() {
		return this.itemMealId;
	}
	public void setItemMealId(Long itemMealId) {
		this.itemMealId = itemMealId;
	}

	public String getItemMealName() {
		return this.itemMealName;
	}
	public void setItemMealName(String itemMealName) {
		this.itemMealName = itemMealName;
	}

	public String getItemMemo() {
		return this.itemMemo;
	}
	public void setItemMemo(String itemMemo) {
		this.itemMemo = itemMemo;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOrderFrom() {
		return this.orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}

	public String getOuterIid() {
		return this.outerIid;
	}
	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}

	public String getOuterSkuId() {
		return this.outerSkuId;
	}
	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}

	public String getPartMjzDiscount() {
		return this.partMjzDiscount;
	}
	public void setPartMjzDiscount(String partMjzDiscount) {
		this.partMjzDiscount = partMjzDiscount;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPicPath() {
		return this.picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Boolean getSellerRate() {
		return this.sellerRate;
	}
	public void setSellerRate(Boolean sellerRate) {
		this.sellerRate = sellerRate;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getSubOrderTaxFee() {
		return this.subOrderTaxFee;
	}
	public void setSubOrderTaxFee(String subOrderTaxFee) {
		this.subOrderTaxFee = subOrderTaxFee;
	}

	public String getSubOrderTaxRate() {
		return this.subOrderTaxRate;
	}
	public void setSubOrderTaxRate(String subOrderTaxRate) {
		this.subOrderTaxRate = subOrderTaxRate;
	}

	public String getTicketExpdateKey() {
		return this.ticketExpdateKey;
	}
	public void setTicketExpdateKey(String ticketExpdateKey) {
		this.ticketExpdateKey = ticketExpdateKey;
	}

	public String getTicketOuterId() {
		return this.ticketOuterId;
	}
	public void setTicketOuterId(String ticketOuterId) {
		this.ticketOuterId = ticketOuterId;
	}

	public Date getTimeoutActionTime() {
		return this.timeoutActionTime;
	}
	public void setTimeoutActionTime(Date timeoutActionTime) {
		this.timeoutActionTime = timeoutActionTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTmserSpuCode() {
		return this.tmserSpuCode;
	}
	public void setTmserSpuCode(String tmserSpuCode) {
		this.tmserSpuCode = tmserSpuCode;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getZhengjiStatus() {
		return this.zhengjiStatus;
	}
	public void setZhengjiStatus(String zhengjiStatus) {
		this.zhengjiStatus = zhengjiStatus;
	}

}
