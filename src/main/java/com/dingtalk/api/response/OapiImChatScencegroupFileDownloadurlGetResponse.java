package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scencegroup.file.downloadurl.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatScencegroupFileDownloadurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1732664581339348344L;

	/** 
	 * 钉钉统一错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 下载地址（5分钟有效）
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 成功
	 */
	@ApiField("succ")
	private Boolean succ;


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

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
