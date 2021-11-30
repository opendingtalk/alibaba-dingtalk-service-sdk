package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.teacher.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduTeacherListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4777563239189814818L;

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
	@ApiListField("result")
	@ApiField("teacher_respone")
	private List<TeacherRespone> result;

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

	public void setResult(List<TeacherRespone> result) {
		this.result = result;
	}
	public List<TeacherRespone> getResult( ) {
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
		private static final long serialVersionUID = 7368597219339792456L;
		/**
		 * 校区ID
		 */
		@ApiField("campus_id")
		private Long campusId;
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
		 * 学段ID
		 */
		@ApiField("period_id")
		private Long periodId;
		/**
		 * 名称
		 */
		@ApiField("teacher_name")
		private String teacherName;
		/**
		 * 老师ID
		 */
		@ApiField("teacher_userid")
		private String teacherUserid;
	
		public Long getCampusId() {
			return this.campusId;
		}
		public void setCampusId(Long campusId) {
			this.campusId = campusId;
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
		public Long getPeriodId() {
			return this.periodId;
		}
		public void setPeriodId(Long periodId) {
			this.periodId = periodId;
		}
		public String getTeacherName() {
			return this.teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		public String getTeacherUserid() {
			return this.teacherUserid;
		}
		public void setTeacherUserid(String teacherUserid) {
			this.teacherUserid = teacherUserid;
		}
	}
	


}
