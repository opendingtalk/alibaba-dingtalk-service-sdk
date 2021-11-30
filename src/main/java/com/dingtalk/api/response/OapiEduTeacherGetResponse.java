package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.teacher.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduTeacherGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7749431338317452852L;

	/** 
	 * 错误码
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
	private TeacherRespone result;

	/** 
	 * 成功状态
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

	public void setResult(TeacherRespone result) {
		this.result = result;
	}
	public TeacherRespone getResult( ) {
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
	public static class TeacherRespone extends TaobaoObject {
		private static final long serialVersionUID = 6371185982884826748L;
		/**
		 * 校区ID
		 */
		@ApiField("campus_id")
		private Long campusId;
		/**
		 * 班级ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 年级ID
		 */
		@ApiField("grade_id")
		private Long gradeId;
		/**
		 * 是否为班主任，1是，0不是
		 */
		@ApiField("is_adviser")
		private Long isAdviser;
		/**
		 * 老师名称
		 */
		@ApiField("teacher_name")
		private String teacherName;
	
		public Long getCampusId() {
			return this.campusId;
		}
		public void setCampusId(Long campusId) {
			this.campusId = campusId;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public Long getGradeId() {
			return this.gradeId;
		}
		public void setGradeId(Long gradeId) {
			this.gradeId = gradeId;
		}
		public Long getIsAdviser() {
			return this.isAdviser;
		}
		public void setIsAdviser(Long isAdviser) {
			this.isAdviser = isAdviser;
		}
		public String getTeacherName() {
			return this.teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
	}
	


}
