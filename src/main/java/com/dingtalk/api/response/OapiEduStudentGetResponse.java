package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.student.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduStudentGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6854629966124367758L;

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
	private StudentRespone result;

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

	public void setResult(StudentRespone result) {
		this.result = result;
	}
	public StudentRespone getResult( ) {
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
	 * guardians
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GuardianRespone extends TaobaoObject {
		private static final long serialVersionUID = 5869545214483861462L;
		/**
		 * 家长ID
		 */
		@ApiField("guardian_userid")
		private String guardianUserid;
		/**
		 * 别名
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 关系
		 */
		@ApiField("relation")
		private String relation;
	
		public String getGuardianUserid() {
			return this.guardianUserid;
		}
		public void setGuardianUserid(String guardianUserid) {
			this.guardianUserid = guardianUserid;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StudentRespone extends TaobaoObject {
		private static final long serialVersionUID = 5293387944284388826L;
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
		 * guardians
		 */
		@ApiListField("guardians")
		@ApiField("guardian_respone")
		private List<GuardianRespone> guardians;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学段ID
		 */
		@ApiField("period_id")
		private Long periodId;
		/**
		 * 学号
		 */
		@ApiField("student_no")
		private String studentNo;
	
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
		public List<GuardianRespone> getGuardians() {
			return this.guardians;
		}
		public void setGuardians(List<GuardianRespone> guardians) {
			this.guardians = guardians;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPeriodId() {
			return this.periodId;
		}
		public void setPeriodId(Long periodId) {
			this.periodId = periodId;
		}
		public String getStudentNo() {
			return this.studentNo;
		}
		public void setStudentNo(String studentNo) {
			this.studentNo = studentNo;
		}
	}
	


}
