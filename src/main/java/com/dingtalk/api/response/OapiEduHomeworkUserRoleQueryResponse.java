package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.user.role.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduHomeworkUserRoleQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4664179121795251422L;

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
	 * 返回结果
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4333743226124242726L;
		/**
		 * 是否家长
		 */
		@ApiField("guardian")
		private Boolean guardian;
		/**
		 * 是否班主任
		 */
		@ApiField("headmaster")
		private Boolean headmaster;
		/**
		 * 是否学生
		 */
		@ApiField("student")
		private Boolean student;
		/**
		 * 学生列表
		 */
		@ApiListField("students")
		@ApiField("string")
		private List<String> students;
		/**
		 * 是否老师
		 */
		@ApiField("teacher")
		private Boolean teacher;
		/**
		 * 用户角色
		 */
		@ApiField("user_role")
		private String userRole;
	
		public Boolean getGuardian() {
			return this.guardian;
		}
		public void setGuardian(Boolean guardian) {
			this.guardian = guardian;
		}
		public Boolean getHeadmaster() {
			return this.headmaster;
		}
		public void setHeadmaster(Boolean headmaster) {
			this.headmaster = headmaster;
		}
		public Boolean getStudent() {
			return this.student;
		}
		public void setStudent(Boolean student) {
			this.student = student;
		}
		public List<String> getStudents() {
			return this.students;
		}
		public void setStudents(List<String> students) {
			this.students = students;
		}
		public Boolean getTeacher() {
			return this.teacher;
		}
		public void setTeacher(Boolean teacher) {
			this.teacher = teacher;
		}
		public String getUserRole() {
			return this.userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
	}
	


}
