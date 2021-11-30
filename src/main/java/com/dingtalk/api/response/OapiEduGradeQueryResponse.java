package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGradeQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5355919296837799515L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
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
	 * 年级列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Grades extends TaobaoObject {
		private static final long serialVersionUID = 4268882427791846178L;
		/**
		 * 校区id
		 */
		@ApiField("campus_id")
		private Long campusId;
		/**
		 * 年级id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 年级level
		 */
		@ApiField("grade")
		private Long grade;
		/**
		 * 年级名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学段code
		 */
		@ApiField("period_code")
		private String periodCode;
		/**
		 * 学段id
		 */
		@ApiField("super_id")
		private Long superId;
	
		public Long getCampusId() {
			return this.campusId;
		}
		public void setCampusId(Long campusId) {
			this.campusId = campusId;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Long getGrade() {
			return this.grade;
		}
		public void setGrade(Long grade) {
			this.grade = grade;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPeriodCode() {
			return this.periodCode;
		}
		public void setPeriodCode(String periodCode) {
			this.periodCode = periodCode;
		}
		public Long getSuperId() {
			return this.superId;
		}
		public void setSuperId(Long superId) {
			this.superId = superId;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 5741324327831955444L;
		/**
		 * 年级列表
		 */
		@ApiListField("grades")
		@ApiField("grades")
		private List<Grades> grades;
	
		public List<Grades> getGrades() {
			return this.grades;
		}
		public void setGrades(List<Grades> grades) {
			this.grades = grades;
		}
	}
	


}
