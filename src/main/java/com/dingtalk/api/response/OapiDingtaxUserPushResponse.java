package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtax.user.push response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingtaxUserPushResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5249483968813491417L;

	/** 
	 * 参数错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 参数错误
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否推送成功
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 服务是否成功
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
