package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGradeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8611631516785977222L;

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
	private GradeResponse result;

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

	public void setResult(GradeResponse result) {
		this.result = result;
	}
	public GradeResponse getResult( ) {
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
		private static final long serialVersionUID = 1821167881778564174L;
		/**
		 * 校区ID
		 */
		@ApiField("campus_id")
		private Long campusId;
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
		public String getStartYear() {
			return this.startYear;
		}
		public void setStartYear(String startYear) {
			this.startYear = startYear;
		}
	}
	


}
