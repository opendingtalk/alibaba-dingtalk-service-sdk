package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.goods.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreGoodsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1388239444877896744L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 商品详情
	 */
	@ApiField("goods_info")
	private OpenGoodsVo goodsInfo;


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

	public void setGoodsInfo(OpenGoodsVo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	public OpenGoodsVo getGoodsInfo( ) {
		return this.goodsInfo;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 周期列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGoodsItemCycVo extends TaobaoObject {
		private static final long serialVersionUID = 4361284319822263599L;
		/**
		 * 周期别名
		 */
		@ApiField("alias_name")
		private String aliasName;
		/**
		 * 订购周期数量
		 */
		@ApiField("cyc_num")
		private Long cycNum;
		/**
		 * 订购周期单位
		 */
		@ApiField("cyc_unit")
		private Long cycUnit;
	
		public String getAliasName() {
			return this.aliasName;
		}
		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}
		public Long getCycNum() {
			return this.cycNum;
		}
		public void setCycNum(Long cycNum) {
			this.cycNum = cycNum;
		}
		public Long getCycUnit() {
			return this.cycUnit;
		}
		public void setCycUnit(Long cycUnit) {
			this.cycUnit = cycUnit;
		}
	}
	
	/**
	 * 规格列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGoodsItemVo extends TaobaoObject {
		private static final long serialVersionUID = 7122796494831871669L;
		/**
		 * 是否试用
		 */
		@ApiField("is_try_outs")
		private Boolean isTryOuts;
		/**
		 * 规格码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 周期列表
		 */
		@ApiListField("item_cyc_list")
		@ApiField("open_goods_item_cyc_vo")
		private List<OpenGoodsItemCycVo> itemCycList;
		/**
		 * 规格名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 最大购买人数
		 */
		@ApiField("max_num")
		private Long maxNum;
		/**
		 * 最小购买人数
		 */
		@ApiField("min_num")
		private Long minNum;
	
		public Boolean getIsTryOuts() {
			return this.isTryOuts;
		}
		public void setIsTryOuts(Boolean isTryOuts) {
			this.isTryOuts = isTryOuts;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public List<OpenGoodsItemCycVo> getItemCycList() {
			return this.itemCycList;
		}
		public void setItemCycList(List<OpenGoodsItemCycVo> itemCycList) {
			this.itemCycList = itemCycList;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getMaxNum() {
			return this.maxNum;
		}
		public void setMaxNum(Long maxNum) {
			this.maxNum = maxNum;
		}
		public Long getMinNum() {
			return this.minNum;
		}
		public void setMinNum(Long minNum) {
			this.minNum = minNum;
		}
	}
	
	/**
	 * 商品详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGoodsVo extends TaobaoObject {
		private static final long serialVersionUID = 4713977422583358851L;
		/**
		 * 规格列表
		 */
		@ApiListField("item_list")
		@ApiField("open_goods_item_vo")
		private List<OpenGoodsItemVo> itemList;
		/**
		 * 商品名称
		 */
		@ApiField("name")
		private String name;
	
		public List<OpenGoodsItemVo> getItemList() {
			return this.itemList;
		}
		public void setItemList(List<OpenGoodsItemVo> itemList) {
			this.itemList = itemList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
