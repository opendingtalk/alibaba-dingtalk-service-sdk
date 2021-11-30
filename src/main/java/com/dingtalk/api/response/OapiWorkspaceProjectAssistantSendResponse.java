package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.assistant.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceProjectAssistantSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4425348458593558636L;

	/** 
	 * errorcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * errorcode
	 */
	@ApiField("msgCode")
	private String msgCode;

	/** 
	 * errmsg
	 */
	@ApiField("msgInfo")
	private String msgInfo;

	/** 
	 * 是否成功
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

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgCode( ) {
		return this.msgCode;
	}

	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}
	public String getMsgInfo( ) {
		return this.msgInfo;
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
