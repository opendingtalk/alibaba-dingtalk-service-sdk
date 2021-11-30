package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5371174946869439168L;

	/** 
	 * 课程唯一编码
	 */
	@ApiField("course_code")
	private String courseCode;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 请求是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseCode( ) {
		return this.courseCode;
	}

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
