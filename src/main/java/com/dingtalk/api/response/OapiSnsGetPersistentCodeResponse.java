package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.get_persistent_code response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsGetPersistentCodeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4347412344641768221L;

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
	 * 用户在当前开放应用内的唯一标识
	 */
	@ApiField("openid")
	private String openid;

	/** 
	 * 用户给开放应用授权的持久授权码，此码目前无过期时间
	 */
	@ApiField("persistent_code")
	private String persistentCode;

	/** 
	 * 用户在当前钉钉开放平台账号范围内的唯一标识，同一个钉钉开放平台账号可以包含多个开放应用，同时也包含ISV的套件应用及企业应用
	 */
	@ApiField("unionid")
	private String unionid;


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

	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getOpenid( ) {
		return this.openid;
	}

	public void setPersistentCode(String persistentCode) {
		this.persistentCode = persistentCode;
	}
	public String getPersistentCode( ) {
		return this.persistentCode;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getUnionid( ) {
		return this.unionid;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
