package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduHomeworkQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4794672547414163494L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private OpenHwDetailResponse result;

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

	public void setResult(OpenHwDetailResponse result) {
		this.result = result;
	}
	public OpenHwDetailResponse getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenHwDetailResponse extends TaobaoObject {
		private static final long serialVersionUID = 2799369421113288876L;
		/**
		 * 扩展属性
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 作业内容
		 */
		@ApiField("hw_content")
		private String hwContent;
		/**
		 * 作业视频
		 */
		@ApiField("hw_media")
		private String hwMedia;
		/**
		 * 作业图片
		 */
		@ApiField("hw_photo")
		private String hwPhoto;
		/**
		 * 作业状态
		 */
		@ApiField("hw_status")
		private String hwStatus;
		/**
		 * 作业标题
		 */
		@ApiField("hw_title")
		private String hwTitle;
		/**
		 * 作业录音
		 */
		@ApiField("hw_video")
		private String hwVideo;
		/**
		 * 是否定时作业
		 */
		@ApiField("scheduled_release")
		private String scheduledRelease;
		/**
		 * 定时发送事件
		 */
		@ApiField("scheduled_time")
		private String scheduledTime;
		/**
		 * 发送时间
		 */
		@ApiField("send_time")
		private Date sendTime;
		/**
		 * 老师ID
		 */
		@ApiField("teacher_id")
		private String teacherId;
		/**
		 * 老师姓名
		 */
		@ApiField("teacher_name")
		private String teacherName;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public String getHwContent() {
			return this.hwContent;
		}
		public void setHwContent(String hwContent) {
			this.hwContent = hwContent;
		}
		public String getHwMedia() {
			return this.hwMedia;
		}
		public void setHwMedia(String hwMedia) {
			this.hwMedia = hwMedia;
		}
		public String getHwPhoto() {
			return this.hwPhoto;
		}
		public void setHwPhoto(String hwPhoto) {
			this.hwPhoto = hwPhoto;
		}
		public String getHwStatus() {
			return this.hwStatus;
		}
		public void setHwStatus(String hwStatus) {
			this.hwStatus = hwStatus;
		}
		public String getHwTitle() {
			return this.hwTitle;
		}
		public void setHwTitle(String hwTitle) {
			this.hwTitle = hwTitle;
		}
		public String getHwVideo() {
			return this.hwVideo;
		}
		public void setHwVideo(String hwVideo) {
			this.hwVideo = hwVideo;
		}
		public String getScheduledRelease() {
			return this.scheduledRelease;
		}
		public void setScheduledRelease(String scheduledRelease) {
			this.scheduledRelease = scheduledRelease;
		}
		public String getScheduledTime() {
			return this.scheduledTime;
		}
		public void setScheduledTime(String scheduledTime) {
			this.scheduledTime = scheduledTime;
		}
		public Date getSendTime() {
			return this.sendTime;
		}
		public void setSendTime(Date sendTime) {
			this.sendTime = sendTime;
		}
		public String getTeacherId() {
			return this.teacherId;
		}
		public void setTeacherId(String teacherId) {
			this.teacherId = teacherId;
		}
		public String getTeacherName() {
			return this.teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
	}
	


}
