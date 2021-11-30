package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.get_by_name response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessGetByNameResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1784925326491845985L;

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
	 * 模板code
	 */
	@ApiField("process_code")
	private String processCode;


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

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	public String getProcessCode( ) {
		return this.processCode;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
