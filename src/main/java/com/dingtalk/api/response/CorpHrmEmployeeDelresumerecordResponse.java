package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.delresumerecord response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpHrmEmployeeDelresumerecordResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2713321852737616521L;

	/** 
	 * 错误code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误提示
	 */
	@ApiField("errmsg")
	private String errmsg;


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

	
	


}
