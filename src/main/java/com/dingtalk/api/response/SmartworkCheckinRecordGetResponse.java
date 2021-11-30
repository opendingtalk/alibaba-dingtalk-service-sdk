package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.checkin.record.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkCheckinRecordGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3829996219291129361L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 分页列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CheckinRecordVo extends TaobaoObject {
		private static final long serialVersionUID = 8741682674569746187L;
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
		private static final long serialVersionUID = 4122238713746173561L;
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
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4585566953112693241L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private PageResult result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public PageResult getResult() {
			return this.result;
		}
		public void setResult(PageResult result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
