package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ext.listlabelgroups response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtListlabelgroupsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7274373816413382629L;

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
