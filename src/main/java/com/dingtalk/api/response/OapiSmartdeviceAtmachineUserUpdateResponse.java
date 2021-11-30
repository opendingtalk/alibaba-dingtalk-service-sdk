package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.atmachine.user.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartdeviceAtmachineUserUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4533841531258875162L;

	/** 
	 * 服务调用结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务调用结果码描述
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
