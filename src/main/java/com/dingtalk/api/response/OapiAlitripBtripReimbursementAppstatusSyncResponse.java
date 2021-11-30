package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.appstatus.sync response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripReimbursementAppstatusSyncResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3321114284778784812L;

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
	 * 结果模型
	 */
	@ApiField("module")
	private Long module;


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

	public void setModule(Long module) {
		this.module = module;
	}
	public Long getModule( ) {
		return this.module;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
