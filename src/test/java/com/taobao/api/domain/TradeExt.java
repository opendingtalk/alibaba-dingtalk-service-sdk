package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 交易扩展表信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeExt extends TaobaoObject {

	private static final long serialVersionUID = 1661366511572291335L;

	/**
	 * 关闭订单前扩展标识位
	 */
	@ApiField("before_close_flag")
	private Long beforeCloseFlag;

	/**
	 * 确认收货前扩展标识位
	 */
	@ApiField("before_confirm_flag")
	private Long beforeConfirmFlag;

	/**
	 * enable前扩展标识位
	 */
	@ApiField("before_enable_flag")
	private Long beforeEnableFlag;

	/**
	 * 修改前扩展标识位
	 */
	@ApiField("before_modify_flag")
	private Long beforeModifyFlag;

	/**
	 * 付款前扩展标识位
	 */
	@ApiField("before_pay_flag")
	private Long beforePayFlag;

	/**
	 * 评价前扩展标识位
	 */
	@ApiField("before_rate_flag")
	private Long beforeRateFlag;

	/**
	 * 退款前扩展标识位
	 */
	@ApiField("before_refund_flag")
	private Long beforeRefundFlag;

	/**
	 * 发货前扩展标识位
	 */
	@ApiField("before_ship_flag")
	private Long beforeShipFlag;

	/**
	 * attributes标记
	 */
	@ApiField("ext_attributes")
	private String extAttributes;

	/**
	 * 第三方个性化数据
	 */
	@ApiField("extra_data")
	private String extraData;

	/**
	 * 第三方状态，第三方自由定义
	 */
	@ApiField("third_party_status")
	private Long thirdPartyStatus;

	public Long getBeforeCloseFlag() {
		return this.beforeCloseFlag;
	}
	public void setBeforeCloseFlag(Long beforeCloseFlag) {
		this.beforeCloseFlag = beforeCloseFlag;
	}

	public Long getBeforeConfirmFlag() {
		return this.beforeConfirmFlag;
	}
	public void setBeforeConfirmFlag(Long beforeConfirmFlag) {
		this.beforeConfirmFlag = beforeConfirmFlag;
	}

	public Long getBeforeEnableFlag() {
		return this.beforeEnableFlag;
	}
	public void setBeforeEnableFlag(Long beforeEnableFlag) {
		this.beforeEnableFlag = beforeEnableFlag;
	}

	public Long getBeforeModifyFlag() {
		return this.beforeModifyFlag;
	}
	public void setBeforeModifyFlag(Long beforeModifyFlag) {
		this.beforeModifyFlag = beforeModifyFlag;
	}

	public Long getBeforePayFlag() {
		return this.beforePayFlag;
	}
	public void setBeforePayFlag(Long beforePayFlag) {
		this.beforePayFlag = beforePayFlag;
	}

	public Long getBeforeRateFlag() {
		return this.beforeRateFlag;
	}
	public void setBeforeRateFlag(Long beforeRateFlag) {
		this.beforeRateFlag = beforeRateFlag;
	}

	public Long getBeforeRefundFlag() {
		return this.beforeRefundFlag;
	}
	public void setBeforeRefundFlag(Long beforeRefundFlag) {
		this.beforeRefundFlag = beforeRefundFlag;
	}

	public Long getBeforeShipFlag() {
		return this.beforeShipFlag;
	}
	public void setBeforeShipFlag(Long beforeShipFlag) {
		this.beforeShipFlag = beforeShipFlag;
	}

	public String getExtAttributes() {
		return this.extAttributes;
	}
	public void setExtAttributes(String extAttributes) {
		this.extAttributes = extAttributes;
	}

	public String getExtraData() {
		return this.extraData;
	}
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public Long getThirdPartyStatus() {
		return this.thirdPartyStatus;
	}
	public void setThirdPartyStatus(Long thirdPartyStatus) {
		this.thirdPartyStatus = thirdPartyStatus;
	}

}
