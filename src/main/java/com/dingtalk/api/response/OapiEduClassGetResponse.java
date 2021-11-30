package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8642156292986644976L;

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
	private ClassResponse result;

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

	public void setResult(ClassResponse result) {
		this.result = result;
	}
	public ClassResponse getResult( ) {
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
	public static class ClassResponse extends TaobaoObject {
		private static final long serialVersionUID = 1636895742114572475L;
		/**
		 * 校区ID
		 */
		@ApiField("campus_id")
		private Long campusId;
		/**
		 * 班级级数（1班为1，二班为2）
		 */
		@ApiField("class_level")
		private Long classLevel;
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
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 别名
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 学段ID
		 */
		@ApiField("period_id")
		private Long periodId;
	
		public Long getCampusId() {
			return this.campusId;
		}
		public void setCampusId(Long campusId) {
			this.campusId = campusId;
		}
		public Long getClassLevel() {
			return this.classLevel;
		}
		public void setClassLevel(Long classLevel) {
			this.classLevel = classLevel;
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
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Long getPeriodId() {
			return this.periodId;
		}
		public void setPeriodId(Long periodId) {
			this.periodId = periodId;
		}
	}
	


}
