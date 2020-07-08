package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.mealconfig.get.beta response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringMealconfigGetBetaResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2314458294322145673L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * GroupMealSettingVo
	 */
	@ApiField("result")
	private GroupMealSettingVo result;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(GroupMealSettingVo result) {
		this.result = result;
	}
	public GroupMealSettingVo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * Mealitemlist
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Mealitemlist extends TaobaoObject {
		private static final long serialVersionUID = 1334392857212386464L;
		/**
		 * 送达时间 HH:mm
		 */
		@ApiField("delivery_time")
		private String deliveryTime;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 点餐项名称
		 */
		@ApiField("title")
		private String title;
	
		public String getDeliveryTime() {
			return this.deliveryTime;
		}
		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * Addressvos
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Addressvos extends TaobaoObject {
		private static final long serialVersionUID = 1193835784977386215L;
		/**
		 * 缩略地址，可为空
		 */
		@ApiField("address")
		private String address;
		/**
		 * 送餐详细地址
		 */
		@ApiField("address_detail")
		private String addressDetail;
		/**
		 * 地址id
		 */
		@ApiField("address_id")
		private Long addressId;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddressDetail() {
			return this.addressDetail;
		}
		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
		public Long getAddressId() {
			return this.addressId;
		}
		public void setAddressId(Long addressId) {
			this.addressId = addressId;
		}
	}
	
	/**
	 * GroupMealSettingVo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMealSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 5383486732552936858L;
		/**
		 * 缩略地址，可为空
		 */
		@ApiField("address")
		private String address;
		/**
		 * 送餐详细地址
		 */
		@ApiField("address_detail")
		private String addressDetail;
		/**
		 * 默认地址的id
		 */
		@ApiField("address_id")
		private Long addressId;
		/**
		 * Addressvos
		 */
		@ApiListField("address_list")
		@ApiField("addressvos")
		private List<Addressvos> addressList;
		/**
		 * 可点餐时间
		 */
		@ApiListField("coming_meal_day_list")
		@ApiField("string")
		private List<String> comingMealDayList;
		/**
		 * 企业corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * Mealitemlist
		 */
		@ApiListField("meal_item_list")
		@ApiField("mealitemlist")
		private List<Mealitemlist> mealItemList;
		/**
		 * 点餐时间枚举值：2-法定工作日3-双休及节假日4- 每天
		 */
		@ApiField("meal_time")
		private Long mealTime;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddressDetail() {
			return this.addressDetail;
		}
		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
		public Long getAddressId() {
			return this.addressId;
		}
		public void setAddressId(Long addressId) {
			this.addressId = addressId;
		}
		public List<Addressvos> getAddressList() {
			return this.addressList;
		}
		public void setAddressList(List<Addressvos> addressList) {
			this.addressList = addressList;
		}
		public List<String> getComingMealDayList() {
			return this.comingMealDayList;
		}
		public void setComingMealDayList(List<String> comingMealDayList) {
			this.comingMealDayList = comingMealDayList;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<Mealitemlist> getMealItemList() {
			return this.mealItemList;
		}
		public void setMealItemList(List<Mealitemlist> mealItemList) {
			this.mealItemList = mealItemList;
		}
		public Long getMealTime() {
			return this.mealTime;
		}
		public void setMealTime(Long mealTime) {
			this.mealTime = mealTime;
		}
	}
	


}
