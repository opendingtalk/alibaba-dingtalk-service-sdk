package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ext.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1536947824792415253L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	
	


}
