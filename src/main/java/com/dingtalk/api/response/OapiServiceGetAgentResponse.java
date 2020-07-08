package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_agent response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceGetAgentResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5526987836895322221L;

	/** 
	 * agentid
	 */
	@ApiField("agentid")
	private Long agentid;

	/** 
	 * close
	 */
	@ApiField("close")
	private Long close;

	/** 
	 * description
	 */
	@ApiField("description")
	private String description;

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
	 * logo_url
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * name
	 */
	@ApiField("name")
	private String name;


	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	public Long getAgentid( ) {
		return this.agentid;
	}

	public void setClose(Long close) {
		this.close = close;
	}
	public Long getClose( ) {
		return this.close;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
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

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
