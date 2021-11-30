package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.isv.openencrypt.registekms response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIsvOpenencryptRegistekmsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2163951729377346952L;

	/** 
	 * 错误类型
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 一般是空字符串
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 接口状态码
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
