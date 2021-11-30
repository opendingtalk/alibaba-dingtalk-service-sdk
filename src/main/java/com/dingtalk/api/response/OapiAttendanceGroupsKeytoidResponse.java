package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.groups.keytoid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupsKeytoidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4611287528189383845L;

	/** 
	 * 调用错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务的错误返回信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 服务结果
	 */
	@ApiField("result")
	private Long result;

	/** 
	 * 调用结果
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
