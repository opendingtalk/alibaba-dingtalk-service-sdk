package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.device.check.out response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosSpaceDeviceCheckOutResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7561265231282695131L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否成功
	 */
	@ApiField("model")
	private Boolean model;


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

	public void setModel(Boolean model) {
		this.model = model;
	}
	public Boolean getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
