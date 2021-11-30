package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5867128925799199266L;

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
	 * result
	 */
	@ApiField("result")
	private Course result;

	/** 
	 * 请求是否成功
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

	public void setResult(Course result) {
		this.result = result;
	}
	public Course getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Course extends TaobaoObject {
		private static final long serialVersionUID = 7662883433414793854L;
		/**
		 * 业务唯一键
		 */
		@ApiField("biz_key")
		private String bizKey;
		/**
		 * 课程编码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 课程结束时间
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 课程介绍
		 */
		@ApiField("introduce")
		private String introduce;
		/**
		 * 课程名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 课程开始时间
		 */
		@ApiField("start_time")
		private Long startTime;
		/**
		 * 老师的组织CorpId
		 */
		@ApiField("teacher_corpid")
		private String teacherCorpid;
		/**
		 * 老师的用户ID
		 */
		@ApiField("teacher_userid")
		private String teacherUserid;
	
		public String getBizKey() {
			return this.bizKey;
		}
		public void setBizKey(String bizKey) {
			this.bizKey = bizKey;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getIntroduce() {
			return this.introduce;
		}
		public void setIntroduce(String introduce) {
			this.introduce = introduce;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
		public String getTeacherCorpid() {
			return this.teacherCorpid;
		}
		public void setTeacherCorpid(String teacherCorpid) {
			this.teacherCorpid = teacherCorpid;
		}
		public String getTeacherUserid() {
			return this.teacherUserid;
		}
		public void setTeacherUserid(String teacherUserid) {
			this.teacherUserid = teacherUserid;
		}
	}
	


}
