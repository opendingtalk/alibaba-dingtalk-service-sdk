package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiBlackboardUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3683239889785894585L;

	/** 
	 * 请求失败返回的错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 请求失败返回的错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * success为true时，该值不为空，否则值为空
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 本次调用是否成功，该值为false时，根据errcode和errMsg排查失败原因
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

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
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
