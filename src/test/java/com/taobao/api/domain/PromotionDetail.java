package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 交易的优惠信息详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionDetail extends TaobaoObject {

	private static final long serialVersionUID = 3692998568633679192L;

	/**
	 * 优惠金额（免运费、限时打折时为空）,单位：元
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 赠品的宝贝id
	 */
	@ApiField("gift_item_id")
	private String giftItemId;

	/**
	 * 满就送商品时，所送商品的名称
	 */
	@ApiField("gift_item_name")
	private String giftItemName;

	/**
	 * 满就送礼物的礼物数量
	 */
	@ApiField("gift_item_num")
	private String giftItemNum;

	/**
	 * 交易的主订单或子订单号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 优惠活动的描述
	 */
	@ApiField("promotion_desc")
	private String promotionDesc;

	/**
	 * 优惠id，(由营销工具id、优惠活动id和优惠详情id组成，结构为：营销工具id-优惠活动id_优惠详情id，如mjs-123024_211143）
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 优惠信息的名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getGiftItemId() {
		return this.giftItemId;
	}
	public void setGiftItemId(String giftItemId) {
		this.giftItemId = giftItemId;
	}

	public String getGiftItemName() {
		return this.giftItemName;
	}
	public void setGiftItemName(String giftItemName) {
		this.giftItemName = giftItemName;
	}

	public String getGiftItemNum() {
		return this.giftItemNum;
	}
	public void setGiftItemNum(String giftItemNum) {
		this.giftItemNum = giftItemNum;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPromotionDesc() {
		return this.promotionDesc;
	}
	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

}
