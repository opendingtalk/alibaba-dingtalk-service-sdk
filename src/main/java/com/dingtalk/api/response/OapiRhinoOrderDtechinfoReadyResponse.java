package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtechinfo.ready response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechinfoReadyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2646319171877618766L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误信息
	 */
	@ApiField("external_msgInfo")
	private String externalMsgInfo;

	/** 
	 * 数字工艺包是否ready
	 */
	@ApiField("model")
	private Boolean model;

	/** 
	 * 是否调用成功
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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(Boolean model) {
		this.model = model;
	}
	public Boolean getModel( ) {
		return this.model;
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
