package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: dingtalk.workspace.workpost.syn response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DingtalkWorkspaceWorkpostSynResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5158892599559957228L;

	/** 
	 * 错误码
	 */
	@ApiField("ding_open_errcode")
	private Long dingOpenErrcode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 成功
	 */
	@ApiField("result")
	private Boolean result;


	public void setDingOpenErrcode(Long dingOpenErrcode) {
		this.dingOpenErrcode = dingOpenErrcode;
	}
	public Long getDingOpenErrcode( ) {
		return this.dingOpenErrcode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}
