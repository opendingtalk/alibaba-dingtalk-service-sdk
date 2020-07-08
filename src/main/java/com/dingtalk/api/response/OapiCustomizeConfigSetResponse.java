package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customize.config.set response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomizeConfigSetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2383922811386172176L;

	/** 
	 * 成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回成功
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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
