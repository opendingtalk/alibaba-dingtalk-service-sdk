package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ext.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7275138837727219813L;

	/** 
	 * 新外部联系人的userId
	 */
	@ApiField("userid")
	private String userid;


	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

	
	


}
