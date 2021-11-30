package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.checkin.record response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCheckinRecordResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8436899377172472881L;

	/** 
	 * data
	 */
	@ApiListField("data")
	@ApiField("data")
	private List<Data> data;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setData(List<Data> data) {
		this.data = data;
	}
	public List<Data> getData( ) {
		return this.data;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * data
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Data extends TaobaoObject {
		private static final long serialVersionUID = 6377596347928381942L;
		/**
		 * 头像url
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 签到详细地址
		 */
		@ApiField("detailPlace")
		private String detailPlace;
		/**
		 * 签到照片url列表
		 */
		@ApiListField("imageList")
		@ApiField("string")
		private List<String> imageList;
		/**
		 * 纬度
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 经度
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * 成员名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 签到地址
		 */
		@ApiField("place")
		private String place;
		/**
		 * 签到备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 签到时间
		 */
		@ApiField("timestamp")
		private Long timestamp;
		/**
		 * 员工唯一标识ID（不可修改）
		 */
		@ApiField("userId")
		private String userId;
	
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public String getDetailPlace() {
			return this.detailPlace;
		}
		public void setDetailPlace(String detailPlace) {
			this.detailPlace = detailPlace;
		}
		public List<String> getImageList() {
			return this.imageList;
		}
		public void setImageList(List<String> imageList) {
			this.imageList = imageList;
		}
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPlace() {
			return this.place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public Long getTimestamp() {
			return this.timestamp;
		}
		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	


}
