package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.get_custom_space response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceGetCustomSpaceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5773252746253334749L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * spaceid
	 */
	@ApiField("spaceid")
	private String spaceid;


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

	public void setSpaceid(String spaceid) {
		this.spaceid = spaceid;
	}
	public String getSpaceid( ) {
		return this.spaceid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
