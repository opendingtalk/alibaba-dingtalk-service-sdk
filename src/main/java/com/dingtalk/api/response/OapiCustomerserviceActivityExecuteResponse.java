package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.activity.execute response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceActivityExecuteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2518217983694349845L;

	/** 
	 * 异常码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否成功
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
