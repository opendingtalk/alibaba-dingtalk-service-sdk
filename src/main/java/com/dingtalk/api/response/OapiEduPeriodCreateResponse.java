package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.period.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduPeriodCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6388293461783732486L;

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
	 * 返回结果值
	 */
	@ApiField("result")
	private OpenPeriodCreateResponse result;

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

	public void setResult(OpenPeriodCreateResponse result) {
		this.result = result;
	}
	public OpenPeriodCreateResponse getResult( ) {
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
	 * 年级id，有可能会空列表，需要通过读接口查询
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EduGradeDo extends TaobaoObject {
		private static final long serialVersionUID = 1794595413189126327L;
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
		 * 年级等级
		 */
		@ApiField("grade")
		private Long grade;
		/**
		 * 年级名
		 */
		@ApiField("name")
		private String name;
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
		public Long getSuperId() {
			return this.superId;
		}
		public void setSuperId(Long superId) {
			this.superId = superId;
		}
	}
	
	/**
	 * 返回结果值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPeriodCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 1586429886225837547L;
		/**
		 * 学段id
		 */
		@ApiField("deptId")
		private Long deptId;
		/**
		 * 年级id，有可能会空列表，需要通过读接口查询
		 */
		@ApiListField("grades")
		@ApiField("edu_grade_do")
		private List<EduGradeDo> grades;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public List<EduGradeDo> getGrades() {
			return this.grades;
		}
		public void setGrades(List<EduGradeDo> grades) {
			this.grades = grades;
		}
	}
	


}
