package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.group.banners.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRetailGroupBannersCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5521161795132619393L;

	/** 
	 * 接口成功状态
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 接口状态描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 接口成功状态
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
