package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.org.virtualcorpid.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmOrgVirtualcorpidGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5841858795776248823L;

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
	 * CRM客户组织ID
	 */
	@ApiField("virtual_corpid")
	private String virtualCorpid;


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

	public void setVirtualCorpid(String virtualCorpid) {
		this.virtualCorpid = virtualCorpid;
	}
	public String getVirtualCorpid( ) {
		return this.virtualCorpid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
