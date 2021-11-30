package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.comment.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduHomeworkStudentCommentListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2266341669962321578L;

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
	@ApiListField("result")
	@ApiField("open_hw_comment_response")
	private List<OpenHwCommentResponse> result;

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

	public void setResult(List<OpenHwCommentResponse> result) {
		this.result = result;
	}
	public List<OpenHwCommentResponse> getResult( ) {
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
	public static class OpenHwCommentResponse extends TaobaoObject {
		private static final long serialVersionUID = 5695363912164385133L;
		/**
		 * 扩展属性
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 评论内容
		 */
		@ApiField("comment")
		private String comment;
		/**
		 * 评论ID
		 */
		@ApiField("comment_id")
		private Long commentId;
		/**
		 * 评论时间
		 */
		@ApiField("comment_time")
		private Date commentTime;
		/**
		 * 视频
		 */
		@ApiField("media")
		private String media;
		/**
		 * 图片
		 */
		@ApiField("photo")
		private String photo;
		/**
		 * 学生ID
		 */
		@ApiField("student_id")
		private String studentId;
		/**
		 * 学生姓名
		 */
		@ApiField("student_name")
		private String studentName;
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
		/**
		 * 音频
		 */
		@ApiField("video")
		private String video;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public String getComment() {
			return this.comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Long getCommentId() {
			return this.commentId;
		}
		public void setCommentId(Long commentId) {
			this.commentId = commentId;
		}
		public Date getCommentTime() {
			return this.commentTime;
		}
		public void setCommentTime(Date commentTime) {
			this.commentTime = commentTime;
		}
		public String getMedia() {
			return this.media;
		}
		public void setMedia(String media) {
			this.media = media;
		}
		public String getPhoto() {
			return this.photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getStudentId() {
			return this.studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return this.studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
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
		public String getVideo() {
			return this.video;
		}
		public void setVideo(String video) {
			this.video = video;
		}
	}
	


}
