package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.record.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceVacationRecordCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2142944142933842466L;

	/** 
	 * test
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * test
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * test
	 */
	@ApiField("result")
	private Long result;

	/** 
	 * test
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

	public void setResult(Long result) {
		this.result = result;
	}
	public Long getResult( ) {
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
