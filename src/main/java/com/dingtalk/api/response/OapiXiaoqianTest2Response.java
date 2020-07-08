package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoqian.test2 response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiXiaoqianTest2Response extends TaobaoResponse {

	private static final long serialVersionUID = 8898447133544851426L;

	/** 
	 * 3
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 3
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
