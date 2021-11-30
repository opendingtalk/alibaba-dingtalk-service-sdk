package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.groups.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupsQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4537783766589959654L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 考勤组列表
	 */
	@ApiField("result")
	private Result result;

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
	 * 考勤组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Group extends TaobaoObject {
		private static final long serialVersionUID = 2319393956658545399L;
		/**
		 * 是否开启拍照打卡，默认false
		 */
		@ApiField("enable_camera_check")
		private Boolean enableCameraCheck;
		/**
		 * 是否开启美颜，默认false
		 */
		@ApiField("enable_face_beauty")
		private Boolean enableFaceBeauty;
		/**
		 * 是否开启笑脸打卡(若开启笑脸则默认开启拍照打卡)，默认false
		 */
		@ApiField("enable_face_check")
		private Boolean enableFaceCheck;
		/**
		 * 扩展字段，JSON格式
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 考勤组id
		 */
		@ApiField("group_key")
		private String groupKey;
		/**
		 * 打卡范围，单位：米
		 */
		@ApiField("location_offset")
		private Long locationOffset;
		/**
		 * 考勤组名称
		 */
		@ApiField("name")
		private String name;
	
		public Boolean getEnableCameraCheck() {
			return this.enableCameraCheck;
		}
		public void setEnableCameraCheck(Boolean enableCameraCheck) {
			this.enableCameraCheck = enableCameraCheck;
		}
		public Boolean getEnableFaceBeauty() {
			return this.enableFaceBeauty;
		}
		public void setEnableFaceBeauty(Boolean enableFaceBeauty) {
			this.enableFaceBeauty = enableFaceBeauty;
		}
		public Boolean getEnableFaceCheck() {
			return this.enableFaceCheck;
		}
		public void setEnableFaceCheck(Boolean enableFaceCheck) {
			this.enableFaceCheck = enableFaceCheck;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public String getGroupKey() {
			return this.groupKey;
		}
		public void setGroupKey(String groupKey) {
			this.groupKey = groupKey;
		}
		public Long getLocationOffset() {
			return this.locationOffset;
		}
		public void setLocationOffset(Long locationOffset) {
			this.locationOffset = locationOffset;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 考勤组列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7642499342258559275L;
		/**
		 * 游标
		 */
		@ApiField("cursor")
		private String cursor;
		/**
		 * 考勤组
		 */
		@ApiListField("group_list")
		@ApiField("group")
		private List<Group> groupList;
		/**
		 * 是否更多
		 */
		@ApiField("has_more")
		private Boolean hasMore;
	
		public String getCursor() {
			return this.cursor;
		}
		public void setCursor(String cursor) {
			this.cursor = cursor;
		}
		public List<Group> getGroupList() {
			return this.groupList;
		}
		public void setGroupList(List<Group> groupList) {
			this.groupList = groupList;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
	}
	


}
