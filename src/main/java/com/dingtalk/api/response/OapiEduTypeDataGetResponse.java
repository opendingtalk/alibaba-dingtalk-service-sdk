package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.type.data.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduTypeDataGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2622529742989686136L;

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
	 * 结果合集
	 */
	@ApiListField("result")
	@ApiField("open_edu_school_type_statistical_data_response")
	private List<OpenEduSchoolTypeStatisticalDataResponse> result;

	/** 
	 * 成功偶然失败
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

	public void setResult(List<OpenEduSchoolTypeStatisticalDataResponse> result) {
		this.result = result;
	}
	public List<OpenEduSchoolTypeStatisticalDataResponse> getResult( ) {
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
	 * 结果合集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEduSchoolTypeStatisticalDataResponse extends TaobaoObject {
		private static final long serialVersionUID = 3849391814766853989L;
		/**
		 * 数字化教师数量
		 */
		@ApiField("auth_teacher_cnt_std")
		private String authTeacherCntStd;
		/**
		 * 班级数量
		 */
		@ApiField("class_cnt_std")
		private String classCntStd;
		/**
		 * 学校id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 多家长监管学生数
		 */
		@ApiField("multi_patriarch_student_cnt")
		private String multiPatriarchStudentCnt;
		/**
		 * 多家长监管学生比率
		 */
		@ApiField("multi_patriarch_student_ratio")
		private String multiPatriarchStudentRatio;
		/**
		 * 无家长监管学生数
		 */
		@ApiField("none_patriarch_student_cnt")
		private String nonePatriarchStudentCnt;
		/**
		 * 无家长监管学生比率
		 */
		@ApiField("none_patriarch_student_ratio")
		private String nonePatriarchStudentRatio;
		/**
		 * 家长数量
		 */
		@ApiField("patriarch_cnt_std")
		private String patriarchCntStd;
		/**
		 * 学校数量
		 */
		@ApiField("school_cnt_std")
		private String schoolCntStd;
		/**
		 * 学校类型
		 */
		@ApiField("school_type")
		private String schoolType;
		/**
		 * 单家长监管学生数
		 */
		@ApiField("single_patriarch_student_cnt")
		private String singlePatriarchStudentCnt;
		/**
		 * 单家长监管学生比率
		 */
		@ApiField("single_patriarch_student_ratio")
		private String singlePatriarchStudentRatio;
		/**
		 * 统计日期
		 */
		@ApiField("stat_date")
		private String statDate;
		/**
		 * 学生数量
		 */
		@ApiField("student_cnt_std")
		private String studentCntStd;
		/**
		 * 教师数量
		 */
		@ApiField("teacher_cnt_std")
		private String teacherCntStd;
		/**
		 * 双家长监管学生数
		 */
		@ApiField("two_patriarch_student_cnt")
		private String twoPatriarchStudentCnt;
		/**
		 * 双家长监管学生比率
		 */
		@ApiField("two_patriarch_student_ratio")
		private String twoPatriarchStudentRatio;
	
		public String getAuthTeacherCntStd() {
			return this.authTeacherCntStd;
		}
		public void setAuthTeacherCntStd(String authTeacherCntStd) {
			this.authTeacherCntStd = authTeacherCntStd;
		}
		public String getClassCntStd() {
			return this.classCntStd;
		}
		public void setClassCntStd(String classCntStd) {
			this.classCntStd = classCntStd;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getMultiPatriarchStudentCnt() {
			return this.multiPatriarchStudentCnt;
		}
		public void setMultiPatriarchStudentCnt(String multiPatriarchStudentCnt) {
			this.multiPatriarchStudentCnt = multiPatriarchStudentCnt;
		}
		public String getMultiPatriarchStudentRatio() {
			return this.multiPatriarchStudentRatio;
		}
		public void setMultiPatriarchStudentRatio(String multiPatriarchStudentRatio) {
			this.multiPatriarchStudentRatio = multiPatriarchStudentRatio;
		}
		public String getNonePatriarchStudentCnt() {
			return this.nonePatriarchStudentCnt;
		}
		public void setNonePatriarchStudentCnt(String nonePatriarchStudentCnt) {
			this.nonePatriarchStudentCnt = nonePatriarchStudentCnt;
		}
		public String getNonePatriarchStudentRatio() {
			return this.nonePatriarchStudentRatio;
		}
		public void setNonePatriarchStudentRatio(String nonePatriarchStudentRatio) {
			this.nonePatriarchStudentRatio = nonePatriarchStudentRatio;
		}
		public String getPatriarchCntStd() {
			return this.patriarchCntStd;
		}
		public void setPatriarchCntStd(String patriarchCntStd) {
			this.patriarchCntStd = patriarchCntStd;
		}
		public String getSchoolCntStd() {
			return this.schoolCntStd;
		}
		public void setSchoolCntStd(String schoolCntStd) {
			this.schoolCntStd = schoolCntStd;
		}
		public String getSchoolType() {
			return this.schoolType;
		}
		public void setSchoolType(String schoolType) {
			this.schoolType = schoolType;
		}
		public String getSinglePatriarchStudentCnt() {
			return this.singlePatriarchStudentCnt;
		}
		public void setSinglePatriarchStudentCnt(String singlePatriarchStudentCnt) {
			this.singlePatriarchStudentCnt = singlePatriarchStudentCnt;
		}
		public String getSinglePatriarchStudentRatio() {
			return this.singlePatriarchStudentRatio;
		}
		public void setSinglePatriarchStudentRatio(String singlePatriarchStudentRatio) {
			this.singlePatriarchStudentRatio = singlePatriarchStudentRatio;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
		public String getStudentCntStd() {
			return this.studentCntStd;
		}
		public void setStudentCntStd(String studentCntStd) {
			this.studentCntStd = studentCntStd;
		}
		public String getTeacherCntStd() {
			return this.teacherCntStd;
		}
		public void setTeacherCntStd(String teacherCntStd) {
			this.teacherCntStd = teacherCntStd;
		}
		public String getTwoPatriarchStudentCnt() {
			return this.twoPatriarchStudentCnt;
		}
		public void setTwoPatriarchStudentCnt(String twoPatriarchStudentCnt) {
			this.twoPatriarchStudentCnt = twoPatriarchStudentCnt;
		}
		public String getTwoPatriarchStudentRatio() {
			return this.twoPatriarchStudentRatio;
		}
		public void setTwoPatriarchStudentRatio(String twoPatriarchStudentRatio) {
			this.twoPatriarchStudentRatio = twoPatriarchStudentRatio;
		}
	}
	


}
