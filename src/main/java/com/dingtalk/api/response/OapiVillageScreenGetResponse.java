package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village.screen.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiVillageScreenGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3796198834894859945L;

	/** 
	 * -
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * -
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * -
	 */
	@ApiField("result")
	private String result;

	/** 
	 * -
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

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
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
