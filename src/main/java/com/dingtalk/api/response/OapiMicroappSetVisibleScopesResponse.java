package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.set_visible_scopes response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappSetVisibleScopesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5277473522935598416L;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回码
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
