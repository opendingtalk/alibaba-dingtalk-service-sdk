package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.student.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduStudentListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2364652655621326341L;

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
	 * result
	 */
	@ApiField("result")
	private PageResult result;

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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StudentRespone extends TaobaoObject {
		private static final long serialVersionUID = 8397867343526712485L;
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
		/**
		 * 学生ID
		 */
		@ApiField("student_userid")
		private String studentUserid;
	
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
		public String getStudentUserid() {
			return this.studentUserid;
		}
		public void setStudentUserid(String studentUserid) {
			this.studentUserid = studentUserid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 2451495782347975618L;
		/**
		 * 是否有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("student_respone")
		private List<StudentRespone> list;
		/**
		 * 下一页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<StudentRespone> getList() {
			return this.list;
		}
		public void setList(List<StudentRespone> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
