package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGradeListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3362462435827333547L;

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
	@ApiField("grade_response")
	private List<GradeResponse> result;

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

	public void setResult(List<GradeResponse> result) {
		this.result = result;
	}
	public List<GradeResponse> getResult( ) {
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
	public static class GradeResponse extends TaobaoObject {
		private static final long serialVersionUID = 8568959783294145821L;
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
		 * 年级级数（一年级为1，二年级为2）
		 */
		@ApiField("grade_level")
		private Long gradeLevel;
		/**
		 * 年级名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 入学年份
		 */
		@ApiField("start_year")
		private String startYear;
	
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
		public Long getGradeLevel() {
			return this.gradeLevel;
		}
		public void setGradeLevel(Long gradeLevel) {
			this.gradeLevel = gradeLevel;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStartYear() {
			return this.startYear;
		}
		public void setStartYear(String startYear) {
			this.startYear = startYear;
		}
	}
	


}
