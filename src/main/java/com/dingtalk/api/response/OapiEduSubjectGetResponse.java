package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.subject.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduSubjectGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4238289149969849141L;

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
	 * 学科实例对象
	 */
	@ApiField("result")
	private SubjectInstanceDTO result;

	/** 
	 * 是否调用成功
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

	public void setResult(SubjectInstanceDTO result) {
		this.result = result;
	}
	public SubjectInstanceDTO getResult( ) {
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
	 * 学科实例对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubjectInstanceDTO extends TaobaoObject {
		private static final long serialVersionUID = 6642299712345726342L;
		/**
		 * 学段编码
		 */
		@ApiField("period_code")
		private String periodCode;
		/**
		 * 学科编码
		 */
		@ApiField("subject_code")
		private String subjectCode;
		/**
		 * 学科名称
		 */
		@ApiField("subject_name")
		private String subjectName;
	
		public String getPeriodCode() {
			return this.periodCode;
		}
		public void setPeriodCode(String periodCode) {
			this.periodCode = periodCode;
		}
		public String getSubjectCode() {
			return this.subjectCode;
		}
		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}
		public String getSubjectName() {
			return this.subjectName;
		}
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
	}
	


}
