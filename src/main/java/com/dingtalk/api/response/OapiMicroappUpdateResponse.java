package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6327745527973572271L;

	/** 
	 * 微应用实例化id，企业只能删除自建微应用
	 */
	@ApiField("agentid")
	private Long agentid;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	public Long getAgentid( ) {
		return this.agentid;
	}

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
