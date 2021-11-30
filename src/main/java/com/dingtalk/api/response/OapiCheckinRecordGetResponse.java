package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.checkin.record.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCheckinRecordGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7747698975178358189L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private PageResult result;


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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 分页列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CheckinRecordVo extends TaobaoObject {
		private static final long serialVersionUID = 4862948191615931372L;
		/**
		 * 签到时间,单位毫秒
		 */
		@ApiField("checkin_time")
		private Long checkinTime;
		/**
		 * 签到详细地址
		 */
		@ApiField("detail_place")
		private String detailPlace;
		/**
		 * 签到照片url列表
		 */
		@ApiListField("image_list")
		@ApiField("string")
		private List<String> imageList;
		/**
		 * 签到位置维度（暂未开放）
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 签到位置经度（暂未开放）
		 */
		@ApiField("longitude")
		private String longitude;
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
		 * 员工唯一标识
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 签到的拜访对象，可以为外部联系人的userid或者用户自己输入的名字
		 */
		@ApiField("visit_user")
		private String visitUser;
	
		public Long getCheckinTime() {
			return this.checkinTime;
		}
		public void setCheckinTime(Long checkinTime) {
			this.checkinTime = checkinTime;
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
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getVisitUser() {
			return this.visitUser;
		}
		public void setVisitUser(String visitUser) {
			this.visitUser = visitUser;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 4255563436496255788L;
		/**
		 * 表示下次查询的游标，为null代表没有更多的数据了
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 分页列表
		 */
		@ApiListField("page_list")
		@ApiField("checkin_record_vo")
		private List<CheckinRecordVo> pageList;
	
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<CheckinRecordVo> getPageList() {
			return this.pageList;
		}
		public void setPageList(List<CheckinRecordVo> pageList) {
			this.pageList = pageList;
		}
	}
	


}
