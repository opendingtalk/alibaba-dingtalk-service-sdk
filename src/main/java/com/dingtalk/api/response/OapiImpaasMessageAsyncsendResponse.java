package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.asyncsend response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasMessageAsyncsendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5223587323499882616L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回描述信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 异步任务返回的ID
	 */
	@ApiField("taskid")
	private Long taskid;


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

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}
	public Long getTaskid( ) {
		return this.taskid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
