package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.personalapp.download.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspacePersonalappDownloadGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5568924834843283752L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * success
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 下载链接
	 */
	@ApiField("result")
	private String result;


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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
