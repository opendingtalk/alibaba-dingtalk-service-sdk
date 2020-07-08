package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.getguideuri response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkbenchShortcutGetguideuriResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5325411793794461916L;

	/** 
	 * 服务返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务返回信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 快捷方式添加到工作台引导页地址
	 */
	@ApiField("guide_uri")
	private String guideUri;


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

	public void setGuideUri(String guideUri) {
		this.guideUri = guideUri;
	}
	public String getGuideUri( ) {
		return this.guideUri;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
