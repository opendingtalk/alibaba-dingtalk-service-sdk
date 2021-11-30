package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoqian.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiXiaoqianTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4812268942211739172L;

	/** 
	 * 55
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 44
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
