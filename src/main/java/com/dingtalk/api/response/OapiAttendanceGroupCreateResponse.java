package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7315437167393895772L;

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
	 * 考勤组
	 */
	@ApiField("result")
	private Group result;

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

	public void setResult(Group result) {
		this.result = result;
	}
	public Group getResult( ) {
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
		private static final long serialVersionUID = 7336871659788125286L;
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
	


}
