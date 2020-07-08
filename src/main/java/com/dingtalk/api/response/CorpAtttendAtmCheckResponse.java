package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.atttend.atm.check response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpAtttendAtmCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7124247955243364789L;

	/** 
	 * res
	 */
	@ApiField("res")
	private String res;


	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

	
	


}
