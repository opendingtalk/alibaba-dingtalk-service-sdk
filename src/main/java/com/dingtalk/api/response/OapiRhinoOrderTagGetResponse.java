package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.tag.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderTagGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3784455786495953791L;

	/** 
	 * 响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 调用结果
	 */
	@ApiField("model")
	private OrderTagDto model;


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

	public void setModel(OrderTagDto model) {
		this.model = model;
	}
	public OrderTagDto getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderTagDto extends TaobaoObject {
		private static final long serialVersionUID = 2266246728547239378L;
		/**
		 * bom是否ready
		 */
		@ApiField("bom_ready")
		private Boolean bomReady;
		/**
		 * 是否为2C订单
		 */
		@ApiField("customize_order")
		private Boolean customizeOrder;
		/**
		 * embroidery是否ready
		 */
		@ApiField("embroidery_ready")
		private Boolean embroideryReady;
		/**
		 * 商家货号
		 */
		@ApiField("goods_no")
		private String goodsNo;
		/**
		 * 唛架包是否ready
		 */
		@ApiField("marker_ready")
		private Boolean markerReady;
		/**
		 * 是否不需要BOM,除非明确设置为true，否则均为false
		 */
		@ApiField("no_bom")
		private Boolean noBom;
		/**
		 * 是否不需要GSD,除非明确设置为true，否则均为false
		 */
		@ApiField("no_gsd")
		private Boolean noGsd;
		/**
		 * 是否不需要laser,除非明确设置为true，否则均为false
		 */
		@ApiField("no_laser")
		private Boolean noLaser;
		/**
		 * 是否不需要唛架,除非明确设置为true，否则均为false
		 */
		@ApiField("no_marker")
		private Boolean noMarker;
		/**
		 * 是否需要跳过sap,除非明确设置为true,否则均不跳过
		 */
		@ApiField("skip_sap")
		private Boolean skipSap;
		/**
		 * 是否跳过供应链相关,除非明确设置为true，否则均不跳过
		 */
		@ApiField("skip_supply_chain")
		private Boolean skipSupplyChain;
	
		public Boolean getBomReady() {
			return this.bomReady;
		}
		public void setBomReady(Boolean bomReady) {
			this.bomReady = bomReady;
		}
		public Boolean getCustomizeOrder() {
			return this.customizeOrder;
		}
		public void setCustomizeOrder(Boolean customizeOrder) {
			this.customizeOrder = customizeOrder;
		}
		public Boolean getEmbroideryReady() {
			return this.embroideryReady;
		}
		public void setEmbroideryReady(Boolean embroideryReady) {
			this.embroideryReady = embroideryReady;
		}
		public String getGoodsNo() {
			return this.goodsNo;
		}
		public void setGoodsNo(String goodsNo) {
			this.goodsNo = goodsNo;
		}
		public Boolean getMarkerReady() {
			return this.markerReady;
		}
		public void setMarkerReady(Boolean markerReady) {
			this.markerReady = markerReady;
		}
		public Boolean getNoBom() {
			return this.noBom;
		}
		public void setNoBom(Boolean noBom) {
			this.noBom = noBom;
		}
		public Boolean getNoGsd() {
			return this.noGsd;
		}
		public void setNoGsd(Boolean noGsd) {
			this.noGsd = noGsd;
		}
		public Boolean getNoLaser() {
			return this.noLaser;
		}
		public void setNoLaser(Boolean noLaser) {
			this.noLaser = noLaser;
		}
		public Boolean getNoMarker() {
			return this.noMarker;
		}
		public void setNoMarker(Boolean noMarker) {
			this.noMarker = noMarker;
		}
		public Boolean getSkipSap() {
			return this.skipSap;
		}
		public void setSkipSap(Boolean skipSap) {
			this.skipSap = skipSap;
		}
		public Boolean getSkipSupplyChain() {
			return this.skipSupplyChain;
		}
		public void setSkipSupplyChain(Boolean skipSupplyChain) {
			this.skipSupplyChain = skipSupplyChain;
		}
	}
	


}
