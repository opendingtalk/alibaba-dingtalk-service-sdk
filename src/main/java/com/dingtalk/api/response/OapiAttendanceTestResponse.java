package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7552144462235983726L;

	/** 
	 * 200
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * error
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * test
	 */
	@ApiField("result")
	private String result;

	/** 
	 * true
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

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
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
	


}
