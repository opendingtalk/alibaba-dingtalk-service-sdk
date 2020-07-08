package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.responsequotation response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpMessageCorpconversationResponsequotationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8389915237979853188L;

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
