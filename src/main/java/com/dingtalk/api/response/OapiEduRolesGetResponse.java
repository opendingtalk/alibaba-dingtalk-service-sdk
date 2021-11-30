package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.roles.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduRolesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5781368554727945164L;

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
	 * 请求数据块
	 */
	@ApiField("result")
	private QueryUserRolesResponse result;

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

	public void setResult(QueryUserRolesResponse result) {
		this.result = result;
	}
	public QueryUserRolesResponse getResult( ) {
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
	 * 请求数据块
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryUserRolesResponse extends TaobaoObject {
		private static final long serialVersionUID = 7638711458287411798L;
		/**
		 * 非NULL列表;此员工在当前家校通讯录中的是班主任角色的班级列表
		 */
		@ApiListField("advisor")
		@ApiField("number")
		private List<Long> advisor;
		/**
		 * 非NULL列表;此员工在当前家校通讯录中的是监护人角色的班级列表
		 */
		@ApiListField("guardian")
		@ApiField("number")
		private List<Long> guardian;
		/**
		 * 非NULL列表;此员工在当前家校通讯录中的是学生角色的班级列表
		 */
		@ApiListField("student")
		@ApiField("number")
		private List<Long> student;
		/**
		 * 非NULL列表;此员工在当前家校通讯录中的是老师角色的班级列表
		 */
		@ApiListField("teacher")
		@ApiField("number")
		private List<Long> teacher;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<Long> getAdvisor() {
			return this.advisor;
		}
		public void setAdvisor(List<Long> advisor) {
			this.advisor = advisor;
		}
		public List<Long> getGuardian() {
			return this.guardian;
		}
		public void setGuardian(List<Long> guardian) {
			this.guardian = guardian;
		}
		public List<Long> getStudent() {
			return this.student;
		}
		public void setStudent(List<Long> student) {
			this.student = student;
		}
		public List<Long> getTeacher() {
			return this.teacher;
		}
		public void setTeacher(List<Long> teacher) {
			this.teacher = teacher;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
