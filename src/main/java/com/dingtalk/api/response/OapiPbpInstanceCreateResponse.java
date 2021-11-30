package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPbpInstanceCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4112286745965522765L;

	/** 
	 * 业务实例id
	 */
	@ApiField("biz_inst_id")
	private String bizInstId;

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


	public void setBizInstId(String bizInstId) {
		this.bizInstId = bizInstId;
	}
	public String getBizInstId( ) {
		return this.bizInstId;
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
