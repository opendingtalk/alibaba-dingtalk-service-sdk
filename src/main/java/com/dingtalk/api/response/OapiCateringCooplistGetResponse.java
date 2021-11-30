package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.cooplist.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringCooplistGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6558616154145518874L;

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
	 * result
	 */
	@ApiField("result")
	private Result result;

	/** 
	 * success or not
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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * mealItemList
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Mealitemlist extends TaobaoObject {
		private static final long serialVersionUID = 8715351842759487495L;
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MealSettingList extends TaobaoObject {
		private static final long serialVersionUID = 7297179434654658475L;
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
		 * 企业corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 企业名称
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 企业logo的url
		 */
		@ApiField("logo")
		private String logo;
		/**
		 * mealItemList
		 */
		@ApiListField("meal_item_list")
		@ApiField("mealitemlist")
		private List<Mealitemlist> mealItemList;
		/**
		 * 点餐时间枚举值：2-法定工作日3-双休及节假日
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
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getLogo() {
			return this.logo;
		}
		public void setLogo(String logo) {
			this.logo = logo;
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
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 6478117438384313529L;
		/**
		 * 是否有下一项数据
		 */
		@ApiField("has_next")
		private Boolean hasNext;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("meal_setting_list")
		private List<MealSettingList> list;
	
		public Boolean getHasNext() {
			return this.hasNext;
		}
		public void setHasNext(Boolean hasNext) {
			this.hasNext = hasNext;
		}
		public List<MealSettingList> getList() {
			return this.list;
		}
		public void setList(List<MealSettingList> list) {
			this.list = list;
		}
	}
	


}
